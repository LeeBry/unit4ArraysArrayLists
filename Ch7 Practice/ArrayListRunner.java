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
       // This prints first and last names in the array.
       String firstName= names.get(0);
       String lastName= names.get(arrayNames.length-1);
       System.out.println("\n"+"1st name in the array is: "+ firstName+"\n"+ "last name in the array is: "+ lastName);
       //this print the size of the array
       int lengthArray= names.size();
       System.out.println(lengthArray);
       // this uses the array method .size to print first and last.
       String firstName1= names.get(0);
       String lastName1= names.get(names.size()-1);
       System.out.println("\n"+"1st name in the array is: "+ firstName1+"\n"+ "last name in the array is: "+ lastName1);
       // Changes the name "Alice" to "Alice B. Toklas"
       names.set(0, "Alice B. Toklas");
       System.out.print(names);
       // Allow you to pick a place in the array, then put a value there, while moving all values to the right
       names.add(3,"Doug");
       System.out.println("\n"+names);
       for (String value:names) //Enhanced For Loop
        // Using the Enhanced For Loop will return the actual value, not the index value.
       {
          System.out.println(value);
       }
       
    }
   
   
} 