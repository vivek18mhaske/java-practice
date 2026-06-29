public class LCM {
    public static void main(String... agrs){
        int x=12;
        int y=18;
        int gcd=1;
        int lcm=0;
        for(int i=1;i<=x && i<=y;i++){
            if(x%i==0 && y%i==0)
            gcd=i;
        }
        lcm=(x*y)/gcd;
        System.out.println("LCM = "+lcm);
    }
}
