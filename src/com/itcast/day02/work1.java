package com.itcast.day02;

/*
 * 使用泛型交换数组的位置
 * ! 泛型的参数必须为对象类型，不能是基本数据类型
 */
public class work1 {
	
	public static void main(String[] args) {
		
		String [] arr ={"aaa","bbb","ccc","111","000"};
		int src=2;
		int des=4;
		swap(arr, src, des);
		for (String string : arr) {
			System.out.println(string);
		}
		
		Integer[] arr1={2,4,5,6,7};
		swap(arr1, src, des);
		for (Integer integer : arr1) {
			System.out.println(integer);
		}
	}
	
	public static <T> void swap(T[] arr,int src,int des){
		T temp=arr[src];
		arr[src]=arr[des];
		arr[des]=temp;
	}
}
