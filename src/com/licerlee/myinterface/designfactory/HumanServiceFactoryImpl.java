package com.licerlee.myinterface.designfactory;

public class HumanServiceFactoryImpl implements HumanServiceFactory<HumanService>{

	@Override
	public HumanService getHumanService(Class<? extends HumanService> c) {

		HumanService hs = null;
		try {
			hs = (HumanService) c.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hs;
	}


	
	
	
}
