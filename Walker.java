import java.awt.Color;

public class Walker extends Piece {
	public Walker(int x, int y, int c, Map map ) {
		super( Piece.WALKER, map );
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
		int pos = rand(0, 3);
		if ( pos == 0 && getMap().isEmpty(getX() , getY() - 1) ) {
			getMap().move( getX() , getY() , getX(), getY() - 1 );
		}
		else if ( pos == 1 && getMap().isEmpty(getX() , getY() + 1) ) {
			getMap().move( getX() , getY() , getX() , getY() + 1 );
		}
		else if ( pos == 2 && getMap().isEmpty(getX() - 1 , getY() ) ) {
			getMap().move( getX() , getY() , getX() - 1, getY() );
		}
		else if ( pos == 3 && getMap().isEmpty(getX() + 1 , getY() ) ) {
			getMap().move( getX() , getY() , getX() + 1, getY() );
		}
	}
	public String toString() {
        return getColorWord() + " Walker at (" + getX() + ", " + getY() + ")";
    }
}
