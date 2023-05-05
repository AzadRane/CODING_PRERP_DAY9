
class Harish
{
    void funtion()
    {
        System.out.println("HEHE i am function of Harish class and called by the object of Harish class otherwise i cannot be called directly");
    }
}

public class InstanceOfExample
{
    public static void main(String args[])
    {
        Harish h = new Harish();

        System.out.println(h instanceof Harish);   // reference_variable instanceof className -> give true or false

    }
}