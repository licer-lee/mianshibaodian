package com.licerlee.myinterface;

public class NestInterfaceClass {

	
	
	
	interface Ia{
		void a();
	}
	
	public interface Ib{
		void b();
	}
	
	private interface Ic{
		void c();
	}
	
	class IaImpl implements Ia{

		@Override
		public void a() {
			System.out.println("a() called by ");
		}
		
	}
	
	
	public static void main(String[] args) {
		NestInterfaceClass nic = new NestInterfaceClass();
		Ia ia = nic.new IaImpl();
		ia.a();
		
		
		
	}
}
