package snackBar;

public class Snack
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
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

    public double getCost()
    {
        return this.cost;
    }

    public int getVendingMachineId()
    {
        return this.vendingMachineId;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public double getTotalCost(int quantity)
    {
        return this.cost*quantity;
    }

    // setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public void setVendingMachineid(int id)
    {
        this.vendingMachineId = id;
    }

    public void addQuantity(int quantity)
    {
        this.quantity += quantity;
    }

    public void buySnack(int quantity)
    {
        if(this.quantity-quantity >= 0) {
            this.quantity -= quantity;
        } else {
            System.out.println("Not enough quantity in machine");
        }
    }
}