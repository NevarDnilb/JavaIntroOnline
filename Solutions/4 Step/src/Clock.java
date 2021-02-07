/*
 * 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
 * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
 * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
 * заданное количество часов, минут и секунд.
 */
public class Clock {
	private int hours = 0;
	private int minutes = 0;
	private int seconds = 0;
	
	public Clock(int anHour, int aMinute, int aSecond) {
		if ((anHour > -1) && (anHour < 24)) {
			this.hours = anHour;
		}
		if ((aMinute > -1) && (aMinute < 59)) {
			this.minutes = aMinute;
		}
		if ((aSecond > -1) && (aSecond < 59)) {
			this.seconds = aSecond;
		}
	}
	
	private void check() {
		if ((this.hours > 23) || (this.hours < 0)) {
			this.hours = 0;
		}
		if ((this.minutes > 59) || (this.minutes < 0)) {
			this.minutes = 0;
		}
		if ((this.seconds > 59) || (this.seconds < 0)) {
			this.seconds = 0;
		}
	}

	public void setHours(int value) {
		this.hours = value;
		this.check();
	}
	public void setMinutes(int value) {
		this.minutes = value;
		this.check();
	}
	public void setSeconds(int value) {
		this.seconds = value;
		this.check();
	}
	public void setAll(int hour, int minute, int second) {
		this.hours = hour;
		this.minutes = minute;
		this.seconds = second;
		this.check();
	}
	
	public String whatTimeIsIt() {
		String res = this.hours + ":" + this.minutes + ":" + this.seconds;
		return res;
	}
	
	public static void main(String[] args) {
		
		Clock clock = new Clock(12, 10, 53);
		
		System.out.println(clock.whatTimeIsIt());
		clock.setHours(10);
		clock.setMinutes(20);
		clock.setSeconds(30);
		System.out.println(clock.whatTimeIsIt());
		clock.setHours(24);
		clock.setMinutes(60);
		clock.setSeconds(60);
		System.out.println(clock.whatTimeIsIt());
		clock.setHours(-1);
		clock.setMinutes(-2);
		clock.setSeconds(-3);
		System.out.println(clock.whatTimeIsIt());
		clock.setAll(12, 34, 56);
		System.out.println(clock.whatTimeIsIt());		
	}
}
