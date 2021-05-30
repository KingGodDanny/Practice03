package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			if(i%5==0) {
			sum = sum + i;
			
			}
		}
		System.out.println("5의 배수의 개수: " + num/5);
		System.out.println("5의 배수의 합  :" + sum);
		
		
		sc.close();

	}

}

/*
if문안에 배수의 합을 출력하라는 sysout을 넣어주면 true일때마다 합값을 출력해주기때문에
반복문 바깥으로 써주는것을 잘생각해야한다.
*/