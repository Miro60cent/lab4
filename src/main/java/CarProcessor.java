import java.util.Arrays;
import java.util.Comparator;

public class CarProcessor {

    /**
     * Sorts an array of cars in ascending order based on the year of manufacture.
     *
     * @param cars An array of Car objects to be sorted.
     */
    public void sortCarsByYearAscending(Car[] cars) {
        Arrays.sort(cars, Comparator.comparingInt(Car::getYear).reversed());
    }

    /**
     * Sorts an array of cars in descending order based on the price.
     *
     * @param cars An array of Car objects to be sorted.
     */
    public void sortCarsByPriceDescending(Car[] cars) {
        Arrays.sort(cars, (car1, car2) -> Double.compare(car2.getPrice(), car1.getPrice()));
    }
}
