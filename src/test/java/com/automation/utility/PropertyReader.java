package com.automation.utility;

import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {

	static Properties prop = new Properties();

	public static void initProperties() {

		try {
			// Create File reader object to read data from file
			FileReader fr = new FileReader("src\\test\\resources\\config\\data.properties");

			// Loading properties from properties file to prop object
			prop.load(fr);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}


}
