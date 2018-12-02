package ShopElectronics;

import shop.ShopElectronic;

import java.util.*;

//import java.util.*; можно импортировать сразу библиотеку

public class Electrosila {
    public static void main(String[] args) {

        ShopElectronic shopElectronic = new ShopElectronic("Электросила",
                "пр. Космонавтов 45", 5, 110);

        String[] personalArray = new String[shopElectronic.getAmountOfWorkers()];
        personalArray[0]="Ярослав Пенторов";
        personalArray[1]="Григорий Витов";
        personalArray[2]="Александр Ульянов";
        personalArray[3]="Михаил Бачила";
        personalArray[4]="Владимир Высоцкий";

        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put(personalArray[0],"Кассир");
        treeMap.put(personalArray[1],"Консультант");
        treeMap.put(personalArray[2],"Менеджер");
        treeMap.put(personalArray[3],"Кассир");
        treeMap.put(personalArray[4],"Директор");


        ArrayList<String> products = new ArrayList<>();
        products.add("Телефоны");
        products.add("Ноутбуки");
        products.add("Телевизоры");
        products.add("Электроплиты");
        products.add("Принтеры");



        System.out.println("Введите цифру операции: \n" +
                "1) Узнать информацию о магазине\n" +
                "2) Узнать список работников\n" +
                "3) Узнать виды продаваемой продукции");

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        switch (num){
            case "1":
                System.out.println(shopElectronic.toString());break;
            case "2":
                System.out.println("Cписок работников : \n");
                for (int j = 0; j<personalArray.length;j++){
                    System.out.println((j+1)+") "+personalArray[j]);
                }
                System.out.println();
                System.out.println("Выберите следующую операцию:\n"+
                        "1) Вывести на экран работников в отсортированном порядке\n"+
                        "2) Узнать должность работника по его номеру:");
                Scanner scan2 = new Scanner(System.in);
                String num2 = scan2.nextLine();

                switch (num2){
                    case "1":
                        Arrays.sort(personalArray);
                        for (String rr:personalArray) {
                            System.out.println(rr);
                        }
                        break;
                    case "2":
                        System.out.println("Введите номер работника: ");
                        Scanner scan3 = new Scanner(System.in);
                        String num3 = scan3.nextLine();
                        if(num3.equals("1")){
                            System.out.println(treeMap.get(personalArray[0]));
                        }else if(num3.equals("2")){
                            System.out.println(treeMap.get(personalArray[1]));
                        }else if(num3.equals("3")){
                            System.out.println(treeMap.get(personalArray[2]));
                        }else if(num3.equals("4")){
                            System.out.println(treeMap.get(personalArray[3]));
                        }else if(num3.equals("5")){
                            System.out.println(treeMap.get(personalArray[4]));
                        }else{
                            System.out.println("Неправильный ввод");
                        }break;
                    default:
                        System.out.println("Неправильный ввод");
                }

                break;
            case "3":
                ListIterator<String>listIterator = products.listIterator();
                while(listIterator.hasNext()){
                    String str = listIterator.next();
                    System.out.println(str);
                }
                break;
            default:
                System.out.println("Повторите ввод");
        }

    }
}

