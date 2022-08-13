package process;

import javax.swing.*;

public class ThreadTest3 {

    public static void main(String[] args) throws Exception{
        Thread thread5 = new Thread5();
        thread5.start();
        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        System.out.println("입력하신 값은 "+ input+"입니다.");
    }
}

class Thread5 extends Thread{
    @Override
    public void run() {
        for(int i=10;i>0;i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}