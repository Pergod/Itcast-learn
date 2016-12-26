package com.itcast.day02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 有关泛型的存取
 */
public class demo1 {

	public static void main(String[] args) {
		
		/*
		 * 这在取出的时候必须要 cast ，但是这样可能会存在一些问题
		 */
//		List list=new ArrayList();
//		list.add("0");
//		Integer integer=(Integer) list.get(0);
		
		List<String> list=new ArrayList<String>();
		list.add("a");
		
		Iterator<String> iterator=list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		/*
		 * 1. 哈希表的取出顺序并不和存储的顺序一致。
		 * 2.如果想两者一致用LinkedHashMap
		 * 3.<K,V>必须是对象类型，不能是基本类型
		 * 4.如果两边的都使用到<K,V>，则一定必须一致
		 * 5.编译器将.java编译为.class文件之后，.class文件将不带有泛型的信息，使得运行效率不受影响，这个过程称为“擦除”
		 */
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		
		//用entrySet遍历map
		Set<Map.Entry<Integer, String>> set=map.entrySet();
		Iterator<Map.Entry<Integer, String>> it=set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry=it.next();
			int key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key + "=" +value);
		}
		
		//for-each循环
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
		
		//用keySet遍历map
		Set<Integer> keyset=map.keySet();
		Iterator<Integer> keys=keyset.iterator();
		while (keys.hasNext()) {
			int key=keys.next();
			System.out.println(map.get(key));
		}
	}
	
	/*
	 * 
	 * 基本术语：
	 *  ArrayList<E>中的E称为类型参数变量
	 *  ArrayList<Integer>中的Integer称为实际类型参数变量
	 *  整个ArrayList<E>称为泛型类型
	 *  整个ArrayList<Integer>称为参数化的类型ParamterizedType
	 */
}
