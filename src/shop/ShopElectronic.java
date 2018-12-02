package shop;

public class ShopElectronic extends Shop{
    private double totalArea;

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public ShopElectronic(){
        super();
        totalArea = 0.0;
    }


    public ShopElectronic(String shopName, String address,int amountOfWorkers, double totalArea){
        super(shopName,address,amountOfWorkers);
        this.totalArea=totalArea;
    }


    @Override
    public String toString() {
        return "Название магазина: " +super.getShopName()+
                "\nАдрес магазина: " + super.getAddress()+
                "\nКоличество работников магазина: "+super.getAmountOfWorkers()+
                "\nОбщая площадь магазина: " + totalArea;
    }
}
