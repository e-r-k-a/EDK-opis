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
	private final int MAXDURATIONNANO = 50000000; // 50ms na czas miêdzy utworzeniem obiektu a zrobieniem testu

	@BeforeEach
	public void setUp() {
		p = new Point(19.56, 38.67, "nazwa1", "opis1");
	}

	@Test
	public void test1() {// testy konstruktora
		assertNotNull(p);

	}

	@Test
	public void test2() {// testy konstruktora

	

		assertEquals(19.56, p.getxGpsCoord());
		assertEquals(38.67, p.getyGpsCoord());
		assertEquals("nazwa1", p.getName());
		assertEquals("opis1", p.getDescription());

		Duration duration = Duration.between(p.getLocalTime(), LocalTime.now());
		assertTrue(duration.getNano() < MAXDURATIONNANO);

	}

}
