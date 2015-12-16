

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author Bryce Lee 
 * @version 12/15/2015
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testInitialState()
    {
        Radar radar= new Radar(10,10);
        // choose monster location
        radar.setMonsterLocation(5,5);
        
        // do the scan test a lot
        for( int i=0; i<30; i++)
        {
            radar.scan();
        }
        radar.getAccumulatedDetection(5,5);
        assertEquals(10, radar.getNumRows());
        assertEquals(10, radar.getNumCols());
    }
    
    @Test
    public void testInitialState2()
    {
        Radar radar= new Radar(100,100);
        // choose monster location
        radar.setMonsterLocation(13,42);
        
        // do the scan test a lot
        for( int i=0; i<30; i++)
        {
     
            radar.scan();
        }
        radar.getAccumulatedDetection(13,42);
        assertEquals(100, radar.getNumRows());
        assertEquals(100, radar.getNumCols());
    }
}
