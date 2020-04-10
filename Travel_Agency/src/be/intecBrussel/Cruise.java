package be.intecBrussel;

import java.time.LocalDateTime;

public class Cruise extends Voyage {
	
	public static final double CRUISE_PRICE_EXTRA_COST =10;
	private boolean vip;
	
	public Cruise() {
		super();
	}
	public Cruise (int totalPersonen , LocalDateTime departuerDate , 
			LocalDateTime returnDate,Destination destination, boolean vip ) {
		super (totalPersonen,departuerDate,returnDate,destination);
		this.vip=vip;
	}
	//TODO: Why does this getter return true by default?
	public boolean isVip() {
		return true;	
	}
	public void setVip() {
		
	}
	@Override
	public double calculatePrice() {
		//TODO: What do you do with totalPriceWithCruise? Why are you returning PRICE_PER_DAY here?
		double totalPriceWithCruise=(PRICE_PER_DAY * getTotalDays()) + (CRUISE_PRICE_EXTRA_COST *getTotalDays());
		//TODO: You need to understand the difference in operators. If you use a '=' once, you tell java to change vip to
		// 'true' and the if-statement will always return true. You need to use 2 '=' --> if(vip ==true).
		if (vip =true) {
			System.out.println(totalPriceWithCruise * 1.5);
					}
		return PRICE_PER_DAY  ;	
	}
	
}
