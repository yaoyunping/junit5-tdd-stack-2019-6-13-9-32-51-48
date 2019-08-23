package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

public class Game {
	public String fizzBuzz(int i){
		if (i%3==0) {
		    return "fizz";		
	}
		if (i%5==0) {
		    return "buzz";
		}
		if (i%7==0) {
			return "whizz";
		}
		if (i%3==0&&i%5==0) {
			return "fizzbuzz";
		}
		return String.valueOf(i);	
	}
	
}
