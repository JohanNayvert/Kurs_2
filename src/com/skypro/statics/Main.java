package com.skypro.statics;

public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork_OOP_Static");
        System.out.println();

        System.out.println("Земноводные");
        Amphibians lyagushka = new Amphibians("Лягушка", 2021, "Болото");
        Amphibians uzh = new Amphibians("Уж", 2015, "Водоем");
        System.out.println(lyagushka);
        System.out.println(uzh);


        System.out.println("Травоядные");
        Herbivores gazel = new Herbivores("Газель", 2005, "Саванна", 45, "Травоядное");
        Herbivores zhiraf = new Herbivores("Жираф", 2012, "Саванна", 30, "Травоядное");
        Herbivores loshad = new Herbivores("Лошадь", 2015, "Степь", 55, "Травоядное");
        System.out.println(gazel);
        System.out.println(zhiraf);
        System.out.println(loshad);

        System.out.println("Хищники");
        Predator giena = new Predator("Гиена", 2018, "Саванна", 35, "Падаль");
        Predator tigr = new Predator("Тигр", 2020, "Саванна", 40, "Мясо");
        Predator medved = new Predator("Медведь", 2019, "Тайга", 25, "Всеядный");
        System.out.println(giena);
        System.out.println(tigr);
        System.out.println(medved);

        System.out.println("Нелетающие");
        Flightless pavlin = new Flightless("Павлин", 2021, "Джунгли", "Зерно");
        Flightless pingvin = new Flightless("Пингвин", 2015, "Ледники", "Рыба");
        Flightless dodo = new Flightless("Додо", 2022, "Джунгли", "Зерно");
        System.out.println(pavlin);
        System.out.println(pingvin);
        System.out.println(dodo);

        System.out.println("Летающие");
        Flying chayka = new Flying("Чайка", 2018, "Прибрежная зона", "Рыба");
        Flying albatros = new Flying("Адьбатрос", 2015, "Горы", "Мясо");
        Flying sokol = new Flying("Сокол", 2019, "Тайга", "Птицы");
        System.out.println(chayka);
        System.out.println(albatros);
        System.out.println(sokol);

        System.out.println();
        System.out.println("Complete HomeWork");
    }
}
