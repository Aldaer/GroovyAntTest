/**
 * Created by UC225488 on 15-Aug-17.
 */
public class FluentBuilderUser
{
    public static void main(String[] args)
    {

//        new FluentBuilder(1).setA(2).setB(3).printSum();          // Groovy/java mix: not working!
        new LombokFluentBuilder(1).setA(2).setB(3).printSum();     // Java/Lombok: OK!
    }
}
