package org.bson.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class Decimal128 extends Number implements Comparable<Decimal128> {

    /* renamed from: f  reason: collision with root package name */
    private final long f20713f;

    /* renamed from: m  reason: collision with root package name */
    private final long f20714m;

    /* renamed from: p  reason: collision with root package name */
    private static final BigInteger f20702p = new BigInteger("10");

    /* renamed from: q  reason: collision with root package name */
    private static final BigInteger f20703q = new BigInteger("1");

    /* renamed from: r  reason: collision with root package name */
    private static final BigInteger f20704r = new BigInteger("0");

    /* renamed from: s  reason: collision with root package name */
    private static final Set<String> f20705s = new HashSet(Collections.singletonList("nan"));

    /* renamed from: t  reason: collision with root package name */
    private static final Set<String> f20706t = new HashSet(Collections.singletonList("-nan"));

    /* renamed from: u  reason: collision with root package name */
    private static final Set<String> f20707u = new HashSet(Arrays.asList("inf", "+inf", "infinity", "+infinity"));

    /* renamed from: v  reason: collision with root package name */
    private static final Set<String> f20708v = new HashSet(Arrays.asList("-inf", "-infinity"));

    /* renamed from: w  reason: collision with root package name */
    public static final Decimal128 f20709w = fromIEEE754BIDEncoding(8646911284551352320L, 0);

    /* renamed from: x  reason: collision with root package name */
    public static final Decimal128 f20710x = fromIEEE754BIDEncoding(-576460752303423488L, 0);

    /* renamed from: y  reason: collision with root package name */
    public static final Decimal128 f20711y = fromIEEE754BIDEncoding(-288230376151711744L, 0);

    /* renamed from: z  reason: collision with root package name */
    public static final Decimal128 f20712z = fromIEEE754BIDEncoding(8935141660703064064L, 0);
    public static final Decimal128 A = fromIEEE754BIDEncoding(3476778912330022912L, 0);
    public static final Decimal128 B = fromIEEE754BIDEncoding(-5746593124524752896L, 0);

    private Decimal128(long j10, long j11) {
        this.f20713f = j10;
        this.f20714m = j11;
    }

    private BigDecimal b() {
        int i10;
        int i11 = -g();
        if (q()) {
            return BigDecimal.valueOf(0L, i11);
        }
        if (n()) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return new BigDecimal(new BigInteger(i10, f()), i11);
    }

    private byte[] f() {
        byte[] bArr = new byte[15];
        long j10 = 255;
        long j11 = 255;
        for (int i10 = 14; i10 >= 7; i10--) {
            bArr[i10] = (byte) ((this.f20714m & j11) >>> ((14 - i10) << 3));
            j11 <<= 8;
        }
        for (int i11 = 6; i11 >= 1; i11--) {
            bArr[i11] = (byte) ((this.f20713f & j10) >>> ((6 - i11) << 3));
            j10 <<= 8;
        }
        bArr[0] = (byte) ((this.f20713f & 281474976710656L) >>> 48);
        return bArr;
    }

    public static Decimal128 fromIEEE754BIDEncoding(long j10, long j11) {
        return new Decimal128(j10, j11);
    }

    private int g() {
        long j10;
        char c10;
        if (q()) {
            j10 = this.f20713f & 2305807824841605120L;
            c10 = '/';
        } else {
            j10 = this.f20713f & 9223231299366420480L;
            c10 = '1';
        }
        return ((int) (j10 >>> c10)) - 6176;
    }

    private boolean k(BigDecimal bigDecimal) {
        if (n() && bigDecimal.signum() == 0) {
            return true;
        }
        return false;
    }

    private boolean o(BigDecimal bigDecimal) {
        if (!m() && !l() && bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            return true;
        }
        return false;
    }

    private String p() {
        StringBuilder sb2 = new StringBuilder();
        BigDecimal b10 = b();
        String bigInteger = b10.unscaledValue().abs().toString();
        if (n()) {
            sb2.append('-');
        }
        int i10 = -b10.scale();
        int length = (bigInteger.length() - 1) + i10;
        if (i10 <= 0 && length >= -6) {
            if (i10 == 0) {
                sb2.append(bigInteger);
            } else {
                int length2 = (-i10) - bigInteger.length();
                if (length2 >= 0) {
                    sb2.append('0');
                    sb2.append('.');
                    for (int i11 = 0; i11 < length2; i11++) {
                        sb2.append('0');
                    }
                    sb2.append((CharSequence) bigInteger, 0, bigInteger.length());
                } else {
                    int i12 = -length2;
                    sb2.append((CharSequence) bigInteger, 0, i12);
                    sb2.append('.');
                    sb2.append((CharSequence) bigInteger, i12, i12 - i10);
                }
            }
        } else {
            sb2.append(bigInteger.charAt(0));
            if (bigInteger.length() > 1) {
                sb2.append('.');
                sb2.append((CharSequence) bigInteger, 1, bigInteger.length());
            }
            sb2.append('E');
            if (length > 0) {
                sb2.append('+');
            }
            sb2.append(length);
        }
        return sb2.toString();
    }

    private boolean q() {
        if ((this.f20713f & 6917529027641081856L) == 6917529027641081856L) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public int compareTo(Decimal128 decimal128) {
        if (m()) {
            return !decimal128.m();
        }
        if (l()) {
            if (n()) {
                if (decimal128.l() && decimal128.n()) {
                    return 0;
                }
                return -1;
            } else if (decimal128.m()) {
                return -1;
            } else {
                if (!decimal128.l() || decimal128.n()) {
                    return 1;
                }
                return 0;
            }
        }
        BigDecimal b10 = b();
        BigDecimal b11 = decimal128.b();
        if (o(b10) && decimal128.o(b11)) {
            if (k(b10)) {
                if (decimal128.k(b11)) {
                    return 0;
                }
                return -1;
            } else if (decimal128.k(b11)) {
                return 1;
            }
        }
        if (decimal128.m()) {
            return -1;
        }
        if (decimal128.l()) {
            if (decimal128.n()) {
                return 1;
            }
            return -1;
        }
        return b10.compareTo(b11);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        if (m()) {
            return Double.NaN;
        }
        if (l()) {
            if (n()) {
                return Double.NEGATIVE_INFINITY;
            }
            return Double.POSITIVE_INFINITY;
        }
        BigDecimal b10 = b();
        if (k(b10)) {
            return -0.0d;
        }
        return b10.doubleValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Decimal128.class != obj.getClass()) {
            return false;
        }
        Decimal128 decimal128 = (Decimal128) obj;
        if (this.f20713f == decimal128.f20713f && this.f20714m == decimal128.f20714m) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) doubleValue();
    }

    public int hashCode() {
        long j10 = this.f20714m;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f20713f;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public long i() {
        return this.f20713f;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) doubleValue();
    }

    public long j() {
        return this.f20714m;
    }

    public boolean l() {
        if ((this.f20713f & 8646911284551352320L) == 8646911284551352320L) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) doubleValue();
    }

    public boolean m() {
        if ((this.f20713f & 8935141660703064064L) == 8935141660703064064L) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if ((this.f20713f & Long.MIN_VALUE) == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (m()) {
            return "NaN";
        }
        if (l()) {
            if (n()) {
                return "-Infinity";
            }
            return "Infinity";
        }
        return p();
    }
}
