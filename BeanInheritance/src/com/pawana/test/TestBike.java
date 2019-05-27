package com.pawana.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.pawana.model.Bike;

public class TestBike {

	public static void main(String[] args) {

		BeanFactory ft = new XmlBeanFactory(new FileSystemResource("src/com/pawana/cfgs/ApplicationContext.xml"));
		Bike b1= ft.getBean("bike1", Bike.class);
		Bike b2= ft.getBean("bike2", Bike.class);
		System.out.println(b1);
		System.out.println(b2);
	}

}
