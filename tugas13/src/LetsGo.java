import java.lang.Math.*;

public class LetsGo
{
    public LetsGo()
    {

    }

    public static int random()
    {
        int max = 500;
        int min = 100;
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }

    public static void main(String[] args)
    {
        RunForYourLife Lionel = new RunForYourLife("Lionel", 1);
        RunForYourLife Andres = new RunForYourLife("Andres", 0.8);
        RunForYourLife Messi = new RunForYourLife("Messi", 0.6);

        Lionel.start();
        Andres.start();
        Messi.start();
    }
}
