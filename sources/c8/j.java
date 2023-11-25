package c8;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class j implements m {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f8875a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8876b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final b f8877c;

    public j(Executor executor, b bVar) {
        this.f8875a = executor;
        this.f8877c = bVar;
    }

    @Override // c8.m
    public final void a(d dVar) {
        if (!dVar.g()) {
            synchronized (this.f8876b) {
                if (this.f8877c == null) {
                    return;
                }
                this.f8875a.execute(new i(this, dVar));
            }
        }
    }
}
