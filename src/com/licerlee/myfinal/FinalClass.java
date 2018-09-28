package com.licerlee.myfinal;

// final 类不能被继承，防修改
public final class FinalClass {

	String name;
	//final 基本类型初始化复制后，不能更改了
	final String name1 = "name1";
	MyFinalClass fc;
	// final 对象引用初始化指向一个对象后，不能指向其他对象了
	final MyFinalClass fc1 = new MyFinalClass();
	// final 域初始化必须赋值
	
	
	
	public FinalClass() {
		this.name = "name";
//		this.name1 = "";
	}
	
	void m(){
		
	}
	
	// final方法不能被重写（非final类中）
	final void m1(){
		
	}
	
	// final参数，保证调用方法内部不能被修改
	void m2(final String s){
//		s = "modify";
		System.out.println("m2() param " + s);
	}
	
	// final方法不能被重写（非final类中），参数在内部不能被更改
	final void m3(final String s){
		
	}
	
	@Override
	public String toString(){
		
		return this.getClass().getName()
				+ "["
				+ this.name 
				+","
				+ this.name1
				+"]";
		
	}
}
