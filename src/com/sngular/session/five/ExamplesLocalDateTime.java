package com.sngular.session.five;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExamplesLocalDateTime {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		LocalDate hoy = LocalDate.now();
        LocalTime ahora = LocalTime.now();
        
        LocalDateTime fecha = LocalDateTime.of(hoy, ahora);
        
        ZonedDateTime z = now.atZone(ZoneId.of("US/Samoa"));

        System.out.println(z);
	}
}
