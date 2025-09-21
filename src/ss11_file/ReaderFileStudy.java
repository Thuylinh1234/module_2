package ss11_file;

import java.io.*;

public class ReaderFileStudy {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ss11_file/data/input.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) == null){
            System.out.println(line);
        }

        bufferedReader.close();
        fileReader.close();


    }
}
