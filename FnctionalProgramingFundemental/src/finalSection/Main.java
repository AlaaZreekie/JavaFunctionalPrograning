package finalSection;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main
{
    public static void main(String[] args) 
    {
        hello("Ali", null, null);
    }

    static void hello (String fN, String lN, Consumer<String> callBack)
    {
        System.out.println(fN);
        if(lN != null)
        {
            System.out.println(lN);
        }           
        else
        {
            System.out.println("no last name provided");
            callBack.accept(fN);
        }
    }
}
