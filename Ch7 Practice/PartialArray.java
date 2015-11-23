import java.util.Random;
import java.util.Scanner;
public class PartialArray
{
    private int[] values;
    private int size;
    public PartialArray()
    {
        this.values= new int[100];
        for (this.size=0; this.size <20; this.size++)
        {
            this.values[this.size]= this.size*this.size;
        }
    }
    public void remove(int pos)
    {
        for(int i=pos+1; i<this.size; i++)
        {
            this.values[i-1]= this.values[i];
        }
        size--;
    }
    public void insert(int pos, int value)
    {
        if(this.size==this.values.length)
        {
            this.growArray();
        }
        size++;
        for(int i=size-1; i>pos; i--)
          {
             this.values[i]=this.values[i-1];
          }
        
        this.values[pos]= value;
    }
    public void swap( int posA, int posB)
    {
        int temp= this.values[posA];
        this.values[ posA ]=this.values[ posB ];
        this.values[ posB ]=temp;
        
        
    }
    private void growArray()
    {
        
        int [] newArray= new int[this.size*2];
        for (int i=0; i<this.size; i++)
        {
            newArray[i]= this.values[i];
            
        }
        this.values= newArray;
    }
    public static void main (String[] args)
    {
        Random gener= new Random();
        String choice= "y";
        while (choice.equals("y")==true)
        {
         System.out.println("Do you want to add a list number to the array? (y/n)");
         if (choice.equals("y")==true)
         {   int randNum= gener.nextInt(100);
             
            }
         
         
        }

    }
}