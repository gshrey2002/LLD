public class ShapeFactory {
    Shape getShape(String ShapeType){
        switch(ShapeType){
            case "CIRCLE":
                return new Circle();
            case  "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }

}
