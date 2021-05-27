package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		int x,y;
		for(x=0; x<4; x++) {
			for(y=2; y>=0; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}

/*
 x=0일때 x<4 성립이되고 그아래 반복문인 y=2 일때 y>=0안에 성립이되서 print:*이 1개찍히고 
 그다음 Y가 --가 되면 y=1이되고 또 성립이되서 그옆에 * 찍히고 또 --가 적용되서 0이되고 성립이 되기때문에 ***가되고
 그다음 y= -1은 성립이되지않기때문에 아래에 공백이 출력되고 x=3일때까지 총 4번 성립되기때문에
 ***
 ***
 ***
 ***가 출력된다. 
 
*/