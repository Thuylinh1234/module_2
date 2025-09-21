package ss11_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterStudy {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ss11_file/data/inputt.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write("Linh");
        bufferedWriter.write(" Thùy");
        bufferedWriter.write(" Thị");
        bufferedWriter.write(" Phạm");

        bufferedWriter.write(" \nNguyễn");



        bufferedWriter.close();
        fileWriter.close();
    }
}
