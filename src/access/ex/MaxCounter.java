package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        // return 를 사용하는 이유?
        // 검증 로직
        if (count >= max){
            System.out.println("최대값을 초과 할수 없습니다.");
            return;
        }
        // 실행 로직
        count ++;

        // 검증 로직 에서 성공 해야 실행 로직을 수행 하기 때문에 이 결과 코드가 명확해 진다



        // 아래처럼 사용할수도 있다 return 를 제거 하고 else 를 사용하면 결과는 같을수 있지만
        // 의도가 명확하고 직관 적이지 않다
//        if (count >= max){
//            System.out.println("최대값을 초과 할수 없습니다.");
//        } else {
//            count ++;
//        }

    }

    public int getCount(){
        return count;
    }


}
