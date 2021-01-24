package calendar;

import java.util.Scanner;

public class calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar(int day) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 1; i <= day; i++) {
			System.out.print(i + "\t");
			if (i % 7 == 0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		// 월을 입력하면 해당월의 달력 출력
		Scanner sc = new Scanner(System.in);
		calendar cal = new calendar();
		while (true) {
			System.out.print("월을 입력하세요 : ");
			int inputMonth = sc.nextInt();
			if (inputMonth < 1 || inputMonth > 12) {
				System.out.println("입력을 종료합니다");
				break;
			}
			int maxDay = cal.getMaxDaysOfMonth(inputMonth);
			cal.printSampleCalendar(maxDay);
			System.out.println();
		}
	}
}
