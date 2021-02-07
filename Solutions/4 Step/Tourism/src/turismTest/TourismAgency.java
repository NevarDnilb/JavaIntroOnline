/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
package turismTest;

import java.util.ArrayList;
import java.util.Arrays;

public class TourismAgency {
	private Voucher[] tours;
	
	public TourismAgency(Voucher...vouchers) {
		this.tours = vouchers;
	}
	
	public Voucher[] getTripList(Voucher.TypeOfTrip trip) {
		ArrayList<Voucher> buffer = new ArrayList<>();
		for (Voucher voucher: this.tours) {
			if (voucher.getTypeOfTrip().equals(trip)) {
				buffer.add(voucher);
			}
		}
		Voucher[] res = new Voucher[buffer.size()];
		int i = 0;
		for (Voucher voucher: buffer) {
			res[i] = voucher;
			i++;
		}
		return res;
	}
	
	public Voucher[] getListSortedByCost() {
		Voucher[] res = Arrays.copyOf(this.tours, this.tours.length);
		Arrays.sort(res, (first, second) -> (first.getCost() - second.getCost()));
		return res;
	}
	
	public static void main(String[] args) {
		Voucher trip1 = new Voucher("Rest1", Voucher.TypeOfTrip.RECREATION, Voucher.TypeOfTransport.TRAIN, 
				Voucher.TypeOfMeals.ALL_INCLUSIVE, 14);
		Voucher trip2 = new Voucher("Rest2", Voucher.TypeOfTrip.RECREATION, Voucher.TypeOfTransport.AIRPLANE, 
				Voucher.TypeOfMeals.THREE_TIMES, 7);
		Voucher trip3 = new Voucher("Shopping", Voucher.TypeOfTrip.SHOPPING, Voucher.TypeOfTransport.AUTOBUS, 
				Voucher.TypeOfMeals.OWN_EXPENSE, 2);
		Voucher trip4 = new Voucher("Rest3", Voucher.TypeOfTrip.RECREATION, Voucher.TypeOfTransport.SHIP, 
				Voucher.TypeOfMeals.ONLY_BREAKFAST, 4);
		Voucher trip5 = new Voucher("Sanatory", Voucher.TypeOfTrip.TREATMENT, Voucher.TypeOfTransport.TRAIN, 
				Voucher.TypeOfMeals.ALL_INCLUSIVE, 30);	
		TourismAgency agencyTest = new TourismAgency(trip1, trip2, trip3, trip4, trip5);
		
		for (Voucher trip: agencyTest.getTripList(Voucher.TypeOfTrip.RECREATION)) {
			System.out.println(trip);
		}
		System.out.println();
		for (Voucher trip: agencyTest.getListSortedByCost()) {
			System.out.println(trip);
		}
	}
}
