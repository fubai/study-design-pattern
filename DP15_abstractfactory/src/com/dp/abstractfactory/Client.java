package com.dp.abstractfactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Client {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, FileNotFoundException, IOException {
		
		Properties properties = new Properties();
		properties.load(Client.class.getResourceAsStream("application.properties"));
		
		Class<Factory> class1 = (Class<Factory>) Class.forName(properties.getProperty("factory1"));
		Class<Factory> class2 = (Class<Factory>) Class.forName(properties.getProperty("factory2"));
		Car car1 = class1.newInstance().createCar();
		Car car2 = class2.newInstance().createCar();
		
		car1.display();
		car2.display();
	}
}
