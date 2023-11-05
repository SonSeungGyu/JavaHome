package chap07;

import chap07.camera.FactoryCam;
import chap07.camera.SpeedCam;

public class _15_Super {
	public static void main(String[] args) {
		
		//super
		FactoryCam factoryCam = new FactoryCam();
		SpeedCam speedCam = new SpeedCam();
		
		factoryCam.recordVideo();
		System.out.println("---------------------");
		speedCam.takePicture();
	}
}

