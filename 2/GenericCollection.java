import java.util.*;

class GenericCollection
{
  public static void main(String[] args)
   {
     LinkedList<Integer>l=new LinkedList<Integer>();
     System.out.println(l.size());
     System.out.println(l);
     l.add(100);
     l.add(200);
     l.add(300);
     l.add(400);
     System.out.println(l.size());
     System.out.println(l);
     l.add(3,500);
     System.out.println(l);
     l.remove(2);
     System.out.println(l);
     l.set(3,600);
     System.out.println(l);
      
    }
}