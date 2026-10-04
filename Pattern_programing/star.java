//Q--1//
//4*5--STAR_PATTERN//

// *****
// *****
// *****
// *****

// import java.util.Scanner;
// public class star {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         for (int i=0;i<n;i++){
//             for(int j=0;j<m;j++)
//                 System.out.print("*");
//             System.out.println();
//         }
//     }
// }

// Q--2//
//4*5--STAR_PATTERN//

// *****
// *   *
// *   *
// *****

// import java.util.Scanner;
// public class star {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if (i==1 || j==1 || i==n || j==m)
//                 System.out.print("*");
//             else
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }

//Q--3//
//1,2,3,4--STAR_PATTERN//

// *
// **
// ***
// *****

// import java.util.Scanner;
// public class star {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Q--4//

// ****
// ***
// **
// *

// import java.util.Scanner;
// public class star {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Q--5//
//   *
//  **
// ***
//****

//--FIRST-LOGIC--//

// import java.util.Scanner;
// public class star {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i=n;i>=1;i--){
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<=n-i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//--SECOND-LOGIC--//

// import java.util.Scanner;
// public class star {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Q--6//

// 1
// 12
// 123
// 1234
// 12345

// import java.util.Scanner;
// public class star {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

//Q--7//

// 12345
// 1234
// 123
// 12
// 1

//FIRST--LOGIC--

// import java.util.Scanner;
// public class star {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

//SECOND--LOGIC--

// import java.util.Scanner;
// public class star {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//Q-8//

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 

// import java.util.Scanner;
// public class star {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int number=1;
//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }

//Q--9//

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

// import java.util.*;
// public class star {
// 	public static void main(String[] args){
// 	Scanner sc = new Scanner(System.in);
// 	int n=sc.nextInt();
// 	for(int i=1;i<=n;i++){
//           for(int j=1;j<=i;j++){
// 		int sum=i+j;
// 		if (sum%2==0)
// 			System.out.print("1 ");
// 		else 
// 			System.out.print("0 ");
//                    }
// 	System.out.println();
// }
//   }
// }

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (i==0 || j==0 || i==n-1 || j==m-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}