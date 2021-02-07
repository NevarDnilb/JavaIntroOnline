/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля. 
 */
package carTest;

public class Wheel {
	protected static enum Type {Summer, Winter};
	
	private int radius;
	private Type tire;
	
	public Wheel(int aRadius, Type aTire) {
		this.radius = aRadius;
		this.tire = aTire;
	}

	public void chageWheel(int aRadius, Type aTire) {
		this.radius = aRadius;
		this.tire = aTire;
	}
	public void chageWheel(int aRadius) {
		this.radius = aRadius;
	}
	public void chageWheel(Type aTire) {
		this.tire = aTire;
	}
	
	public String toString() {
		return "[Radius: " + this.radius + ", Tire: " + this.tire + "]";
	}
	
}
