/*
 * 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, 
 *успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
 *Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Student {
	private String name;
	private int group;
	private int[] marks;
	
	public Student(String aName, int aGroup, int... theMarks) {
		this.name = aName;
		this.group = aGroup;
		this.marks = new int[5];
		for (int i = 0; i < 5; i++) {
			this.marks[i] = theMarks[i];
		}
	}
	
	public String getName() {
		return this.name;
	}
	public int getGroup() {
		return this.group;
	}
	
	public boolean isExelentStudent() {
		boolean res = true;
		for (int mark: this.marks) {
			if (mark < 9) {
				res = false;
				break;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		Student[] students = new Student[10];

		students[0] = new Student("Akulich A.A.", 1, 10, 10, 10, 10, 10);
		students[1] = new Student("Brown B.B.", 2, 10, 10, 9, 9, 9);
		students[2] = new Student("Craw C.C.", 1, 10, 10, 9, 8 ,8);
		students[3] = new Student("Drake D.D.", 2, 10, 7, 9, 9, 9);
		students[4] = new Student("Eek E.E.", 1, 5, 10, 10, 10, 10);
		students[5] = new Student("Fpresstorespect F.F.", 2, 9, 10, 9, 9, 9);
		students[6] = new Student("Green G.G.", 1, 9, 8, 8, 9, 9);
		students[7] = new Student("Hala H.H.", 2, 10, 10, 9, 9, 9);
		students[8] = new Student("Ivanov I.I.", 1, 2, 2, 2, 2, 2);
		students[9] = new Student("Joker J.J.", 2, 10, 10, 9, 9, 9);
		
		for (Student person: students) {
			if (person.isExelentStudent()) {
				System.out.println(person.getName() + " from Group №" + person.getGroup());
			}
		}
	}
}
