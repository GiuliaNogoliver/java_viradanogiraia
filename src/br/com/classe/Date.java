package br.com.classe;

public class Date {
	int day;
	int month;
	int year;

	Date() {
		day = 01;
		month = 01;
		year = 1970;
	}

	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	String formatedBrazilDate() {
		String formatedDate = day + "/" + month + "/" + year;
		return formatedDate;
	}

	String formatedChineseDate() {
		String formatedDate = year + "/" + month + "/" + day;
		return formatedDate;
	}

	void printDate() {
		System.out.printf("%d/%d/%d\n", day, month, year);
	}
}
