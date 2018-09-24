/**
   @Author: 
      Date: Sep 06, 2006 
   Teacher: 
       Lab: 
      Misc: 
  */
import kareltherobot.*;
public class Karpeter extends Robot
{
   public Karpeter (int st, int ave, Direction direction, int beeps)
   {
       super(st, ave, direction, beeps);
    }
   public void turnRight()
   {
       turnLeft();
       turnLeft();
       turnLeft();
    }
    public void turnAround()
   {
       turnLeft();
       turnLeft();
       
    }
   public boolean threeWalls()
   {
       turnLeft();
       if (frontIsClear())
       {
            move();
            if (frontIsClear())
            {
                turnAround();
                move();
                turnLeft();
                return false;
            }
            else
            {
                turnLeft();
                if (frontIsClear())
                {
                    turnLeft();
                    move();
                    turnLeft();
                    return false;
                    
                }
                else
                {
                    turnAround();
                    if(frontIsClear())
                    {
                        turnRight();
                        move();
                        turnLeft();
                        return false;
                        
                    }
                    else
                    {
                         turnRight();
                        move();
                        turnLeft();
                        return true;
                    }
                }
            }
        }
       else
       {
          turnRight();
          return false;
        }
      
       
    }
    public void check()
    {
        if(threeWalls())
        {
            turnLeft();
            move();
            putBeeper();
            turnAround();
            move();
            turnLeft();
            move();
        }
        else
        {
            move();
        }
    }
    public void carpetRooms()
    {
        check();
        check();
        check();
        check();
        check();
        check();
        check();
        check();
        check();
        
        //perform task
              
    }
}
