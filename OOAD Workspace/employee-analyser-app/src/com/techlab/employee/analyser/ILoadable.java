package com.techlab.employee.analyser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

public interface ILoadable {

	ArrayList<String> load() throws MalformedURLException, IOException;
}
