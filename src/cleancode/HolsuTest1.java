package cleancode;

import java.util.Random;
import java.util.Scanner;

/**
 * 1 injent 코딩하기
 */
public class HolsuTest1 {

    public void holjjakVer1() {
        System.out.println("1 : 홀, 2 : 짝, 그외 : 종료");

        Scanner in = new Scanner(System.in);

        while(true) {

            int input = in.nextInt();

            Random random = new Random();
            int randomNumber = random.nextInt(9)+1;

            if(input > 0 && input <3) {

                int result = randomNumber%2;

                if(result == 0 && input == 2) {
                    System.out.println("개수는 "+ randomNumber +"! 맞췄습니다.");
                }else if(result == 1 && input == 1) {
                    System.out.println("개수는 "+ randomNumber +"! 맞췄습니다.");
                }else {
                    System.out.println("개수는 "+ randomNumber +"! 틀렸습니다.");
                }

            }else {
                System.out.println("종료합니다.");
                break;
            }
        }
        in.close();
    }
}
