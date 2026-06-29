//QQ--13 //
// public class Armstrong_Number {
//     public static void main(String... args){
//         int n=153;
//         int original=n;
//         int sum=0;
//         while(n>0){
//            int digit=n%10;
//             sum+=digit* digit*digit;
//             n=n/10;
//         }
//         if (sum==original)
//             System.out.println("Armstrong number");
//         else
//             System.out.println("not an armtstrong number");

//     }
// }
class Armstrong_Number{
    public static void main(String... args){
        int n=154;
        int original=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        if (sum==original)
            System.out.println("it's an armstrong number");
        else
            System.out.println("it's not an armstrong number");
    }
}