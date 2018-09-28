package com.licerlee.myinterface.designfactory.impl;

import com.licerlee.myinterface.designfactory.ChildService;

public class ChildServiceImpl implements ChildService{

	@Override
	public void eat() {
		System.out.println("eat by 勺子");
	}

	@Override
	public void learn() {
		System.out.println("learn hard");
	}

}
