package xu_ly_file;

public class Main {
    public static void main(String[] args) {
        String path = "src/xu_ly_file/data/input.txt";

        try {
            // a
            XuLyFile.readAllLinesInOne(path);

            // b
            XuLyFile.readFirst3Lines(path);

            // c
            XuLyFile.countWord(path, "Mơ");

            // d
            XuLyFile.checkPath(path);

            // e
            // XuLyFile.deletePath("src/xu_ly_file/data/test.txt"); // test với file khác

            // f
            // XuLyFile.renamePath("src/xu_ly_file/data/input.txt", "src/xu_ly_file/data/input_renamed.txt");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
