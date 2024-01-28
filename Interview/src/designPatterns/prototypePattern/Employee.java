package designPatterns.prototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
	
	private List<String> empList;

	public Employee(List<String> empList) {
		super();
		this.empList = empList;
	}

	public Employee() {
		empList = new ArrayList<>();
	}
	
	public void loadData() {
		empList.add("Ravi");
		empList.add("Dhruv");
		empList.add("Ajay");
		empList.add("Aditya");
	}

	public List<String> getEmpList() {
		return empList;
	}

	public void setEmpList(List<String> empList) {
		this.empList = empList;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		ArrayList<String> temp = new ArrayList<>();
		for(String s : this.empList) {
			temp.add(s);
		}
		return new Employee(temp);
	}
}
