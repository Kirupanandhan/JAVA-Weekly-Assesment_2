package WA2;

public class Main
{
    public static void main(String[] args)
    {
        Employe e1=new Employe();
        Employe e2=new Employe();
        Employe e3=new Employe();
        e1.name="jose";
        e1.yoj=1994;
        e1.address="64C-WallsStreet";
        e1.salary=35000;

        e2.name="Imanuel";
        e2.yoj=2000;
        e2.address="68D-WallsStreet";
        e2.salary=45000;

        e3.name="John";
        e3.yoj=1999;
        e3.address="26B-WallsStreet";
        e3.salary=55000;

        System.out.println("  Name   Year of joining        Address           Salary");
        e1.display();
        e2.display();
        e3.display();
    }
}