package y;

/* compiled from: LazyLayoutPrefetchState.kt */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private b f26164a;

    /* compiled from: LazyLayoutPrefetchState.kt */
    /* loaded from: classes.dex */
    public interface a {
        void cancel();
    }

    /* compiled from: LazyLayoutPrefetchState.kt */
    /* loaded from: classes.dex */
    public interface b {
        a a(int i10, long j10);
    }

    public final a a(int i10, long j10) {
        a a10;
        b bVar = this.f26164a;
        if (bVar == null || (a10 = bVar.a(i10, j10)) == null) {
            return y.b.f26017a;
        }
        return a10;
    }

    public final void b(b bVar) {
        this.f26164a = bVar;
    }
}
