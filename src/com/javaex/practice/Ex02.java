package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		int x, y;
		for(x=0; x<4; x++) {
			for(y=0; y<2; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}

/*
x= 0이고 x<4안에 성립됐으니 그 안에 반복문에서 y는 0과 1이 성립되기때문에
print인 상황에서 가로로 **이 찍히고 그다음 2는 y<2에 성립이 되지않기때문에
다음 출력인 공백이 출력되고 또다시 올라가서 x=1일때 x<4안에 성립되기 때문에
또 y가 반복문이 실행되고 0과 1이 y<2에 성립이니깐 print출력으로인해 가로로 **
찍혀서 x=3까지 총 4번의 반복이 되고 그래서
**
**
**
** 으로 출력된다. 

*/