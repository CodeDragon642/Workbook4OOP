public class DogTest {
    public static void main(String[] args){

        Dog dog1 = new Dog("Rover", "Doberman", 5);
        System.out.println("Name: " + dog1.getName() + " Breed: " + dog1.getBreed() + " Age: " + dog1.getAge() + "yrs");
        Dog dog2= new Dog("Charles", "Terrier", 11);
        System.out.println("Name: " + dog2.getName() + " Breed: " + dog2.getBreed() + " Age: " + dog2.getAge() + "yrs");
        Dog dog3= new Dog("Thorin", "Tibetan Mastiff", 3);
        System.out.println("Name: " + dog3.getName() + " Breed: " + dog3.getBreed() + " Age: " + dog3.getAge() + "yrs");

        dog3.growOlder();
        System.out.println("Name: " + dog3.getName() + " Breed: " + dog3.getBreed() + " Age: " + dog3.getAge() + "yrs");

        dog1.callDog();
        dog2.rollOver();
        dog3.callDog();
    }
}
