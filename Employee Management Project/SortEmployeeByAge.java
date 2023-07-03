package customsorting;

import java.util.Comparator;

import com.Employee;

public class SortEmployeeByAge implements Comparator<Employee>{
	

	@Override
	public int compare(Employee a, Employee b) {
		Integer x=a.getAge();
		Integer y=b.getAge();   // conver wrapper class
		return x.compareTo(y); 
		
	}
}
