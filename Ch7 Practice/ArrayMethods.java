
public class ArrayMethods
{
    private int[] values;
    private int size;
    public ArrayMethods(int[] initialValues)
    {
        values = initialValues;
    }
    public void swapFirstAndLast()
    {
        int temp= values[0];
        this.values[0]= this.values[this.values.length-1]; // switch the first with the last
        this.values[this.values.length-1]= temp; // switch the last with first
    }
    public void shiftRight()
    {
        int last= values[this.values.length-1];
        
        for (int i=0; i<values.length; i++)
        {
          values[i]=values[i+1];
          
        }
        values[0]= last;
    }
    public void allZero()
    {        
        for (int i=0; i<values.length; i++)
        {
           if (values[i]%2==0){
            values[i]=0;
           }
        }
    }
    public void replaceNeighbors()
    {        
        for (int i=1; i<values.length-1; i++)
        {
           if (values[i]<values[i+1]){
            values[i]=values[i+1];
           }
           else if (values[i]<values[i-1])
           {
             values[i]=values[i-1];
           }
        }
    }
    private void removeMiddle()// work on later [incomplete:E]
    {
     
        if (values.length % 2 == 0)
        {
           int size= values.length-2;
        }
        else
        {
            int size= values.length-1;
        }
        int [] newArray= new int[size];

        for (int i=0; i<values.length; i++)
        {
         
            newArray[i]= this.values[i];
            
        }
        this.values= newArray;
    }
    private void moveEvens()//Move the evens in front of the array
    { 
        int [] newArrayEvens= new int[values.length];
        int count=0;
        for( int i=0; i<values.length; i++)
        {
            if (values[i]%2==0)
            {
                newArrayEvens[count]= this.values[i];
                count++;
            }
            
        }
        int count2=0;
        for( int i=0; i<values.length; i++)
        {
            if (values[i]%2 !=0)
            {
                newArrayEvens[count+count2]=values[i];
            }
            
        }
    }
    private void secondLargest()
    {
        int largest=0;
        for (int i=0; i<values.length; i++)
        {
            if (values[i]>largest)
            {
                largest= values[i];
            }
        }
        for (int i=0; i<values.length; i++)
        {
            if (values[i]>largest)
            {
                largest= values[i];
            }
        }
    }
}