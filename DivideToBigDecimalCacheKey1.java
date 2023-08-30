package math;

/**
 * A helper class to represent a key for memoization of divideToBigDecimal results in the BigLong class.
 *
 * <p>
 * The {@code DivideToBigDecimalCacheKey1} class encapsulates the dividend and divisor as {@code BigLong} objects,
 * which are used as key components for caching the results of division operations in the {@code BigLong} class.
 * </p>
 *
 * <p>
 * This class provides implementations for the {@code equals} and {@code hashCode} methods to ensure correct equality
 * comparison and hashing when used as keys in a cache.
 * </p>
 *
 * <p>
 * <strong>Usage Example:</strong>
 * </p>
 * <pre>
 * BigLong dividend = new BigLong("123456");
 * BigLong divisor = new BigLong("789");
 * DivideToBigDecimalCacheKey1 cacheKey = new DivideToBigDecimalCacheKey1(dividend, divisor);
 * </pre>
 * 
 * <p>
 * <li><strong>Author:</strong> Mohith. P</li>
 * <li><strong>Version:</strong> 2.0</li>
 * <li><strong>Built On:</strong> Java 20.0.1</li>
 * <li><strong>Built With:</strong> Eclipse IDE(2023 - 06)</li>
 * <li><strong>For:</strong> BigLong 2.0</li>
 * </p>
 */
public class DivideToBigDecimalCacheKey1 {
    private final BigLong dividend;
    private final BigLong divisor;

    /**
     * Constructs a new {@code DivideToBigDecimalCacheKey1} instance with the specified dividend and divisor.
     *
     * @param dividend The {@code BigLong} representing the dividend.
     * @param divisor  The {@code BigLong} representing the divisor.
     */
    public DivideToBigDecimalCacheKey1(BigLong dividend, BigLong divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    /**
     * Compares this {@code DivideToBigDecimalCacheKey1} instance with another object for equality.
     *
     * @param o The object to compare with this instance.
     * @return {@code true} if the specified object is equal to this instance, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DivideToBigDecimalCacheKey1 that = (DivideToBigDecimalCacheKey1) o;
        return dividend.equals(that.dividend) && divisor.equals(that.divisor);
    }

    /**
     * Computes the hash code value for this {@code DivideToBigDecimalCacheKey1} instance.
     *
     * @return The computed hash code value.
     */
    @Override
    public int hashCode() {
        int result = dividend.hashCode();
        result = 31 * result + divisor.hashCode();
        return result;
    }
}
