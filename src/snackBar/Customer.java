package snackBar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // getters
    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public double getCashOnHand()
    {
        return this.cashOnHand;
    }

    // setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setCashOnHand(double cash)
    {
        this.cashOnHand = cash;
    }

    public void addCash(double cash)
    {
        this.cashOnHand += cash;
    }

    public void buySnack(double cost)
    {
        double cashAfterPurchase = this.cashOnHand - cost;
        if(cashAfterPurchase > 0) {
            this.cashOnHand -= cost;
        } else {
            System.out.println("Not enough funds to purchase");
        }
    }
}