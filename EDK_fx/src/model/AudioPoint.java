package model;

import java.util.StringTokenizer;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

public class AudioPoint extends Point {
	String fileName;
    //kondtuktor bez nagrywania - pusty
	public AudioPoint(){
    	super();
    }
    
	//skonstruowanie obiektu 
	//nagranie pliku pod nazwa podan¹ w wywo³aniu
	public AudioPoint(double xGpsCoord, double yGpsCoord, String name, String description, String fileName) {
		super(xGpsCoord, yGpsCoord, name, description);
		this.fileName = fileName;
		
		//nagrywamy dzwiek dla recordpointa
		final Record recorder = new Record(fileName);
		 
        // creates a new thread that waits for a specified
        // of time before stopping
        Thread stopper = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                recorder.finish();
            }
        });
 
        stopper.start();
 
        // start recording
        recorder.start();
 		
	}
		
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "Audio" + super.toString() + " nazwa pliku wav : " + getFileName();
	}
	
		
	
}
