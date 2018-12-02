package shop;

//Есть завод(factory) который производит некую продукцию и магазин(shop) который принимает эту продукцию по мере того как продукция выпускается
public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        Factory pr = new Factory(product, 10);
        Shop1 cons = new Shop1(product, 10);

        pr.start();
        cons.start();
    }
}
class Product {
    int id;
    boolean isProduced;
    synchronized void getIdProduct() {
        // Если товар не произведен, поток магазина засыпает
        if (!isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Get " + this.id);
        isProduced = false;
        notify();
    }
    synchronized void setIdProduct(int id) {
        // Если товар произведен, тогда поток завода засыпает
        if (isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.id = id;
        System.out.println("Set " + this.id);
        isProduced = true;
        notify();
    }
}
class Factory extends Thread {
    Product product;
    int count;
    Factory(Product product, int count) {
        this.product = product;
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 1; i < count + 1; i++) {
            product.setIdProduct(i);
        }
    }
}
class Shop1 extends Thread {
    Product product;
    int count;
    Shop1(Product product, int count) {
        this.product = product;
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 1; i < count + 1; i++) {
            product.getIdProduct();
        }
    }
}

