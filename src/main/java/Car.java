public class Car {

    private final String mark;
    private final String model;
    private final int year;
    private final double price;
    private final int mileage;

    public Car(String mark, String model, int year, double price, int mileage) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        if (mileage < 0) {
            throw new IllegalArgumentException("Mileage cannot be negative.");
        }
        if (year < 0) {
            throw new IllegalArgumentException("Year cannot be negative.");
        }
        if (mark.isEmpty()){
            throw new IllegalArgumentException("Mark cannot be empty.");
        }
        if (model.isEmpty()){
            throw new IllegalArgumentException("Model cannot be empty.");
        }

        this.mark = mark;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return mark + " " + model + " (" + year + ") - Price: $" + price + ", Mileage: " + mileage + " kilometers";
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }
}
