/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля. 
 */
package carTest;

public class Engine {
	protected static enum Fuel {Petrol80, Petrol92, Petrol95, Gas};
	
	private Fuel type;	
	private double fuelConsumptionPer100km;
	
	public Engine( Fuel aType, double consumption) {
		this.type = aType;
		this.fuelConsumptionPer100km = consumption;
	}
	
	public double fuelPerDistance(double km) {
		double res = this.fuelConsumptionPer100km * km / 100;
		return res;
	}
}
