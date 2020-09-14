package ru.mirea.inbo0219;


public class TestAuthor {
    public static void main(String[] args) {

        Author a1 = new Author("ХудшийИзЛучших", "lolcolor@kek.org",'M');

        System.out.println("Данная прогрмма содержит класс Author с несколькоми переменными и методами");

        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println("Пол автора "+a1.getGender());
        System.out.println(a1.toString());
    }
}
