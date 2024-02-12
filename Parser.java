import java.io.FileWriter;
import java.io.IOException;

public class Parser {
    // private String name;
    // private String surname;
    // private String lastName;
    // private String

    public static void parser(String[] string) throws IllegalArgumentException{
        String dob = string[3];
        String num = string[4];
        String sex = string[5];
        char[] testch = dob.toCharArray();
        if (dob.length() != 10) throw new IllegalArgumentException();
        if (testch[2] != '.') throw new IllegalArgumentException();
        if (testch[5] != '.') throw new IllegalArgumentException();
        // if (sex.equals("f") || sex.equals("m")) throw new IllegalArgumentException();

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
