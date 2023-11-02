package chap_08;

import chap07.BlackBoxRefur;

public class _00_AccessModifierTest {
	public static void main(String[] args) {
		BlackBoxRefur b1 = new BlackBoxRefur();
		b1.modelName = "까망이"; // public
		//b1.resolution = "fhd";//default (같은 패키지가 아니라서)
		//b1.price = 200000; // private (같은 클래스가 아니라서)
		//b1.color = "노랑";//protected (다른 패키지에 자식도 아니라서 에러)
		
	}
}
