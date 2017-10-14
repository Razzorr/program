package ProgramTutorial;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class main_program {
	
	public static void main(String[] args) 
	{
		
	
		try 
		{
			{
				Robot r = new Robot();
				
				r.keyPress(KeyEvent.VK_WINDOWS);
				r.keyRelease(KeyEvent.VK_WINDOWS);
				
				try {
			         Thread.sleep(1000);
			     } catch (InterruptedException ie)
			     {
			          
			     }
				
				r.keyPress(KeyEvent.VK_M);
				r.keyRelease(KeyEvent.VK_M);
				try {
			         Thread.sleep(1000);
			     } catch (InterruptedException ie)
			     {
			          
			     }
				r.keyPress(KeyEvent.VK_I);
				r.keyRelease(KeyEvent.VK_I);
				try {
			         Thread.sleep(1000);
			     } catch (InterruptedException ie)
			     {
			          
			     }
				r.keyPress(KeyEvent.VK_N);
				r.keyRelease(KeyEvent.VK_N);
				try {
			         Thread.sleep(1000);
			     } catch (InterruptedException ie)
			     {
			          
			     }
				r.keyPress(KeyEvent.VK_E);
				r.keyRelease(KeyEvent.VK_E);
				try {
			         Thread.sleep(1000);
			     } catch (InterruptedException ie)
			     {
			          
			     }
				r.keyPress(KeyEvent.VK_C);
				r.keyRelease(KeyEvent.VK_C);
				try {
			         Thread.sleep(1000);
			     } catch (InterruptedException ie)
			     {
			          
			     }
				r.keyPress(KeyEvent.VK_R);
				r.keyRelease(KeyEvent.VK_R);
				try {
			         Thread.sleep(1000);
			     } catch (InterruptedException ie)
			     {
			          
			     }
				r.keyPress(KeyEvent.VK_A);
				r.keyRelease(KeyEvent.VK_A);
				try {
			         Thread.sleep(1000);
			     } catch (InterruptedException ie)
			     {
			          
			     }
				r.keyPress(KeyEvent.VK_F);
				r.keyRelease(KeyEvent.VK_F);
				try {
			         Thread.sleep(1000);
			     } catch (InterruptedException ie)
			     {
			          
			     }
				r.keyPress(KeyEvent.VK_T);
				r.keyRelease(KeyEvent.VK_T);
				try {
			         Thread.sleep(1000);
			     } catch (InterruptedException ie)
			     {
			          
			     }
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				
				
				
				
			}
		} 
		
		catch (Exception e)
		
		{
			System.out.println(e);
		}
	}

}
