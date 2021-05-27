package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("while문");
		int index = 0;										// 	while문은 반복문이고 0~2까지 3안에 들어가기때문에
		while( index < 3 ) {								//  while문 / index=0 / index=1 / index=2 이 출력된다.
			System.out.println("index=" + index);
			index++;
		}

		System.out.println("for문");						// for문도 역시 반복문이고 오더는 0이고 ++로 증가하여 1,2까지
		for(int order=0; order<3; order++) {				// 3안에 들어가기때문에 
			System.out.println("order=" + order);			// for문 / order=0 / order=1 / order=2가 출력된다.
		}
	}

}
