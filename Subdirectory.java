import java.io.*;

public class Subdirectory {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the directory path: ");
        String dir = br.readLine();
        File f = new File(dir);
        if (!f.exists()) {
            System.out.println("Directory does not exist!");
            return;
        }
        if (!f.isDirectory()) {
            System.out.println("Given path is not a directory!");
            return;
        }
        listFiles(f, 0);
    }

    static void listFiles(File file, int level) {
        File[] files = file.listFiles();
        if (files == null) return;
        for (File f : files) {
            for (int i = 0; i < level; i++) {
                System.out.print("  ");
            }
            if (f.isDirectory()) {
                System.out.println("[DIR] " + f.getName());
                listFiles(f, level + 1); 
            } else {
                System.out.println("File: " + f.getName());
            }
        }
    }
}