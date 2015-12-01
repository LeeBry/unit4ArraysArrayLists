
public class MedalCount
{
    final int COUNTRIES= 7;
    final int MEDALS=3;
    int [][] counts= 
        {
            {1,1,5},
            {2,1,2},
            {9,1,3},
            {8,1,4},
            {4,1,5},
            {5,1,6},
            {4,1,7}
        };
            
    public MedalCount()
    {
           // alternative way to initialize 2D arrays
           // counts= new int [COUNTRIES][MEDALS];
           
    }
    public String toString()
    {
        String str="";
        
        // Good: for(int i =0; i<COUNTRIES; i++)
        // Better:
        for (int i=0; i<counts.length; i++)
        {
            //Good: for (int j=0; j<MEDALS; j++)
            //Better: for (int j=0; j<counts[0].length; j++)
            //Best:
            for (int j=0; j<counts[i].length; j++)
            {
                str+=counts[i][j]+ "\t";
            }
            str+="\n";
        }
        System.out.print(str);
        return str;
        }
    public int medalCount(int countryIndex)
    {
        int total=0;
        for(int j=0;j<counts[countryIndex].length; j++)
        {
            total+=counts[countryIndex][j];
        }
        return total;
    }
    public int countPerMedal(int medalIndex)
    {
        int total=0;
        for(int i=0; i<counts.length;i++)
        {
            total+=counts[i][medalIndex];
        }
        return total;
    }
    }


