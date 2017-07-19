package com.javacodepoint.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javacodepoint.customer.services.CustomerService;

public class AOPMainApp {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] { "Spring-javacodepoint-Customer.xml" });

		CustomerService customer = (CustomerService) appContext.getBean("customerServiceBean");

		System.out.println("----------------------------------------------------------------");
		customer.printCustomerName();
		System.out.println("----------------------------------------------------------------");
		customer.printAddress();
		System.out.println("----------------------------------------------------------------");
		try {
			customer.printThrowException();
		} catch (Exception e) {
			//e.printStackTrace();
		}

	}
}