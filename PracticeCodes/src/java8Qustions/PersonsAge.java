package java8Qustions;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PersonsAge {

	public static void main(String[] args) {
			
		LocalDate birthDate = LocalDate.of(1983, 12, 2023);
		LocalDate today = LocalDate.now();
		System.out.println(ChronoUnit.YEARS.between(birthDate, today));
	}
}
