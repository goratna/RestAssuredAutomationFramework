package com.shaku.utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class propertiesConfiguration {
	public static void main(String[] args) {
		propertiesConfiguration.loadFile();
	}
	
	
	public static Properties loadFile() {
		Properties prop = new Properties();
		try (OutputStream output = new FileOutputStream("/Users/kumar/Documents/API/config.properties")) {
			// set the properties value
			prop.setProperty("HOST", "http://localhost:8081");
			// save properties to project root folder
			prop.store(output, null);
			System.out.println(prop);
		} catch (IOException io) {
			io.printStackTrace();
		}
		return prop;
	}

}
