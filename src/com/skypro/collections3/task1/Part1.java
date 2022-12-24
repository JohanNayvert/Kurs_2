package com.skypro.collections3.task1;

import java.util.HashMap;
import java.util.Map;

public class Part1 {

    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Денисов Андрей", "+7(925)680-50-23");
        phoneBook.put("Тарасов Денис", "+7(912)380-43-12");
        phoneBook.put("Евдакимов Павел", "+7(213)623-23-21");
        phoneBook.put("Юлмашев Сергей", "+7(123)623-50-33");
        phoneBook.put("Кульмаметьева Зарина", "+7(215)123-12-43");
        phoneBook.put("Елисеева Анастасия", "+7(543)450-23-57");
        phoneBook.put("Фаустов Петр", "+7(545)545-45-56");
        phoneBook.put("Троцкий Генадий", "+7(367)340-54-23");
        phoneBook.put("Щадрина Мария", "+7(765)890-65-33");
        phoneBook.put("Дунаев Михаил", "+7(876)656-35-67");
        phoneBook.put("Чемезов Денис", "+7(889)546-35-67");
        phoneBook.put("Хустнудинов Константин", "+7(345)670-78-56");
        phoneBook.put("Рафаилов Раиль", "+7(456)567-87-55");
        phoneBook.put("Голунов Алексей", "+7(567)780-87-53");
        phoneBook.put("Зорин Николай", "+7(567)876-56-78");
        phoneBook.put("Понаморев Евгений", "+7(655)456-76-56");
        phoneBook.put("Чусов Максим", "+7(567)567-76-67");
        phoneBook.put("Носкова Жанна Андрей", "+7(556)676-55-67");
        phoneBook.put("Перцев Артем", "+7(765)876-57-27");
        phoneBook.put("Фефелов Родион", "+7(554)450-67-58");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Контакт: " + entry.getKey() + "-> Номер: " + entry.getValue());
        }
    }
}
