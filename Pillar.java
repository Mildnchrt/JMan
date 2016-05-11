import java.awt.Color;

public class Pillar extends Piece{
	public Pillar ( int x, int y, int c, Map map ) {
		super( Piece.PILLAR, map);
		setX( x );
		setY( y );
		if ( c == 0 ) { 
	       	setColor( Color.RED );
		}else if ( c == 1 ) {
			setColor( Color.GREEN );
	    }else if ( c == 2 ) {
	        setColor( Color.YELLOW );
	    }
	}

	@Override
	public void act() {
		if ( Piece.rand(0, 2) == 1 ) { 
			int c = rand(0, 2);
			if ( c == 0 ) { 
		       	setColor( Color.RED );
			}else if ( c == 1 ) {
				setColor( Color.GREEN );
		    }else if ( c == 2 ) {
		        setColor( Color.YELLOW );
		    }
		}
	}
	public String toString() {
        return getColorWord() + " Pillar at (" + getX() + ", " + getY() + ")";
    }
}
