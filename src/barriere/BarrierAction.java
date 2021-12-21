package barriere;

public class BarrierAction implements Runnable{
    private final int tDelay_;

    public BarrierAction (int tDelay){ // Set-Methode
        this.tDelay_ = tDelay;
    }

    @Override
    public void run() {
        System.out.printf("BarrierAction: A.v = ( %d %d %d %d )\n", MyClassBarrier.answerVector[0], MyClassBarrier.answerVector[1], MyClassBarrier.answerVector[2], MyClassBarrier.answerVector[3]);

    }
}
