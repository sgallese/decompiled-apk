package dd;

import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Merge.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class r {

    /* renamed from: a  reason: collision with root package name */
    private static final int f13477a = fd.h0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {217, 217}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a<R, T> extends kotlin.coroutines.jvm.internal.l implements pc.q<h<? super R>, T, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f13478f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f13479m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f13480p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.p<T, Continuation<? super R>, Object> f13481q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f13481q = pVar;
        }

        public final Object invoke(h<? super R> hVar, T t10, Continuation<? super dc.w> continuation) {
            a aVar = new a(this.f13481q, continuation);
            aVar.f13479m = hVar;
            aVar.f13480p = t10;
            return aVar.invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            h hVar;
            d10 = ic.d.d();
            int i10 = this.f13478f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        dc.n.b(obj);
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h hVar2 = (h) this.f13479m;
                dc.n.b(obj);
                hVar = hVar2;
            } else {
                dc.n.b(obj);
                h hVar3 = (h) this.f13479m;
                Object obj2 = this.f13480p;
                pc.p<T, Continuation<? super R>, Object> pVar = this.f13481q;
                this.f13479m = hVar3;
                this.f13478f = 1;
                obj = pVar.invoke(obj2, this);
                hVar = hVar3;
                if (obj == d10) {
                    return d10;
                }
            }
            this.f13479m = null;
            this.f13478f = 2;
            if (hVar.emit(obj, this) == d10) {
                return d10;
            }
            return dc.w.f13270a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pc.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super dc.w> continuation) {
            return invoke((h) ((h) obj), (h<? super R>) obj2, continuation);
        }
    }

    public static final <T, R> g<R> a(g<? extends T> gVar, pc.p<? super T, ? super Continuation<? super R>, ? extends Object> pVar) {
        return i.R(gVar, new a(pVar, null));
    }

    public static final <T> g<T> b(Iterable<? extends g<? extends T>> iterable) {
        return new ed.i(iterable, null, 0, null, 14, null);
    }

    public static final <T> g<T> c(g<? extends T>... gVarArr) {
        Iterable E;
        E = ec.p.E(gVarArr);
        return i.G(E);
    }

    public static final <T, R> g<R> d(g<? extends T> gVar, pc.q<? super h<? super R>, ? super T, ? super Continuation<? super dc.w>, ? extends Object> qVar) {
        return new ed.h(qVar, gVar, null, 0, null, 28, null);
    }
}
