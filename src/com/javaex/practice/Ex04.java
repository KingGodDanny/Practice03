package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			System.out.println(i);
		}

		System.out.println("=================");
		
		for(int i=10; i>0; i=i-2) {
			System.out.println(i);
		}
	}

}

/*
 i=1 일때 i<5안에 성립이되고 ++되면서 i=4까지 i<5안에 성립이되기때문에 
 1
 2
 3
 4 까지 출력이되고 난후에 더이상 성립이되지않으니 아래 출력인
 =================== 가 출력이되고
 i=10가 초기값이고 i>0에 성립이 되니깐 
 10 이출력되고 그다음은 i(10)-2가 i에 들어가서 8이 되고 8(i)>0 에 성립이되서
 8  이 출력되고 이렇게 2까지 >0에 성립되서
 6
 4
 2 로 출력된다. 
 
*/