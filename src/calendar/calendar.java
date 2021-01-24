package calendar;

import java.util.Scanner;

public class calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) { // 윤년인지 평년인지
			return true; // 윤년
		}
		return false; // 평년
	}

	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		}
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalendar(int inputYear, int month, int day, String inputWeek) {
		System.out.println(inputYear + "년 " + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int count = 0;
		if (inputWeek.equals("일")) { //요일에 대한 카운트
			count = 0;
		} else if (inputWeek.equals("월")) {
			count = 1;
		} else if (inputWeek.equals("화")) {
			count = 2;
		} else if (inputWeek.equals("수")) {
			count = 3;
		} else if (inputWeek.equals("목")) {
			count = 4;
		} else if (inputWeek.equals("금")) {
			count = 5;
		} else if (inputWeek.equals("토")) {
			count = 6;
		}
		for (int j = 0; j < count; j++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= day; i++) {
			System.out.print(i + "\t");
			count++;
			if (count % 7 == 0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		// 월을 입력하면 해당월의 달력 출력
		// 윤년 평년 계산하고 해당월 출력
		Scanner sc = new Scanner(System.in);
		calendar cal = new calendar();
		while (true) {
			System.out.print("년도를 입력하세요 : ");
			int inputYear = sc.nextInt();
			System.out.print("월을 입력하세요 : ");
			int inputMonth = sc.nextInt();
			if (inputMonth < 1 || inputMonth > 12) {
				System.out.println("입력을 종료합니다");
				break;
			}
			System.out.print("첫번째 요일을 입력하세요 : ");
			String inputWeek = sc.next();
			int maxDay = cal.getMaxDaysOfMonth(inputYear, inputMonth);
			cal.printSampleCalendar(inputYear, inputMonth, maxDay, inputWeek); // 달력 출력
			System.out.println();
		}
	}
}
