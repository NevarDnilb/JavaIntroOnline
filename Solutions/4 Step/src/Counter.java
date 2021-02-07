/*
 * 5. ќпишите класс, реализующий дес€тичный счетчик, который может увеличивать или уменьшать свое значение
 * на единицу в заданном диапазоне. ѕредусмотрите инициализацию счетчика значени€ми по умолчанию
 * и произвольными значени€ми. —четчик имеет методы увеличени€ и уменьшени€ состо€ни€, и метод
 * позвол€ющее получить его текущее состо€ние. Ќаписать код, демонстрирующий все возможности класса.
 * 
 * прим. ѕри пересечении границы счЄткич будет получать значение этой границы.
 */
import java.util.Scanner;

public class Counter {
	private int minValue;
	private int maxValue;
	private int currentValue;
	
	public Counter(int min, int max, int value) {
		this.minValue = min;
		this.maxValue = max;
		this.currentValue = value;
	}
	public Counter(int min, int max) {
		this(min, max, min);
	}
	
	public int getCurrentValue() {
		return this.currentValue;
	}
	
	public void setCounterValue(int value) {
		this.currentValue = value;
		if (value > this.maxValue) {
			this.currentValue = this.maxValue;
		}
		if (value < this.minValue) {
			this.currentValue = this.minValue;
		}
	}
	public void setDefaultValue() {
		this.currentValue = this.minValue;
	}
	
	public void increase() {
		this.currentValue++;
		if (this.currentValue > this.maxValue) {
			this.currentValue = this.maxValue;
		}
	}
	public void decrease() {
		this.currentValue--;
		if (this.currentValue < this.minValue) {
			this.currentValue = this.minValue;
		}
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter minimun and maximum vlues: ");
		int min = in.nextInt();
		int max = in.nextInt();
		
		Counter counter1 = new Counter(min, max, (min+max) / 2);
		Counter counter2 = new Counter(min, max);
		
		System.out.println(counter1.getCurrentValue() + ", " + counter2.getCurrentValue());
		counter1.increase();
		counter2.decrease();
		System.out.println(counter1.getCurrentValue() + ", " + counter2.getCurrentValue());
		counter1.increase();
		counter2.increase();
		System.out.println(counter1.getCurrentValue() + ", " + counter2.getCurrentValue());
		counter1.decrease();
		counter2.decrease();
		System.out.println(counter1.getCurrentValue() + ", " + counter2.getCurrentValue());
		counter1.decrease();
		counter2.setCounterValue(max);
		System.out.println(counter1.getCurrentValue() + ", " + counter2.getCurrentValue());
		counter1.setDefaultValue();
		counter2.increase();
		System.out.println(counter1.getCurrentValue() + ", " + counter2.getCurrentValue());
	}
}
