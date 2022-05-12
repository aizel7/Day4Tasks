import java.io.File;
import java.io.IOException;
public class exercises {
    public static void main(String[] args) throws IOException {
    File directoryGiven = new File("C:\\ExampleDirectory");
    String contents[] = directoryGiven.list();
    System.out.println("List of files and directories in the specified directory:");
        for (int i = 0; i < contents.length; i++) {
            System.out.println(contents[i]);
        }
    }
}