/*
 * 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.\
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. 
 * Добавьте set- и get- методы для полей экземпляра класса.
 */
public class Test2 {
	private double first;
	private double second;
	  
	public Test2(double aFirst, double aSecond) {
		this.first = aFirst;
		this.second = aSecond;
	}
	public Test2(double aFirst) {
		this(aFirst, 0);
	}
	public Test2() {
		this(0, 0);
	 }
	  
	public void setFirst(double value) {
		this.first = value;
	 }
	public void setSecond(double value) {
		this.second = value;
	 }

	 public double getFirst() {
		 return this.first;
	 }
	 public double getSecond() {
		 return this.second;
	 }
	  
	 public static void main(String[] args) {
		 Test2 test = new Test2(13,10);
		 System.out.println(test.getFirst() + " " + test.getSecond());
		 test.setFirst(15);
		 test.setSecond(-20);
		 System.out.println(test.getFirst() + " " + test.getSecond());
	 }
}
