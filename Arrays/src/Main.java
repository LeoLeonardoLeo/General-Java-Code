public class Main {
    public static void main(String[] args) {
        //Basics of array
        //Arrays can be numbers, words, objects, a lot of things, they can also be 2d
        //most basic array
        String[] animals = {"dog", "cat", "bird", "horse", "fish"};
        //finding specific item, we want bird
        System.out.println(animals[2]);
        //looping through an array

        for (int i = 0; i < animals.length; i++) {
            System.out.println("Animal: " + animals[i]);
        }

        int[] numbers = new int[5]; // setting a max size of the array
        numbers = new int[]{1, 2, 3, 4, 5}; // initializing the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //array of object
        Car[] cars = new Car[5]; // Setting size of 5

        Car car1 = new Car("Camaro", "Black");
        Car car2 = new Car("Toyota", "Blue");
        Car car3 = new Car("Honda", "White");
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        System.out.println(car1.name);
        System.out.println(car1.colour);

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                System.out.println(cars[i].name);
                System.out.println(cars[i].colour);
                System.out.println();
            }
        }


    }
}
class Car{
    public String name;
    public String colour;

    public Car(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }
}