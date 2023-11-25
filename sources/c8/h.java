package c8;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class h implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f8870a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8871b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final a f8872c;

    public h(Executor executor, a aVar) {
        this.f8870a = executor;
        this.f8872c = aVar;
    }

    @Override // c8.m
    public final void a(d dVar) {
        synchronized (this.f8871b) {
            if (this.f8872c == null) {
                return;
            }
            this.f8870a.execute(new g(this, dVar));
        }
    }
}
