import java.io.*;

public class FileDemo {

    public static void main(String[] args) {

        try {
            // Writing to file
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello Java\n");
            fw.write("File Handling in VS Code\n");
            fw.close();

            // Reading from file
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

            String line;

            System.out.println("File Content:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}