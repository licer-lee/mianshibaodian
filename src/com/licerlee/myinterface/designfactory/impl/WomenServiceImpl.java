package com.licerlee.myinterface.designfactory.impl;

import com.licerlee.myinterface.designfactory.WomenService;

public class WomenServiceImpl implements WomenService{

	@Override
	public void eat() {
		System.out.println("eat by 筷子,slow & little");
	}

	@Override
	public void cook() {
		System.out.println("food of cooked is very good");
	}


}
