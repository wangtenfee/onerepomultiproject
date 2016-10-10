package local.spitter.serviceimpl;

import local.spitter.service.SpitterService;

public class SpitterServiceBurlapImpl implements SpitterService {

	@Override
	public void sayHello(String string) {
		// TODO Auto-generated method stub
		System.out.println("Burlap implements of the spitter service:");
		System.out.println("Burlap client says: "+string);
	}

	@Override
	public String sayClientMsg(String string) {
		// TODO Auto-generated method stub
		return "Burlap Server"+string;
	}

}
