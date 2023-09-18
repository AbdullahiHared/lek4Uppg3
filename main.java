import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        // ask for the first Name
        System.out.println("Ange din förnämn:");
        String firstName = newScanner.nextLine();
        newScanner.nextLine();

        // ask for the secondName
        System.out.println("Ange din efternämn");
        String secondName = newScanner.nextLine();
        newScanner.nextLine();

        // ask for the length
        System.out.print("Ange din längd: ");
        double length = newScanner.nextDouble();
        newScanner.nextLine();

        // ask the user for weight
        System.out.print("Ange din vikt: ");
        double weight = newScanner.nextDouble();
        newScanner.nextLine();

        // check the index of space and display text between spaces
        String userText = firstName + " " + secondName + " " + weight + "kg  " + length + "cm";
        System.out.println(userText);

        int firstSpace = userText.indexOf(" ");
        System.out.println("The index of the first space is : " + firstSpace);

        int secondSpace = userText.indexOf(" ", firstSpace + 1);
        System.out.println("The index of the second space:" + secondSpace);

        int thirdSpace = userText.indexOf(" ", secondSpace + 1);
        System.out.println("The index of third space:" + secondSpace);

        System.out.println("Text between the first space and second: " + userText.substring(firstSpace + 1, secondSpace));
        newScanner.nextLine();

        System.out.println("Text between the second space and third: " + userText.substring(secondSpace + 1, thirdSpace));
        newScanner.nextLine();

        System.out.println("Text between the first space and third:" + userText.substring(firstSpace + 1, thirdSpace));

        // even year
        System.out.println("Your age? ");
        int age = newScanner.nextInt();

        int checkAge = age % 2;
        int evenAge = age + 2;
        int oddAge = age + 1;

        if (checkAge == 0) {
            System.out.println("You will fill " + evenAge + " in two years.");
        } else if (checkAge == 1) {
            System.out.println("You will fill " + oddAge + " in one year.");
        }

        // round off (avrunda)
        
        System.out.println("Give number to round off: ");
        float number = newScanner.nextFloat();

        float result = Math.round(number);
        int myResult = (int) result;
        System.out.println("The rounded number is : " + myResult);
    }
}