package com.itcast.day02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * �йط��͵Ĵ�ȡ
 */
public class demo1 {

	public static void main(String[] args) {
		
		/*
		 * ����ȡ����ʱ�����Ҫ cast �������������ܻ����һЩ����
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
		 * 1. ��ϣ���ȡ��˳�򲢲��ʹ洢��˳��һ�¡�
		 * 2.���������һ����LinkedHashMap
		 * 3.<K,V>�����Ƕ������ͣ������ǻ�������
		 * 4.������ߵĶ�ʹ�õ�<K,V>����һ������һ��
		 * 5.��������.java����Ϊ.class�ļ�֮��.class�ļ��������з��͵���Ϣ��ʹ������Ч�ʲ���Ӱ�죬������̳�Ϊ��������
		 */
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		
		//��entrySet����map
		Set<Map.Entry<Integer, String>> set=map.entrySet();
		Iterator<Map.Entry<Integer, String>> it=set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry=it.next();
			int key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key + "=" +value);
		}
		
		//for-eachѭ��
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
		
		//��keySet����map
		Set<Integer> keyset=map.keySet();
		Iterator<Integer> keys=keyset.iterator();
		while (keys.hasNext()) {
			int key=keys.next();
			System.out.println(map.get(key));
		}
	}
	
	/*
	 * 
	 * �������
	 *  ArrayList<E>�е�E��Ϊ���Ͳ�������
	 *  ArrayList<Integer>�е�Integer��Ϊʵ�����Ͳ�������
	 *  ����ArrayList<E>��Ϊ��������
	 *  ����ArrayList<Integer>��Ϊ������������ParamterizedType
	 */
}
