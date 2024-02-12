import java.io.FileWriter;
import java.io.IOException;

public class Parser {

    public static void parser(String[] string) throws IllegalArgumentException{
        String dob = string[3];
        String sex = string[5];
        boolean s1 = sex.equals("f");
        boolean s2 = sex.equals("m");
        char[] testch = dob.toCharArray();
        if (dob.length() != 10) throw new IllegalDoEException();
        if (testch[2] != '.') throw new IllegalDoEException();
        if (testch[5] != '.') throw new IllegalDoEException();
        if (!(s1 || s2)) throw new IllegalSexException();

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
