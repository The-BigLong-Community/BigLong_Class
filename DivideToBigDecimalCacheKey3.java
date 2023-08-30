package math;

import java.math.RoundingMode;

/**
 * A cache key class used for memoization of the divideToBigDecimal method with RoundingMode and precision.
 * This class encapsulates the dividend, divisor, rounding mode, and precision to uniquely identify cached results.
 *
 * <p>The memoization cache stores results of dividing one BigLong by another using a specified RoundingMode and precision.
 * This class is used to create keys for the cache based on the dividend, divisor, rounding mode, and precision.</p>
 *
 * <p>The equals and hashCode methods are overridden to ensure proper comparison and hashing of cache keys.</p>
 *
 * @see BigLong#divideToBigDecimal(BigLong, RoundingMode, int)
 * 
 * <p>
 * <li><strong>Author:</strong> Mohith. P</li>
 * <li><strong>Version:</strong> 2.0</li>
 * <li><strong>Built On:</strong> Java 20.0.1</li>
 * <li><strong>Built With:</strong> Eclipse IDE(2023 - 06)</li>
 * <li><strong>For:</strong> BigLong 2.0</li>
 * </p>
 */
public class DivideToBigDecimalCacheKey3 {
    private final BigLong dividend;
    private final BigLong divisor;
    private final RoundingMode roundingMode;
    private final int precision;

    /**
     * Constructs a cache key for dividing BigLong numbers with a specified rounding mode and precision.
     *
     * @param dividend The dividend BigLong number.
     * @param divisor  The divisor BigLong number.
     * @param roundingMode The rounding mode used for division.
     * @param precision   The precision used for division.
     */
    public DivideToBigDecimalCacheKey3(BigLong dividend, BigLong divisor, RoundingMode roundingMode, int precision) {
        this.dividend = dividend;
        this.divisor = divisor;
        this.roundingMode = roundingMode;
        this.precision = precision;
    }

    /**
     * Compares this cache key to another object for equality.
     *
     * @param o The object to compare to.
     * @return {@code true} if the objects are equal, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DivideToBigDecimalCacheKey3 that = (DivideToBigDecimalCacheKey3) o;
        return dividend.equals(that.dividend) && divisor.equals(that.divisor) && 
               roundingMode == that.roundingMode && precision == that.precision;
    }

    /**
     * Generates a hash code for this cache key.
     *
     * @return The hash code for this cache key.
     */
    @Override
    public int hashCode() {
        int result = dividend.hashCode();
        result = 31 * result + divisor.hashCode();
        result = 31 * result + roundingMode.hashCode();
        result = 31 * result + precision;
        return result;
    }
}
