public class GeoProgression extends Progression {
    protected long base;

    /**
     * Constructs progression 1, 2, 4, 8, 16, ...
     */
    public GeoProgression() {
        this(2, 1);
    } // start at 1 with base of 2

    /**
     * Constructs progression 1, b, bˆ2, bˆ3, bˆ4, ... for base b.
     */
    public GeoProgression(long b) {
        this(b, 1);
    } // start at 1

    /**
     * Constructs geometric progression with arbitrary base and start.
     */
    public GeoProgression(long b, long start) {
        super(start);
        base = b;
    }

    /**
     * Multiplies the current value by the geometric base.
     */
    protected void advance() {
         current *= base; // multiply current by the geometric base
    }
}
