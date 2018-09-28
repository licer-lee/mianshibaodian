package com.licerlee.myinterface.designfactory.impl;

import com.licerlee.myinterface.designfactory.HumanService;

public class DefaultHumanServiceImpl implements HumanService{

	@Override
	public void eat() {
		System.out.println("eat by 筷子");
	}

}
