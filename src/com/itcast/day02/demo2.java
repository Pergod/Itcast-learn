package com.itcast.day02;

/*
 * 自定义类上的泛型(静态成员无效,需在static单独声明)
 */
public class demo2<T,E,K> {

	public static void main(String[] args) {
		
	}
	
	public void test(){
		a("aaa");
	}
	
	public <T> T a(T t){
		
		return null;
	}
	
	//自定义泛型方法
	public <E,K> void b(T t,E e,K k){
		
	}
}
