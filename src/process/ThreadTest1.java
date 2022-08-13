package process;

public class ThreadTest1 {

    static long startTime = 0;
    public static void main(String[] args) {
        ThreadEx11_1 t1 = new ThreadEx11_1();
        ThreadEx11_2 t2 = new ThreadEx11_2();
        t1.start();
        t2.start();
        startTime = System.currentTimeMillis();

        try {
            //main thread가 t1,t2가 끝날 때까지 기다려준다.
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("소요시간:"+(System.currentTimeMillis()-startTime));
    }
}
class ThreadEx11_1 extends Thread {
    public void run() {
        for (int i = 0; i < 500; i++) {
//            System.out.println(this.getName());
            System.out.print("-");

        }
    }
}
class ThreadEx11_2 extends Thread{
    public void run(){
        for(int i=0;i<500;i++){
//            System.out.println(this.getName());
            System.out.print("|");

        }
    }
}