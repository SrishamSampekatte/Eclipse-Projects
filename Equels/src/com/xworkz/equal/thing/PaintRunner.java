package com.xworkz.equal.thing;

public class PaintRunner {

	public static void main(String[] args) {
		Paint paint = new Paint();
		paint.setBrand("asian");
		paint.setName("Paint");
		paint.setAmbassidor("Yash");
		paint.setPaintColor("royalpaint");
		paint.setManfIn("Jan");
		paint.setPrice(897);
		paint.setDensity(3.7);
		paint.setForm("Null");
		paint.setQuality(true);
		System.out.println(paint);

		Paint paint2 = new Paint("Wall","Paint","Gangooly","paints","March",895,6.2,0, null, true);
		System.out.println(paint2);

		boolean ref=paint.equals(paint2);
		System.out.println(ref);

	}

}
