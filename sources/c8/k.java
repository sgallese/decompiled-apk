package c8;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class k implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ d f8878f;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ l f8879m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(l lVar, d dVar) {
        this.f8879m = lVar;
        this.f8878f = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        c cVar;
        c cVar2;
        obj = this.f8879m.f8881b;
        synchronized (obj) {
            l lVar = this.f8879m;
            cVar = lVar.f8882c;
            if (cVar != null) {
                cVar2 = lVar.f8882c;
                cVar2.onSuccess(this.f8878f.e());
            }
        }
    }
}
