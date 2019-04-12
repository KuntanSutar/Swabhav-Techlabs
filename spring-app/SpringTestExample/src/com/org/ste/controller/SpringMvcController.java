package com.org.ste.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import au.com.bytecode.opencsv.CSVReader;

import com.org.ste.beans.BranchAddressUpdateBean;
import com.org.ste.beans.LoginPageBean;
import com.org.ste.beans.ProposalFormBean;
import com.org.ste.beans.TempTestData;
import com.org.ste.beans.TestFormBean;
import com.org.ste.dao.TempTestDao;
import com.org.ste.pojo.ProposalNonUlipNumSort;
import com.org.ste.pojo.ProposalUlipNumSort;


@Controller
public class SpringMvcController {
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String indexPage(ModelMap model) {
		
		System.out.println("Inside"); 
		//model.addAttribute("testForm", new TestFormBean());
		//model.addAttribute("loginForm", new LoginPageBean());
		//return "LoginPage";
		return "index";
	}
	
	@RequestMapping(value = {"/loginAction"}, method = RequestMethod.POST)
	public String goToProposalNumPage(@ModelAttribute("loginForm") LoginPageBean bean, ModelMap model){
		
		System.out.println("Inside Login");
		String result = "";
		if(bean.getUserName() == null || bean.getUserName().equals("")){
			
			model.addAttribute("message", "Please enter user name");
			result = "LoginPage";
			
		} else if(bean.getPassword() == null || bean.getPassword().equals("")){
			
			model.addAttribute("message", "Please enter password");
			result = "LoginPage";
			
		} else if(bean.getUserName() != null && bean.getPassword() != null && bean.getUserName().equals("chetanu") 
				&& bean.getPassword().equals("chetanu")){
			
			result = "ProposalNumberInsert";
			
		} else if(bean.getUserName() != null && bean.getPassword() != null && bean.getUserName().equals("durgeshj") 
				&& bean.getPassword().equals("durgeshj")){
			
			result = "BranchAddressUpdate";
			
		}else {
			
			//model.addAttribute("message", "Some error occured");
			model.addAttribute("message", "Invalid username or password");
			result = "LoginPage";
			
		} /*else if(bean.getUserName() != null && bean.getPassword() != null && bean.getUserName().equals("chetanz") && bean.getPassword().equals("chetanz")){
		
		result = "ZipUnzipData";
		
		}*/ 
		model.addAttribute("loginForm", bean);
		return result;
		
	}
	
	@RequestMapping(value = {"/dataSortAction", "/fileZipAction", "branchAddressUpdateAction"}, method = RequestMethod.GET)
	public String gotoLoginPage(@ModelAttribute LoginPageBean bean, ModelMap model) {
		
		System.out.println("after index page");
		
		model.addAttribute("loginForm", bean);
		return "LoginPage";
	}
	
	@RequestMapping(value = {"/logoutAction"}, method = RequestMethod.GET)
	public String logOutPage(@ModelAttribute LoginPageBean bean, ModelMap model) {
		
		System.out.println("Inside");
		
		model.addAttribute("loginForm", bean);
		return "LoginPage";
	}
	
	@RequestMapping(value = {"/indexPageAction"}, method = RequestMethod.GET)
	public String gotoIndexPage(@ModelAttribute TestFormBean bean, ModelMap model) {
		
		System.out.println("Inside");
		Map<String, String> city = new LinkedHashMap<String, String>();
		city.put("Select", "Select");
		city.put("Mumbai", "Mumbai");
		city.put("Delhi", "Delhi");
		city.put("Chennai", "Chennai");
		city.put("Kolkata", "Kolkata");
		System.out.println("Map size is "+city.size());
		//bean.setCityMap(tempMap);
		
		model.addAttribute("citylst", city);
		model.addAttribute("testForm", bean);
		return "index1";
	}
	
	@RequestMapping(value ={"/testAction"}, method = RequestMethod.POST, params = "submitForm")
	public String mainMethod(@ModelAttribute("testForm") TestFormBean bean, ModelMap model){
		
	System.out.println("Name is " + bean.getEmpFirstName() + " " + bean.getEmpLastName() + " City is " + bean.getCity()); 
		model.addAttribute("message", "Hello Spring MVC");
		
		Session session = new TempTestDao().getSessionObj();
		Transaction tx = session.beginTransaction();
		TempTestData data = new TempTestData();
		Integer id = Integer.parseInt(String.valueOf(Math.round(Math.random() * 100)));
		data.setEmpId(id);
		data.setFirstName(bean.getEmpFirstName());
		data.setLastName(bean.getEmpLastName());
		data.setCity(bean.getCity()); 
		data.setContactNo(Integer.parseInt(bean.getEmpContactNo()));
		session.save(data);
		System.out.println("after session.save");
		tx = session.getTransaction();
		tx.commit();
		TempTestData dataObj = (TempTestData) session.get(TempTestData.class, id);
		System.out.println("result");
		session.close();
		TestFormBean beanObj = new TestFormBean();
		beanObj.setEmpDispFstName((dataObj != null) ? dataObj.getFirstName() : bean.getEmpFirstName());
		beanObj.setEmpDispLstName((dataObj != null) ? dataObj.getLastName() : bean.getEmpLastName());
		model.addAttribute("testForm", beanObj);
		
		return "Home";
		
	}
	
	@SuppressWarnings({ "unused", "resource", "unchecked" })
	@RequestMapping(value = {"/propNumInsertAction"}, method = RequestMethod.POST)
	public String propasalNumSort(@ModelAttribute("propNumInsertForm") ProposalFormBean prpslFbBean, ModelMap model){
		
		try{
			
			System.out.println("Inside propNumInsertAction");
			String[] line;
			
			if(prpslFbBean.getFile().getOriginalFilename() == null || prpslFbBean.getFile().getOriginalFilename().equals("")){
				
				model.addAttribute("message", "Please select file");
				
			} else if(!prpslFbBean.getFile().getOriginalFilename().substring(prpslFbBean.getFile().getOriginalFilename().lastIndexOf(".") + 1, prpslFbBean.getFile().getOriginalFilename().length()).equals("csv")){
				
				model.addAttribute("message", "Please select .csv file");
				
			} else {
				
				Session session = new TempTestDao().getSessionObj();
				Transaction tx = session.beginTransaction();
				/*List<String[]> ulipNonUlipLst = new ArrayList<String[]>();
				LinkedHashMap<String, String> ulipNonUlipDetailsLst = new LinkedHashMap<String, String>();*/
				File convFile = new File(prpslFbBean.getFile().getOriginalFilename());
				prpslFbBean.getFile().transferTo(convFile);
				int i = 1;
				
				Criteria crt = session.createCriteria(ProposalUlipNumSort.class);
				List<ProposalUlipNumSort> ulipLst = crt.list();
				System.out.println("ulipLst size is "+ulipLst.size());
				
				Criteria crt1 = session.createCriteria(ProposalNonUlipNumSort.class);
				List<ProposalNonUlipNumSort> nonUlipLst = crt1.list();
				System.out.println("nonUlipLst size is "+nonUlipLst.size());
				
				CSVReader read = new CSVReader(new FileReader(convFile));
			//	CSVWriter write = new CSVWriter(new FileWriter("//D://Durgesh//Other Docs//ResultTestFile.csv"));
				HSSFWorkbook workbook = new HSSFWorkbook();
				HSSFSheet sheet = workbook.createSheet("Sheet1");
				HSSFRow rowHead = sheet.createRow(0);
				rowHead.createCell(0).setCellValue("Policy Number");
				rowHead.createCell(1).setCellValue("Policy Category");
				
				while((line = read.readNext()) != null){	
					
					if(line != null){
						
						HSSFRow row = sheet.createRow(i);
						for(String s : line){
							
							for(ProposalUlipNumSort ul : ulipLst){
								
								if(s != null && ul != null && ul.getUlipNo() != null && !s.equals("") 
										&& !ul.getUlipNo().equals("") & s.substring(0, 2).equals(ul.getUlipNo())){
									
									//ulipNonUlipLst.add(new String[]{s,"Ulip Number"});
									row.createCell(0).setCellValue(s);
									row.createCell(1).setCellValue("Ulip Number");
									
								}
								
							}
							
							 for(ProposalNonUlipNumSort nul : nonUlipLst){
								 
								 if(s != null && nul != null && nul.getNonUlipNo() != null && !s.equals("") 
										 && !nul.getNonUlipNo().equals("") & s.substring(0, 2).equals(nul.getNonUlipNo())){
										
									 	//ulipNonUlipLst.add(new String[]{s,"Non Ulip Number"});
									 	row.createCell(0).setCellValue(s);
										row.createCell(1).setCellValue("Non Ulip Number");
										
								 }
								 
							 }
							
						}
						
						i++;
						
					}
					
				}
				
				//write.writeAll(ulipNonUlipLst);
				Calendar cal = Calendar.getInstance();
				File chkFile = new File("//D://Durgesh//Other Docs//Ulip_NonUlip//" + new Formatter().format("%tY", cal) 
						+ "//" + new Formatter().format("%tB", cal).toString().toUpperCase() + "//" 
						+ new SimpleDateFormat("dd-MMM-yyyy").format(new Date()) + "//Output");
				
				if(!chkFile.exists()){
					
					chkFile.mkdirs();
					System.out.println("Folder Created");
					
				}
				
				String outpitFile = "//D://Durgesh//Other Docs//Ulip_NonUlip//" + new Formatter().format("%tY", cal) + "//" 
				+ new Formatter().format("%tB", cal).toString().toUpperCase() + "//" 
						+ new SimpleDateFormat("dd-MMM-yyyy").format(new Date()) 
						+ "//Output//Result_" 
						+ prpslFbBean.getFile().getOriginalFilename().substring(0, prpslFbBean.getFile().getOriginalFilename().lastIndexOf(".")) 
						+ "_" + new SimpleDateFormat("dd-MMM-yyyy-hh-mm").format(new Date()) + ".xls";
				
				System.out.println("outpitFile is "+outpitFile);
				FileOutputStream fileOut = new FileOutputStream(outpitFile);
				workbook.write(fileOut);
				fileOut.close();
				System.out.println("File written successfully");
				
			}
			
			model.addAttribute("message", "File Upload Successful");
			model.addAttribute("propNumInsertForm", prpslFbBean);
			
		} catch(Exception e){
			
			model.addAttribute("message", "File Upload Unsuccessful");
			e.printStackTrace();
			
		}
		
		return "ProposalNumberInsert";
	}
	
	@SuppressWarnings("unused")
	@RequestMapping(value = {"/branchAddressUpdateFormAction"}, method = RequestMethod.POST)
	public String branchAddressUpdate(@ModelAttribute("branchAddressUpdateForm")BranchAddressUpdateBean branchBean, ModelMap model){
		
		try{
			
			System.out.println("Inside branch address update form action");
			
			if(branchBean.getBranchAddressfile().getOriginalFilename() == null || branchBean.getBranchAddressfile().getOriginalFilename().equals("")){
				
				model.addAttribute("message", "Please select file");
				
			} else if(!branchBean.getBranchAddressfile().getOriginalFilename().substring(branchBean.getBranchAddressfile().getOriginalFilename().lastIndexOf(".") + 1, 
					branchBean.getBranchAddressfile().getOriginalFilename().length()).equals("xls") && 
					!branchBean.getBranchAddressfile().getOriginalFilename().substring(branchBean.getBranchAddressfile().getOriginalFilename().lastIndexOf(".") + 1, 
							branchBean.getBranchAddressfile().getOriginalFilename().length()).equals("xlsx")){
				
				model.addAttribute("message", "Please select .xls or .xlsx file");
				
			} else {
				
				String fileType = branchBean.getBranchAddressfile().getOriginalFilename().substring(branchBean.getBranchAddressfile().getOriginalFilename().lastIndexOf(".") + 1, branchBean.getBranchAddressfile().getOriginalFilename().length());
				System.out.println("file type is " + fileType);
				Session session = new TempTestDao().getSessionObj();
				File conFileObj = new File(branchBean.getBranchAddressfile().getOriginalFilename());
				branchBean.getBranchAddressfile().transferTo(conFileObj);
				Transaction tx = session.beginTransaction();
				FileInputStream fis = new FileInputStream(conFileObj);
				HSSFSheet hssfSheet;
				XSSFSheet xssfSheet;
				HSSFWorkbook hssfWorkBook;
				XSSFWorkbook xssfWorkBook;
				Iterator<Row> rowIterator = null;
				
				if(fileType != null && !fileType.trim().equals("") & fileType.trim().equals("xls")){
					
					hssfWorkBook = new HSSFWorkbook(fis);
					hssfSheet = hssfWorkBook.getSheetAt(0);
					rowIterator = hssfSheet.iterator();
					
				} else if(fileType != null && !fileType.trim().equals("") & fileType.trim().equals("xlsx")){
					
					xssfWorkBook = new XSSFWorkbook(fis);
					xssfSheet = xssfWorkBook.getSheetAt(0);
					rowIterator = xssfSheet.iterator();
					
				}
				
				if(rowIterator != null){
					
					while(rowIterator.hasNext()){
						
						Row row = rowIterator.next();
						int totColNum = row.getPhysicalNumberOfCells();
						int totColNum1 = row.getLastCellNum();
						System.out.println("Physical number of cell are " + totColNum + " Last Cell num is " + totColNum1);
						
						if(row.getRowNum() == 0)
						 continue;
						
						Iterator<Cell> cellIterator = row != null ? row.cellIterator() : null;
						
						if(cellIterator != null){
							
							while(cellIterator.hasNext()){
								
								Cell cell = cellIterator.next();
								
								 int columnIndex = cell.getColumnIndex();
								 
								 switch(columnIndex + 1){
								 
								 case 1:
									 
									 System.out.println("Case 1");
									 break;
								 
								 case 2 :
									 
									 System.out.println("Case 2");
									 break;
									 
								 default :
									 
									 System.out.println("Default condition");
								 
								 }
								
							}
							
						} else {
							
							model.addAttribute("message", "Branch Address Update Unsuccessful");
							model.addAttribute("branchAddressUpdateForm", branchBean);
							return "BranchAddressUpdate";
							
						}
						
					}
					
				} else {
					
					model.addAttribute("message", "Branch Address Update Unsuccessful");
					model.addAttribute("branchAddressUpdateForm", branchBean);
					return "BranchAddressUpdate";
					
				}
				
			}
			
		} catch(Exception e){
			
			model.addAttribute("message", "Branch Address Update Unsuccessful");
			e.printStackTrace();
			
		}
		
		model.addAttribute("message", "Branch Address Update Successful");
		model.addAttribute("branchAddressUpdateForm", branchBean);
		return "BranchAddressUpdate";
		
	}
	
	/*@SuppressWarnings({ "unused", "resource" })
	@RequestMapping(value = {"/zipUnzipAction"}, method = RequestMethod.POST)
	public String goToRenameZipUnzip(@ModelAttribute("zipUnzipForm")ZipUnzipFormBean zipBean, ModelMap model){
		
		try{
			
			byte[] buffer = new byte[4096];
			System.out.println("Inside");
			String srcZipFilePath = "//D://Durgesh//Other Docs//Zip_Files//Input_Zip_Files//"+new SimpleDateFormat("dd-MMM-yyyy").format(new Date())+"//";
			String destUnZipFilePath = "//D://Durgesh//Other Docs//Zip_Files//Output_Files//Extract_Data//" + new SimpleDateFormat("dd-MMM-yyyy").format(new Date());
			String destUnZipOutFilePath = "//D://Durgesh//Other Docs//Zip_Files//Output_Files//Zip_Files//" + new SimpleDateFormat("dd-MMM-yyyy").format(new Date());
			System.out.println("Source file path is "+srcZipFilePath); 
			String[] line;
			ZipInputStream zis = null;
			
			if(zipBean.getFile().getOriginalFilename() == null || zipBean.getFile().getOriginalFilename().equals("")){
				
				model.addAttribute("message", "Please select file");
				
			} else if(!zipBean.getFile().getOriginalFilename().substring(zipBean.getFile().getOriginalFilename().lastIndexOf(".") + 1, zipBean.getFile().getOriginalFilename().length()).equals("csv")){
				
				model.addAttribute("message", "Please select .csv file");
				
			} else {
				
				Session session = new TempTestDao().getSessionObj();
				Transaction tx = session.beginTransaction();
				File convFile = new File(zipBean.getFile().getOriginalFilename());
				zipBean.getFile().transferTo(convFile);
				int i = 1;
				
				CSVReader read = new CSVReader(new FileReader(convFile));
				File dir = new File(srcZipFilePath);
				String[] fileLst = dir.list();
				String srcFilename = fileLst != null ? fileLst[0] : "";
				if(srcFilename == null || srcFilename.equals("")){
					
					model.addAttribute("message", "Input zip not available");
					
				} else {
					
					File inZipFile = new File(srcZipFilePath + srcFilename);
					System.out.println("File Path is "+inZipFile.getAbsolutePath());
					
					File chkFile = new File(destUnZipFilePath);
					if(!chkFile.exists()){
						
						chkFile.mkdirs();
						System.out.println("Folder Created");
						
					}
					
					File chkFile1 = new File(destUnZipOutFilePath);
					if(!chkFile1.exists()){
						
						chkFile1.mkdirs();
						System.out.println("Folder Created");
						
					}
					
					while((line = read.readNext()) != null){	
						
						if(line != null){
							
							for(String s : line){
								
								zis = new ZipInputStream(new FileInputStream(inZipFile));
								ZipEntry ze = zis.getNextEntry();
								while(ze != null){
									
									String tempFile = destUnZipFilePath + "//" + ze.getName();
									FileOutputStream fout = null;
									
									if(!ze.isDirectory()){
										
										File tmpFile = new File(destUnZipFilePath + "//" + ze.getName());
										File newTmpFile = new File(tmpFile.getParent());
										newTmpFile.mkdirs();
										File newFile = new File(destUnZipFilePath + "//" + s);
										newTmpFile.renameTo(newFile);
										File newFile1 = new File(destUnZipFilePath + "//" + s + "//" + s +".TIFF");
										fout = new FileOutputStream(newFile1); 
										int len;
										while((len = zis.read(buffer)) > 0){
											
											fout.write(buffer, 0, len);
											
										}
										
									} else {
										
										File tmpDir = new File(tempFile);
										tmpDir.mkdir();
										File tempDir = new File(destUnZipFilePath + "//" + s);
										tmpDir.renameTo(tempDir);
										
									}
									
									fout.close();
									ze = zis.getNextEntry();
									
								}
								
								zis.closeEntry();
								zis.close();
									
							}
							
						}
						
					}
					
					System.out.println("File written successfully");
					model.addAttribute("message", "File Upload Successful");
					
				}
				
			}
			
			model.addAttribute("zipUnzipForm", zipBean);
			
		} catch(Exception e){
			
			model.addAttribute("message", "File Upload Unsuccessful");
			e.printStackTrace();
			
		}
		
		return "ZipUnzipData";
		
	} */
	
	
	
	
	
}
