package model;

import java.util.StringTokenizer;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class CommentPoint extends Point {
	private String comment;

	public CommentPoint() {
		this(null, null);
	}
	
	public CommentPoint(double xGpsCoord, double yGpsCoord, String name, String description, String comment) {
		super(xGpsCoord, yGpsCoord, name, description);
		this.comment = comment;
	}

	public CommentPoint(String name, String description) {
		this(0.0, 0.0, name, description, null );
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return " Comment " + comment + " "+ super.toString();
	}
	
}
