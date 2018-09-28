package com.licerlee.myinterface.designfactory.impl;

import com.licerlee.myinterface.designfactory.ManService;

public class ManServiceImpl implements ManService{

	@Override
	public void eat() {
		System.out.println("eat by 筷子,fast & much");
	}

	@Override
	public void makeMoney() {
		System.out.println("work hard");
	}

}
