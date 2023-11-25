package ad;

import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Timeout.kt */
/* loaded from: classes4.dex */
public final class w2<U, T extends U> extends fd.c0<T> implements Runnable {

    /* renamed from: r  reason: collision with root package name */
    public final long f572r;

    public w2(long j10, Continuation<? super U> continuation) {
        super(continuation.getContext(), continuation);
        this.f572r = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        G(x2.a(this.f572r, u0.c(getContext()), this));
    }

    @Override // ad.a, ad.e2
    public String w0() {
        return super.w0() + "(timeMillis=" + this.f572r + ')';
    }
}
