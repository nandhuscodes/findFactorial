import java.util.Scanner;

public class FindFactorial {
    static int findFactorial(int N){
        if(N == 0) return 1;
        return findFactorial(N-1)*N;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(findFactorial(scanner.nextInt()));
    }
}
