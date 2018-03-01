package model;

import java.util.ArrayList;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


@XmlRootElement
public class PointManager{

	
	public static final int COMMENT_POINT_TYPE = 0;
    public static final int AUDIO_POINT_TYPE = 1;
    
   	        private ArrayList<Point> pointArray; //tablica do przechowywania punktów
	        
	        
	        //----------------------------------------------------------------------------
	        //konstruktor
	        //----------------------------------------------------------------------------
			public PointManager() {
				pointArray = new ArrayList<>();
			}
						
			public ArrayList<Point> getPointArray() {
				return pointArray;
			}
			
			public void setPointArray(ArrayList<Point> pointArray) {
				this.pointArray = pointArray;
			}

			//----------------------------------------------------------------------------
			//dodanie do tablicy punktu
			//----------------------------------------------------------------------------
	        public void add(Point point){
	        	pointArray.add(point);
	        }
	       
	        //----------------------------------------------------------------------------
			//dodanie do tablicy punktu typu CommentPoint
			//----------------------------------------------------------------------------
	        public void add(int pointType){
	        	//konstruktor pointa
	        	switch (pointType){
	        		case COMMENT_POINT_TYPE: 
	        			pointArray.add(new CommentPoint());
	        			break;
	        		case AUDIO_POINT_TYPE: 
	        	//		pointArray.add(new AudioPoint("name", "description"));
	        			break;
	        	}
	        	
	        }
       
	        //----------------------------------------------------------------------------
	        //usuniecie z tablicy punktu typu Point
	        //----------------------------------------------------------------------------
	        public void remove(Point point){
	        	pointArray.remove(point);
	        }
	        
	        //----------------------------------------------------------------------------
	        //znalezienie elementu, który w name zawiera str
	        //----------------------------------------------------------------------------
	        public Point findName(String str){
	        	for(int i=0; i < pointArray.size(); i++){
	        		if( pointArray.get(i).getName().contains(str)){
	        			return pointArray.get(i);
	        		}
	        	}
	        	return null;
	        }
	        
	        //----------------------------------------------------------------------------
	        //znalezienie elementu, który w desc zawiera str
	        //----------------------------------------------------------------------------
	        public Point findDesc(String str){
	        	for(int i=0; i < pointArray.size(); i++){
	        		if( pointArray.get(i).getDescription().contains(str)){
	        			return pointArray.get(i);
	        		}
	        	}
	        	return null;
	        }
	       
	        
	      //----------------------------------------------------------------------------
			@Override
			public String toString() {
				String tmp="PointManager - liczba punktów: " + pointArray.size() + "\n";
				for(int i=0; i < pointArray.size(); i++){
					tmp += i + ": " + pointArray.get(i).toString() + "\n";
				}
				return tmp + "\n";
			}   
			
			//-------------------------------------------------------------------------
			public void changeName(Point point,String newName){
				int index = pointArray.indexOf(point);
				pointArray.get(index).setName(newName);
			}
	        
	        //-------------------------------------------------------------------------    
	        //zapis ca³ego managera do XML
	        //------------------------------------------------------------------------
	        public void saveXml(String fileName) throws JAXBException{
	        
	        	File file = new File(fileName);
	    		boolean fileExists = file.exists();
	            if(!fileExists) {
	                 try {
	                     fileExists = file.createNewFile();
	                 } catch (IOException e) {
	                     System.out.println("Nie uda³o siê utworzyæ pliku");
	                 }
	            }
	            //marshalling obiektu na plik XML
	            JAXBContext jaxbContext = JAXBContext.newInstance(PointManager.class);
	    		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	    		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    		jaxbMarshaller.marshal(this, file); 
	         	
	        }

	        //-------------------------------------------------------------------------    
	        //odczyt z pliku XML ca³ego managera
	        //------------------------------------------------------------------------
	        public void openXml(String fileName) throws JAXBException{
	        
	        	File file = new File(fileName);
	    		boolean fileExists = file.exists();
	            if(!fileExists) {
	                 try {
	                     fileExists = file.createNewFile();
	                 } catch (IOException e) {
	                     System.out.println("Nie uda³o siê utworzyæ pliku");
	                 }
	            }
	            //unmarshalling z pliku XML do tmp_managera
	            JAXBContext jaxbContext = JAXBContext.newInstance(PointManager.class);
	            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	            PointManager tmpManager = (PointManager) jaxbUnmarshaller.unmarshal(file);//w
	            this.pointArray = tmpManager.getPointArray();//skopiowanie tablicy z tmp do istniej¹cego managera
	            
	        }

}
