package com.hostmdy.test;
import com.hostmdy.other.C;
import com.hostmdy.other.D;

// import com.hostmdy.other.C; // Bad practice

// Fullname = com.hostmdy.test.A
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.method1();
		
//		com.hostmdy.other.C c = new com.hostmdy.other.C();
		C c = new C();
		c.methodC();
		
		D d = new D();
		d.methodD();
	}

}

// Compiler convert
//public class com.hostmdy.test.A {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		com.hostmdy.test.B b = new com.hostmdy.test.B();
//		b.method1();
//	}
//
//}
