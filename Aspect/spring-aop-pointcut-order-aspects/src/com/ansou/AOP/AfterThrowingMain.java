package com.ansou.AOP;

import com.ansou.AOP.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AfterThrowingMain {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		List<Account> theAccounts = null;
		try {
			theAccounts = theAccountDAO.findAccounts(true);
		} catch (Exception e) {
			System.out.println("Main program Exception caught" + e);
		}
		// close the context
		context.close();
	}

}










