package Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.AudioPoint;
import java.io.File;

class AudioPointTest {

	private AudioPoint p;
	private final int MAXDURATIONNANO = 50000000; // 50ms na czas miêdzy utworzeniem obiektu a zrobieniem testu

	@BeforeEach
	public void setUp() {
		p = new AudioPoint(19.56, 38.67, "nazwa1", "opis1", "TestAudioPoint");
		File file = new File("TestAudioPoint");
		assertTrue(file.exists());
	}

	@Test
	public void test1() {// testy konstruktora
		assertNotNull(p);

	}

	@Test
	public void test2() {
		assertEquals(19.56, p.getxGpsCoord());
		assertEquals(38.67, p.getyGpsCoord());
		assertEquals("nazwa1", p.getName());
		assertEquals("opis1", p.getDescription());
		assertEquals("TestAudioPoint", p.getFileName());

		Duration duration = Duration.between(p.getLocalTime(), LocalTime.now());
		assertTrue(duration.getNano() < MAXDURATIONNANO);
	}
}
