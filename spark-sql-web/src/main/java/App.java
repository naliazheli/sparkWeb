
/**
 * Hello world!
 *
 */
public class App 
{


    public static void main(String[] args) throws Exception{

        String[] testStr={
                "2",
                "a+b+3",
                "(a-b)+3",
                "a+(b*3"
        };

        for (String s:testStr){
            System.out.println("Input expr:"+s);

        }
    }
}
