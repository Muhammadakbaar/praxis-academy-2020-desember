package latihan.satu;

public class ShapeFactory2 extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}