package ad;

import java.util.concurrent.Future;

/* compiled from: Executors.kt */
/* loaded from: classes4.dex */
final class b1 implements c1 {

    /* renamed from: f  reason: collision with root package name */
    private final Future<?> f470f;

    public b1(Future<?> future) {
        this.f470f = future;
    }

    @Override // ad.c1
    public void dispose() {
        this.f470f.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f470f + ']';
    }
}
