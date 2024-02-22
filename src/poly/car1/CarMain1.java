package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Dirver dirver = new Dirver();

        // 차량 선택 (k3)
        K3Car k3Car = new K3Car();
        dirver.setCar(k3Car);
        dirver.driver();

        // 차량 변경 (k3 -> Model3)
        Model3Car model3Car = new Model3Car();
        dirver.setCar(model3Car);
        dirver.driver();

        // 차량 변경 (Model3 -> NewCar)
        NewCar newCar = new NewCar();
        dirver.setCar(newCar);
        dirver.driver();
    }
}
