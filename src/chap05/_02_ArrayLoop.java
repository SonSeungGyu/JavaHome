package chap05;

public class _02_ArrayLoop {
	public static void main(String[] args) {
		
		//배열의 순회
		String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
		
		//for 반복문 순회 -> 인덱스 번호를 이용하여 조건을 주려면 일반 for문을 이용
		for (int i = 0; i < coffees.length; i++) {
			System.out.println(coffees[i] + " 하나");
		}
		
		System.out.println("---------------------------------------");

		//for-each 반복문  -> 배열의 모든 요소를 순회하면서 작업할 때 간편
		for (String coffee : coffees) {
			System.out.println(coffee + " 하나");
		}
		
	}
}
