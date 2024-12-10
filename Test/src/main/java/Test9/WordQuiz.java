package Test9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class Word {
	private String english;
	private String korean;

	public Word(String english, String korean) {
		this.english = english;
		this.korean = korean;
	}

	public String getEnglish() {
		return english;
	}

	public String getKorean() {
		return korean;
	}

}

public class WordQuiz {
	private Vector<Word> v;
	String name;

	public WordQuiz(String name) {
		this.name = name;

		v = new Vector<Word>();
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("emotion", "감정"));
		v.add(new Word("human", "인간"));
		v.add(new Word("stock", "주식"));
		v.add(new Word("trade", "거래"));
		v.add(new Word("society", "사회"));
		v.add(new Word("baby", "아기"));
		v.add(new Word("honey", "꿀"));
		v.add(new Word("dall", "인형"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("picture", "사진"));
		v.add(new Word("painting", "그림"));
		v.add(new Word("fault", "오류"));
		v.add(new Word("example", "보기"));
		v.add(new Word("eye", "눈"));
		v.add(new Word("statue", "조각상"));
	}

	public void start() {
		System.out.println("\"" + name + "\"" + "의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");
		Scanner scan = new Scanner(System.in);
		while (true) {
			// 랜덤 문제 출제
			Word correctWord = v.get((int) (Math.random() * v.size()));
			String correctAnswer = correctWord.getKorean();

			// 보기 생성
			HashSet<String> options = new HashSet<>();
			options.add(correctAnswer); // 정답 포함

			while (options.size() < 4) { // 4개의 보기를 생성
				String randomOption = v.get((int) (Math.random() * v.size())).getKorean();
				options.add(randomOption);
			}

			// 보기를 랜덤하게 섞기
			List<String> shuffledOptions = new ArrayList<>(options);
			Collections.shuffle(shuffledOptions);

			// 문제 출력
			System.out.println(correctWord.getEnglish() + "?");
			for (int i = 0; i < shuffledOptions.size(); i++) {
				System.out.print("(" + (i + 1) + ")" + shuffledOptions.get(i) + " ");
			}

			// 사용자 입력
			System.out.print(":> ");
			int userChoice = scan.nextInt();

			if (userChoice == -1) {
				System.out.println("\"" + name + "\"" + "를 종료합니다...");
				break;
			}
			if (shuffledOptions.get(userChoice - 1).equals(correctAnswer)) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("오답입니다. 정답은 " + correctAnswer + "입니다.");
			}
		}
	}

	public static void main(String[] args) {
		WordQuiz quiz = new WordQuiz("영어테스트");
		quiz.start();
	}
}
