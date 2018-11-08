package chap20.Flyweight;

import java.util.HashMap;
import java.util.Map;

import chap20.Flyweight.FontExam.Font;

public class FontExam {
	public enum Font{
		BOLD,ITALIC,SUPERSCRIPT,SUBSCRIPT, STRIKETHROUGH
	}
	Map<Font,FontStyle> map = new HashMap<Font,FontStyle>();
	
	public FontStyle getFont(Font fontName){
		FontStyle fontStyle = map.get(fontName);
		if(fontStyle==null){
			fontStyle = new FontStyle(fontName);
			map.put(fontName, fontStyle);
		}
		return fontStyle;
	}
}

class FontStyle{

    private String name;

    public FontStyle(Font name){
        this.name = name.name();
        System.out.println("create : " + this.name);
    }

}






