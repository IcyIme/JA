public class Vars
{
    public static void Variables()
    {

        /*
        - int holds integers (whole numbers).
        - double holds decimal numbers.
        - float is similar to double, but has less precision and requires less memory.
        ^^^ You need to use an f postfix after the value to make it a float (for example: 3.14f)
        - char holds a single character.
        - boolean can have one of the following values: true or false.
         */

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
        //Error: Variable 'b' might not have been initialized
        Float b;

        //int declaration with default value and print to console
        float weight = 40.5f;
        System.out.println("float => " + weight);

        //override string variable named weight and print changed int to console
        weight = 15.8f;
        System.out.println("new float => " + weight);

        /*
        By default, decimal values are of type double.
        float is using less storage in the memory, but is not as precise as the double type.
        This means that the calculations that use floats are faster than the ones that use double, however,
        the result is less accurate in terms of the decimal digits.
         */

        /*
                  _
              ___| |__   __ _ _ __
             / __| '_ \ / _` | '__|
            | (__| | | | (_| | |
             \___|_| |_|\__,_|_|

         */
        //Empty Double declaration can't be printed because will show you error
        //Error: Variable 'c' might not have been initialized
        char c;

        //int declaration with default value and print to console
        char character = 'a';
        System.out.println("char => " + weight);

        //override string variable named character and print changed int to console
        character = 'b';
        System.out.println("new char => " + weight);

        /*
             _                 _
            | |__   ___   ___ | | ___  __ _ _ __
            | '_ \ / _ \ / _ \| |/ _ \/ _` | '_ \
            | |_) | (_) | (_) | |  __/ (_| | | | |
            |_.__/ \___/ \___/|_|\___|\__,_|_| |_|

         */

        //Empty Double declaration can't be printed because will show you error
        //Error: Variable 'bool' might not have been initialized
        Boolean bool;

        //int declaration with default value and print to console
        boolean boole = true;
        System.out.println("boolean => " + boole);

        //override string variable named character and print changed int to console
        boole = false;
        System.out.println("new boolean => " + boole);

        //boolean can be only true or false
    }
}
