package customsorting;

import java.util.Comparator;

import com.Employee;

public class SortEmployeeBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee x, Employee y) {
		Double a=x.getSalary();  //2.8  auto boxing
		Double b=y.getSalary();  //2.6
		return a.compareTo(b);
	}
}


//x-->object to be inserted
//y--> already existing object