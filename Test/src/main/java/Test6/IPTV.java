package Test6;

public class IPTV extends ColorTV{
	
	String ip;
	IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
		
	}
	public void printProperty() {
		System.out.print("나의 IPTV는" + ip + " 주소의 ");
		super.printProperty();
	}
	
}
