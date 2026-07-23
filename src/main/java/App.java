import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner scanner;
    int lastId = 0;
    List<WiseSaying> wiseSayings = new ArrayList<>();

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String command = scanner.nextLine();

            switch (command) {
                case "등록" -> {
                    System.out.print("명언 : ");
                    String saying = scanner.nextLine();
                    System.out.print("작가 : ");
                    String author = scanner.nextLine();

                    lastId++;
                    System.out.println("%d번 명언이 등록되었습니다.".formatted(lastId));
                }
                case "종료" -> {
                    return;
                }
                case "목록" -> {
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("----------------------");

                    wiseSayings
                            .reversed()
                            .stream()
                            .forEach(wiseSaying -> System.out.printf("%d / %s / %s%n",
                                    wiseSaying.getId(), wiseSaying.getAuthor(), wiseSaying.getSaying()));

                }
            }
        }
    }
}
