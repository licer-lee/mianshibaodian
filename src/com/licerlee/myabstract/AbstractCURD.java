package com.licerlee.myabstract;

// abstract类通常提供通用的行为能力，不能被new，可继承
public abstract class AbstractCURD {

	String name;
	
	void save(){
		System.out.println("save() called by "+ this.getClass().getSimpleName());
	}
	
	void update(){
		System.out.println("update() called by "+ this.getClass().getSimpleName());
	}
	
	void select(){
		System.out.println("select() called by "+ this.getClass().getSimpleName());
	}
	
	void delete(){
		System.out.println("delete() called by "+ this.getClass().getSimpleName());
	}
	
	abstract void m1();
	
	
}
