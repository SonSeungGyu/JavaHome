package chap06;

public class _Quiz_06 {
	public static void main(String[] args) {
		String name = "김서방";
		String id = "911111-1234567";
		String num = "010-2099-1923";
		
		System.out.println("이름 : " + getHiddenData(name, 1));
		System.out.println("주민등록번호 : " + getHiddenData(id, 8));
		System.out.println("전화번호 : " + getHiddenData(num, 9));
		
	}

	public static String getHiddenData(String str, int a) {
		String hiddenData;
		hiddenData = str.substring(0,a);
		for (int i = 0; i < str.length()-a; i++) {
			hiddenData += "*";
		}
		return hiddenData;
	}
}





