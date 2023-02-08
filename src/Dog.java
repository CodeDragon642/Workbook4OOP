public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        setName(name);
        setBreed(breed);
        setAge(age);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void callDog(){
        System.out.println("Come here, " + getName());
    }

    public void rollOver(){
        System.out.println("Aaw! look at " + getName() + " roll over.");
    }

    public void growOlder(){
        age++;
    }
}
