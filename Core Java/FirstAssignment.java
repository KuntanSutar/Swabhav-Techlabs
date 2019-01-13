//First Assignment : 12/1/2018
import java.net.*;

class Test
{
	public static void main(String... Kuntan) throws Exception
	{
		String u = "http://www.swabhavtechlabs.com?developer=Kuntan&client=Aurionpro";
		String[] urlArray = u.split("=");
		for(String element:urlArray)
		{
			System.out.println(element);
		}
		URL url = new URL(u);
		
		String host = url.getHost(); 
		System.out.println(host);
		

		String[] hostDivided = host.split("\\.");
		System.out.println("Domain : "+hostDivided[1]);
		
		String secondSplit = urlArray[1];
		String[] secondSplitArray = secondSplit.split("&");
		System.out.println("Developer : "+secondSplitArray[0]);
		
		System.out.println("Client : "+urlArray[2]);
	}
}

