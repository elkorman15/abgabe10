package at.fhj.itm;
/**
 * @since 2016
 * @author Akram
 *
 */
class Point2d {
	private boolean debug;
	protected double x;
	protected double y;
	
	/**
	 * 
	 * @param px
	 * @param py
	 */
	public Point2d (double px, double py)
	{ 
		this.x = px;
		this.y = py;
	}
/**
 *2ter Konstruktur
 */
	public Point2d () {		
		// just create a point of 0/0
		this.x =0;
		this.y = 0;
	}
/**
 * @param pt
 */
	public Point2d (Point2d pt) 
	{	
		this.x= pt.x;
		this.y = pt.y;
	}
	/**
	 * 
	 * @param s
	 * @return void
	 *  wird in anderen Methoden verwendet
	 */
	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}
	/**
	 * @param b
	 * setter fuer debug
	 */
	public void setDebug (boolean b) {
		this.debug = b;
	}
	/**
	 * @param px
	 * setter fuer x
	 */
	public void setX(double px) {
		dprint ("setX(): Changing value of X from " + x + " to " + px);
		this.x = px;
	}
	/**
	 * getter fuer x
	 */
	public double getX() {
		return x;
	}

	/**
	 * setter fuer y
	 * @param py
	 */
	public void setY(double py)  {
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
		this.y = py;
	}
	/**
	 * getter fuer y
	 */
	public double getY() {
		return y;
	}

	/**
	 * 
	 * @param px
	 * @param py
	 * setter fuer x und y
	 */
	public void setXY(double px, double py) {
		dprint ("setX(): Changing value of X from " + x + " to " + px );
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
		this.x = px;
		this.y = py;
	}
	

	/**
	 * 
	 * @param pt
	 * @return das ergebnis von der entfernung
	 * 
	 */
	public double distanceFrom (Point2d pt) {
		double neux = pt.x - this.x;
		double neuy = pt.y - this.y;
		double neux2 = Math.pow(neux, 2);
		double neuy2 = Math.pow(neuy, 2);
		double erg = Math.sqrt(neux2 + neuy2);
		
		return erg;
		
	}

	/**
	 * 
	 * @return das ergebnis vom ursprung
	 */
	public double distanceFromOrigin () {
		
		double neux2 = Math.pow(x, 2);
		double neuy2 = Math.pow(y, 2);
		double erg = Math.sqrt(neux2 + neuy2);
		
		return erg;
	}

	/**
	 * 
	 * @return punkt in AusgabeFormat
	 */
	public String toString() {
		
		return "P(" + x + "/" +y + ")";
	}
}

