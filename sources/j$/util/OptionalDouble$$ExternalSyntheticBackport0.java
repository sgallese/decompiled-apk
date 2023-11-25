package j$.util;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class OptionalDouble$$ExternalSyntheticBackport0 {
    public static /* synthetic */ int m(double d10) {
        long doubleToLongBits = Double.doubleToLongBits(d10);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
