package m0;

/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class l {
    public static final int a(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final <E> l0.f<E> b() {
        return j.f19726p.a();
    }

    public static final Object[] c(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int d(int i10) {
        return (i10 - 1) & (-32);
    }
}
