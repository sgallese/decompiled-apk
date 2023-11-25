package s;

/* compiled from: AnimationVectors.kt */
/* loaded from: classes.dex */
public final class r {
    public static final n a(float f10) {
        return new n(f10);
    }

    public static final <T extends q> T b(T t10) {
        qc.q.i(t10, "<this>");
        T t11 = (T) d(t10);
        int b10 = t11.b();
        for (int i10 = 0; i10 < b10; i10++) {
            t11.e(i10, t10.a(i10));
        }
        return t11;
    }

    public static final <T extends q> void c(T t10, T t11) {
        qc.q.i(t10, "<this>");
        qc.q.i(t11, "source");
        int b10 = t10.b();
        for (int i10 = 0; i10 < b10; i10++) {
            t10.e(i10, t11.a(i10));
        }
    }

    public static final <T extends q> T d(T t10) {
        qc.q.i(t10, "<this>");
        T t11 = (T) t10.c();
        qc.q.g(t11, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t11;
    }
}
