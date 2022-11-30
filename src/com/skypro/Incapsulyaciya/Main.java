package com.skypro.Incapsulyaciya;

import com.skypro.Incapsulyaciya.transport.Car;
import com.skypro.Incapsulyaciya.transport.Bus;
import com.skypro.Incapsulyaciya.transport.Train;

public class Main {

    public static void main(String[] args) {
        System.out.println("HomeWork_OOP_Object");

        System.out.println();
        System.out.println("task_1");
        Human maksim = new Human(1987, "Максим", "Минск", "бренд-менеджером");
        Human anya = new Human(1993, "Аня", "Москва", "методистом образовательных программ");
        Human katya = new Human(1994, "Катя", "Калининград", "продакт-менеджером");
        Human artem = new Human(1995, "Артем", "Москва", "директора по развитию бизнеса");
        Human vladimir = new Human(2001, "Владимир", "Казань", "не работает");
        System.out.println(maksim);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artem);
        System.out.println(vladimir);

        System.out.println();
        System.out.println("task_2");
        Car ladaGrande = new Car("lada", "Grande", 1.7, "желтый", 2015, "Россия", "МКП", "сидан", 5, "У000ВБ000", true, null, null, 120);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "АКПП", "сидан", 5, "К000ЕН000", true, null, null, 150);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия", "АКПП", "родстер", 2, "Г000АК000", false, null, null, 180);
        Car kiaSportage4 = new Car("Kia", "Sportage4", 2.4, "желтый", 2018, "Южная Корея", "МКП", "кроссовер", 5, "Ц000ПР000", false, null, null, 140);
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "желтый", 2016, "Южная Корея", "АКПП", "сидан", 5, "Р000ШЛ000", null, null, null, 160);
        System.out.println(ladaGrande);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(hyundaiAvante);

        System.out.println();
        System.out.println("task_3");
        Flower roseCommon = new Flower("Роза обыкновенная", null, "Голандия", 35.59, 0);
        Flower hrizantemma = new Flower("Хризантемма", null, null, 15, 5);
        Flower pion = new Flower("Пион", null, "Англия", 69.90, 1);
        Flower gipsofila = new Flower("Гипсофила", null, "Турция", 19.50, 10);

        System.out.println();
        System.out.println("Расчет стоимости букета");
        Flower.printCompositionOfBouquet(roseCommon, roseCommon, roseCommon, pion, pion, pion, hrizantemma, hrizantemma, hrizantemma, gipsofila);

        System.out.println();
        System.out.println("task_4");
        Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", null, 301, 3500, 0, "Белорусский вокзвл", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2011, "Россия", null, 270, 1700, 0, "Ленинградский вокзвл", "Ленинград-Пассажирский", 8);
        System.out.println(lastochka);
        System.out.println(leningrad);

        System.out.println();
        System.out.println("task_5");
        Bus paz = new Bus("ПАЗ", "1211", 1963, "Россия", "желтый", 90);
        Bus laz = new Bus("ЛАЗ", "1134", 1985, "Россия", "белый", 115);
        Bus ikarus = new Bus("Икарус", "B-343", 1989, "Венгрия", "синий", 120);
        System.out.println(paz);
        System.out.println(laz);
        System.out.println(ikarus);

        System.out.println();
        System.out.println("Complete HomeWork");
    }
}
