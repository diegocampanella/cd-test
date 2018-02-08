package it.myproject.application;

import java.util.ArrayList;

public class ArrayListInverter<T> {
	
	private ArrayList<T> _arrayList;
	
	public ArrayListInverter(ArrayList<T> arrayList) {
		
		_arrayList = arrayList;
	}
	
	public ArrayList<T> reverse() {
		
		ArrayList<T> reversedList = new ArrayList<T>();
		
		for(int i = _arrayList.size() -1;i >= 0;i--) {
				
			T element = _arrayList.get(i);
			reversedList.add(element);
			
		}
		return reversedList;
	}
}
