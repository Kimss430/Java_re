package Test7;

public class Game {

	private Bear bear;
    private Fish fish;

    public Game() {
        bear = new Bear(0, 0, 1); // Bear 초기 위치 (0, 0), 이동 거리 1
        fish = new Fish(5, 5, 1); // Fish 초기 위치 (5, 5), 이동 거리 1
    }

    public void run() {
        System.out.println("** Bear의 Fish 잡기 게임을 시작합니다. **");

        while (true) {
            printMap();

            bear.move(); // Bear 이동
            if (bear.collide(fish)) { // Bear가 Fish를 잡았는지 확인
                System.out.println("Bear가 Fish를 잡았습니다. 게임 종료!");
                break;
            }

            fish.move(); // Fish 이동
            if (bear.collide(fish)) { // Fish가 이동한 후 Bear가 Fish를 잡았는지 확인
                System.out.println("Bear가 Fish를 잡았습니다. 게임 종료!");
                break;
            }
        }
    }

    private void printMap() {
        char[][] map = new char[10][20];

        // 맵 초기화
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                map[i][j] = '-';
            }
        }

        // Bear와 Fish의 위치를 표시
        map[bear.getY()][bear.getX()] = bear.getShape();
        map[fish.getY()][fish.getX()] = fish.getShape();

        // 맵 출력
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
        game.run();
	}

}
