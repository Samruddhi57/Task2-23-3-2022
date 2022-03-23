abstract class Animal 
{
    abstract void run();
}
class Dog extends Animal
{
    void run()
    {
        System.out.println("Running");
    }
}
class abstractDemo
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.run();
    }
}