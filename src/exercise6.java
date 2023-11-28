import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập đoạn văn: ");
        String paragraph = scanner.nextLine();

        String[] words = paragraph.split("\\s+");
        StringBuilder reversedParagraph = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedParagraph.append(words[i]).append(" ");
        }

        System.out.println("Đoạn văn sau khi đảo từ: " + reversedParagraph.toString().trim());
    }
}
