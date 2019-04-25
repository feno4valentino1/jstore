import java.lang.Math.*;

public class RunForYourLife implements Runnable
{

    private String name;
    private int runDelay;
    private double handicap;
    private int checkpoint;
    private Thread thread;

    public RunForYourLife(String name, double handicap)
    {
        this.name = name;
        this.handicap = handicap;
        this.checkpoint = 1;
    }

    public void run()
    {
        System.out.println(name + ", go!");

        while(getCheckpoint() < 20)
        {
            setRunDelay((int) Math.round(LetsGo.random() * handicap));

            try
            {
                Thread.sleep(runDelay);
                System.out.println(name + " has passed checkpoint (" +  checkpoint + ").");
                checkpoint = checkpoint + 1;
            }
            catch (InterruptedException e)
            {
                System.out.println(name + " was interrupted.");
            }
        }

        System.out.println(name + " has finished!");
    }

    public void start()
    {
        if (thread == null)
        {
            thread = new Thread(this, getName());
            System.out.println(name + ", ready.");
            System.out.println(name + ", set...");
            thread.start();
        }
    }

    public String getName()
    {
        return name;
    }

    public int getCheckpoint()
    {
        return checkpoint;
    }

    public void setRunDelay(int runDelay)
    {
        this.runDelay = runDelay;
    }
}
