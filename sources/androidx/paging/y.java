package androidx.paging;

/* compiled from: PageFetcherSnapshot.kt */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final int f6191a;

    /* renamed from: b  reason: collision with root package name */
    private final o2 f6192b;

    public y(int i10, o2 o2Var) {
        qc.q.i(o2Var, "hint");
        this.f6191a = i10;
        this.f6192b = o2Var;
    }

    public final int a() {
        return this.f6191a;
    }

    public final o2 b() {
        return this.f6192b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f6191a == yVar.f6191a && qc.q.d(this.f6192b, yVar.f6192b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f6191a * 31) + this.f6192b.hashCode();
    }

    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.f6191a + ", hint=" + this.f6192b + ')';
    }
}
