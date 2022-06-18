package adapter;

import business.UserCheck;
import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MersisAdapter implements UserCheck{
	KPSPublicSoapProxy kpsspublic=new KPSPublicSoapProxy();
	
	@Override
	public boolean checkIfRealperson(User user) {
		boolean result=false;
		
	    try {
	    	result=kpsspublic.TCKimlikNoDogrula(user.getidentityNumber(), user.getName(), user.getSurname(), user.getBirtdate());
	    	
	    }
	    catch (Exception e) {
			System.out.println("yok böyle bir þey");
			e.printStackTrace();
		}
		return result;
	}

}
