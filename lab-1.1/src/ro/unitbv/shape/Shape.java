package ro.unitbv.shape;

public interface Shape {

	void Draw();

	double getArea();

	String getName();

	String getHexFillColor();

	int getBorderWidth();

}