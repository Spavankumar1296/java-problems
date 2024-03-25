public class Command 
{
    public static void main(String args[])
    {
        if(args.length<=4)
        {
         System.out.println("enter name,age,occupation,gender");
        }
        String name=args[0];
        int age=Integer.parseInt(args[1]);
        String occupation=args[2];
        String gender=args[3];
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("occupation:"+occupation);
        System.out.println("gender:"+gender);
    }
}