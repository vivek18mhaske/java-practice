//QQ--15// find the GCD of the two no.

public class GCD 
{
    public static void main(String... args){
      int x=12;
      int y=18;
      int gcd=1;
      for(int i=1;i<=x && i<=y;i++)
      if (x%i==0 && y%i==0)
        gcd=i;
      System.out.println("GCD = "+gcd);
    }
}
