package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		for(int num=1; num<=100; num++) {
			if (num%5==0 && num%7==0) {
				System.out.println(num);
			}
		}
					
	}

}

/*
1에서 100까지의 수중에 5의 배수 이면서(if) 7의 배수인 수를 출력하라는것은 
반복문안에 if 가 들어가야한다. 
break를 안걸은 이유는 35가 성립되면 break에 걸려 반복이 끝나버리기때문이다.
*/