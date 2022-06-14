public class HomeWork_2 {
    public static void main(String[] args) {

        //Задание 1
        for (int i = 1; i < 101; i++)
            System.out.println(i + "a");

        //Задание 2

        int ageChildren = 10;
        if (ageChildren <= 6) {
            System.out.println("пошел в сад");
        }if (7 <= ageChildren == ageChildren <= 10) {
            System.out.println("пошел в начальную школу");
        }if (11 <= ageChildren == ageChildren <= 16) {
            System.out.println("пошел в среднюю школу");
        }if (ageChildren >= 17) {
            System.out.println("пошел в институт");
        }

        //Задание 3
        boolean chicken = true;           //курица
        boolean vegetables = false;       //овощи
        boolean sour = true;              //соус
        boolean toast = true;             //гренки
        boolean sausage = true;           //колбаса
        boolean eggs = true;              //яйца

        if (chicken == vegetables == sour == toast) {
            System.out.println("Сделать салат Цезарь");
        }if (vegetables == (sausage || chicken) == eggs) {
            System.out.println("Сделать салат Оливье");
        }if (vegetables == true) {
            System.out.println("Сделать салат Овощной");
        } else {
        System.out.println("У меня ничего нет");

        }
        }
    }

















