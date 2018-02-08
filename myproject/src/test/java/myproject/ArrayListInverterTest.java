package myproject;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import it.myproject.application.ArrayListInverter;

public class ArrayListInverterTest {
	
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	@Before
	public void initList() {
		
		for(int i = 0;i < 10; i++) {
			
			Integer number = Integer.valueOf(i);
			list.add(number);
		}
	}
	
	@Test
	public void checkInvertedResultConsistency() {
		
		ArrayListInverter<Integer> inverter = new ArrayListInverter<Integer>(list);
		ArrayList<Integer> reversedList = inverter.reverse();
		assertEquals(list.size(), reversedList.size());
	}

}
