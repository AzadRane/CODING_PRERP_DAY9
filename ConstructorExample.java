class Demo
{
    int i;
    int j;

    Demo()
    {

         i=-1;
         j=-3;
    }

    Demo(int x,int y)
    {
         i = x;
         j = y;
    }

    Demo(Demo obj)
    {
         i = obj.i;
         j = obj.j;
    }

    void Display()
    {
        System.out.println(i);
        System.out.println(j);
    }


}


public class ConstructorExample {
   public static void main(String args[])
   {
        Demo o1 = new Demo();
        System.out.println("DEfault Constructor");
        o1.Display();
        System.out.println("Parameterized constructor ");
        Demo o2 = new Demo(5,6);
        o2.Display();

        Demo o3 = new Demo(o2);
        o3.Display();

   } 
}
