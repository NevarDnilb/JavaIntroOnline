/*
 * 3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */
package governmentTest;

public class City {
	private String name;
	
	public City(String aName) {
		this.name = aName;
	}
	
	public String getCityName() {
		return this.name;
	}
	public void setCityName(String aName) {
		this.name = aName;
	}
	
	public String toString() {
		return this.name;
	}
}
