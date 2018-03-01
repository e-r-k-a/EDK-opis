package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.StringTokenizer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.*;

import xml.LocalDateAdapter;
import xml.LocalTimeAdapter;
import xml.PointAdapter;


@XmlJavaTypeAdapter(PointAdapter.class)
public class Point {
	private double xGpsCoord;
	private double yGpsCoord;
	private String name;
	private String description;
	private LocalDate localDate;
	private LocalTime localTime;
	

	public double getxGpsCoord() {
		return xGpsCoord;
	}

	public void setxGpsCoord(double xGpsCoord) {
		this.xGpsCoord = xGpsCoord;
	}
	public double getyGpsCoord() {
		return yGpsCoord;
	}
	
	public void setyGpsCoord(double yGpsCoord) {
		this.yGpsCoord = yGpsCoord;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}

	@XmlJavaTypeAdapter( LocalDateAdapter.class )	
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public LocalTime getLocalTime() {
		return localTime;
	}

	@XmlJavaTypeAdapter( LocalTimeAdapter.class )	
	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}
	//--------------------------------------------------------------------------------
	//konstruktory 
	//--------------------------------------------------------------------------------
	public Point() {
			super();
			setLocalDate(LocalDate.now());
			setLocalTime(LocalTime.now());		
	}
		
	public Point(String name, String description) {
		this();
		this.name = name;
		this.description = description;
	}
	//----------------------------------------------------
	public Point(double xGpsCoord, double yGpsCoord, String name, String description) {
		this(name, description);
		this.xGpsCoord = xGpsCoord;
		this.yGpsCoord = yGpsCoord;
	}
	//---------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Data: " + getLocalDate() + " Czas: " + getLocalTime() +  " xGpsCoord=\u0001" + xGpsCoord + "\u0001, yGpsCoord=\u0001" + yGpsCoord + "\u0001, name=\u0001" + name + "\u0001, description=\u0001"
				+ description ;
	}
	
}
