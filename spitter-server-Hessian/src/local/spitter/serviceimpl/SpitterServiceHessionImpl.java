package local.spitter.serviceimpl;

import local.spitter.service.SpitterService;

public class SpitterServiceHessionImpl implements SpitterService {

	@Override
	public void sayHello(String string) {
		// TODO Auto-generated method stub
		System.out.println("Hession implements of the spitter service:");
		System.out.println("hession client says: "+string);
	}

	@Override
	public String sayClientMsg(String string) {
		// TODO Auto-generated method stub
		return "hessian Server"+string;
	}

}
