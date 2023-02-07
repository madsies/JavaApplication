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
                boolean code;
                code = manager.Quit();
                System.out.println("Status Code: "+code);
            }
        };
        t.schedule(tsk, 1000);


    }

}