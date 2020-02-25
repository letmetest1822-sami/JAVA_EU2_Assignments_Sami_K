package assignments.Assignment10;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your HTML : ");
		String html = sc.nextLine();
		if(!html.contains("<html>")) {
			System.out.println("Invalid input!");
		}else {
			int beginIndex = html.indexOf('"');
			int endIndex = html.indexOf('"',beginIndex+1)+1;
			System.out.println(html.substring(beginIndex,endIndex));
		}

		
		
		
		
		
		
/*
		String str = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
		String[] arr1 = str.split(",");
		System.out.println(Arrays.toString(arr1));
		
		for (int i=0; i<arr1.length; i++) {
			arr1[i]*/
	}

}
