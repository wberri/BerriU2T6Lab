public class LabRunner {

    public static void main(String[] arg){
        String str1 = "A";
        str1 += 1;
        str1 += 2;
        str1 += 3;
        str1 += "B";
        System.out.println("str1 = " + str1);

        String str2 = "0";
        str2 += 1;
        str2 += 2;
        str2 += 3;
        System.out.println("str2 = " + str2);

        String str3 = "0" + 1;
        str3 += 2 + 3;
        System.out.println("str3 = " + str3);

        String str4 = 1 + 2 + "3";
        str4 += 4 + 5;
        str4 += 6;
        System.out.println("str4 = " + str4);

        String str5 = "1" + 2 + 3;
        str5 += "4" + 5 + 6;
        System.out.println("str5 = " + str5);
System.out.println();
        String str6 = "";
        str6 += 1;
        str6 += 2;
        str6 += 3 + 4 + 5;
        System.out.println("str6 = " + str6);

        int five = 5;
        int six = 6;
        String s = "7";
        s += 8;
        System.out.println(five + six + s);

        String t = "2";
        int f = 4;
        int x = 7;
        x += 5;
        System.out.println(t + f + x);

        System.out.println("The string \"\"\nis an empty string."); //d
        System.out.println("The escape sequence for \\ is \\\\");
        System.out.println("The escape sequence for \" is \\\"");
        System.out.println("/A\\V/A\\\n\\V/A\\V/");
        System.out.println("Use \"\\n\"\nfor a new line");
        System.out.println("My favorite punctuation mark is \"\\\"");
        System.out.println("Now I know my\n A\n  B\n   C's");
        System.out.println("¯\\_(\"/)_/¯");
        System.out.println("Dear Jen, \nYou got an \"A\"! \n\nSincerely,\nThe teacher");
        System.out.println("O   O\n\n  \" \n\n\\\\\\\\\\");
        System.out.println("  /\\\n /\"\"\\\n/\"  \"\\\n\\\"  \"/\n \\\"\"/\n  \\/" );
        String name = "Angie";
        int age = 17;
        String word = "Bam";
        String info = "Name:\n" + name + "\n" + "\nAge:\n" + age;
        info += "\n\nFavorite Word:\n" +"\"" + word + "!\"";
        System.out.println(info);
        String greeting = "Hello, friend!\n";
        System.out.print(greeting);
        System.out.print("Nice to see you!\n");
        System.out.println("Goodbye!");

    }
}
