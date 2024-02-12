import java.util.Scanner;


public class IDParser{
    public static void idParser()throws IllegalArgumentException{
        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Input information in one line as in <Surname> <Name> <Last name> <DoB> <Phone number> <Sex>");
            System.out.println("DoB's format should be dd.mm.yyyy. Sex should be indicated as one character - m for male and f for female.");
            input = scanner.nextLine();
        }

        String[] inputS = input.split(" ");
        if (inputS.length != 6) { throw new IllegalArgumentException();}

        try{
            Parser.parser(inputS);
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}