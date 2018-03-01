package xml;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import model.AudioPoint;
import model.CommentPoint;
import model.Point;


public class PointAdapter extends
	    XmlAdapter<PointAdapter.AdaptedPoint, Point> {
	 
	  @Override
	    public AdaptedPoint marshal(Point point)
	        throws Exception {
	        if (null == point) {
	            return null;
	        }
	        AdaptedPoint adaptedPoint = new AdaptedPoint();
	        
	        if (point instanceof CommentPoint) {
	            CommentPoint commentPoint = (CommentPoint) point;
	            adaptedPoint.comment = commentPoint.getComment();
	            
	        } else {
	            AudioPoint audioPoint = (AudioPoint) point;
	            adaptedPoint.fileName = audioPoint.getFileName();
	        }
	      //wspolne pola
	        adaptedPoint.xGpsCoord = point.getxGpsCoord();
	    	adaptedPoint.yGpsCoord = point.getyGpsCoord();
	    	adaptedPoint.name = point.getName();
	    	adaptedPoint.description = point.getDescription();
	    	adaptedPoint.localDate = point .getLocalDate();
	    	adaptedPoint.localTime = point.getLocalTime();
	        
	        return adaptedPoint;
	    }
	 
	    @Override
	    public Point unmarshal(AdaptedPoint adaptedPoint) throws Exception {
	    	//AudioPoint audioPoint = new AudioPoint();
	    	//CommentPoint commentPoint = new CommentPoint();
	        if (null == adaptedPoint) {
	            return null;
	        }
	        if (null != adaptedPoint.fileName) {
	            AudioPoint audioPoint = new AudioPoint();
	            audioPoint.setxGpsCoord(adaptedPoint.xGpsCoord);
		    	audioPoint.setyGpsCoord(adaptedPoint.yGpsCoord);
		    	audioPoint.setName(adaptedPoint.name);
		    	audioPoint.setDescription(adaptedPoint.description);
		    	audioPoint.setLocalDate(adaptedPoint.localDate);
		    	audioPoint.setLocalTime(adaptedPoint.localTime);
		    	//pole wystepujace tylko w AudioPoint
		    	audioPoint.setFileName(adaptedPoint.fileName);
		        return audioPoint;
	        } else {
	            CommentPoint commentPoint = new CommentPoint();
	            commentPoint.setxGpsCoord(adaptedPoint.xGpsCoord);
	            commentPoint.setyGpsCoord(adaptedPoint.yGpsCoord);
	            commentPoint.setName(adaptedPoint.name);
	            commentPoint.setDescription(adaptedPoint.description);
	            commentPoint.setLocalDate(adaptedPoint.localDate);
	            commentPoint.setLocalTime(adaptedPoint.localTime);
	            //pole wystepujace tylko w CommentPoint
	            commentPoint.setComment(adaptedPoint.comment);
	            return commentPoint;
	        }
	        //wspólne
	        
	    }
	 
	    public static class AdaptedPoint {
	    	//wspólne pola wystêpuj¹ce w obu klasach dziedzicz¹cych po Point
	    	@XmlElement
	    	public double xGpsCoord;
	    	public double yGpsCoord;
	    	public String name;
	    	public String description;
	    	@XmlJavaTypeAdapter( LocalDateAdapter.class )	
	    	public LocalDate localDate;
	    	@XmlJavaTypeAdapter( LocalTimeAdapter.class )	
	    	public LocalTime localTime;
	    	
	    	//Pole wystepuj¹ce tylko w klasie CommentPoint
	        public String comment;
	    	//Pole wystêpuj¹ce tylko w klasie AudioPoint
	        public String fileName;
	 
	    }
	 
	}
