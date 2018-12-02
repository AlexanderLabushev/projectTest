package shop;

import java.io.Serializable;

public abstract class Shop implements Serializable {

    private  String shopName;
    private String address;
    private transient int amountOfWorkers;


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmountOfWorkers() {
        return amountOfWorkers;
    }

    public void setAmountOfWorkers(int amountOfWorkers) {
        this.amountOfWorkers = amountOfWorkers;
    }

    public Shop(){
     this("'Имя магазина не указано'","'Адрес магазина не указан'",0);
    }

    public Shop(String shopName){
        this(shopName,null,0);
    }

    public Shop(String shopName, String address){
        this(shopName,address,0);
    }


    public Shop(String shopName, String address, int amountOfWorkers) {
        this.shopName = shopName;
        this.address = address;
        this.amountOfWorkers = amountOfWorkers;
    }
}
