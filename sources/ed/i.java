package ed;

import ad.k0;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* compiled from: Merge.kt */
/* loaded from: classes4.dex */
public final class i<T> extends d<T> {

    /* renamed from: q  reason: collision with root package name */
    private final Iterable<dd.g<T>> f14246q;

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {96}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f14247f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ dd.g<T> f14248m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v<T> f14249p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(dd.g<? extends T> gVar, v<T> vVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14248m = gVar;
            this.f14249p = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f14248m, this.f14249p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f14247f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                dd.g<T> gVar = this.f14248m;
                v<T> vVar = this.f14249p;
                this.f14247f = 1;
                if (gVar.collect(vVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public /* synthetic */ i(Iterable iterable, hc.f fVar, int i10, cd.a aVar, int i11, qc.h hVar) {
        this(iterable, (i11 & 2) != 0 ? hc.g.f16601f : fVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? cd.a.SUSPEND : aVar);
    }

    @Override // ed.d
    protected Object i(cd.p<? super T> pVar, Continuation<? super dc.w> continuation) {
        v vVar = new v(pVar);
        Iterator<dd.g<T>> it = this.f14246q.iterator();
        while (it.hasNext()) {
            ad.i.d(pVar, null, null, new a(it.next(), vVar, null), 3, null);
        }
        return dc.w.f13270a;
    }

    @Override // ed.d
    protected d<T> j(hc.f fVar, int i10, cd.a aVar) {
        return new i(this.f14246q, fVar, i10, aVar);
    }

    @Override // ed.d
    public cd.r<T> n(k0 k0Var) {
        return cd.n.c(k0Var, this.f14213f, this.f14214m, l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(Iterable<? extends dd.g<? extends T>> iterable, hc.f fVar, int i10, cd.a aVar) {
        super(fVar, i10, aVar);
        this.f14246q = iterable;
    }
}
