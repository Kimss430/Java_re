package Test7;

import java.util.Scanner;

public class ConcertReservationSystem {

	private static int SEAT_COUNT = 10;
	private String[] sSeats = new String[SEAT_COUNT];
	private String[] aSeats = new String[SEAT_COUNT];
	private String[] bSeats = new String[SEAT_COUNT];
	private Scanner scanner = new Scanner(System.in);

	public ConcertReservationSystem() {
		for (int i = 0; i < SEAT_COUNT; i++) {
			sSeats[i] = aSeats[i] = bSeats[i] = "---";
		}
	}

	public void start() {
		while (true) {
			System.out.println("메뉴를 선택하세요: 1.예약 2.조회 3.취소 4.끝내기");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				reserve();
				break;
			case 2:
                viewSeats();
				break;
			case 3:
            	cancel();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
                return;
			default:
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
			}
		}
	}

	private void reserve() {
		System.out.println("좌석 구분 S(1), A(2), B(3): ");
		int seatType = scanner.nextInt();
		String[] seats = getSeatsByType(seatType);
		
		if (seats == null) {
            System.out.println("잘못된 좌석 유형입니다.");
            return;
        }
		
		System.out.println("이름: ");
		String name = scanner.next();
		
		System.out.println("좌석 번호(1~10): ");
		int seatNumber = scanner.nextInt();
		
		if (seatNumber < 1 || seatNumber > SEAT_COUNT || !seats[seatNumber - 1].equals("---")) {
            System.out.println("예약할 수 없는 좌석입니다.");
            return;
        }

        seats[seatNumber - 1] = name;
        System.out.println("예약이 완료되었습니다.");
	}

	private void viewSeats() {
		System.out.print("S석: ");
		printSeats(sSeats);
		System.out.print("A석: ");
		printSeats(aSeats);
		System.out.print("B석: ");
		printSeats(bSeats);
	}

	private void cancel() {
		System.out.println("좌석 구분 S(1), A(2), B(3): ");
        int seatType = scanner.nextInt();
        String[] seats = getSeatsByType(seatType);

        if (seats == null) {
            System.out.println("잘못된 좌석 유형입니다.");
            return;
        }
		
		System.out.println("이름: ");
		String name = scanner.next();
		
		boolean found = false;
		for(int i = 0; i < SEAT_COUNT; i++) {
			if (seats[i].equals(name)) {
                seats[i] = "---";
                found = true;
                System.out.println("예약이 취소되었습니다.");
                break;
			}
		}
		if (!found) {
            System.out.println("예약자를 찾을 수 없습니다.");
        }
	}
	
	private String[] getSeatsByType(int seatType) {
        switch (seatType) {
            case 1:
                return sSeats;
            case 2:
                return aSeats;
            case 3:
                return bSeats;
            default:
                return null;
        }
    }
	
	private void printSeats(String[] seats) {
		for (String seat : seats) {
			System.out.print(seat + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcertReservationSystem system = new ConcertReservationSystem();
        system.start();
	}

}
