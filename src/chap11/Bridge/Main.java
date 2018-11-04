package chap11.Bridge;

import java.awt.Toolkit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final PrintMorseCode wordMorseCode = new PrintMorseCode(new Word());
		final PrintMorseCode flashMorseCode = new PrintMorseCode(new Flash());
		final PrintMorseCode soundMorseCode = new PrintMorseCode(new Sound());
		System.out.println("Morse code word");
		
		wordMorseCode.S().O().S();
		
		System.out.println();
		
		wordMorseCode.I().M().I().S().S().Y().O().U();
		
		System.out.println();
		System.out.println("######################");

		
		System.out.println("Morse code flash");
		
		flashMorseCode.S().O().S();
		
		System.out.println();
		
		flashMorseCode.I().M().I().S().S().Y().O().U();
		
		System.out.println();
		System.out.println("######################");
		
		
		
		System.out.println("Morse code sound");
		
		soundMorseCode.S().O().S();
		soundMorseCode.I().M().I().S().S().Y().O().U();
		
		System.out.println();
		System.out.println("######################");
		
		
		
		
		
	}

}
