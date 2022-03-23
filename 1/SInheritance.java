class Teacher
{
  int a=20;
  void showTeacher()
   {
     System.out.println("Showing Teacher");
   }
}
class SInheritance extends Teacher
{ 
  int b=30;
  public static void main(String[] args)
  {
    SInheritance s=new SInheritance();
    System.out.println("Showing Teacher:"+s.a);
    System.out.println("Showing Single:"+s.b);
  }
}
