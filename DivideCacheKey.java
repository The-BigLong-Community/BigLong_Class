package math;

/**
 * The `DivideCacheKey` class represents a key used for caching the result of division operations in the `BigLong` class.
 * It is designed to be used as a key in a cache, typically a HashMap, to store and retrieve previously computed
 * division results to improve performance.
 * 
 * <p>
 * <strong>Implementation Note:</strong> The `DivideCacheKey` class is used to uniquely identify division operations by
 * caching both the dividend and divisor. It ensures that equal division operations yield equal cache keys, allowing
 * efficient retrieval of previously computed results.
 * </p>
 * 
 * <p>
 * <li><strong>Author:</strong> Mohith. P</li>
 * <li><strong>Version:</strong> 2.0</li>
 * <li><strong>Built On:</strong> Java 20.0.1</li>
 * <li><strong>Built With:</strong> Eclipse IDE(2023 - 06)</li>
 * <li><strong>For:</strong> BigLong 2.0</li>
 * </p>

 */
class DivideCacheKey {
    private final BigLong dividend; // The dividend in the division operation
    private final BigLong divisor;  // The divisor in the division operation

    /**
     * Constructs a new `DivideCacheKey` with the specified dividend and divisor.
     *
     * @param dividend The dividend in the division operation.
     * @param divisor The divisor in the division operation.
     */
    public DivideCacheKey(BigLong dividend, BigLong divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    /**
     * Compares this `DivideCacheKey` to the specified object for equality. Returns true if the specified object is also
     * a `DivideCacheKey` and both the dividend and divisor are equal.
     *
     * @param o The object to compare to.
     * @return true if this `DivideCacheKey` is equal to the specified object, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DivideCacheKey key = (DivideCacheKey) o;

        return dividend.equals(key.dividend) && divisor.equals(key.divisor);
    }

    /**
     * Computes the hash code for this `DivideCacheKey`. The hash code is computed based on the hash codes of the dividend
     * and divisor, ensuring that equal objects have equal hash codes.
     *
     * @return The hash code for this `DivideCacheKey`.
     */
    @Override
    public int hashCode() {
        int result = dividend.hashCode();
        result = 31 * result + divisor.hashCode();
        return result;
    }
}
