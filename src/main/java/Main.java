public class Main {
    public static void main(String[] args) {
        CarProcessor carProcessor = new CarProcessor();
        Main main = new Main();

        try {
            Car[] cars = main.createCars();
            carProcessor.sortCarsByYearAscending(cars);
            main.printCars("Сортування за роком випуску за зростанням:", cars);

            carProcessor.sortCarsByPriceDescending(cars);
            main.printCars("\nСортування за ціною за спаданням:", cars);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Car[] createCars() {
        return new Car[] {
                new Car("Subaru", "Impreza", 2020, 25000.0, 15000),
                new Car("Honda", "Civic", 2019, 22000.0, 18000),
                new Car("Ford", "Escort", 2021, 35000.0, 10000),
                new Car("Chevrolet", "Camaro", 2018, 20000.0, 25000),
                new Car("Nissan", "GT-R", 2017, 18000.0, 30000)
        };
    }

    public void printCars(String message, Car[] cars) {
        System.out.println(message);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
