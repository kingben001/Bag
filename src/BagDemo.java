import java.util.Scanner;

public class BagDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Bag myBag = new Bag();
        int choice;


        do {
            System.out.println("Press 1 to change the name of the bag  \nPress 2 to add an item to the bag "+
            "\nPress 3 to change the maximum weight of the bag  \nPress 4 to view all information about the bag " +
                    "\nPress 5 to end the program");
             choice = keyboard.nextInt();

            if (choice == 1){
                System.out.println("What is the name of the bag?");
                String newName = keyboard.next();
                myBag.setName(newName);

            }
            else if (choice ==2){
                System.out.println("What is the weight of the item?");
                double newWeight = keyboard.nextDouble();
                myBag.addItem(newWeight);

            }
            else if (choice ==3){
                System.out.println("What is the new maximum weight of the bag?");
                double newMaximumWeight = keyboard.nextDouble();
                myBag.setMaximumWeight(newMaximumWeight);

            }
            else if (choice == 4){
                System.out.println(myBag.getName());
                System.out.println(myBag.getCurrentWeight());
                System.out.println(myBag.getMaximumWeight());
               

            }
            else if (choice == 5){
                System.out.println("Goodbye");
            }
else
                System.out.println("Error!");


        } while (choice !=5);
    }
}
