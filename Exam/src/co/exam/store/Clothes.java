package co.exam.store;

public class Clothes implements Store{

	private String storeName;
	private double storeRatio;
		
	public Clothes(String storeName, double storeRatio) {
		this.storeName = storeName;
		this.storeRatio = storeRatio;
	}

	@Override
	public int card(int price) {
		return (int)(price - (price* (Store.CARD_PAYMENT_RATIO + storeRatio)));
	}

	@Override
	public int cash(int price) {
		return (int)(price - (price* (Store.CASH_PAYMENT_RATIO + storeRatio)));
	}

	@Override
	public void showInfo() {
		System.out.println("######"+ storeName + "입니다.");
		System.out.println("카드 결제 할인율 : " + (Store.CARD_PAYMENT_RATIO + storeRatio));
		System.out.println("현금 결제 할인율 : " + (Store.CASH_PAYMENT_RATIO + storeRatio));
		
	}

}
