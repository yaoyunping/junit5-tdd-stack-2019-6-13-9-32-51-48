package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Fizzbuzztest {
	
	@Test
	public void should_return_Fizz_when_input_1() {
		Game game = new Game();
		String result=game.fizzBuzz(1);
		Assertions.assertEquals("1", result);
	}
	@Test
	public void should_return_Fizz_when_input_3() {
		Game game = new Game();
		String result=game.fizzBuzz(3);
		Assertions.assertEquals("fizz", result);
	}
	@Test
	public void should_return_Fizz_when_input_5() {
		Game game = new Game();
		String result=game.fizzBuzz(5);
		Assertions.assertEquals("buzz", result);
	}
	@Test
	public void should_return_Fizz_when_input_7() {
		Game game = new Game();
		String result=game.fizzBuzz(7);
		Assertions.assertEquals("whizz", result);
	}
	@Test
	public void should_return_Fizz_when_input_15() {
		Game game = new Game();
		String result=game.fizzBuzz(15);
		Assertions.assertEquals("fizzbuzz", result);
	}
	
	
	
}
