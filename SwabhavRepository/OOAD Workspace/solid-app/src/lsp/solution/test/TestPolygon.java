package lsp.solution.test;

import lsp.solution.IPolygon;
import lsp.solution.Rectangle;
import lsp.solution.Square;

public class TestPolygon {

	public static void main(String[] args) {

		shouldNotChangeWidthWhenHeightChanges(new Rectangle(30, 10));
		// shouldNotChangeWidthWhenHeightChanges(new Square(30)); It will give an error!
	}

	private static void shouldNotChangeWidthWhenHeightChanges(Rectangle rectangle) {

		int beforeChange = rectangle.getWidth();
		rectangle.setHeight(100);
		int afterChange = rectangle.getWidth();
		System.out.println(beforeChange);
		System.out.println(afterChange);
	}
}
