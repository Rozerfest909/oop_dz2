class AnimalCats {
    private String name;
    private int age;
    private int weight;
    private String color;

    public AnimalCats(String name, int age, int weight, String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color =color;
    }
    public int getAge(){
        return age;
    }
    public int getWeight(){
        return weight;
    }
    @Override
    public String toString(){
        return "Animal{" +
                "name'" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color=" + color +
                '}';
    }
}