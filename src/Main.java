import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int answer = 0;
        for(int i = 0; i <= s.length(); i++){
            answer = i;
        }
        System.out.println(answer);
    }
}
