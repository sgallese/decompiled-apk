package c8;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f8880a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8881b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final c f8882c;

    public l(Executor executor, c cVar) {
        this.f8880a = executor;
        this.f8882c = cVar;
    }

    @Override // c8.m
    public final void a(d dVar) {
        if (dVar.g()) {
            synchronized (this.f8881b) {
                if (this.f8882c == null) {
                    return;
                }
                this.f8880a.execute(new k(this, dVar));
            }
        }
    }
}
