import java.util.Scanner;
import java.util.Arrays;

public class LoopSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = 1;
        int maxCount = 10;

        // while 문
//        while (maxCount > 0) {
//            amount = scanner.nextInt();
//
//            if(amount == 0) //0원을 송금하려고 무료 송금 횟수를 차감하면 안되므로 별로도 탈출 코드 작성
//                break;
//
//            System.out.println("송금하신 금액은 " + amount + " 입니다.");
//
//            //무한 루프가 돌지 않기 위한 수행문;
//            maxCount--;
//
//            System.out.println("남은 송금 횟수는 " + maxCount + "번 입니다.");
//        }
//
//        // for 문
//        for(maxCount = 10; maxCount > 0; maxCount--){
//            amount = scanner.nextInt();
//
//            if(amount == 0) //0원을 송금하려고 무료 송금 횟수를 차감하면 안되므로 별로도 탈출 코드 작성
//                break;
//
//            System.out.println("송금하신 금액은 " + amount + " 입니다.");
//
//            System.out.println("남은 송금 횟수는 " + maxCount + "번 입니다.");
//        }
//        // do while 문
//
//        maxCount = 10;
//
//        do{
//            amount = scanner.nextInt();
//
//            if(amount == 0) //0원을 송금하려고 무료 송금 횟수를 차감하면 안되므로 별로도 탈출 코드 작성
//                break;
//
//            System.out.println("송금하신 금액은 " + amount + " 입니다.");
//
//            System.out.println("남은 송금 횟수는 " + --maxCount + "번 입니다.");
//        }while(maxCount > 0);

        // Nested for 문
        int[][] bankDeposit = {{300, 200, 100}, {2, 30}, {300, 50}};
        int[] bankBalance = {0, 0, 0};

        for(int i = 0 ; i < bankDeposit.length; i++){
            System.out.printf("%d번째 은행 입금 이력은 %s입니다.\n", i, Arrays.toString(bankDeposit[i]));
            for(int j = 0 ; j < bankDeposit[i].length ; j++){
                //수행문;
                bankBalance[i] += bankDeposit[i][j];
            }
        }
        System.out.println(Arrays.toString(bankBalance));

        // Continue

        maxCount = 10;

        while (maxCount > 0) {
            amount = scanner.nextInt();

            if(amount == 0) //0원을 송금하려고 무료 송금 횟수를 차감하면 안되므로 별로도 탈출 코드 작성
                continue;

            System.out.println("송금하신 금액은 " + amount + " 입니다.");

            //무한 루프가 돌지 않기 위한 수행문;
            maxCount--;

            System.out.println("남은 송금 횟수는 " + maxCount + "번 입니다.");
        }
    }
}