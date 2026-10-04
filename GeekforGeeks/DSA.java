//1//

// import java.util.Scanner;

// class DSA {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         // System.out.prinln(n*i);
//         for(int i=1;i>=10;i++)
//          System.out.print(n*i+"");
        
//     }
// }

// 2// 

// import java.util.Scanner;

// class DSA {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
        
//         // Write the if, else if, else statements below
//         if (number>100)
//            System.out.println("Big");
//         else if (number<10)
//            System.out.println("small");
//         else
//            System.out.println("Number");
//     }
// }

//3//
// import java.util.Scanner;

// class DSA {
//     public static void utility(int number) {
//         // Write the if, else if, else statements below
//         if (number>100)
//            System.out.println("Big");
//         else if (number<10)
            
//            System.out.println("small");
//         else
//            System.out.println("Number");
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//             int number = sc.nextInt();
//             utility(number);
//     }
    
// }

//4//

// import java.util.Scanner;
// class DSA {
//     static boolean isEven(int number) {
//         // code here
//         if (number%2==0)
//                 return true;
//         else
//                  return false;
//           }
//     public static void main(String[] args){
//               Scanner sc = new Scanner(System.in);
//                   int number = sc.nextInt();
//         if (isEven(number))
//           System.out.println("true");
//         else 
//           System.out.println("false");
//           }
// }

//5//
// import java.util.Scanner;
// class DSA{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int number=sc.nextInt();
//         int sum=0;
//         for (int i=1;i<=number;i++){
//             sum+=i;
//         }
//         System.out.println(sum);
//     }
// }

//6//
// import java.util.Scanner;
// class GFG {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int number=1;
//         for (int i=0;i<n;i++){
//             for (int j=0;j<=i;j++){
//                 System.out.print(number + " ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }

//7//

// import java.util.Scanner;
// class GFG {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         } 
//     }
//}

//8//

// import java.util.Scanner;
// class GFG {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if (i==1||j==1||i==n||j==m)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }