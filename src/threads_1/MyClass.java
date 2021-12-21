package threads_1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReentrantLock;

public class MyClass extends Thread{
    int [][] matrix = {{0,1,0,0},{0,0,1,0},{0,0,0,1},{1,0,0,0}};
    int [] vector = {1,2,3,4};
    static int[] answerVector = new int [4];
    int row;
    ReentrantLock lock = new ReentrantLock();



    public MyClass(int i) {
        this.row = i;
    }

    @Override
    public void run(){
        answerVector[row] = matrix[row][0]*vector[0]+matrix[row][1]*vector[1]+matrix[row][2]*vector[2]+matrix[row][3]*vector[3];
        // Thread-Methode

        this.lock.lock();
        System.out.printf("Worker_%d A.v = ( %d %d %d %d )\n",this.row, answerVector[0], answerVector[1], answerVector[2], answerVector[3]);
        this.lock.unlock();
    }
}