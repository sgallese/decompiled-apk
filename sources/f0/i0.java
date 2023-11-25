package f0;

/* compiled from: SnackbarHost.kt */
/* loaded from: classes.dex */
final class i0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f14797a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.q<pc.p<? super j0.l, ? super Integer, dc.w>, j0.l, Integer, dc.w> f14798b;

    /* JADX WARN: Multi-variable type inference failed */
    public i0(T t10, pc.q<? super pc.p<? super j0.l, ? super Integer, dc.w>, ? super j0.l, ? super Integer, dc.w> qVar) {
        qc.q.i(qVar, "transition");
        this.f14797a = t10;
        this.f14798b = qVar;
    }

    public final T a() {
        return this.f14797a;
    }

    public final pc.q<pc.p<? super j0.l, ? super Integer, dc.w>, j0.l, Integer, dc.w> b() {
        return this.f14798b;
    }

    public final T c() {
        return this.f14797a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (qc.q.d(this.f14797a, i0Var.f14797a) && qc.q.d(this.f14798b, i0Var.f14798b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        T t10 = this.f14797a;
        if (t10 == null) {
            hashCode = 0;
        } else {
            hashCode = t10.hashCode();
        }
        return (hashCode * 31) + this.f14798b.hashCode();
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f14797a + ", transition=" + this.f14798b + ')';
    }
}
