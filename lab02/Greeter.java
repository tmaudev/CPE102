/*
 * Greeter class returns greeting to Driver.
 *
 * @author Tyler Mau
 * @version Lab 02 Part 1
 */

public class Greeter
{
   private String name;

   public Greeter(String inputName)
   {
      name = inputName;
   }
   public String greet()
   {
      return "Hello" + " " +  name;
   }
}
