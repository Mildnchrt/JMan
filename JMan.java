import java.awt.*;

/** An instance of this class is a J*Man.
 There should at most one J*Man in a game board at a time*/
public class JMan extends Piece {
    
    /** Constructor: a new J*Man at position (x, y) on Map m
     with color red if c = 0, green if c = 1, and yellow if c = 2. */
    public JMan(int x, int y, int c, Map m){
        super(Piece.JMAN, m);
        // Complete this
        super.setX( x );
        super.setY( y );
        if ( c == 0 ) { 
        	super.setColor( Color.RED );
        }else if ( c == 1 ) {
        	super.setColor( Color.GREEN );
        }else if ( c == 2 ) {
        	super.setColor( Color.YELLOW );
        }
    }
    
    /** Constructor: a new J*Man at position (x, y) on Map m with color c. 
        Precondition: c is one of Color.RED, Color.GREEN, and Color.YELLOW.*/
    public JMan(int x, int y, Color c, Map m){
        super(Piece.JMAN, m);
        // Complete this;
        super.setX( x );
        super.setY( y );
        
        if ( c.equals( Color.RED ) || c.equals( Color.GREEN ) || c.equals( Color.YELLOW ) ) {
        	super.setColor( c );
        }
    }
    
    /** J*Man should move based on what button is pushed.
     This method is not used. */
    public void act(){
        return;
    }
    
    /** Move J*Man one step based on the value of i:
        0 = up, 1 = down, 2 = left, 3 = right. */
    public void step(int i){ 
        setActed(true);
        
        // Complete this
        if ( i == 0 && getMap().isEmpty( getX() , getY() -1) || canEat( getMap().pieceAt( getX() , getY() - 1 ) ) ) {
        	getMap().move( getX(), getY(), getX(), getY() - 1 );
        }
        else if ( i == 1 && getMap().isEmpty( getX() , getY() + 1 ) || canEat( getMap().pieceAt( getX() , getY() + 1 ) ) ) {
        	getMap().move( getX(), getY(), getX(), getY() + 1 );
        }
        else if ( i == 2 && getMap().isEmpty( getX() - 1 , getY() ) || canEat( getMap().pieceAt( getX() - 1 , getY() ) ) ) {
        	getMap().move( getX(), getY(), getX() - 1 , getY() );
        }
        else if ( i == 3 && getMap().isEmpty( getX() + 1 , getY() ) || canEat( getMap().pieceAt( getX() + 1 , getY() ) ) ) {
        	getMap().move( getX(), getY(), getX() + 1 , getY() );
        }
    }
    
    public boolean canEat( Piece p ) {
    	if ( p != null && (getColorWord().equals( "YELLOW" ) && p.getColorWord().equals( "GREEN" )) || (getColorWord().equals( "GREEN" ) && p.getColorWord().equals("Red")) || (getColorWord().equals( "RED" ) && p.getColorWord().equals( "YELLOW" ))) {
    		if( p.getColorWord().equals( "GREEN" ) ) { this.setColor( Color.GREEN ); }
    		else if ( p.getColorWord().equals( "YELLOW" ) ) { this.setColor( Color.YELLOW ); }
    		else if ( p.getColorWord().equals( "RED" ) ) { this.setColor( Color.RED ); }
    		return true;
    	}
    	return false;
    }
    
    /** = representation of this piece */
    public String toString() {
        return getColorWord() + " J*Man at (" + getX() + ", " + getY() + ")";
    }
}
