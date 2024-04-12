import java.lang.Thread;

class C implements Runnable{
    public void run (){
        for(int i = 0; i < 5; i++){
            System.out.println("Lordwin");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class  RunnableInterface {
    public static void main(String[] args) {

        C r = new C();
        Thread t = new Thread(r);
        t.start();

    }
}
