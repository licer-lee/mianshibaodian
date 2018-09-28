package com.licerlee.myabstract;

public class MyCURD extends AbstractCURD{

	@Override
	void m1() {
		System.out.println("m1() called by "+ this.getClass().getSimpleName());
	}
	
	
	@Override
	void save(){
		System.out.println("save() called by "+ this.getClass().getSimpleName());
	}
	

}
