/*
 * 3. ������� ������ ������ �����������, ��������� ������ �������, �����, �����. ������: ������� �� �������
 * �������, ���������� ��������, �������, ��������� ������.
 */
package governmentTest;

public class City {
	private String name;
	
	public City(String aName) {
		this.name = aName;
	}
	
	public String getCityName() {
		return this.name;
	}
	public void setCityName(String aName) {
		this.name = aName;
	}
	
	public String toString() {
		return this.name;
	}
}
