package s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t {
    public static /* synthetic */ int a(double d10) {
        long doubleToLongBits = Double.doubleToLongBits(d10);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
