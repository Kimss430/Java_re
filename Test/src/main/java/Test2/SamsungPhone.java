package Test2;

public class SamsungPhone implements PhonIterface {

	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가왔습니다.");
	}
	public void flash() {
		System.out.println("핸드폰 불이 켜졌습니다.");
	}
}
