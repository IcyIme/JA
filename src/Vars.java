public class Vars
{
    public static void Variables()
    {
        /*
             __ _        _
            / _\ |_ _ __(_)_ __   __ _
            \ \| __| '__| | '_ \ / _` |
            _\ \ |_| |  | | | | | (_| |
            \__/\__|_|  |_|_| |_|\__, |
                                 |___/
         */

        //Empty String declaration can't be printed because will show you error
        //Error: Variable 'name' might not have been initialized
        String name ;

        //String declaration with default value and print to console
        String text = "String";
        System.out.println("string => " + text);

        //override string variable named text and print changed string to console
        text = "New String";
        System.out.println("new string => " + text);

        /*
             _       _
            (_)_ __ | |_
            | | '_ \| __|
            | | | | | |_
            |_|_| |_|\__|

         */

        //Empty int declaration can't be printed because will show you error
        //Error: Variable 'height' might not have been initialized
        int height;

        //int declaration with default value and print to console
        int age = 42;
        System.out.println("int => " + age);

        //override string variable named age and print changed int to console
        age = 18;
        System.out.println("new int => " + age);

        /*
                 _             _     _
              __| | ___  _   _| |__ | | ___
             / _` |/ _ \| | | | '_ \| |/ _ \
            | (_| | (_) | |_| | |_) | |  __/
             \__,_|\___/ \__,_|_.__/|_|\___|

         */

        //Empty Double declaration can't be printed because will show you error
        //Error: Variable 'a' might not have been initialized
        Double a;

        //int declaration with default value and print to console
        double price = 12.5 ;
        System.out.println("double => " + price);

        //override string variable named age and print changed int to console
        price = 15.8;
        System.out.println("new double => " + price);

        /*
              __ _             _
             / _| | ___   __ _| |_
            | |_| |/ _ \ / _` | __|
            |  _| | (_) | (_| | |_
            |_| |_|\___/ \__,_|\__|

         */

        //Empty Double declaration can't be printed because will show you error
        //Error: Variable 'a' might not have been initialized
        Float b;

        //int declaration with default value and print to console
        float weight = 40.5f;
        System.out.println("float => " + weight);

        //override string variable named age and print changed int to console
        weight = 15.8f;
        System.out.println("new float => " + weight);
    }
}
