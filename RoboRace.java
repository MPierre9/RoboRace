import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.Button;

public class RoboRace     
{
    public static void main (String[] args) throws Exception
    {
    	Thread.sleep(5000); //5 Second Delay
    	
    	LightSensor light1 = new LightSensor(SensorPort.S1); //Creates object for sensor 1
    	LightSensor light2 = new LightSensor(SensorPort.S2); //Creates object for sensor 2
    	
    	Motor.A.setSpeed(500); //Sets speed for both motors to maximum
    	Motor.B.setSpeed(500);
    	
      //For different race use case
    	/*//Moves both motors forward 
    	Motor.A.forward(); 
    	Motor.B.forward();
    	Thread.sleep(5000); 
    	
    	//Moves slight left
    	Motor.B.setSpeed(100); //Lowers speed of motor B to do slight turn can be adjusted
    	Motor.B.forward();	
    	Motor.A.forward();
    	Thread.sleep(500); //Change this value to change from a slight turn to a more sharp one
    	Motor.B.setSpeed(1500);
    	Motor.A.forward(); 
    	Motor.B.forward();
    	Thread.sleep(5000); 
    	
    	//Moves slight right
    	Motor.A.setSpeed(100); //Lowers speed of motor B to do slight turn can be adjusted
    	Motor.A.forward();
    	Motor.B.forward();
    	Thread.sleep(5000); //Change this value to change from a slight turn to a more sharp one
    	
    	//Moves forward for 2 seconds.
    	Motor.A.setSpeed(1500); 
    	Motor.A.forward(); 
    	Motor.B.forward();
    	Thread.sleep(2000);
    	
    	//Stops for 5 seconds.
    	Motor.A.stop();			 
    	Motor.B.stop();
    	Thread.sleep(5000);
    	
    	//Moves backwards for 3 seconds.
    	Motor.A.backward();
    	Motor.B.backward();
    	Thread.sleep(3000);
    	
    	//Does a 360 for 5 seconds.
    	Motor.A.forward();
    	Motor.B.backward();
    	Thread.sleep(5000); */
    	
    	do{
    		if(light1.getLightValue() >= 32 && light1.getLightValue() <= 44 && light2.getLightValue() >= 32 && light2.getLightValue() <= 44)
    		{	
    		
    						
    			Motor.A.setSpeed(500);
    			Motor.B.setSpeed(500);
    			Motor.A.backward();
    			Motor.B.backward();
    			Thread.sleep(100);
    		
    		}
    	
    		else if (light1.getLightValue() >= 18 && light1.getLightValue() <= 29 && light2.getLightValue() >= 32 && light2.getLightValue() <= 44)
    		{
    		
    			Motor.A.setSpeed(500);
    			Motor.B.setSpeed(500);
    			Motor.A.forward();
    			Motor.B.forward();
    			Thread.sleep(800);
    			Motor.A.backward();
    			Motor.B.forward();
    			Thread.sleep(350);
    		
    		}
    	
    		else if (light1.getLightValue() >= 32 && light1.getLightValue() <= 44 && light2.getLightValue() >= 18 && light2.getLightValue() <= 29)
        	
    		{
    		
    			Motor.A.setSpeed(500);
    			Motor.B.setSpeed(500);
    			Motor.A.forward();
    			Motor.B.forward();
    			Thread.sleep(800);
    			Motor.A.forward();
    			Motor.B.backward();
    			Thread.sleep(350);
    		
    		}
    	
    		else if (light1.getLightValue() >= 18 && light1.getLightValue() <= 29 && light2.getLightValue() >= 18 && light2.getLightValue() <= 29)
    		{
    			Motor.A.setSpeed(500);
    			Motor.B.setSpeed(500);
    			Motor.A.forward();
    			Motor.B.forward();
    			Thread.sleep(800);
    			Motor.A.backward();
    			Motor.B.forward();
    			Thread.sleep(350);
    		}
    		
    		else if (light1.getLightValue() >= 45 && light1.getLightValue() <= 51 && light2.getLightValue() >= 45 && light2.getLightValue() <= 51)
    		{
    			Thread.sleep(750);
    			Motor.A.stop();
    			Motor.B.stop();
    			
    		}
    	}   while (!Button.ESCAPE.isDown() || light1.getLightValue() >= 45 && light1.getLightValue() <= 51 && light2.getLightValue() >= 45 && light2.getLightValue() <= 51);
    }
    
}
