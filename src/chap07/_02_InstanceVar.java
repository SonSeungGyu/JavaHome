package chap07;

public class _02_InstanceVar {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "해상";
		b1.resolution = "fhd";
		b1.price = 200000;
		b1.color = "검정";
		
		System.out.println(b1.modelName);
		System.out.println(b1.resolution);
		System.out.println(b1.price);
		System.out.println(b1.color);
		
		//새로운 블랙박스 제품
		BlackBox b2 = new BlackBox();
		b2.modelName = "현다이";
		b2.resolution = "uhd";
		b2.price = 300000;
		b2.color = "노랑";
		
		System.out.println(b2.modelName);
		System.out.println(b2.resolution);
		System.out.println(b2.price);
		System.out.println(b2.color);
	}
}
