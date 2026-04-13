import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {

        // Writing to file
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Hello Java");
        fw.close();

        // Reading from file
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        String line = br.readLine();
        System.out.println(line);
        br.close();
    }
}
