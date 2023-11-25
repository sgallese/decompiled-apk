package cd;

import ad.e2;
import dc.w;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobCancellationException;

/* compiled from: ChannelCoroutine.kt */
/* loaded from: classes4.dex */
public class e<E> extends ad.a<w> implements d<E> {

    /* renamed from: q  reason: collision with root package name */
    private final d<E> f9006q;

    public e(hc.f fVar, d<E> dVar, boolean z10, boolean z11) {
        super(fVar, z10, z11);
        this.f9006q = dVar;
    }

    @Override // ad.e2
    public void J(Throwable th) {
        CancellationException M0 = e2.M0(this, th, null, 1, null);
        this.f9006q.c(M0);
        G(M0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final d<E> X0() {
        return this.f9006q;
    }

    @Override // cd.r
    public id.f<h<E>> a() {
        return this.f9006q.a();
    }

    @Override // ad.e2, ad.x1
    public final void c(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(N(), null, this);
        }
        J(cancellationException);
    }

    @Override // cd.r
    public Object g() {
        return this.f9006q.g();
    }

    @Override // cd.s
    public void h(pc.l<? super Throwable, w> lVar) {
        this.f9006q.h(lVar);
    }

    @Override // cd.r
    public Object i(Continuation<? super h<? extends E>> continuation) {
        Object i10 = this.f9006q.i(continuation);
        ic.d.d();
        return i10;
    }

    @Override // cd.r
    public f<E> iterator() {
        return this.f9006q.iterator();
    }

    @Override // cd.r
    public Object k(Continuation<? super E> continuation) {
        return this.f9006q.k(continuation);
    }

    @Override // cd.s
    public boolean l(Throwable th) {
        return this.f9006q.l(th);
    }

    @Override // cd.s
    public Object p(E e10) {
        return this.f9006q.p(e10);
    }

    @Override // cd.s
    public Object r(E e10, Continuation<? super w> continuation) {
        return this.f9006q.r(e10, continuation);
    }

    @Override // cd.s
    public boolean s() {
        return this.f9006q.s();
    }
}
