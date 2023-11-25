package s;

import j0.d3;
import j0.g3;
import s.q;

/* compiled from: AnimationState.kt */
/* loaded from: classes.dex */
public final class l<T, V extends q> implements g3<T> {

    /* renamed from: f  reason: collision with root package name */
    private final i1<T, V> f22754f;

    /* renamed from: m  reason: collision with root package name */
    private final j0.j1 f22755m;

    /* renamed from: p  reason: collision with root package name */
    private V f22756p;

    /* renamed from: q  reason: collision with root package name */
    private long f22757q;

    /* renamed from: r  reason: collision with root package name */
    private long f22758r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f22759s;

    public l(i1<T, V> i1Var, T t10, V v10, long j10, long j11, boolean z10) {
        j0.j1 e10;
        V v11;
        qc.q.i(i1Var, "typeConverter");
        this.f22754f = i1Var;
        e10 = d3.e(t10, null, 2, null);
        this.f22755m = e10;
        this.f22756p = (v10 == null || (v11 = (V) r.b(v10)) == null) ? (V) m.e(i1Var, t10) : v11;
        this.f22757q = j10;
        this.f22758r = j11;
        this.f22759s = z10;
    }

    public final long e() {
        return this.f22758r;
    }

    public final long f() {
        return this.f22757q;
    }

    @Override // j0.g3
    public T getValue() {
        return this.f22755m.getValue();
    }

    public final i1<T, V> j() {
        return this.f22754f;
    }

    public final T k() {
        return this.f22754f.b().invoke(this.f22756p);
    }

    public final V m() {
        return this.f22756p;
    }

    public final boolean r() {
        return this.f22759s;
    }

    public final void s(long j10) {
        this.f22758r = j10;
    }

    public final void t(long j10) {
        this.f22757q = j10;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + k() + ", isRunning=" + this.f22759s + ", lastFrameTimeNanos=" + this.f22757q + ", finishedTimeNanos=" + this.f22758r + ')';
    }

    public final void u(boolean z10) {
        this.f22759s = z10;
    }

    public void v(T t10) {
        this.f22755m.setValue(t10);
    }

    public final void w(V v10) {
        qc.q.i(v10, "<set-?>");
        this.f22756p = v10;
    }

    public /* synthetic */ l(i1 i1Var, Object obj, q qVar, long j10, long j11, boolean z10, int i10, qc.h hVar) {
        this(i1Var, obj, (i10 & 4) != 0 ? null : qVar, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }
}
