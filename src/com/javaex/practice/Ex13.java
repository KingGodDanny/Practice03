package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum = sum + i;
		}
			System.out.println("합계: " + sum);
			
			
		sc.close();
	}

	
}

/*

sum의 초기값을 0이 아닌 그 이상의 숫자를 넣어줫을경우엔 그 수부터 더해지기때문에
num의 1부터의 합과 sum 초기값이 더해져버린다.

*/