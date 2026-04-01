import java.io.File;
import java.util.Scanner;

class DirectoryListing {

    static boolean fileFound = false;
    static String filePath = null;

    static void listFilesAndDirectories(File dir) {
        if (!dir.isDirectory()) return;

        System.out.println("Files under " + dir.getName());

        File[] files = dir.listFiles();
        if (files == null) return; 

        for (File f : files) {
            System.out.println(f.getName());
            listFilesAndDirectories(f);
        }
    }

    static void searchFile(File dir, String filename) {
        if (!dir.isDirectory() || fileFound) return;

        File[] files = dir.listFiles();
        if (files == null) return; // safety check

        for (File f : files) {
            if (f.isFile() && f.getName().equals(filename)) {
                fileFound = true;
                filePath = f.getAbsolutePath();
                return;
            }
        }

        for (File f : files) {
            if (f.isDirectory()) {
                searchFile(f, filename);
            }
        }
    }
}

public class SubDirAndFiles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter directory path:");
        String dirpath = scanner.next();
        File directory = new File(dirpath);
        if (directory.isDirectory()) {
            System.out.println("Files and directories");
            DirectoryListing.listFilesAndDirectories(directory);
            System.out.println("Enter filename to be searched");
            String fileName = scanner.next();
            DirectoryListing.searchFile(directory, fileName);
            if (DirectoryListing.fileFound) {
                System.out.println("File Path=" + DirectoryListing.filePath);
            } else {
                System.out.println("File Not found");
            }
        } else {
            System.out.println("Not a valid directory");
        }
    }
}