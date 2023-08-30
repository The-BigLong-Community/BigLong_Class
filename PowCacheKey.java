package math;

/**
 * The `PowCacheKey` class represents a key used for caching the result of exponentiation operations in the `BigLong` class.
 * It is designed to be used as a key in a cache, typically a HashMap, to store and retrieve previously computed
 * exponentiation results to improve performance.
 *
 * <p>
 * <strong>Implementation Note:</strong> The `PowCacheKey` class is used to uniquely identify exponentiation operations by
 * caching both the base and exponent. It ensures that equal exponentiation operations yield equal cache keys, allowing
 * efficient retrieval of previously computed results.
 * </p>
 *
 * <p>
 * <li><strong>Author:</strong> [Your Name]</li>
 * <li><strong>Version:</strong> 1.0</li>
 * <li><strong>Built On:</strong> [Date]</li>
 * <li><strong>Built With:</strong> [Development Environment]</li>
 * <li><strong>For:</strong> BigLong [Version]</li>
 * </p>
 */
class PowCacheKey {
    private final BigLong base;      // The base in the exponentiation operation
    private final BigLong exponent;  // The exponent in the exponentiation operation

    /**
     * Constructs a new `PowCacheKey` with the specified base and exponent.
     *
     * @param base     The base in the exponentiation operation.
     * @param exponent The exponent in the exponentiation operation.
     */
    public PowCacheKey(BigLong base, BigLong exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    /**
     * Compares this `PowCacheKey` to the specified object for equality. Returns true if the specified object is also
     * a `PowCacheKey` and both the base and exponent are equal.
     *
     * @param o The object to compare to.
     * @return true if this `PowCacheKey` is equal to the specified object, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PowCacheKey key = (PowCacheKey) o;

        return base.equals(key.base) && exponent.equals(key.exponent);
    }

    /**
     * Computes the hash code for this `PowCacheKey`. The hash code is computed based on the hash codes of the base
     * and exponent, ensuring that equal objects have equal hash codes.
     *
     * @return The hash code for this `PowCacheKey`.
     */
    @Override
    public int hashCode() {
        int result = base.hashCode();
        result = 31 * result + exponent.hashCode();
        return result;
    }
}
