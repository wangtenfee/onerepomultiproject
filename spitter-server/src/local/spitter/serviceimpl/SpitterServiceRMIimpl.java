package local.spitter.serviceimpl;

import local.spitter.service.SpitterService;

public class SpitterServiceRMIimpl implements SpitterService{

	@Override
	public void sayHello(String string) {
		// TODO Auto-generated method stub
		System.out.println("the client message is " + string);
	}

}
