package poly.car1;

public class Dirver {
    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다:" + car);
        this.car = car;
    }

    public void driver(){
        System.out.println("자동차를 운전합니다");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
