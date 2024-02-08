package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 추가
    MemberConstruct(String name, int age){
//        System.out.println("go"); // this가 첫번째 줄에 있어야 한다 현재 부분의 주석을 제거 하면 컴발일 에러가 발생!!
        this(name,age,50);  // 변경
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
