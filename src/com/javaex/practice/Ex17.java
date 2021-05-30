package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		
		for(int y = 1; y<=num; y++) {
				for(int x = y; x<=num; x++ ) {
					System.out.print("*");
			}
				System.out.println("");
		}
		
		
		sc.close();

	}

}

/*
내가 정해놓은 Y축과 X축의 규칙을 잘보고 나중에는 Y라는 변수는 i라는 변수로 사용할수있도록 
할것같다.

*/