import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (!sb.toString().contains(ch + "")) {
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString());
        }

    }
}
