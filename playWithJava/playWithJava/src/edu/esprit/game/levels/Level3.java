package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import edu.esprit.game.utils.Data;
import java.util.Map;
import java.util.stream.Collectors;
import static jdk.nashorn.internal.objects.NativeArray.map;

public class Level3 {

    public static void main(String[] args) {
        List<Employee> employees = Data.employees();


        /* TO DO 1: Retourner une chaine de caractére qui contient tous les noms des employés */
        System.out.println("tout les nom dans une chaine");
        String names = employees.stream().map(Employee::getName).reduce("", (e1, e2) -> e1 + " " + e2);/* TO DO 1  hint(reduce)*/;
        System.out.println(names);
        System.out.println("--------------------------");
        System.out.println("------------------a--------------------");

        /* TO DO 2: Retourner une chaine de caractére qui contient tous les noms des employés en majuscule separés par # */
        System.out.println("tout les nom en majiscule dans une chaine avec # ");
        String namesMajSplit = employees.stream().map(Employee::getName).reduce("", (e1, e2) -> e1 + "#" + e2).toUpperCase();/* TO DO 2 */;
        System.out.println(namesMajSplit);
        System.out.println("--------------------------");

        /* TO DO 3: Retourner une set d'employés*/
        System.out.println("Set");
        Set<Employee> emps = employees.stream().collect(Collectors.toSet());/* TO DO 3 */;
        System.out.println("--------------------------");

        /* TO DO 4: Retourner une TreeSet d'employés (tri par nom) */
        System.out.println("Treeset");
        TreeSet<Employee> emps2 = employees.stream().collect(Collectors.toCollection(() -> new TreeSet<>((a, b) -> a.getName().compareTo(b.getName()))));
        System.out.println(emps2);
        System.out.println("---------------------------");
        TreeSet<Employee> emp77=employees.stream().collect(Collectors.toCollection(()->new TreeSet<>((a,b)->a.getName().compareTo(b.getName()))));
        /* TO DO 5: Retourner une Map qui regroupe les employés par salaire */
        System.out.println("Map info employees par salaire ");
        Map<Integer, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getSalary));/* TO DO 5 */
        map.forEach((k, v) -> System.out.println(k + " =>  " + v));
        System.out.println("-------------tessttt-------------");

        map.entrySet().forEach(System.out::println);

        System.out.println("--------------------------");

        /* TO DO 6: Retourner une Map qui regroupe les nom des employés par salaire */
        System.out.println("Map nom employees par salaire ");
        Map<Integer, String> mm = employees.stream().collect(Collectors.toMap(Employee::getSalary, Employee::getName, (s1, s2) -> s1 + " " + s2));
        mm.forEach((k, v) -> System.out.println(k + " =>  " + v));
        mm.forEach((k, v) -> System.out.println(k + " =>  " + v));
        System.out.println("--------------------------");

        /* TO DO 7: Retourner le  min, max,average, sum,count des salaires */
        System.out.println("Résumé sur salaire ");
        String s = employees.stream().collect(Collectors.summarizingInt(e -> e.getSalary())).toString();/* TO DO 7 */
        System.out.println(s);

    }
}
