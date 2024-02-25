package org.example.threads;

public class StopTest {
    public static void main(String[] args) {
        Player rabbit = new Player("兔子", 30, 100, 10000);
        Player turtoise = new Player("乌龟", 30, 1000, 1000);

        rabbit.start();
        turtoise.start();

        while (true){
            if(rabbit.isFinished() || turtoise.isFinished()){
                rabbit.setRunFlag(false);
                turtoise.setRunFlag(false);
                rabbit.interrupt();
                turtoise.interrupt();
                break;
            }else if(!rabbit.isRunFlag() && !turtoise.isRunFlag()){
                break;
            }
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
        }else if(rabbit.isFinished() || turtoise.isFinished()){
            System.out.println(rabbit.isFinished() ? "兔子赢":"乌龟赢");
        }else {
            System.out.println("乌龟和兔子都没有到达终点比赛取消");
        }
    }
}

class Player extends Thread{
    private String name;
    private long runTime;
    private long restTime;
    private  long distance;
    private long time;

    private boolean runFlag = true;

    private volatile  boolean finished;

    public Player(String name, long distance, long runTime, long restTime){
        this.name = name;
        this.distance = distance;
        this.runTime = runTime;
        this.restTime = restTime;
    }

    @Override
    public void run() {
        long sum = 0;
        long start = System.currentTimeMillis();
        while (sum < distance && runFlag){
            System.out.println(name + "正在跑...");
            try {
                Thread.sleep(runTime);
            } catch (InterruptedException e) {
                System.out.println(name + "未到达终点就停止");
                runFlag = false;
                break;
            }
            sum++;
            try {
                if(sum % 10 == 0 && sum <distance && runFlag){
                    System.out.println(name + "已经跑了"+ sum +"米正在休息...");
                    Thread.sleep(restTime);
                }
            }catch (InterruptedException e){
                System.out.println(name + "未到达终点就停止");
                runFlag = false;
                break;
            }
        }
        long end = System.currentTimeMillis();
        time = end - start;
        System.out.println(name + "跑了" + sum + "米，已经到达终点，共用时" + (double)time/1000.0 + "秒");
        finished = sum == distance ? true : false;
    }

    public  long getTime(){
        return time;
    }

    public void  setRunFlag(boolean runFlag){
        this.runFlag = runFlag;
    }

    public boolean isRunFlag(){
        return runFlag;
    }

    public boolean isFinished(){
        return  finished;
    }
}



















