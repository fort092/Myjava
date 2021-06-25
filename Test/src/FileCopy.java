import java.io.*;
public class FileCopy {
    public static void main(String[] args){
        File original = new File("test.txt");
        File copied = new File("text.txt");
        try{
            InputStream in = new BufferedInputStream(new FileInputStream(original));
            OutputStream out = new BufferedOutputStream(new FileOutputStream(copied));
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0){
                out.write(buffer,0,lengthRead);
                out.flush();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
