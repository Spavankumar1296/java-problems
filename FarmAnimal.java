class Animal
{
String name;
public Animal(String name)
{
    this.name=name;
}
public void makesound()
{
     System.out.println("make sound");
}
public void eat()
{
    System.out.println("eat some thing");
}
public void theystay()
{
    System.out.println("the stay some where");
}
}
class Cow extends Animal
{
   public Cow()
   {
     super("cow");
   }
   @Override 
   public void makesound()
   {
       System.out.println("the cow says: Moo!");
   }
   @Override
   public void eat()
   {
     System.out.println(" the cow eat :grass");
   }
   @Override
   public void theystay()
   {
    System.out.println(" the cow stay at barn");
   }
}
class Pig extends Animal
{
    public Pig()
    {
      super("pig");
    }
    @Override 
    public void makesound()
    {
        System.out.println("the pig says: Oink");
    }
    @Override
    public void eat()
    {
      System.out.println(" the pig eat :slop");
    }
    @Override
    public void theystay()
    {
     System.out.println(" the pig stay at pigsty");
    }
}
 public class FarmAnimal
 {
   public static void main(String args[])
   
   { Animal c=new Cow();
    Animal p=new Pig();
    c.makesound();
    c.eat();
    c.theystay();
    System.out.println();
    p.makesound();
    p.eat();
    p.theystay();}

 }
