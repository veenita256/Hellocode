package customsorting;

import java.util.Comparator;

import com.Employee;

public class SortEmployeeByName implements Comparator<Employee>{

	@Override
	public int compare(Employee a, Employee b) {
		String x=a.getName();
		String y=b.getName();
		return x.compareTo(y);
	}
}
