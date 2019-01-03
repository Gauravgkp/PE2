import java.util.Scanner;

public class Even {
    int n;

    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;

    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        isEven(n);
    }
}


