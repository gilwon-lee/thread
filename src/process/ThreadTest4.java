package process;

import javax.swing.*;

public class ThreadTest4 {

    public static void main(String[] args) throws Exception {
        Thread t6 = new Thread6();
        Thread t7 = new Thread7();
        //쓰레드 우선순위 가중치 설정
        t6.setPriority(1);
        t7.setPriority(10);
        t6.start();
        t7.start();

    }
}

class Thread6 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
//            System.out.println(this.getName());
            System.out.print("-");

        }
    }
}

class Thread7 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
//            System.out.println(this.getName());
            System.out.print("l");

        }
    }
}