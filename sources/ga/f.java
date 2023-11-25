package ga;

import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber.java */
/* loaded from: classes3.dex */
public final class f extends Number {

    /* renamed from: f  reason: collision with root package name */
    private final String f16291f;

    public f(String str) {
        this.f16291f = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f16291f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f16291f;
        String str2 = ((f) obj).f16291f;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f16291f);
    }

    public int hashCode() {
        return this.f16291f.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f16291f);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f16291f);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f16291f).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f16291f);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f16291f).longValue();
        }
    }

    public String toString() {
        return this.f16291f;
    }
}
