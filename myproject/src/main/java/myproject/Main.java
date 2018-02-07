package myproject;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Prova");
		System.out.println("Fixed Issue #1");

	}
	
	@Test
	public void myTest() {
		String message = "Test1";
		assertNotNull(message);
	}

}
