package com.collection.comparable;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int salary;

	public Employee() {
	}

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		String str = id + " " + name + " " + salary;
		return str;
	}

	@Override
	public int compareTo(Employee o) {

		int diff = this.id - o.id;

		System.out.println("this = " + this + ",o = " + o + ", diff = " + diff);

		return this.id - o.id;
	}

}
