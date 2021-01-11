
import java.awt.*;
import java.applet.*;
import java.applet.*;
import java.awt.*;
import java.util.*;

public class ClockApplet extends Applet implements Runnable { 
   Thread t1=new Thread(this);
   public void start() {
      
      t1.start();
   }
   public void run() { 
     
     for(;;){
         repaint();
         try {
            t1.sleep(1000);    
         }
         catch(InterruptedException e){}
      }
   }
   public void paint(Graphics g) {
      Calendar cal = new GregorianCalendar();
     String hour = String.valueOf(cal.get(Calendar.HOUR));
      String minute = String.valueOf(cal.get(Calendar.MINUTE));
      String second = String.valueOf(cal.get(Calendar.SECOND));
	
	g.setColor(new Color(156,81,81));
	g.fillOval(60,90,50,50);
	g.fillOval(242,90,50,50);

	g.setColor(new Color(255,255,255));
	g.fillOval(59,79,230,230);

	g.setColor(new Color(156,81,81));
	g.fillOval(77,97,205,205);
	g.fillRect(170,97,10,10);
	g.fillOval(170,92,15,15);
	g.fillRect(115,250,10,30);
	g.fillOval(115,279,10,10);	
	g.fillRect(235,250,10,30);
	g.fillOval(235,277,10,10);	

	g.setColor(new Color(255, 204,204));
	g.fillOval(80,100,200,200);

	g.setColor(new Color(156,81,81));
	g.drawOval(110,125,140,140);
	g.fillRect(168,276,8,8);
	g.fillRect(183,276,8,8);
	g.fillRect(198,276,8,8);
	
	
	g.setFont(new Font("Serif",Font.BOLD, 28));    
	g.drawString(hour + ":" + minute + ":" + second, 136, 203);
   }
}