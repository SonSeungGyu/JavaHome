package chap05;

public class _01_Array {
	public static void main(String[] args) {
		//배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
		
		String coffeeRoss = "아메리카노";
		String coffeeRachel = "카페모카";
		String coffeeChandler = "라떼";
		String coffeeMonica = "카푸치노";
		
//		System.out.println(coffeeRoss + "하나");
//		System.out.println(coffeeRachel + "하나");
//		System.out.println(coffeeChandler + "하나");
//		System.out.println(coffeeMonica + "하나");
		
		//배열 선언 첫 번쨰 방법
		//String[] coffees = new String[4];
		
		//두 번쨰 방법
		//String coffees[] = new String[4];
	
//		coffees[0] = "아메리카노";
//		coffees[1] = "카페모카";
//		coffees[2] = "라떼";
//		coffees[3] = "카푸치노";

		//세 번쨰 방법
//		String[] coffees = new String[] {"아메리카노","카페모카","라떼","카푸치노"};
		
		//네 번쨰 방법
		String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
		
		//커피주문
		System.out.println(coffees[0] + " 하나");
		System.out.println(coffees[1] + " 하나");
		coffees[2] = "에스프로소"; //라떼를 에스프레소로 변경
		System.out.println(coffees[2] + " 하나");
		System.out.println(coffees[3] + " 하나");
	}
}
