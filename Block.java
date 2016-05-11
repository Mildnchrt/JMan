import java.awt.Color;

public class Block extends Piece{
	public Block(int x, int y, Map map) {
		super( Piece.BLOCK, map );
		setX( x );
		setY( y );
		setColor( Color.WHITE );
	}

	@Override
	public void act() {
	}
	public String toString() {
        return getColorWord() + " Block at (" + getX() + ", " + getY() + ")";
    }
}
