package edu.esprit.game.models;

public class Employee {

	private String name;
	private String post;
	private Integer salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
    // class Employee

	public Employee(String name, String post, Integer salary) {
		super();

		this.name = name;
		this.post = post;
		this.salary = salary;
	}

	// nouvelle moudification

// get name

	public String getName() {
		return name;
	}
    // get by emna

    // get nim

	public void setName(String name) {

    // get nim	public void setName(String name) {

		this.name = name;
	}
    //   funtion get post
	public String getPosts() {
		return posts;




	}


	public void setPost(String post) {
		this.post = post;
	}

	public Integer getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static AddEmp()
	{
		System.out.println("add employyees");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", post=" + post + ", salary="
				+ salary + "]";
	}
public String toString() {
		return "Etudiant [name=" + name + ", post=" + post + ", salary="
				+ salary + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
