package dd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.kt */
/* loaded from: classes4.dex */
public final class c<T> extends ed.d<T> {

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f13283s = AtomicIntegerFieldUpdater.newUpdater(c.class, "consumed");
    private volatile int consumed;

    /* renamed from: q  reason: collision with root package name */
    private final cd.r<T> f13284q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f13285r;

    public /* synthetic */ c(cd.r rVar, boolean z10, hc.f fVar, int i10, cd.a aVar, int i11, qc.h hVar) {
        this(rVar, z10, (i11 & 4) != 0 ? hc.g.f16601f : fVar, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? cd.a.SUSPEND : aVar);
    }

    private final void o() {
        if (this.f13285r) {
            boolean z10 = true;
            if (f13283s.getAndSet(this, 1) != 0) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    @Override // ed.d, dd.g
    public Object collect(h<? super T> hVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object d11;
        if (this.f14214m == -3) {
            o();
            Object d12 = k.d(hVar, this.f13284q, this.f13285r, continuation);
            d11 = ic.d.d();
            if (d12 == d11) {
                return d12;
            }
            return dc.w.f13270a;
        }
        Object collect = super.collect(hVar, continuation);
        d10 = ic.d.d();
        if (collect == d10) {
            return collect;
        }
        return dc.w.f13270a;
    }

    @Override // ed.d
    protected String f() {
        return "channel=" + this.f13284q;
    }

    @Override // ed.d
    protected Object i(cd.p<? super T> pVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object d11 = k.d(new ed.v(pVar), this.f13284q, this.f13285r, continuation);
        d10 = ic.d.d();
        if (d11 == d10) {
            return d11;
        }
        return dc.w.f13270a;
    }

    @Override // ed.d
    protected ed.d<T> j(hc.f fVar, int i10, cd.a aVar) {
        return new c(this.f13284q, this.f13285r, fVar, i10, aVar);
    }

    @Override // ed.d
    public g<T> k() {
        return new c(this.f13284q, this.f13285r, null, 0, null, 28, null);
    }

    @Override // ed.d
    public cd.r<T> n(ad.k0 k0Var) {
        o();
        if (this.f14214m == -3) {
            return this.f13284q;
        }
        return super.n(k0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(cd.r<? extends T> rVar, boolean z10, hc.f fVar, int i10, cd.a aVar) {
        super(fVar, i10, aVar);
        this.f13284q = rVar;
        this.f13285r = z10;
        this.consumed = 0;
    }
}
