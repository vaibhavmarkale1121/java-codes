import java.util.Scanner;
public class First {

    public int add(int x, int y)
    {
        return x+y;
    }
    public int subs(int x, int y)
    {
        return x-y;
    }
    public int multi(int x, int y)
    {
        return x*y;
    }
    public float divide(float x, float y)
    {
        return x/y;
    }
    public int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
           f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println("enter the choice");
        Scanner myobj = new Scanner(System.in);
        int choice = myobj.nextInt(); 
        First obj = new First();
        switch(choice)
        {
            case 1:
               System.out.println("performing addition.......");
               System.out.println(obj.add(2,3)); 
               break;
                  
            case 2:
               System.out.println("performing substraction.......");
               System.out.println(obj.subs(2,3)); 
               break;
               
            case 3:
               System.out.println("performing multiplication.......");
               System.out.println(obj.multi(2,3));
               break;
               
            case 4:
               System.out.println("performing division.......");
               System.out.println(obj.divide(2,3));
               break;
            case 5:
               System.out.println("calculating factorial");
               System.out.println(obj.fact(6));
               break;                 
 
            default :
               System.out.println("enter the correct choice");
               break;   
        }
    }
}
