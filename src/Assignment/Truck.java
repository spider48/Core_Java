package Assignment;

public class Truck extends Car{

    public void SetSalePrice(double price){
        int Weight = 2000;
        this.SalePrice = price;
    }

    @Override
    public double getSalePrice() {
        return super.getSalePrice();
    }
}
