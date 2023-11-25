package c8;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class i implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ d f8873f;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ j f8874m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(j jVar, d dVar) {
        this.f8874m = jVar;
        this.f8873f = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        b bVar;
        b bVar2;
        obj = this.f8874m.f8876b;
        synchronized (obj) {
            j jVar = this.f8874m;
            bVar = jVar.f8877c;
            if (bVar != null) {
                bVar2 = jVar.f8877c;
                bVar2.onFailure(this.f8873f.d());
            }
        }
    }
}
