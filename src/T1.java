//Задача 1:
//Создайте класс "Кот" (Cat) со следующими свойствами:
//Приватное поле "имя" (name) типа String для хранения имени кота.
//Приватное поле "возраст" (age) типа int для хранения возраста кота.
//Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
//Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
//Дополнительное задание:
//Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот"
// и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида
// "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class T1 implements Const {
    public static void main(String[] args) {
        Cat person = new Cat("Мяу!", "Барс", 4);
        Owner people = new Owner("Александр");
        System.out.println(person.getGreet() + "Меня зовут " + person.getName() + ". Мне " + person.getAge()
                + " года (лет)." + " Мой владелец " + people.getName());
        Job_2 t2 = new Job_2();

        for (int i = 0; i < 6; i++) {
            System.out.println("Следующее значение " + t2.getNext());
        }
        System.out.println("Сброс ");
        t2.reset();
        System.out.println("Начальное значение " + person.getAge());
        t2.setNum(4);
        for (int i = 0; i <= 3; i++){
            System.out.println("Следующее значение " + t2.getNext());
        }

        for (int i = MIN; i < 6; i++){
            if(i == person.getAge()){
                System.out.println("Возможно это кот Шрёдингера");
            }
            else if(i < MAX){
                System.out.println("Возможно это кот не Шрёдингера");
            }
            else
                System.out.println(ERROR);
        }
        person.message1();
        person.message2();
        person.message3();

        LF_2 t4 = new LF_2();
        t4.getOwner();
        System.out.println("Владелец: " + t4.getOwner());
        System.out.println("Кот: " + t4.getCat());

        Inter inter = (x) -> x;
        Inter inter_2 = (y) -> 2023 - y;
        System.out.println("Родился  " + inter.getInter(person.getAge()) + " года (лет) назад");
        System.out.println("Год рождения кота: " + inter_2.getInter(person.getAge()));


        List<AnimalCats> cats = new ArrayList<>();
        cats.add(new AnimalCats("Бэтмен", 7, 8,"Черный"));
        cats.add(new AnimalCats("Робин", 2, 5,"Черный в горошек"));
        cats.add(new AnimalCats("Кот-провокатор", 10, 7,"Рыжий"));
        cats.add(new AnimalCats("Барс", 4, 6,"Тигровый"));
        cats.add(new AnimalCats("Пупс", 7, 3,"Белый"));
        cats.add(new AnimalCats("Пушистик", 1, 5,"Серый"));
        cats.add(new AnimalCats("Пикачу", 3, 6,"Рыжий"));

        Comparator<AnimalCats> ageAndColorComparator = new Comparator<AnimalCats>() {
            @Override
            public int compare(AnimalCats cat1, AnimalCats cat2) {
                int ageCompare = cat1.getAge() - cat2.getAge();
                if(ageCompare != 0) {
                    return ageCompare;
                }
                return cat1.getWeight() - cat2.getWeight();
            }
        };
        cats.sort(ageAndColorComparator);
        for (AnimalCats cat : cats){
            System.out.println(cat);

        }
    }
}

class Cat implements I2 {
    private String name;
    private int age;
    private String greet;

    public Cat(String greet, String name, int age) {
        this.name = name;
        this.greet = greet;
        this.age = age;
    }
    public String getGreet() {
        return greet;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public void message1() {
        System.out.println("Кот  " + name);
    }

    @Override
    public void message2() {
        System.out.println("Возраст " + age);
    }

    @Override
    public void message3() {
        System.out.println("Сказал " + greet);
    }
}
class Owner {
    private String name_owner;

    public Owner(String name_owner) {
        this.name_owner = name_owner;
    }
    public String getName() {
        return name_owner;
    }
}

