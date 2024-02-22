package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스 생성 불가
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

    }
    // 변하지 않는 부분
    private static void soundAnimal(InterfaceAnimal interfaceAnimal) {
        System.out.println("동물 이동 테스트 시작");
        interfaceAnimal.sound();
        System.out.println("동물 이동 테스트 종료");
    }
}
