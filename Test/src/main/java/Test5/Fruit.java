package Test5;

public class Fruit {
	String name;
	int price;
	
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
	int getPrice(int num) {
		return price*num;
	}
}
