package org.example.threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class SleepingTask extends LiftOff{
    @Override
    public void run() {
        try {
            while (countDown-- > 0){
                System.out.print(status());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++){
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
