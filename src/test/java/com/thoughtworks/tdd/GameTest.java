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

	

}

