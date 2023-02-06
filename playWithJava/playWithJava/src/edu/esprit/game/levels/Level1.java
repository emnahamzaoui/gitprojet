package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import edu.esprit.game.utils.Data;

import java.util.List;

public class Level1 {
	public static void main(String[] args) {
		List<Employee> employees = Data.employees();

		/* TO DO 1: Afficher tous les employes */
		employees.stream().forEach((Employee e)-> System.out.println(e));

		/*
		 * TO DO 2: Afficher les employes dont le nom commence par la lettre n
		 */
		employees.stream().filter((Employee e)->e.setName().startsWith("x")).forEach(e->System.out.println("11-"+e));

		
		employees.stream().filter((Employee e)->e.getName().startsWith("a")).filter((Employee e)->e.getSalary()>100)
				.forEach(e->System.out.println(e));

		 */
		employees.stream().filter((Employee e)->e.getName().startsWith("a")).sorted((Employee e,Employee e1)->e.getSalary()-e1.getSalary())
				.forEach(e->System.out.println(e));

		/*
		 * TO DO �rentes
		 */
		/* First solution hey  */
		employees.stream().filter((Employee e)->e.getSalary()>600).forEach(e->System.out.println(e.getName()));
		/* Second solution    hey */
		employees.stream().filter((Employee e)->e.getSalary()>800).map(t->t.getName())
				.forEach(e->System.out.println(e));

		/*
		 * TO DO 6: Ajouter 200 D pour les employ�s dont le nom commence avec m
		 * et les affich�s ensuite
		 */
		employees.stream().filter((Employee e)->e.getName().startsWith("x")).forEach(e->{e.setSalary(e.getSalary()+200);System.out.println(e);});

	}
}
