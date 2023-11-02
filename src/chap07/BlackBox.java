package chap07;

public class BlackBox {
	
	//인스턴스 변수, 필드
	String modelName;
	String resolution;
	int price;
	String color;
	int serialNumber;
	
	static int counter = 0;//시리얼 번호를 생성해주는 역활 (처음에 0 이었다가 ++ 연산을 통해 증가)
	
	//클래스 변수, 이 클래스로부터 만들어지는 모든 객체에 똑같이 적용
	static boolean canAutoReport = false;
	
	//생성자
	public BlackBox() {
//		System.out.println("기본 생성자 호출");
//		this.serialNumber = ++counter;//객체를 생성 할때마다 값이 증가한다.
//		System.out.println("새로운 시리얼 넘버를 발급 했습니다 : " + this.serialNumber);
	}
	
	
	public BlackBox(String modelName, String resolution, int price, String color) {
//		this();//기본생성자를 호출한다. 고로 serialNum이 오른다.
//		
//		System.out.println("사용자 정의 생성자 호출");
//		this.modelName = modelName;
//		this.resolution = resolution;
//		this.price = price;
//		this.color = color;
		
	}




	@Override
	public String toString() {
		return "BlackBox [modelName=" + modelName + ", resolution=" + resolution + ", price=" + price + ", color="
				+ color + "]";
	}


	//자동 신고 기능 메소드
	public void autoReport() {
		if(canAutoReport) {
			System.out.println("충돌이 감지되어 자동으로 신고합니다.");
		}else {
			System.out.println("자동 신고 기능이 지원되지 않습니다.");
		}
	}
	
	//메모리카드 삽입 메소드
	public void insertMemoryCard(int capacity) {
		System.out.println("메모리카드가 삽입되었습니다.");
		System.out.println("용량은 " + capacity + "GB 입니다." );
	}
	
	//비디오 파일 메소드
	public int getVideoFileCount(int type) {
		if(type ==1) {
			return 9;
		}else if (type ==2) {
			return 1;
		}
		return 10;
	}
	
	//showDateTime : 날짜 정보 표시여부
	//showSpeed : 속도정부 표시여부
	//min : 영상 기록 단위(분)
	public void record(boolean showDateTime, boolean showSpeed,int min) {
		System.out.println("녹화를 시작합니다.");
		if(showDateTime) {
			System.out.println("영상에 날짜정보가 표시됩니다.");
		}
		if(showSpeed) {
			System.out.println("영상에 속도정보가 표시됩니다.");
		}
		System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
	}
	
	//메소드 오버로딩
	public void record() {
		record(true, true, 5);//메소드에서 메소드 호출 가능.
	}
	
	//클래스 메소드
	static void callServiceCenter() {
		System.out.println("서비스 센터로 연결합니다.");
	}
	
	//모델 이름에 추가 해주는 메소드
	public void appendModelName(String modelName) {
		this.modelName += modelName; //this의 사용 this를 사용 하지 않으면 인수로 받은 변수로 인식.
	}

//------------------getter setter--------------------------------
	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public String getResolution() {
		if(resolution == null || resolution.isEmpty()) {
			return "판매자에게 문의하세요";
		}
		return resolution;
	}


	public void setResolution(String resolution) {
		this.resolution = resolution;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		if(price < 100000) {
			this.price = 100000;
		}else {
			this.price = price;
		}
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
	
	
	
}
