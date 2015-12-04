import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       String [] arrayNames={"Alice", "Bob", "Connie", "David", "Edward", "Fran", "Gomez", "Harry"};
       for (int i=0; i<arrayNames.length;i++)
       {
           String personName =arrayNames[i];
           names.add(personName);
        }
       System.out.print(names);
       
   }
   
   
} 