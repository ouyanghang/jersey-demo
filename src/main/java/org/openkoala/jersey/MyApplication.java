package org.openkoala.jersey;

import java.util.HashSet;
import java.util.Set;

import javax.naming.InitialContext;
import javax.ws.rs.core.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication extends Application {

	private ApplicationContext context;

	@Override
	public Set<Object> getSingletons() {
		try {
			InitialContext ctx = new InitialContext();
			String xmlFile = (String) ctx.lookup("java:comp/env/spring-beans-file");
			context = new ClassPathXmlApplicationContext(xmlFile);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		UserService userService = (UserService) context.getBean(UserService.class);
		HashSet<Object> results = new HashSet<Object>();
		results.add(userService);
		return results;
	}

}
