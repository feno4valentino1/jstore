public class HitungMundur implements Runnable{
    private String name;
    private int initialNumber;
    private Thread thread;

    public HitungMundur(String name)
    {
        this.name = name;
        this.initialNumber = 10;
    }

    public void run()
    {
        System.out.println(name + ", go!");

        while(initialNumber >= 0)
        {

            try
            {
                Thread.sleep(1000);

            }
            catch (InterruptedException e)
            {
                System.out.println(name + " was interrupted.");
            }

            System.out.println(name + " counts down to " + initialNumber + ".");
            initialNumber = initialNumber - 1;
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


}
