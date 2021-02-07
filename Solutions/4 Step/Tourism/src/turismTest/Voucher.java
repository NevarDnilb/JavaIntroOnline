/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
package turismTest;

public class Voucher {
	protected enum TypeOfTrip {RECREATION, EXCURSION, TREATMENT, SHOPPING, CRUISE};
	protected enum TypeOfTransport {TRAIN, AIRPLANE, AUTOBUS, SHIP};
	protected enum TypeOfMeals {ALL_INCLUSIVE, OWN_EXPENSE, THREE_TIMES, ONLY_BREAKFAST};
	
	private String tuorName;
	private TypeOfTrip trip;
	private TypeOfTransport transport;
	private TypeOfMeals meals;
	private int numOfDays;
	
	public Voucher(String aName, TypeOfTrip aTrip, TypeOfTransport aTransport, TypeOfMeals food, int theDays) {
		this.tuorName = aName;
		this.trip = aTrip;
		this.transport = aTransport;
		this.meals = food;
		this.numOfDays = theDays;
	}

	public void setTypeOfTrip(TypeOfTrip value) {
		this.trip = value;
	}
	public void setTypeOfTransport(TypeOfTransport value) {
		this.transport = value;
	}
	public void setTypeOfMeals(TypeOfMeals value) {
		this.meals = value;
	}
	public void setDays(int value) {
		this.numOfDays = value;
	}
	public void setTourName(String value) {
		this.tuorName = value;
	}
	
	public TypeOfTrip getTypeOfTrip() {
		return this.trip;
	}
	public TypeOfTransport getTypeOfTransport() {
		return this.transport;
	}
	public TypeOfMeals getTypeOfMeals() {
		return this.meals;
	}
	public int getDays() {
		return this.numOfDays;
	}
	public String getTourName() {
		return this.tuorName;
	}
	
	public int getCost() {
		int res = 0;
		switch (this.trip) {
			case RECREATION: res += 100;
							 break;
			case EXCURSION: res += 200;
							break;
			case TREATMENT: res += 1000;
							break;
			case SHOPPING: res += 50;
						   break;
			case CRUISE: res += 1000;
			default:
		}
		switch (this.meals) {
			case ALL_INCLUSIVE: res += 15;
								break;
			case THREE_TIMES: res += 8;
							  break;
			case ONLY_BREAKFAST: res += 3;
			default:
		}
		res *= this.numOfDays;
		
		switch (this.transport) {
			case TRAIN: res += 20;
						break;
			case AIRPLANE: res += 100;
						   break;
			case AUTOBUS: res += 10;
						  break;
			case SHIP: res += 50;
			default:
		}
		
		return res;
	}
	
	public String toString() {
		return this.getTourName() + ". Type of trip: " + this.getTypeOfTrip() + ". Transport: " + this.getTypeOfTransport() + ". Meals: " +
				this.getTypeOfMeals() + ". Days: " + this.getDays();
	}
}
