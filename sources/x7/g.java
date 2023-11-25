package x7;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public abstract class g implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    private final c8.o f25839f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g() {
        this.f25839f = null;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c8.o b() {
        return this.f25839f;
    }

    public final void c(Exception exc) {
        c8.o oVar = this.f25839f;
        if (oVar != null) {
            oVar.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }

    public g(c8.o oVar) {
        this.f25839f = oVar;
    }
}
