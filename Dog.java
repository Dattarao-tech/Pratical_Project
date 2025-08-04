public class Dog 
{
    String name;
    String breed;
    int age;
    public Dog(String name, String breed, int age) 
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public void displayDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years");
    }
    public static void main(String[] args) 
    {
        Dog myDog = new Dog("Buddy", "Golden Retriever", 3);
        myDog.displayDetails();
    },bbbbbb
}