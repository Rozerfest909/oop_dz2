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


public class T1 implements Const {
    public static void main(String[] args) {
        Cat person = new Cat("Мяу!", "Барс", 4);
        Owner people = new Owner("Александр");
        System.out.println(person.getGreet() + "Меня зовут " + person.getName() + ". Мне " + person.getAge()
                + " года (лет)." + " Мой владелец " + people.getName());
        Job_2 t2 = new Job_2();

        for (int i = 0; i <= 2; i++) {
            System.out.println("Следующее значение " + t2.getNext());
        }
        System.out.println("Сброс ");
        t2.reset();
        System.out.println("Начальное значение " + person.getAge());
        t2.setNum(4);
        for (int i = 0; i <= 2; i++){
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

