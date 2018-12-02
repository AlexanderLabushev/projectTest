package ZooShop;

import shop.ZooShop;
import java.io.*;

public class EvrethingForAnimals {
    public static void main(String[] args) {

ZooShop zooShopOne = new ZooShop("Happy Animals","ул. Драгунова 23",3);
ZooShop zooShopTwo = new ZooShop("Fanny Animals","ул. Волкова 64",6);
ZooShop zooShopThree = new ZooShop();

        System.out.println("До сериализации: ");
        System.out.println();
        System.out.println(zooShopOne);
        System.out.println();
        System.out.println(zooShopTwo);
        System.out.println();
        System.out.println(zooShopThree);

        File file = new File("C:\\Users\\Besby\\IdeaProjects\\Project\\src\\ZooShop/animals.txt");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))){

            objectOutputStream.writeObject(zooShopOne);
            zooShopThree = (ZooShop) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException|ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("**********************************************");
        System.out.println("После сериализации: ");
        System.out.println();
        System.out.println(zooShopOne);
        System.out.println();
        System.out.println(zooShopTwo);
        System.out.println();
        System.out.println(zooShopThree);
    }
}
