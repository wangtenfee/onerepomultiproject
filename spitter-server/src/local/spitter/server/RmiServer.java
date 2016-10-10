package local.spitter.server;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiServer {
	
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("resouces/rmiserver-contetxt.xml");
	}
}
