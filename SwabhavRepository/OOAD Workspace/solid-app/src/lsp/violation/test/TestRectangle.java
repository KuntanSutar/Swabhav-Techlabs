package lsp.violation.test;

import lsp.violation.Rectangle;
import lsp.violation.Square;

public class TestRectangle {

	public static void main(String[] args) {

		shouldNotChangeWidthWhenHeightChanges(new Rectangle(30, 10));
		shouldNotChangeWidthWhenHeightChanges(new Square(30));
	}

	private static void shouldNotChangeWidthWhenHeightChanges(Rectangle rectangle) {

		int beforeChange = rectangle.getWidth();
		rectangle.setHeight(100);
		int afterChange = rectangle.getWidth();
		System.out.println(beforeChange);
		System.out.println(afterChange);
	}

}
