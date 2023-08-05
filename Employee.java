package managementApp.com;

//import java.io.Serializable;
//import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String designation;
    private String department;
    private double salary;

    public Employee(int id,String name,int age,String designation,String department,double salary){
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.designation=designation;
        this.department=department;
        this.salary=salary;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public String getDesignation(){
        return designation;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }


    public String toString(){
        return "Employee[id ="+id+",name = "+name+",age = "
                +age+",Designation = "+designation+", Department = "
                +department+", Salary = "+ salary + "]";
    }

}
