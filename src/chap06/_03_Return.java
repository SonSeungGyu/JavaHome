package chap06;

public class _03_Return {
	//호텔 전화번호
	public static String getNum() {
		String phoneNum = "01-2313-1234";
		return phoneNum;
	}
	//호텔 주소
	public static String getAdd() {
		return "인천 남동구";
	}
	
	//호텔 액티비티
	public static String getAct() {
		return "볼링장, 탁구장, 노래방";
	}
	
	public static void main(String[] args) {
		//반환값, return
		String num = getNum();
		System.out.println(num);
		
		System.out.println(getAdd());
		
		System.out.println(getAct());
	}
}
