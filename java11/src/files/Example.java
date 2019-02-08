package files;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Example {

    public static void main(String[] args) throws Exception {
        String text = "Hello biezhi.";

        // å†™å…¥æ–‡æœ¬
        Files.writeString(Paths.get("hello.txt"), text);

        // è¯»å�–æ–‡æœ¬
        String readText = Files.readString(Paths.get("hello.txt"));
        System.out.println(text.equals(readText));

        // åˆ é™¤æ–‡æœ¬
        Files.delete(Paths.get("hello.txt"));
    }

}