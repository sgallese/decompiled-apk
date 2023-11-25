package b2;

/* compiled from: MathUtils.kt */
/* loaded from: classes.dex */
public final class w {
    public static final int a(int i10, int i11, pc.a<Integer> aVar) {
        qc.q.i(aVar, "defaultValue");
        int i12 = i10 - i11;
        if (((i10 ^ i12) & (i11 ^ i10)) < 0) {
            return aVar.invoke().intValue();
        }
        return i12;
    }
}
