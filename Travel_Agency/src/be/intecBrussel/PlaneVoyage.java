package be.intecBrussel;

import java.time.LocalDateTime;

public class PlaneVoyage extends Voyage {
	private double airplaneTicketPrice;
	
	public PlaneVoyage(double airplaneTicketPrice) {
		this.airplaneTicketPrice=airplaneTicketPrice;
	}
	
	public PlaneVoyage(int totalPersonen , LocalDateTime departuerDate ,
	          LocalDateTime returnDate,Destination destination ,double airplaneTicketPrice) {
		super (totalPersonen,departuerDate,returnDate,destination);
		this.airplaneTicketPrice=airplaneTicketPrice;
	}
	@Override
	public double calculatePrice() {
		//TODO: Why do you need to calculate airplanetaickets for each day? Sounds expensive =D
		double totalPriceWithPlane= (PRICE_PER_DAY * getTotalDays()) + (airplaneTicketPrice * getTotalDays());

		return airplaneTicketPrice ;	
}
}