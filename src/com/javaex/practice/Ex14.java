package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요:");
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum = sum + i;
			System.out.print(i);
			if(i != num) {
				System.out.print("+");
			}
		}
			System.out.println("");
			System.out.println("합계: " + sum);
		
		sc.close();

	}

}
/*
 규칙을 잘보면 i의 값이 출력되지만 num의 숫자뒤에는 +가 붙지않는패턴을 논리적으로 이해해야한다.
 
 
 */
