package co.exam.store;

public class Main {
	public static void main(String[] args) {
		int price = 50000;
		
		Store clothes = new Clothes("지오다노", 0.02);
		clothes.showInfo();
		System.out.println("카드 결제 금액 : "+ clothes.card(price));
		System.out.println("현금 결제 금액 : "+ clothes.cash(price));
				
		price = 10000;
		Store restaurant = new Restaurant("김밥천국", 0.03);
		restaurant.showInfo();
		System.out.println("카드 결제 금액 : "+ restaurant.card(price));
		System.out.println("현금 결제 금액 : "+ restaurant.cash(price));
		
	}
}
