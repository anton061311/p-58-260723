package wiseSaying;

import com.back.App;
import com.back.global.AppContext;
import util.TestUtil;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTestRunner {

    public static String run(String input) {
        Scanner scanner = TestUtil.genScanner(input + "종료");
        ByteArrayOutputStream outputStream = TestUtil.setOutToByteArray();
        AppContext.init(scanner, true);
        new App().run();

        TestUtil.clearSetOutToByteArray(outputStream);
        return outputStream.toString();
    }

}
