/*
 * 3. ������� ������ ������ �����������, ��������� ������ �������, �����, �����. ������: ������� �� �������
 * �������, ���������� ��������, �������, ��������� ������.
 */
package governmentTest;

public class Region {
	private City regionCenter;
	private District[] districts;
	
	public Region(City center, District...theDistricts) {
		this.regionCenter = center;
		this.districts = theDistricts;
	}
	
	public void setCenter(City newCenter) {
		this.regionCenter = newCenter;
	}
	public City getCenter() {
		return this.regionCenter;
	}
	public double getArea() {
		double res = 0;
		for (District district: this.districts) {
			res += district.getArea();
		}
		return res;
	}
}
