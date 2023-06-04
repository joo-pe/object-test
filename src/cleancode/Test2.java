package cleancode;

/**
 * if 문 없애보기
 */

public class Test2 {

    /**
     * @title 홀짝 체크
     * @param input, randomNumber
     * @desc 난수에 대한 홀짝을 추출하고, 입력값과 비교하여 최종 홀짝 여부를 판단한다
     */
    public void check(int input, int randomNumber) {

        int result = randomNumber%2;

        if(result == 0 && input == 2) {
            System.out.println("개수는 "+ randomNumber +"! 맞췄습니다.");
        }else if(result == 1 && input == 1) {
            System.out.println("개수는 "+ randomNumber +"! 맞췄습니다.");
        }else {
            System.out.println("개수는 "+ randomNumber +"! 틀렸습니다.");
        }

    }
}
