package calendar;

import java.util.Scanner;

public class calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public int[] inputCycle(int num) {
		int[] month = new int[num];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < month.length; i++) {
			System.out.print("월을 입력하세요 : ");
			month[i] = sc.nextInt();
		}
		return month;
	}

	public void printSampleCalendar() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("---------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		calendar cal = new calendar();
		System.out.print("반복 횟수를 입력해주세요");
		int cycle = sc.nextInt();

		int month[] = cal.inputCycle(cycle);
		for (int i = 0; i < month.length; i++) {
			System.out.printf("%d월의 %d일까지 있습니다.\n", month[i], cal.getMaxDaysOfMonth(month[i]));
		}
		;
		// cal.printSampleCalendar();
		sc.close();
	}

}
