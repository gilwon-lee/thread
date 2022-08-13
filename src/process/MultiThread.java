package process;

public class MultiThread {

    public static void main(String[] args) {
        System.out.println("start!");
        ThreadEx1_1 t1 = new ThreadEx1_1();
        //Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(new ThreadEx1_2());

        // run을 생성 후 start를 실행하는 이유 :
        // start()가 새로운 호출 스택을 만든 후 그 안에 run()넣어 실행 한다
        // 그 후 start()는 끝
        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread{
    public void run(){
        for(int i=0;i<500;i++){
//            System.out.println(this.getName());
            System.out.print(1);

        }
    }
}

class ThreadEx1_2 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<500;i++){
//            System.out.println(Thread.currentThread().getName());
            System.out.print(2);
        }
    }
}