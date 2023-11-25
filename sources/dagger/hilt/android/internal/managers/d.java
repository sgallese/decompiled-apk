package dagger.hilt.android.internal.managers;

/* compiled from: ApplicationComponentManager.java */
/* loaded from: classes4.dex */
public final class d implements ab.b<Object> {

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f13178f;

    /* renamed from: m  reason: collision with root package name */
    private final Object f13179m = new Object();

    /* renamed from: p  reason: collision with root package name */
    private final f f13180p;

    public d(f fVar) {
        this.f13180p = fVar;
    }

    @Override // ab.b
    public Object generatedComponent() {
        if (this.f13178f == null) {
            synchronized (this.f13179m) {
                if (this.f13178f == null) {
                    this.f13178f = this.f13180p.get();
                }
            }
        }
        return this.f13178f;
    }
}
