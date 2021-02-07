/*
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
 * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
 * назначения должны быть упорядочены по времени отправления.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Train {
	private String target;
	private int id;
	private int time;
	
	public Train(String aName, int aId, int hour, int minute) {
		this.target = aName;
		this.id = aId;
		this.time = hour * 60 + minute;
	}
	
	public int getNumber() {
		return this.id;
	}
	public int getHour() {
		int res = this.time / 60;
		return res;
	}
	public int getMinute() {
		int res = this.time % 60;
		return res;
	}
	public int getTimeInMinutes() {
		return this.time;
	}
	public String getTarget() {
		return this.target;
	}
	
	public static Train[] sortByNumber(Train[] array) {
		Train[] res = array;
		Arrays.sort(res, (first, second) -> (first.getNumber() - second.getNumber()));
		return res;
	}
	public static Train[] sortByTarget(Train[] array) {
		Train[] res = array;
		Arrays.sort(res, (first, second) -> {
			if (first.getTarget().equals(second.getTarget())) {
				return first.getTimeInMinutes() - second.getTimeInMinutes();
			} else {
				return first.getTarget().compareTo(second.getTarget());
			}});
		return res;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Train[] trains = new Train[5];
		trains[0] = new Train("Minsk", 123, 10, 30);
		trains[1] = new Train("Bobruisk", 321, 11, 20);
		trains[2] = new Train("Minsk", 102, 11, 40);
		trains[3] = new Train("Gomel", 322, 6, 20);
		trains[4] = new Train("Bobruisk", 1387, 7, 40);
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of the train You want to know about: ");
		int number = in.nextInt();
		for (Train train: trains) {
			if (train.getNumber() == number) {
				System.out.println("Target: " + train.getTarget() + ", Number: " + number + 
						", Depature time: " + train.getHour() + ":" + train.getMinute());
			}
		}
		System.out.println("_______________");
		for (Train train: Train.sortByNumber(trains)) {
			System.out.println("Target: " + train.getTarget() + ", Number: " + train.getNumber() + 
					", Depature time: " + train.getHour() + ":" + train.getMinute());
		}
		System.out.println("_______________");
		for (Train train: Train.sortByTarget(trains)) {
			System.out.println("Target: " + train.getTarget() + ", Number: " + train.getNumber() + 
					", Depature time: " + train.getHour() + ":" + train.getMinute());
		}
	}
}
