package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import edu.esprit.game.utils.Data;

import java.util.List;
import java.util.stream.Collectors;

public class Level2 {
	public static void main(String[] args) {
	List<Employee> employees = Data.employees();

	/* TO DO 1: Retourner le nombre des employ�s dont le nom commence avec n */
	long nbr = employees.stream().filter((Employee e)->e.getName().startsWith("n")).count();
				
	/* TO DO 2: Retourner la somme des salaires de tous les employ�s (hint: mapToInt) */	
	long sum = employees.stream().mapToInt((Employee e)->e.getSalary()).sum();	
		
	/* TO DO 3: Retourner la moyenne des salaires des employ�s dont le nom commence avec s */	
	double average = employees.stream().filter((Employee e)->e.getName().startsWith("m")).mapToInt((Employee e)->e.getSalary()).average().getAsDouble();
		
		
	/* TO DO 4: Retourner la liste de tous les employ�s  */	
	List<Employee> emps = employees.stream().collect(Collectors.toList());
		
		/* TO DO 5: Retourner la liste des employ�s dont le nom commence par s */	
		List<Employee> emps2 = employees.stream().filter((Employee e)->e.getName().startsWith("s")).collect(Collectors.toList())/* TO DO 5 */;
		
		
	/* TO DO 6: Retourner true si il y a au min un employ�s dont le salaire > 1000, false si non
	*/
	boolean test = employees.stream().anyMatch((Employee e)->e.getSalary()>1000);/* TO DO 6 */
				
	/* TO DO 7: Afficher le premier employ� dont le nom commence avec s avec deux mani�res diff�rentes */
	/*First way*/
	employees.stream().filter((Employee e)->e.getName().startsWith("s")).findFirst().ifPresent(e->System.out.println(e));/* TO DO 7 */
	/*Second way*/
	employees.stream().filter((Employee e)->e.getName().startsWith("s")).limit(1);
		
	/* TO DO 8: Afficher le second employ� dont le nom commence avec s */
	employees.stream().filter((Employee e)->e.getName().startsWith("s")).limit(2).skip(1);/* TO DO 8 */
		

	}
}
