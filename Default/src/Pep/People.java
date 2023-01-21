package Pep;

public abstract class People {
    String name,profession;
    int age;

    public People(String name, int age, String profession) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }
   public abstract String getProfession();

       public abstract int getAge();
    public abstract String  getName();
}
