package com.licerlee.innerclass;

public class UpCastClass {

	public static void main(String[] args) {

		Up up = new Up();

		UpCast u = up.getUpcast("hello inner");

		System.out.println(u.u());

		UpCast2 u2 = up.getUpcast2();

		System.out.println(u2.u2());

		// UpCastClass.UpCast = // error
	}

}

class Up {

	// inner向上转型到基类、接口，可以隐藏impl实现细节
	private class UpCastImpl implements UpCast {

		String name;

		public UpCastImpl(String name) {
			this.name = name;
		}

		@Override
		public String u() {
			return name;
		}

	}

	protected class UpCast2Impl implements UpCast2 {

		int i = 0;

		@Override
		public int u2() {
			return i;
		}

	}

	public UpCast getUpcast(String name) {
		return new UpCastImpl(name);
	}

	public UpCast2 getUpcast2() {
		return new UpCast2Impl();
	}

}