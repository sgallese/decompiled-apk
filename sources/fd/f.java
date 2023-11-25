package fd;

/* compiled from: Scopes.kt */
/* loaded from: classes4.dex */
public final class f implements ad.k0 {

    /* renamed from: f  reason: collision with root package name */
    private final hc.f f15628f;

    public f(hc.f fVar) {
        this.f15628f = fVar;
    }

    @Override // ad.k0
    public hc.f getCoroutineContext() {
        return this.f15628f;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
