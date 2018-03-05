package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.format.*;



import model.Point;


public class pointTest {

	private Point p;
	private final int MAXDURATIONNANO = 50000000; //50ms na czas miêdzy utworzeniem obiektu a zrobieniem testu
	
	@BeforeEach
	public void setUp() {
		p = new Point(19.56, 38.67, "nazwa1", "opis1");

	}
	
	@Test
	public void test1() {//testy konstruktora
		assertEquals(19.56, p.getxGpsCoord());
		assertEquals(38.67, p.getyGpsCoord());
		assertEquals("nazwa1", p.getName());
		assertEquals("opis1", p.getDescription());
		
		assertEquals(LocalDate.now(), p.getLocalDate());//sprawdzenie czy konstr wpisuje poprawnie date
				
		Duration duration=Duration.between(p.getLocalTime(), LocalTime.now());
		if(duration.getNano() > MAXDURATIONNANO) {
			fail("Zle wpisany czas do obiektu"); 
		}
		
		
		
		
		
		
	}

	@Test
	public void test2() {//testy konstruktora
		assertEquals(19.56, p.getxGpsCoord());
		assertEquals(38.67, p.getyGpsCoord());
		assertEquals("nazwa1", p.getName());
		assertEquals("opis1", p.getDescription());
	}
}


