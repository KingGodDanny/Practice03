package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
						
		int sum=0;									  
		for(int i=1; i<=num; i++) {					  
			if( num%2==0 && i%2==0) {
				sum = sum + i;
			} else if(num%2==1 && i%2==1) {
				sum = sum + i;   //   =  1(o) , 3(0)
			} 
		}
			System.out.println("결과값: " + sum); //135
							
		sc.close();
	}

}

/*
 
 반복해야되는 i라는 값/   입력받아야하는 num / 합계의 sum값
 sum은 결과값을 출력할 합계라는 변수이고 num=3이라하고 i는 
 */