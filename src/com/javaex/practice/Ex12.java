package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int result = 1;
		
		for(int i=1; i<=num; i++) {
			   result = result * i;       //성립되지않을때까지 오른쪽에서 왼쪽으로 대입이된상태가 위로 올라가서 *로 중첩된다고 생각한다!!!
			}
		System.out.println("결과값 :" + result);
		
			
			
		sc.close();

	}

}
