package com.thoughtworks.tdd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
	
	@Test
	public void should_return_1_when_input_1() {
		Game game=new Game();
		String gameString=game.play(1);
		Assertions.assertEquals("1", gameString);
	}
	
	@Test
	public void should_return_Fizz_when_input_3() {
		Game game=new Game();
		String gameString=game.play(3);
		Assertions.assertEquals("Fizz", gameString);
	}

	@Test
	public void should_return_Buzz_when_input_5() {
		Game game=new Game();
		String gameString=game.play(5);
		Assertions.assertEquals("Buzz", gameString);
	}
	
	@Test
	public void should_return_Whizz_when_input_7() {
		Game game=new Game();
		String gameString=game.play(7);
		Assertions.assertEquals("Whizz", gameString);
	}
	
	@Test
	public void should_return_FizzBuzz_when_input_15() {
		Game game=new Game();
		String gameString=game.play(15);
		Assertions.assertEquals("FizzBuzz", gameString);
	}
	@Test
	public void should_return_BuzzWhizz_when_input_35() {
		Game game=new Game();
		String gameString=game.play(35);
		Assertions.assertEquals("BuzzWhizz", gameString);
	}
	@Test
	public void should_return_FizzWhizz_when_input_21() {
		Game game=new Game();
		String gameString=game.play(21);
		Assertions.assertEquals("FizzWhizz", gameString);
	}
	@Test
	public void should_return_FizzBuzzWhizz_when_input_21() {
		Game game=new Game();
		String gameString=game.play(105);
		Assertions.assertEquals("FizzBuzzWhizz", gameString);
	}
	

}

