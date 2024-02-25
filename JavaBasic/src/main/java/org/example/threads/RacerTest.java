package org.example.threads;

public class RacerTest {
    public static void main(String[] args) {
        Racer rabbit = new Racer("兔子", 30, 100, 10000);
        Racer turtoise = new Racer("乌龟", 30, 1000, 1000);

        rabbit.start();
        turtoise.start();

        try {
            rabbit.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            turtoise.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("比赛结束");
        if(rabbit.isFinished() && turtoise.isFinished()){
            if(rabbit.getTime() < turtoise.getTime()){
                System.out.println("兔子赢");
            }else if(rabbit.getTime() > turtoise.getTime()){
                System.out.println("乌龟赢");
            }else {
                System.out.println("平局");
            }
        }
    }
}

class Racer extends Thread{
    private String name;
    private long runTime;    // 每米需要时间，单位毫秒
    private long restTime;   // 每10米的休息时间，单位毫秒

    private long distance;   // 全程距离，单位米

    private long time; // 跑完全程的总时间
    private boolean finished;  // 是否跑完全程

    public Racer(String name, long distance, long runTime, long restTime){
        this.name = name;
        this.distance = distance;
        this.runTime = runTime;
        this.restTime = restTime;
    }

    @Override
    public void run() {
        super.run();
        long sum = 0;
        long start = System.currentTimeMillis();
        while (sum < distance){
            System.out.println(name + "正在努力奔跑...");
            try {
                Thread.sleep(runTime);
            } catch (InterruptedException e) {
                System.out.println(name + "出现意外");
                return;
            }
            sum++;

            try {
                if(sum % 10 == 0 && sum < distance){
                    // 每10米休息一下
                    System.out.println(name + "已经跑了"+sum + "米正在休息....");
                    Thread.sleep(restTime);
                }
            }catch (Exception  e){
                System.out.println(name + "出现意外");
                return;
            }

        }

        long end = System.currentTimeMillis();
        time = end - start;
        System.out.println(name + "跑了" + sum + "米，已经到达终点，共用时" + (double)time/1000.0 + "秒");
        finished = true;

    }

    public  long getTime(){
        return  time;
    }

    public boolean isFinished(){
        return finished;
    }
}