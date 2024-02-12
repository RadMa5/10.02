import java.io.FileWriter;
import java.io.IOException;

public class Parser {
    // private String name;
    // private String surname;
    // private String lastName;
    // private String

    public static void parser(String[] string) throws IllegalArgumentException{
        // // if (string[3].length() != 8) throw new IllegalArgumentException();
        // if (string[3].charAt(2) != '.' && string[3].charAt(5) != '.') throw new IllegalArgumentException();
        // // if (string[4].length() != 11 || string[4].length() != 12) throw new IllegalArgumentException();
        // if (string[5] != "f" || string[5] != "m") throw new IllegalArgumentException();

        String name = string[0] + ".txt";
        try(FileWriter fw = new FileWriter(name, true)){
            for(String data: string){
                fw.write(data + " ");
            }
            fw.write("\n");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
