
public class Timeshow {
	public static void main(String[] args) {
		Thread t=new Thread(new Runnable()
		{
		public void run()
		{
			while(true)
			{
				try
				{
					long totalMilliSeconds =System.currentTimeMillis() ;
					long totalSeconds = totalMilliSeconds  / 1000 ;
					long currentSeconds = totalSeconds   % 60 ;
					long totalMinutes = totalSeconds / 60 ;
					long currentMinutes = totalMinutes % 60 ;
					long totalHours = totalMinutes / 60 ;
					long currentHours = totalHours % 24 ;
					currentHours+=5;
					currentMinutes+=30;
					if(currentMinutes >60)
					{
						currentHours+=1;
						currentMinutes-=60;
					}
					System.out.println("Current Time is " + currentHours + " : " + currentMinutes + " : " + currentSeconds + " GMT ");
					Thread.sleep(1000);
				}catch(Exception e){System.out.println(e);}
				
			}
			
		}
		});t.start();
	}

}
