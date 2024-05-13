
class SquareAdapter implements Shape {
    private Square square;

    SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public double calculateArea() {
        return square.calculateArea();
    }
}


class ModelingSystem {
    void calculateAndPrintArea(Shape shape) {
        System.out.println("Área calculada: " + shape.calculateArea());
    }
}

public class Main {
    public static void main(String[] args) {
        ModelingSystem modelingSystem = new ModelingSystem();

        Circle circle = new Circle(5);
        modelingSystem.calculateAndPrintArea(circle);

        Square square = new Square(5);

        SquareAdapter squareAdapter = new SquareAdapter(square);
        modelingSystem.calculateAndPrintArea(squareAdapter);
    }
}
