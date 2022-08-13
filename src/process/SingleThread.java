package process;

public class SingleThread{

    public static void main(String[] args) {
        for(int i=0;i<500;i++){
            System.out.print(1);
        }

        for(int j=0;j<500;j++){
            System.out.print(2);
        }

    }
}

