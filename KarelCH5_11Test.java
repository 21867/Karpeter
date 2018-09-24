/*
   @Author: Coglianese
      Date: Sep 18, 2006
   Teacher:
       Lab:
      Misc: based on work by C. Nelson
  */

import kareltherobot.*;

public class KarelCH5_11Test extends KJRTest implements Directions
{
    public KarelCH5_11Test (String name)
    {
    		super(name);
   	}
   	
   	private Karpeter alice;

   	

   	public void setUp()
   	{
   		 World.reset();
   		 World.setDelay(5);
   		 World.setVisible(true);    			
   		 World.setTrace(false);
    	 
   	}
   	
    public void testCarpet()
    {
   		 World.reset();
    	 World.readWorld("ch5_11.kwld");  		 
         alice=  new Karpeter(1, 1, East, 6);  
		 alice.carpetRooms();    
         assertState(alice, 1, 10, East, false);
    }
     
    public void testRoom1()
    {
   		 World.reset();
    	 World.readWorld("ch5_11.kwld");  		 
         alice=  new Karpeter(1, 1, East, 8);      
 		 alice.carpetRooms();        
      	 assertBeepersAt(2, 2,1);
    }
    
    public void testRoom2()
    {
    	 World.reset();
    	 World.readWorld("ch5_11.kwld");  		 
         alice=  new Karpeter(1, 1, East, 8);      
 		 alice.carpetRooms(); 
         assertBeepersAt(2, 7, 1);
    }
    
    public void assertState(Robot karel, int str, int av, Direction dir, boolean beeps)
   	{
   			if(dir == Directions.East)
   				assertFacingEast(karel);
   			else if(dir == Directions.West)
   				assertFacingWest(karel);
   			else if(dir == Directions.North)
   				assertFacingNorth(karel);
   			else if(dir == Directions.South)
   				assertFacingSouth(karel);
   			
   			assertAt(karel, str, av);
   			
   			if(beeps)
   				assertBeepersInBeeperBag(karel);
   	}
 
}
