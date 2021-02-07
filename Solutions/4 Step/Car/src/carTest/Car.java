/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
 * менять колесо, вывести на консоль марку автомобиля. 
 */
package carTest;

import carTest.Engine.Fuel;

public class Car {
	private Wheel[] wheels;
	private Engine engine;
	private double fuelLevel;
	private double fuelTankVolume;
	private String name;
	
	public Car(String aName, Engine anEngine, double aFuelTankVolume, Wheel...theWheels) {
		this.name = aName;
		this.wheels = theWheels;
		this.engine = anEngine;
		this.fuelTankVolume = aFuelTankVolume;
		this.fuelLevel = 0;
	}
	
	public String getMark() {
		return this.name;
	}
	public Wheel[] getWheels() {
		return this.wheels;
	}
	public String getWheelsToString() {
		StringBuilder buffer = new StringBuilder();
		for (Wheel wheel: this.wheels) {
			buffer.append(wheel.toString());
		}
		return buffer.toString();
	}
	public double getFuelLevel() {
		return this.fuelLevel;
	}
	public boolean moveFor(double km) {
		boolean secsess = true;
		if (this.engine.fuelPerDistance(km) > fuelLevel) {
			secsess = false;
		} else {
			this.fuelLevel = this.fuelLevel - this.engine.fuelPerDistance(km);
		}
		return secsess;
	}
	
	public void refuel(double aFuel) {
		if (this.fuelLevel + aFuel >= this.fuelTankVolume) {
			this.fuelLevel = this.fuelTankVolume;
		} else {
			this.fuelLevel += aFuel;
		}
	}
	public void changeCarWheel(int index, int aRadius, Wheel.Type aTire) {
		this.wheels[index].chageWheel(aRadius, aTire);
	}
	public void changeCarWheel(int index, Wheel.Type aTire) {
		this.wheels[index].chageWheel(aTire);
	}
	public void changeCarWheel(int index, int aRadius) {
		this.wheels[index].chageWheel(aRadius);
	}
	public void changeCarWheel(int index) {
		//Change to the same radius and type;
	}
	
	public static void main(String[] args) {
		Wheel wheel1 = new Wheel(20, Wheel.Type.Summer);
		Wheel wheel2 = new Wheel(20, Wheel.Type.Summer);
		Wheel wheel3 = new Wheel(20, Wheel.Type.Summer);
		Wheel wheel4 = new Wheel(20, Wheel.Type.Summer);
		Engine engine = new Engine(Fuel.Petrol92, 6);
		Car car = new Car("Pepelatz", engine, 60, wheel1, wheel2, wheel3, wheel4);
		car.refuel(36);
		System.out.println(car.getMark() + " " + car.getWheelsToString() + " Fuel Level: " + car.getFuelLevel());
		car.moveFor(200);
		for (int i = 0; i < car.getWheels().length; i++) {
			car.changeCarWheel(i, Wheel.Type.Winter);
		}	
		System.out.println(car.getMark() + " " + car.getWheelsToString() + " Fuel Level: " + car.getFuelLevel());
		car.refuel(50);
		for (int i = 0; i < car.getWheels().length; i++) {
			car.changeCarWheel(i, 25, Wheel.Type.Summer);
		}	
		System.out.println(car.getMark() + " " + car.getWheelsToString() + " Fuel Level: " + car.getFuelLevel());
	}
}
