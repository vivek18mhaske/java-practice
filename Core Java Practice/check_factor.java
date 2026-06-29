//QQ check factors of ___ //

public class check_factor{
    public static void main(String[] args) {
        int number = 60; // Target number
        
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
