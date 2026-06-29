// //june-18//
// //QQ--11//find prime no. or not 
// class prime_number
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

// QQ--16//
class prime_number{
    public static void main(String... args){
        for(int n=2;n<=100;n++){
        boolean isprime=true;
        if (n<=1)
            isprime=false;
        else{
              for (int i=2;i<n;i++)
                if (n%i==0){
                isprime=false;
                 break;}
        }
        if(isprime==true)
            System.out.println(n);}
    }

}
