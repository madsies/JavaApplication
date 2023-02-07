import java.util.Timer;
import java.util.TimerTask;

class Main{

    public static void main(String[] args){
        WindowManager manager;

        System.out.println("Hello, world!");

        manager = new WindowManager("Program!", 1920, 1080);

        Timer t = new Timer();

        TimerTask tsk = new TimerTask() {
            @Override
            public void run() {
                manager.tick();
                manager.setWindowTitle("Program Window!! (ticks:"+manager.getTicks()+")");

                if (manager.getTicks() > 5){
                    System.out.println("Cancelling.");
                    manager.Quit();

                    cancel();
                }
            }
        };
        t.scheduleAtFixedRate(tsk, 0L, 1000L);

        System.out.println("haha: "+manager.isLive());


    }

}