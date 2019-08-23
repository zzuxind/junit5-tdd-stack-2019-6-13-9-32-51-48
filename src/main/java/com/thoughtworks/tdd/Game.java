package com.thoughtworks.tdd;

public class Game {
	private static String FIZZ="Fizz";
	private static String BUZZ="Buzz";
	private static String WHIZZ="Whizz";

	public String play(int number) {
		String resultString="";
		if(number<1 || number>105) {
			resultString="invalid";
		}else {
			if(number % 3 == 0) {
				resultString+=FIZZ;
			}
			if(number % 5 ==0) {
				resultString+=BUZZ;
			}
			if(number % 7 == 0) {
				resultString+=WHIZZ;
			}if(resultString == "") {
				resultString=String.valueOf(number);
			}
		}
		
	
		return resultString;
}
}
