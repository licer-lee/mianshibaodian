package com.licerlee.myinterface.designfactory;

import com.licerlee.myinterface.designfactory.impl.ManServiceImpl;

public class Test {

	public static void main(String[] args) {

		HumanService hs = HumanServices.newDefaultService();
		hs.eat();

		HumanService hss = new HumanServiceFactoryImpl().getHumanService(ManServiceImpl.class);
		hss.eat();

	}
}
