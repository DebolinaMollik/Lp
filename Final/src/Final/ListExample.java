package Final;

import java.beans.Statement;
import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student>studentsList=new ArrayList<>();
	      Student s1=new Student(1,"promi");
		Student s2=new Student(2,"Debolina");
		studentsList.add(s1);
		studentsList.add(s2);
		
		
		
		
		System.out.println("-----");
		for(Student students1:studentsList) {
			System.out.println(students1);
		}

	}

}
