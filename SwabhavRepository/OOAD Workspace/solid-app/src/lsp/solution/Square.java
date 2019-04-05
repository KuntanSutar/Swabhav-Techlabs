package lsp.solution;

public class Square implements IPolygon {

	int side;
	
	public Square(int newSide) {
		side=newSide;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	@Override
	public int calcArea() {
		return side*side;
	}
	
}
