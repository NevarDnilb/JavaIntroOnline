/*
 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 *и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
 *методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 *Найти и вывести:
 *a) список рейсов для заданного пункта назначения;
 *b) список рейсов для заданного дня недели;
 *c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
package airLineTest;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Airport {
	private Airline[] airlines;
	
	public Airport(Airline...theAirlines) {
		this.airlines = theAirlines;
	}
	
	public Airline[] getAirlines() {
		return this.airlines;
	}
	
	public Airline[] airlinesWithTarget(String aTarget) {
		ArrayList<Airline> buffer = new ArrayList<>();
		for (Airline airline: this.airlines) {
			if (airline.getTarget().equals(aTarget)) {
				buffer.add(airline);
			}
		}
		int i = 0;
		Airline[] res = new Airline[buffer.size()];
		for (Airline airline: buffer) {
			res[i] = airline;
			i++;
		}
		return res;
	}
	
	public Airline[] airlinesOnDay(String aDay) {
		ArrayList<Airline> buffer = new ArrayList<>();
		Pattern pattern = Pattern.compile(aDay);
		for (Airline airline: this.airlines) {
			Matcher matcher = pattern.matcher(airline.getDaysOfWeek());
			if (matcher.find()) {
				buffer.add(airline);
			}
		}
		int i = 0;
		Airline[] res = new Airline[buffer.size()];
		for (Airline airline: buffer) {
			res[i] = airline;
			i++;
		}
		return res;
	}
	
	public Airline[] airlinesOnDayAfterTime(String aDay, int anHour, int aMinute) {
		ArrayList<Airline> buffer = new ArrayList<>();
		for (Airline airline: this.airlinesOnDay(aDay)) {
			if (airline.getHour() * 60 + airline.getMinute() > anHour * 60 + aMinute) {
				buffer.add(airline);
			}
		}
		int i = 0;
		Airline[] res = new Airline[buffer.size()];
		for (Airline airline: buffer) {
			res[i] = airline;
			i++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Airline airline1 = new Airline("Target 1", 10, Airline.PlaneType.PASSENGER, 13, 45, "Mon, Wed, Fri");
		Airline airline2 = new Airline("Target 2", 9, Airline.PlaneType.STATE, 7, 40, "Tue, Thu, Sun");
		Airline airline3 = new Airline("Target 1", 8, Airline.PlaneType.PRIVATE, 12, 00, "Wed, Sun");
		Airline airline4 = new Airline("Target 3", 7, Airline.PlaneType.AIRBUS, 10, 45, "Mon, Wed, Fri");
		Airport airport1 = new Airport(airline1, airline2, airline3, airline4);
		
		System.out.println("Airlines with target 'Target 1'");
		for (Airline airline: airport1.airlinesWithTarget("Target 1")) {
			System.out.println(airline.toString());
		}
		System.out.println();
		System.out.println("Airlines on Wed");
		for (Airline airline: airport1.airlinesOnDay("Wed")) {
			System.out.println(airline.toString());
		}
		System.out.println();
		System.out.println("Airlines on Wed after 11:00");
		for (Airline airline: airport1.airlinesOnDayAfterTime("Wed", 11, 00)) {
			System.out.println(airline.toString());
		}
		System.out.println();		
	}
}
