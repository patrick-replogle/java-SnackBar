package snackBar;

public class Main
{
    private static void workWithData()
    {
        // setup
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, 1);
        Snack s2 = new Snack("Chocalate Bar", 36, 1.00, 1);
        Snack s3 = new Snack("Pretzel", 30, 2.00, 1);

        Snack s4 = new Snack("Soda", 24, 2.50, 2);
        Snack s5 = new Snack("Water", 20, 2.75, 2);

        // processing
        // #1
        c1.buySnack(s4.getCost() * 3);
        s4.buySnack(3);
        System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity() + "\n");
        // #2
        c1.buySnack(s3.getCost());
        s3.buySnack(1);
        System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity() + "\n");
        // #3
        c2.buySnack(s4.getCost() * 2);
        s4.buySnack(2);
        System.out.println(c2.getName() + " cash on hand " + c2.getCashOnHand());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity() + "\n");
        // #4
        c1.addCash(10);
        System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand() + "\n");
        // #5
        c1.buySnack(s2.getCost());
        s2.buySnack(1);
        System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of " + s2.getName() + " is " + s2.getQuantity() + "\n");
        // #6
        s3.addQuantity(12);
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity() + "\n");
        // #7
        c2.buySnack(s3.getCost() * 3);
        s3.buySnack(3);
        System.out.println(c2.getName() + " cash on hand " + c2.getCashOnHand());
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity() + "\n");
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}