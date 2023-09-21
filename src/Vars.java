public class Vars
{
    public static void Variables()
    {
        //Empty String declaration can't be printed because will show you error
        //Error: Variable 'name' might not have been initialized
        String name ;

        //String declaration with default value and print to console
        String text = "String";
        System.out.println(text);

        //override string variable named text and print changed string to console
        text = "New String";
        System.out.println(text);

        //Empty int declaration can't be printed because will show you error
        //Error: Variable 'height' might not have been initialized
        int height;

        //int declaration with default value and print to console
        int age = 42;
        System.out.println(age);

        //override string variable named age and print changed int to console
        age = 18;
        System.out.println(age);
    }
}
