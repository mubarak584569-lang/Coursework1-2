
import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = "024034";

        int vanilla = Integer.parseInt(number.substring(3,4));
        int chocolate = Integer.parseInt(number.substring(4,0));
        int strawberry = Integer.parseInt(number.substring(0,2));

        System.out.print("Would you like (v)anilla, (c)hocolate or (s)trawberry");
        String flavour = scanner.nextLine().toLowerCase();

        int pricePerScoop = 0;
        if (flavour.equals("v")){
            pricePerScoop = vanilla;
        } else if (flavour.equals("c")){
            pricePerScoop = chocolate;
        } else if (flavour.equals("s")){
            pricePerScoop = strawberry;
        } else {
            System.out.println("we don't have that flavour");
            scanner.close();
            return;
        }
        System.out.println("(How many scoops would you like? )");
        int scoops = scanner.nextInt();

        if(scoops < 1){
            System.out.println("We don't sell just a cone");
        } else if (scoops > 3){
            System.out.println("That's too many scoops to fit in a cone. ");
        } else {
            int totalPence = 100 + (pricePerScoop * scoops);
            System.out.printf("That will be £%.2f please.%n", totalPence / 100.0);
        }
        scanner.close();
    }
}
