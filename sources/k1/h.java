package k1;

/* compiled from: PointerEvent.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final long f19190a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19191b;

    public /* synthetic */ h(long j10, long j11, qc.h hVar) {
        this(j10, j11);
    }

    public final long a() {
        return this.f19191b;
    }

    public final long b() {
        return this.f19190a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f19190a + ", position=" + ((Object) z0.f.v(this.f19191b)) + ')';
    }

    private h(long j10, long j11) {
        this.f19190a = j10;
        this.f19191b = j11;
    }
}
