/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */
package governmentTest;

public class Government {
	private City capital;
	private Region[] regions;
	
	public Government(City aCapital, Region...theRegions) {
		this.capital = aCapital;
		this.regions = theRegions;
	}
	
	public void setCapital(City newCapital) {
		this.capital = newCapital;
	}
	public City getCapital() {
		return this.capital;
	}
	public double getArea() {
		double res = 0;
		for (Region region: this.regions) {
			res += region.getArea();
		}
		return res;
	}
	public int numberOfRegions() {
		return this.regions.length;
	}
	public City[] getRegionCenters() {
		City[] res = new City[this.regions.length];
		for (int i = 0; i < this.regions.length; i++) {
			res[i] = this.regions[i].getCenter();
		}
		return res;
	}
	
	public static void main(String[] args) {
		City city1 = new City("Bobruisk");
		City city2 = new City("Mogilev");
		City city3 = new City("Minsk");
		City city4 = new City("Grodno");
		City city5 = new City("Gomel");
		
		District district1 = new District(10000, city1, city2);
		District district2 = new District(9999, city3);
		District district3 = new District(1234, city4);
		District district4 = new District(1234, city5);
		
		Region region1 = new Region(city3, district1, district2);
		Region region2 = new Region(city4, district3, district4);
		
		Government government = new Government(city3, region1, region2);
		System.out.println("Capital: " + government.getCapital().toString());
		System.out.println("Number of regions: " + government.numberOfRegions());
		System.out.println("Area: " + government.getArea());
		for (City city: government.getRegionCenters()) {
			System.out.println(city);
		}
	}
}
