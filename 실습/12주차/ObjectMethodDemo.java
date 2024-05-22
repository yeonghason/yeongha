package wret;

import wret.kk.mouse;

public class ObjectMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mouse m1=new mouse("Logitech");
		mouse m2=new mouse("Logitech");
		mouse m3=m1;
		keyboard k1=new keyboard("Microsoft");
		keyboard k2=new keyboard("Microsoft");
		
		System.out.println(m1.toString());
		System.out.println(m1);
		
		System.out.println(k1.toStrong());
		System.out.println(k1);
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m1.equals(k2));
	}

}
