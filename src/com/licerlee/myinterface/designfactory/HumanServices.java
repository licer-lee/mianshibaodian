package com.licerlee.myinterface.designfactory;

import com.licerlee.myinterface.designfactory.impl.ChildServiceImpl;
import com.licerlee.myinterface.designfactory.impl.DefaultHumanServiceImpl;
import com.licerlee.myinterface.designfactory.impl.ManServiceImpl;
import com.licerlee.myinterface.designfactory.impl.WomenServiceImpl;

public class HumanServices {

	public static HumanService newDefaultService() {
		return new DefaultHumanServiceImpl();
	}
	
	public static ManService newManService() {
		return new ManServiceImpl();
	}

	public static WomenService newWomenService() {
		return new WomenServiceImpl();
	}

	public static ChildService newChildService() {
		return new ChildServiceImpl();
	}

	
	
	
}
