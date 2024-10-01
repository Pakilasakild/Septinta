import java.util.Scanner;

public class Main {
    public static void stringBits(String str) {
        for (int i = 0; i < str.length();){
            char a = str.charAt(i);
            System.out.print(a);
            i = i + 2;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        stringBits(text);
    }
}