/*
 * 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */
import static java.lang.Math.max;

public class Test1{
	  private double first;
	  private double second;
	  
	  public Test1(double aFirst, double aSecond) {
		  this.first = aFirst;
		  this.second = aSecond;
	  }
	  public Test1(double aFirst) {
		  this(aFirst, 0);
	  }
	  public Test1() {
		  this(0, 0);
	  }
	  public void setFirst(double value) {
		  this.first = value;
	  }
	  public void setSecond(double value) {
		  this.second = value;
	  }
	  
	  public void printlnFirst() {
		  System.out.println(this.first);
	  }
	  public void printlnSecond() {
		  System.out.println(this.second);
	  }
	  public void printlnBoth() {
		  System.out.println(this.first + ", " + this.second);
	  }
	  
	  public double sum() {
		  double res = this.first + this.second;
		  return res;
	  }
	  public double maximum() {
		  double res = max(this.first, this.second);
		  return res;
	  }
	  
	  public static void main(String[] args) {
		  Test1 test = new Test1(13,2);
		  test.printlnFirst();
		  test.printlnSecond();
		  test.printlnBoth();
		  
		  test.setFirst(15);
		  test.setSecond(-10);

		  test.printlnFirst();
		  test.printlnSecond();
		  test.printlnBoth();
		  
		  System.out.println(test.sum());
		  System.out.println(test.maximum());
	  }
  }