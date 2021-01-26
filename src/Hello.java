import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Write 2 integer numbers more than 0");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), n = scanner.nextInt(), r;
        if (m > n) { // here code branching depending on which number bigger: first or second
            r = m % n; // finding the remainder
            while (r != 0) { // continue to repeat assignment n to m and r to n till r!=0 therefore n is GCD or numbers doesn't have a GCD
                m = n;
                n = r;
                r = m % n;
                }
            if (n == 1) // Here we define numbers have GCD or not
                System.out.println("Doesn't have a GCD");
                else
                    System.out.printf("GCD is %d", n);

            } else { // Here starts the previous cycle but if m < n
                r = n % m;
                while (r != 0) {
                    n = m;
                    m = r;
                    r = n % m;
                }
                if (m == 1)
                    System.out.println("Doesn't have a GCD");
                else
                    System.out.printf("GCD is %d", m);
        }

    }
}