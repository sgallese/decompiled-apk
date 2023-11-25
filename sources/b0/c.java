package b0;

import qc.q;

/* compiled from: CornerSize.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final b f7622a = new a();

    /* compiled from: CornerSize.kt */
    /* loaded from: classes.dex */
    public static final class a implements b {
        a() {
        }

        @Override // b0.b
        public float a(long j10, j2.e eVar) {
            q.i(eVar, "density");
            return 0.0f;
        }

        public String toString() {
            return "ZeroCornerSize";
        }
    }

    public static final b a(float f10) {
        return new g(f10);
    }

    public static final b b(int i10) {
        return new f(i10);
    }

    public static final b c(float f10) {
        return new e(f10, null);
    }

    public static final b d() {
        return f7622a;
    }
}
