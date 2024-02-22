import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

       
        Stack<String> stack = new Stack<>();

        try {
           
            BufferedReader reader = new BufferedReader(new FileReader(inputFile)); //buff serve per leggere da input
            String line;
            while ((line = reader.readLine()) != null) {
               
                stack.push(line);
            }
            reader.close();

            
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            while (!stack.isEmpty()) {
                
                writer.write(stack.pop());
                writer.newLine();
            }
            writer.close();
            System.out.println("Inversione frasi " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

