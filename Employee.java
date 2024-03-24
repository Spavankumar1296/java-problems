public class Employee
{
    private String name;
    private int id;
    private String designation;
    private double salary;
    public boolean promotionStatus;
    
    public Employee(String name,int id,double salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.designation="Employee";
        this.promotionStatus=false;
    }
    public Employee(String name, int id, double salary, boolean promotionStatus)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.designation="Manager";
        this.promotionStatus=promotionStatus;
    }
    public Employee(String name, int id, double salary ,String designation, boolean promotionStatus)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.designation=designation;
        this.promotionStatus=promotionStatus;
    }
     public String getone()
     {
        return name;
     }
     public int gettwo()
     {
        return id;
     }
     public String getthree(){
        return designation;
     }
     public double getfour()
     {
        return salary;
     }
     public boolean getfive()
     {
        return promotionStatus;
    }
    public static void main(String args[])
    {
       Employee e1=new Employee ("pavan" ,2022, 45000);
       Employee e2=new Employee ("pavan kumar",2023, 50000,true);
       Employee e3=new Employee ("s.pavan kumar",2024,100000, "executive" ,true);
    
    e1.info();
    System.out.println();
    e2.info();
    System.out.println();
    e3.info();
    }
    public void info()
    {
        System.out.println("employee information");
        System.out.println("Employee name:"+name);
        System.out.println("Employee id:"+id);
        System.out.println("Employee salary:"+salary);
        System.out.println("Employee designation:"+designation);
        System.out.println("Employee promotionStatus:"+promotionStatus);
    }
}