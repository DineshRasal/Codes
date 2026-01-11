package Interview;

public class Car {

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static class Main {
        public static void main(String[] args) {
            Car car = new Car();
            car.setModel("BMW");
            System.out.println(car.getModel());
        }
    }
}
