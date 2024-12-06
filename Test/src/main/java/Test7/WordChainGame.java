package Test7;
import java.util.Scanner;

public class WordChainGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("끝말잇기 게임 시작");
        System.out.print("참가인원 입력 : ");
        int num = scan.nextInt();

        String[] participants = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("이름 : ");
            participants[i] = scan.next();
        }

        System.out.println("시작하는 단어는 '자바'입니다.");
        String currentWord = "자바";
        boolean gameOver = false;
        int currentPlayer = 0;

        while (!gameOver) {
            System.out.print(participants[currentPlayer] + ">> ");
            String nextWord = scan.next();

            // 끝말잇기 규칙 검사
            if (!nextWord.startsWith(String.valueOf(currentWord.charAt(currentWord.length() - 1)))) {
                System.out.println(participants[currentPlayer] + "이(가) 졌습니다!");
                gameOver = true;
            } else {
                currentWord = nextWord; // 현재 단어 갱신
                currentPlayer = (currentPlayer + 1) % num; // 다음 참가자로 이동
            }
        }

        System.out.println("게임 종료!");
        scan.close();
    }
}
