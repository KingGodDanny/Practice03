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

/*

곱해지는 값을 받기위한 result 이라는 변수를 잡아줘야하며
result 의 초기값을 0으로 줫을경우에 *0 은 0이 되기때문에 1로 초기값을 잡아야한다.

*/