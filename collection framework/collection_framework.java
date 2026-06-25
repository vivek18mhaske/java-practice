// june-18//
//QQ--11//find prime no. or not 
// class collection_framework
// {
//     public static void main(String... args){
//         int num=23;
//         boolean isprime=true;
//         if(num<=1){
//             isprime=false;
//         }else{
//             for (int i=2;i<num;i++){
//                 if (num%i==0){
//                  isprime=false;
//                  break;}
//             }
//         }
//         if (isprime)
//             System.out.println("its prime no.");
//         else
//             System.out.println("its not a prime no.");
        
//     }
// }
// QQ check factors of ___ //

// public class collection_framework 
// {
//     public static void main(String[] args) {
//         int number = 60; // Target number
        
//         System.out.print("Factors of " + number + " are: ");
//         for (int i = 1; i <= number; i++) {
//             if (number % i == 0) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }

// QQ--12 // Fibonacci series
// class collection_framework
// {
//     public static void main(String... args){
//         int n=10;
//         int a=0;
//         int b=1;
//        for(int i=0;i<=n;i++){
//             System.out.println(a+" ");
//             int c=a+b;
//             a=b;
//             b=c;
//         }
         
// }
// }
// QQ--13 //
// class collection_framework{
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
// class collection_framework{
//     public static void main(String... args){
//         int n=154;
//         int original=n;
//         int sum=0;
//         while(n>0){
//             int digit=n%10;
//             sum+=digit*digit*digit;
//             n=n/10;
//         }
//         if (sum==original)
//             System.out.println("it's an armstrong number");
//         else
//             System.out.println("it's not an armstrong number");
//     }
//}
class collection_framework{
    public static void main(String... args){
        int num=23;
        boolean isprime=true;
        if(num<=1){
            isprime=false;}
        else{
            for(int i=2;i<num;i++)
                if(num%i==0){
                 isprime=false;
                 break;}
        if (isprime==true)
            System.out.println("its an prime no.");
        else
            System.out.println("its not an prime no.");                
        
        }
    }
}