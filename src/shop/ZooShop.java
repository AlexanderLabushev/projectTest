package shop;

public class ZooShop extends Shop{

    public ZooShop() {
        super();
    }

    public ZooShop(String shopName) {
        super(shopName);
    }

    public ZooShop(String shopName, String address) {
        super(shopName, address);
    }

    public ZooShop(String shopName, String address, int amountOfWorkers) {
        super(shopName, address, amountOfWorkers);
    }
    @Override
    public String toString() {
        return "Название магазина: " +super.getShopName()+
                "\nАдрес магазина: " + super.getAddress()+
                "\nКоличество работников магазина: "+super.getAmountOfWorkers();
    }
}

