package edu.esprit.game.utils;

import java.util.ArrayList;
import java.util.List;

import edu.esprit.game.models.Employee;


public class Data {
	public static List<Employee> employees() {
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee("mehdi", "blueWorker", 100);
		Employee e2 = new Employee("nader", "blueWorker", 100);
		Employee e3 = new Employee("karray", "blueWorker", 150);
		Employee e4 = new Employee("karim", "blueWorker", 150);
		Employee e5 = new Employee("houssem", "blueWorker", 100);
		Employee e6 = new Employee("sana", "teacher", 700);
		Employee e7 = new Employee("salma", "teacher", 900);
		Employee e8 = new Employee("wiem", "teacher", 900);
		Employee e9 = new Employee("mariem", "teacher", 900);
		Employee e10 = new Employee("ibrahim", "teacher", 900);
		Employee e11 = new Employee("bassem", "teacher", 1000);
		Employee e12 = new Employee("wael", "teacher", 900);
		Employee e13 = new Employee("imed", "teacher", 1000);
		Employee e14 = new Employee("nadhir", "responsable", 1100);
		Employee e15 = new Employee("hamza", "responsable", 1000);
		Employee e16 = new Employee("bassem", "responsable", 1000);
		Employee e17 = new Employee("marwa", "responsable", 900);
		Employee e18 = new Employee("maroua", "responsable", 900);
		Employee e19 = new Employee("zayen", "responsable", 1200);
		Employee e20 = new Employee("sofienne", "responsable", 1200);
		Employee e21 = new Employee("khalil", "Administrator", 2100);

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		employees.add(e10);
		employees.add(e11);
		employees.add(e12);
		employees.add(e13);
		employees.add(e14);
		employees.add(e15);
		employees.add(e16);
		employees.add(e17);
		employees.add(e18);
		employees.add(e19);
		employees.add(e20);
		employees.add(e21);

		return employees;
	}
}
