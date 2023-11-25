package ed;

import fd.k0;
import kotlin.coroutines.Continuation;

/* compiled from: ChannelFlow.kt */
/* loaded from: classes4.dex */
final class y<T> implements dd.h<T> {

    /* renamed from: f  reason: collision with root package name */
    private final hc.f f14295f;

    /* renamed from: m  reason: collision with root package name */
    private final Object f14296m;

    /* renamed from: p  reason: collision with root package name */
    private final pc.p<T, Continuation<? super dc.w>, Object> f14297p;

    /* compiled from: ChannelFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<T, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f14298f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f14299m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ dd.h<T> f14300p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(dd.h<? super T> hVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14300p = hVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t10, Continuation<? super dc.w> continuation) {
            return ((a) create(t10, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f14300p, continuation);
            aVar.f14299m = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f14298f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                Object obj2 = this.f14299m;
                dd.h<T> hVar = this.f14300p;
                this.f14298f = 1;
                if (hVar.emit(obj2, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public y(dd.h<? super T> hVar, hc.f fVar) {
        this.f14295f = fVar;
        this.f14296m = k0.b(fVar);
        this.f14297p = new a(hVar, null);
    }

    @Override // dd.h
    public Object emit(T t10, Continuation<? super dc.w> continuation) {
        Object d10;
        Object b10 = e.b(this.f14295f, t10, this.f14296m, this.f14297p, continuation);
        d10 = ic.d.d();
        if (b10 == d10) {
            return b10;
        }
        return dc.w.f13270a;
    }
}
