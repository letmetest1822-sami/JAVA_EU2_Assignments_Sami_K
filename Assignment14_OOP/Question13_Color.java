package assignments.Assignment14_OOP;

import java.util.Arrays;

public class Question13_Color {

/*
 * There are number of ways to describe color to computers, smartphones, tablets, browsers, etc.
One of the popular ways is to use RGB (red, green, blue) value.

More info: https://en.wikipedia.org/wiki/RGB_color_model
RGB chart: https://www.rapidtables.com/web/color/RGB_Color.html

In this task, we are going to write a simple Color class, that can represent only a few major colors.

Available colors are already initialized to static final arrays.  

Color.javaPreview the document

We will practice :
overloading constructors
this() keyword
comparing arrays
overriding toString method

Color color = new Color();
System.out.println(color.toString() ) ; // prints "white"

Color color2 = new Color(255, 0, 0);
System.out.println(color2.toString() ) ; // prints "red"

Color color3 = new Color(255, 44, 88);
System.out.println(color3.toString() ) ; // prints "n/a"

Color color4 = new Color(192, 192, 192);
System.out.println(color4 ) ; // prints "light gray"	
 */
	
public static void main(String[] args) {
		
		Color color = new Color();
		System.out.println(color.toString() ) ; // prints "white"
		
		Color color2 = new Color(255, 0, 0);
	    System.out.println(color2.toString() ) ; // prints "red"
	     
	    Color color4 = new Color(192, 192, 192); 
	    System.out.println(color4 ) ; // prints "light gray"
	    
	}

}

class Color {
	

	private int[] rgb = new int[3];



	public final static int[] WHITE     = new int[]{255, 255, 255};
	public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
	public final static int[] GRAY      = new int[]{128, 128, 128};
	public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
	public final static int[] BLACK     = new int[]{0, 0, 0};
	public final static int[] RED       = new int[]{255, 0, 0};
	public final static int[] PINK      = new int[]{255, 175, 175};
	public final static int[] ORANGE    = new int[]{255, 200, 0};
	public final static int[] YELLOW    = new int[]{255, 255, 0};
	public final static int[] GREEN     = new int[]{0, 255, 0};
	public final static int[] MAGENTA   = new int[]{255, 0, 255};
	public final static int[] CYAN      = new int[]{0, 255, 255};
	public final static int[] BLUE      = new int[]{0, 0, 255};



	public Color(int r, int g, int b){
	   rgb[0] = r;
	   rgb[1] = g;
	   rgb[2] = b;
	}


	public Color() {
	    this(255,255,255);
	}


	public String toString() {
		int[][] rgbs = {WHITE,LIGHT_GRAY,GRAY,DARK_GRAY,BLACK,RED,PINK,ORANGE,YELLOW,GREEN,MAGENTA,CYAN,BLUE};
		String[] colors = {"white","light gray","gray","dark gray","black","red","pink","orange","yellow","green","magenta","cyan","blue"};
		for(int i =0;i<rgbs.length;i++) {
			if(Arrays.equals(rgb,rgbs[i])){
				return colors[i];
			}
		}
		return "n/a"; 

	}
}