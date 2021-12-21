package threads_1;

public class app {
    public static void main(String[] args){
        MyClass thread1 = new MyClass(1);
        MyClass thread2 = new MyClass(2);
        MyClass thread3 = new MyClass(3);
        MyClass thread4 = new MyClass(0);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();// Start der Thread-Methode
        //System.out.printf("Worker_%d A.v = ( %d %d %d %d )\n",1, MyClass.answerVector[0], answerVector[1], answerVector[2], answerVector[3]);
    }
}
