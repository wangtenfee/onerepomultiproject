package local.spitter.client;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import local.spitter.service.SpitterService;

public class RmiClient {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/rmiclient-context.xml");
		SpitterService spitterService = (SpitterService)context.getBean("spitterservice");
		spitterService.sayHello("rmiclient "+new Date());
	}
}
