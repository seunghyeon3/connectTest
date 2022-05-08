package co.exam.store;

public interface Store {
	
	double CARD_PAYMENT_RATIO = 0.01;
	double CASH_PAYMENT_RATIO = 0.03;
	
	public int card(int price);
	public int cash(int price);
	public void showInfo();	
}
