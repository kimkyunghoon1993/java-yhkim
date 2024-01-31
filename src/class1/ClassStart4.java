package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student();   //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();   //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2];    // 2개의 값이 들어 갈수 있는 배열을 생성하고
        students[0] = student1; //  0번째 자리에 student1 을 넣고
        students[1] = student2; //  1번째 자리에 student2 을 넣어준다


        System.out.println("이름:" + students[0].name + "나이:" + students[0].age + "성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + "나이:" + students[1].age + "성적:" + students[1].grade);



    }
}
