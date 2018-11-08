package chap20.Flyweight;

import chap20.Flyweight.FontExam.Font;

public class Main {

	public static void main(String[] args) {
		FontExam fontExam = new FontExam();
		fontExam.getFont(Font.BOLD);
		fontExam.getFont(Font.ITALIC);
		fontExam.getFont(Font.BOLD);
		fontExam.getFont(Font.SUPERSCRIPT);
		fontExam.getFont(Font.SUBSCRIPT);
		fontExam.getFont(Font.SUBSCRIPT);
		fontExam.getFont(Font.STRIKETHROUGH);

	}

}
