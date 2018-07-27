
import java.io.File;

/**
 *
 * @author H. Antunes
 */
public class RemoveFiles {

    public static void main(String[] args) {
        String target = args[0];
//        String baseDir = "/home/user/";
        String baseDir = args[1];
        File dir = new File(baseDir);
        File files[] = dir.listFiles();
        for (int i = 0, j = files.length; i < j; i++) {
            File file = files[i];
            if (file.getName().contains(target)) {
                System.out.println(file.getName());
                file.delete();
            }
        }
    }
}
