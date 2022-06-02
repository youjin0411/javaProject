import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {
    public static void main(String[] args) {
        File src = new File("C:\\Windows\\Web\\Wallpaper\\Theme1\\img3.jpg");
        File dest = new File("copyimg.jpg");
        int c;
        try {
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            while ((c = fi.read()) != -1) {
                fo.write((byte) c);
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath() + "를  " + dest.getPath() + "로 복사 했네");
        } catch (IOException e) {
            System.out.println("파일복사 오류");
        }
    }
}