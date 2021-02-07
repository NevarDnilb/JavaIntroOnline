/*
 * 10. ������� ����� Airline, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������
 *� ����� toString(). ������� ������ �����, ������������ ������ ���� Airline, � ����������� �������������� �
 *��������. ������ �������� ������ ������ � ������� ��� ������ �� �������.
 *Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������.
 *����� � �������:
 *a) ������ ������ ��� ��������� ������ ����������;
 *b) ������ ������ ��� ��������� ��� ������;
 *c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
 */
package airLineTest;

public class Airline {
	protected enum PlaneType {PASSENGER, PRIVATE, AIRBUS, STATE};
	
	private String target;
	private int id;
	private PlaneType type;
	private int hour;
	private int minute;
	private String daysOfWeek;
	
	public Airline(String aTarget, int anId, PlaneType aType, int anHour, int aMinute, String days) {
		this.target = aTarget;
		this.id = anId;
		this.type = aType;
		this.hour = anHour;
		this.minute = aMinute;
		this.daysOfWeek = days;
	}

	public String getTarget() {
		return this.target;
	}
	public int geId() {
		return this.id;
	}
	public PlaneType getPlaneType() {
		return this.type;
	}
	public int getHour() {
		return this.hour;
	}
	public int getMinute() {
		return this.minute;
	}
	public String getDaysOfWeek() {
		return this.daysOfWeek;
	}
	
	public void setTarget(String value) {
		this.target = value;
	}
	public void seId(int value) {
		this.id = value;
	}
	public void setPlaneType(PlaneType value) {
		this.type = value;
	}
	public void setHour(int value) {
		this.hour = value;
	}
	public void setMinute(int value) {
		this.minute = value;
	}
	public void setDaysOfWeek(String value) {
		this.daysOfWeek =value;
	}
	
	public String toString() {
		return "Flight#" + this.id + ". Target: " + this.target + ". Plane Type: " + this.type + 
				". Time: " + this.hour + ":" + this.minute + ". On this week on " + this.daysOfWeek;
	}
}
