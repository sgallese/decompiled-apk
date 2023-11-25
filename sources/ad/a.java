package ad;

import kotlin.coroutines.Continuation;

/* compiled from: AbstractCoroutine.kt */
/* loaded from: classes4.dex */
public abstract class a<T> extends e2 implements Continuation<T>, k0 {

    /* renamed from: p  reason: collision with root package name */
    private final hc.f f460p;

    public a(hc.f fVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            m0((x1) fVar.get(x1.f574b));
        }
        this.f460p = fVar.plus(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ad.e2
    protected final void D0(Object obj) {
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            U0(a0Var.f462a, a0Var.a());
            return;
        }
        V0(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ad.e2
    public String N() {
        return o0.a(this) + " was cancelled";
    }

    protected void T0(Object obj) {
        C(obj);
    }

    public final <R> void W0(m0 m0Var, R r10, pc.p<? super R, ? super Continuation<? super T>, ? extends Object> pVar) {
        m0Var.invoke(pVar, r10, this);
    }

    @Override // ad.e2, ad.x1
    public boolean b() {
        return super.b();
    }

    @Override // kotlin.coroutines.Continuation
    public final hc.f getContext() {
        return this.f460p;
    }

    @Override // ad.k0
    public hc.f getCoroutineContext() {
        return this.f460p;
    }

    @Override // ad.e2
    public final void k0(Throwable th) {
        i0.a(this.f460p, th);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object u02 = u0(d0.d(obj, null, 1, null));
        if (u02 == f2.f504b) {
            return;
        }
        T0(u02);
    }

    @Override // ad.e2
    public String w0() {
        String b10 = f0.b(this.f460p);
        if (b10 == null) {
            return super.w0();
        }
        return '\"' + b10 + "\":" + super.w0();
    }

    protected void V0(T t10) {
    }

    protected void U0(Throwable th, boolean z10) {
    }
}
