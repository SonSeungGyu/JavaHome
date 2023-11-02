package chap05;

public class _Quiz_05 {
	public static void main(String[] args) {
		
		//배열을 활용하여 쇼핑목에서 구매 가능한 신발 사이즈 옵션을 출력하는 
		//프로그램을 작성
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 250 + (5*i);//가능하다면 변수를 추가하지 않고 index를 가지고 최대한 계산해보자.
			System.out.println("사이즈 " + arr[i] + "(재고 있음)");
		}
	}
}
