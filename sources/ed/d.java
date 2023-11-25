package ed;

import ad.k0;
import ad.l0;
import ad.m0;
import ad.o0;
import ec.b0;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes4.dex */
public abstract class d<T> implements o<T> {

    /* renamed from: f  reason: collision with root package name */
    public final hc.f f14213f;

    /* renamed from: m  reason: collision with root package name */
    public final int f14214m;

    /* renamed from: p  reason: collision with root package name */
    public final cd.a f14215p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f14216f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f14217m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ dd.h<T> f14218p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ d<T> f14219q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(dd.h<? super T> hVar, d<T> dVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14218p = hVar;
            this.f14219q = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f14218p, this.f14219q, continuation);
            aVar.f14217m = obj;
            return aVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f14216f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k0 k0Var = (k0) this.f14217m;
                dd.h<T> hVar = this.f14218p;
                cd.r<T> n10 = this.f14219q.n(k0Var);
                this.f14216f = 1;
                if (dd.i.q(hVar, n10, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<cd.p<? super T>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f14220f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f14221m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ d<T> f14222p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d<T> dVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f14222p = dVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(cd.p<? super T> pVar, Continuation<? super dc.w> continuation) {
            return ((b) create(pVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f14222p, continuation);
            bVar.f14221m = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f14220f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                cd.p<? super T> pVar = (cd.p) this.f14221m;
                d<T> dVar = this.f14222p;
                this.f14220f = 1;
                if (dVar.i(pVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public d(hc.f fVar, int i10, cd.a aVar) {
        this.f14213f = fVar;
        this.f14214m = i10;
        this.f14215p = aVar;
    }

    static /* synthetic */ <T> Object h(d<T> dVar, dd.h<? super T> hVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object e10 = l0.e(new a(hVar, dVar, null), continuation);
        d10 = ic.d.d();
        if (e10 == d10) {
            return e10;
        }
        return dc.w.f13270a;
    }

    @Override // dd.g
    public Object collect(dd.h<? super T> hVar, Continuation<? super dc.w> continuation) {
        return h(this, hVar, continuation);
    }

    @Override // ed.o
    public dd.g<T> d(hc.f fVar, int i10, cd.a aVar) {
        hc.f plus = fVar.plus(this.f14213f);
        if (aVar == cd.a.SUSPEND) {
            int i11 = this.f14214m;
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2 && (i11 = i11 + i10) < 0) {
                            i10 = Integer.MAX_VALUE;
                        }
                    }
                }
                i10 = i11;
            }
            aVar = this.f14215p;
        }
        if (qc.q.d(plus, this.f14213f) && i10 == this.f14214m && aVar == this.f14215p) {
            return this;
        }
        return j(plus, i10, aVar);
    }

    protected String f() {
        return null;
    }

    protected abstract Object i(cd.p<? super T> pVar, Continuation<? super dc.w> continuation);

    protected abstract d<T> j(hc.f fVar, int i10, cd.a aVar);

    public dd.g<T> k() {
        return null;
    }

    public final pc.p<cd.p<? super T>, Continuation<? super dc.w>, Object> l() {
        return new b(this, null);
    }

    public final int m() {
        int i10 = this.f14214m;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public cd.r<T> n(k0 k0Var) {
        return cd.n.d(k0Var, this.f14213f, m(), this.f14215p, m0.ATOMIC, null, l(), 16, null);
    }

    public String toString() {
        String k02;
        ArrayList arrayList = new ArrayList(4);
        String f10 = f();
        if (f10 != null) {
            arrayList.add(f10);
        }
        if (this.f14213f != hc.g.f16601f) {
            arrayList.add("context=" + this.f14213f);
        }
        if (this.f14214m != -3) {
            arrayList.add("capacity=" + this.f14214m);
        }
        if (this.f14215p != cd.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f14215p);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(o0.a(this));
        sb2.append('[');
        k02 = b0.k0(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb2.append(k02);
        sb2.append(']');
        return sb2.toString();
    }
}
