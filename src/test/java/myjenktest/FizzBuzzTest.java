package myjenktest;

import org.junit.jupiter.api.*;


import myjenktest.tutorial.FizzBuzz;

public class FizzBuzzTest {
	public FizzBuzz fb;
	
	@BeforeEach
	public void setup() {
		fb=new FizzBuzz();
	}
	
	@DisplayName("Play FizzBuzz with number = 1")
	@Test
	public void testNumber1() {
		String risultato = fb.play(1);
		// Verifica che il risultato sia uguale
		Assertions.assertEquals(risultato, "200");
	}
	/*
	@DisplayName("Play FizzBuzz with number = 5")
	@Test
	public void testNumber5() {
		String risultato = fb.play(5);
		// Verifica che il risultato sia uguale
		Assertions.assertEquals(risultato, "Buzz");
	}
	*/
	@DisplayName("Play FizzBuzz with number = 3")
	@Test
	public void testNumber3() {
		
		
		
		String risultato = fb.play(3);
		// Verifica che il risultato sia uguale
		Assertions.assertEquals(risultato, "Fizz");
	}
	
}
