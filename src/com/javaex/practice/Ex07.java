package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int x,y; 
		
		for (y=1; y<=num; y++) {
			for (x=1; x<=y-1; x++) {
				
				System.out.print(y);
				
			}
			System.out.println(x);
		}
			
		
		
		
		sc.close();
	}

}
 //num=y   x=1  / x<=num /x++      1
/* 7
 
 
 */

