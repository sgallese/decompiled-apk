package dd;

import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Zip.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class v {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class a<R> implements g<R> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f13553f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f13554m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.q f13555p;

        public a(g gVar, g gVar2, pc.q qVar) {
            this.f13553f = gVar;
            this.f13554m = gVar2;
            this.f13555p = qVar;
        }

        @Override // dd.g
        public Object collect(h<? super R> hVar, Continuation<? super dc.w> continuation) {
            Object d10;
            Object a10 = ed.j.a(hVar, new g[]{this.f13553f, this.f13554m}, v.a(), new b(this.f13555p, null), continuation);
            d10 = ic.d.d();
            if (a10 == d10) {
                return a10;
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {33, 33}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b<R> extends kotlin.coroutines.jvm.internal.l implements pc.q<h<? super R>, Object[], Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f13556f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f13557m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f13558p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.q<T1, T2, Continuation<? super R>, Object> f13559q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pc.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f13559q = qVar;
        }

        @Override // pc.q
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(h<? super R> hVar, Object[] objArr, Continuation<? super dc.w> continuation) {
            b bVar = new b(this.f13559q, continuation);
            bVar.f13557m = hVar;
            bVar.f13558p = objArr;
            return bVar.invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            h hVar;
            d10 = ic.d.d();
            int i10 = this.f13556f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        dc.n.b(obj);
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = (h) this.f13557m;
                dc.n.b(obj);
            } else {
                dc.n.b(obj);
                hVar = (h) this.f13557m;
                Object[] objArr = (Object[]) this.f13558p;
                pc.q<T1, T2, Continuation<? super R>, Object> qVar = this.f13559q;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f13557m = hVar;
                this.f13556f = 1;
                obj = qVar.invoke(obj2, obj3, this);
                if (obj == d10) {
                    return d10;
                }
            }
            this.f13557m = null;
            this.f13556f = 2;
            if (hVar.emit(obj, this) == d10) {
                return d10;
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Zip.kt */
    /* loaded from: classes4.dex */
    public static final class c extends qc.r implements pc.a {

        /* renamed from: f  reason: collision with root package name */
        public static final c f13560f = new c();

        c() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final /* synthetic */ pc.a a() {
        return c();
    }

    public static final <T1, T2, R> g<R> b(g<? extends T1> gVar, g<? extends T2> gVar2, pc.q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return new a(gVar, gVar2, qVar);
    }

    private static final <T> pc.a<T[]> c() {
        return c.f13560f;
    }
}
