package sudhesh.controller;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;




public class Counts extends TimerTask {

	@Override
    public void run() {
        System.out.println("Timer task started at:"+new Date());
        completeTask();
        System.out.println("Timer task finished at:"+new Date());
    }

    private void completeTask() {
        try {
            //assuming it takes 20 secs to complete the task
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static int main(int cartid){
    	int carid=cartid;
        TimerTask timerTask = new Counts();
        Timer timer = new Timer(true);
        timer.schedule(timerTask, 0);
        System.out.println("TimerTask started"+cartid);
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled"+carid);
        return cartid;
    }

}
