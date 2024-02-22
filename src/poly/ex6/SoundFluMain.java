package poly.ex6;


public class SoundFluMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnumal(bird);
        flyAnumal(chicken);

    }

    // AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.sound();
        System.out.println("동물 이동 테스트 종료");
    }

    // Fly 인터페이스 있으면 사용 가능
    private static void flyAnumal(Fly fly){
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
}
