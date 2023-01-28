public class RunProgression {
    public static void main(String[] args) {
        Progression prog;
        // test ArithProgression
        System.out.print("Arithmetic progression with default increment: ");
        prog = new ArithProgression();
        prog.printProgression(10);
        System.out.print("Arithmetic progression with increment 5: ");
        prog = new ArithProgression(5);
        prog.printProgression(10);
        System.out.print("Arithmetic progression with start 2: ");
        prog = new ArithProgression(5, 2);
        prog.printProgression(10);
        // test GeometricProgression
        System.out.print("Geometric progression with default base: ");
        prog = new GeoProgression();
        prog.printProgression(10);
        System.out.print("Geometric progression with base 3: ");
        prog = new GeoProgression(3);
        prog.printProgression(10);
        // test FibonacciProgression
        System.out.print("Fibonacci progression with default start values: ");
        prog = new FiboProgression();
        prog.printProgression(10);
        System.out.print("Fibonacci progression with start values 4 and 6: ");
        prog = new FiboProgression(4, 6);
        prog.printProgression(8);
    }
}