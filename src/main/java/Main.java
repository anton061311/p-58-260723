import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        experiment1();
    }
    public static void experiment2() {
        System.out.println("안녕하세요");

        PrintStream originalOut = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);

        System.setOut(printStream);

        System.out.println("하하하");

        String outStr = outputStream.toString();
        System.setOut(originalOut);
        printStream.close();

        if(outStr.equals("하하하")) {
            System.out.println("출력 결과가 일치합니다.");
        } else {
            System.out.println("출력 결과가 일치하지 않습니다.");
        }

        System.out.println(outStr);


    }

    public static void experiment1() {

        String input = """
                등록
                너 자신을 알라
                """;
        Scanner scanner = new Scanner(input);
        String command = scanner.nextLine();
        String saying = scanner.nextLine();
        System.out.println("입력한 명령어: " + command);
        System.out.println("입력한 명언: " + saying);

    }

}