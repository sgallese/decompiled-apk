package androidx.compose.ui.platform;

/* compiled from: WindowInfo.kt */
/* loaded from: classes.dex */
public final class u4 implements t4 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f2851b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final j0.j1<k1.p0> f2852c;

    /* renamed from: a  reason: collision with root package name */
    private final j0.j1<Boolean> f2853a;

    /* compiled from: WindowInfo.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    static {
        j0.j1<k1.p0> e10;
        e10 = j0.d3.e(k1.p0.a(k1.v.a()), null, 2, null);
        f2852c = e10;
    }

    public u4() {
        j0.j1<Boolean> e10;
        e10 = j0.d3.e(Boolean.FALSE, null, 2, null);
        this.f2853a = e10;
    }

    public void a(int i10) {
        f2852c.setValue(k1.p0.a(i10));
    }

    public void b(boolean z10) {
        this.f2853a.setValue(Boolean.valueOf(z10));
    }
}
