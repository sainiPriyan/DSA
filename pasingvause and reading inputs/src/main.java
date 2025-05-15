import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int currentYear = 2023;
        try {
            System.out.println(getInputFromConsole(currentYear));
        }
        catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear)
    {
        String name = System.console().readLine("Hi, What is your name?\n");
        System.out.println("hello "+name+", thanks for replying!");

        String dateOfBirth = System.console().readLine("What year were you born ? \n");

        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "so you are "+age+" years old";
    }

    public static String getInputFromScanner (int currentYear)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, What is your name?");

        String name = scanner.nextLine();

        System.out.println("hello "+name+", thanks for replying!");
        System.out.println("What year were you born ?");

        String dateOfBirth = scanner.nextLine();

        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "so you are "+age+" years old";

    }

}
