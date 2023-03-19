package WA2;

public class Main {
    public static void main(String[] args)
    {
        employee emp1= new employee();
        Manager emp2= new Manager();
        emp1.name="Bharath";
        emp1.age=19;
        emp1.phone="0987654321";
        emp1.add="Chennai";
        emp1.salary="50k";
        emp1.Specialization="Data Science";
        System.out.println(emp1.name+"\n"+emp1.age+"\n"+emp1.phone+"\n"+emp1.add+"\n"+emp1.Specialization);
        emp1.printSalary();
        System.out.println("\n");
        emp2.name="Kirupa";
        emp2.age=19;
        emp2.phone="1234567890";
        emp2.add="Chennai";
        emp2.salary="50k";
        emp2.Department="AI-DS";
        System.out.println(emp2.name+"\n"+emp2.age+"\n"+emp2.phone+"\n"+emp2.add+"\n"+"\n"+emp2.Department);
        emp2.printSalary();

    }
}
