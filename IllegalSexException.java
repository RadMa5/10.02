public class IllegalSexException extends IllegalArgumentException{
    public IllegalSexException(){
        super("Illegal sex pointer. 'm' or 'f' is expected.");
    }
}
