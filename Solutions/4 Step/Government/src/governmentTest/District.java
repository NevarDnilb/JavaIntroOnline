/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */
package governmentTest;

public class District {
	public City[] cities;
	public double area;
	
	public District(double anArea, City...theCities) {
		this.area = anArea;
		this.cities = theCities;
	}
	
	public double getArea() {
		return this.area;
	}
	public City[] getDistrictCities() {
		return this.cities;
	}
}
