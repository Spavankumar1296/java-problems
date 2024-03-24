import java.util.Scanner;
class Employees
{
      protected String employee;
      public Employees(String employee)
      {
        this.employee=employee;
      }
      public void salary()
      {
        System.out.println("Employee salary of"+employee);
      }

}
class Regular extends Employees
{
    private double Basicpay=25000;
    private double HRA=15000;
    private double TA=5000;
    public Regular(String employee)
    {
        super(employee);
    }
    public void salary()
    {
        super.salary();
        System.out.println("Basic pay:"+Basicpay);
        System.out.println("HRA:"+HRA);
        System.out.println("TA:"+TA);
        System.out.println("total amount:"+(Basicpay+HRA+TA));
    }
}
class Contract extends Employees{
    private double bp = 12000.0;
    private double ta = 3000.0;
    public Contract(String employee)
    {
        super(employee);
    }
    public void salary()
    {
        super.salary();
        System.out.println("Basic pay:"+bp);
        System.out.println("TA:"+ ta );
        System.out.println("Total amount:"+(bp+ta));
    }
}
public class Salarydemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the employee name:");
        String employee=sc.nextLine();
         System.out.println("Enter the employee is regular or contract:");
         String s=sc.nextLine().toLowerCase();
         Employees e;
         if(s.equals("regular"))
         {
            e=new Regular(employee);
         }
         else if(s.equals("contract"))
         {
            e=new Contract(employee);
         }
         else
         {
            System.out.println("enter the valid one");
            sc.close();
            return;
         }
         e.salary();
         sc.close();
    }
}
