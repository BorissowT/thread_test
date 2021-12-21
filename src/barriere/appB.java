package barriere;
import java.util.concurrent.*;

public class appB {
    public static void main(String[] args){
        int tDelay_ = 6;
        BarrierAction barrierAction = new BarrierAction(tDelay_);;
        CyclicBarrier barrier = new CyclicBarrier(4, barrierAction);;
        MyClassBarrier thread1 = new MyClassBarrier(1,barrier);
        MyClassBarrier thread2 = new MyClassBarrier(2,barrier);
        MyClassBarrier thread3 = new MyClassBarrier(3,barrier);
        MyClassBarrier thread4 = new MyClassBarrier(0,barrier);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();// Start der Thread-Methode
        //System.out.printf("Worker_%d A.v = ( %d %d %d %d )\n",1, MyClass.answerVector[0], answerVector[1], answerVector[2], answerVector[3]);
    }
}
