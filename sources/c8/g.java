package c8;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class g implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ d f8868f;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ h f8869m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(h hVar, d dVar) {
        this.f8869m = hVar;
        this.f8868f = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        a aVar;
        a aVar2;
        obj = this.f8869m.f8871b;
        synchronized (obj) {
            h hVar = this.f8869m;
            aVar = hVar.f8872c;
            if (aVar != null) {
                aVar2 = hVar.f8872c;
                aVar2.a(this.f8868f);
            }
        }
    }
}
