package u;

import ad.k0;
import ad.l0;
import j0.d3;
import j0.j1;
import kotlin.coroutines.Continuation;
import t.b0;
import t.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollableState.kt */
/* loaded from: classes.dex */
public final class f implements x {

    /* renamed from: a  reason: collision with root package name */
    private final pc.l<Float, Float> f23820a;

    /* renamed from: b  reason: collision with root package name */
    private final u f23821b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f23822c;

    /* renamed from: d  reason: collision with root package name */
    private final j1<Boolean> f23823d;

    /* compiled from: ScrollableState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {178}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f23824f;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ b0 f23826p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ pc.p<u, Continuation<? super dc.w>, Object> f23827q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ScrollableState.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {181}, m = "invokeSuspend")
        /* renamed from: u.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0555a extends kotlin.coroutines.jvm.internal.l implements pc.p<u, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f23828f;

            /* renamed from: m  reason: collision with root package name */
            private /* synthetic */ Object f23829m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ f f23830p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ pc.p<u, Continuation<? super dc.w>, Object> f23831q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0555a(f fVar, pc.p<? super u, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super C0555a> continuation) {
                super(2, continuation);
                this.f23830p = fVar;
                this.f23831q = pVar;
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object invoke(u uVar, Continuation<? super dc.w> continuation) {
                return ((C0555a) create(uVar, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                C0555a c0555a = new C0555a(this.f23830p, this.f23831q, continuation);
                c0555a.f23829m = obj;
                return c0555a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f23828f;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        u uVar = (u) this.f23829m;
                        this.f23830p.f23823d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                        pc.p<u, Continuation<? super dc.w>, Object> pVar = this.f23831q;
                        this.f23828f = 1;
                        if (pVar.invoke(uVar, this) == d10) {
                            return d10;
                        }
                    }
                    this.f23830p.f23823d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    return dc.w.f13270a;
                } catch (Throwable th) {
                    this.f23830p.f23823d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(b0 b0Var, pc.p<? super u, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f23826p = b0Var;
            this.f23827q = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f23826p, this.f23827q, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f23824f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                d0 d0Var = f.this.f23822c;
                u uVar = f.this.f23821b;
                b0 b0Var = this.f23826p;
                C0555a c0555a = new C0555a(f.this, this.f23827q, null);
                this.f23824f = 1;
                if (d0Var.f(uVar, b0Var, c0555a, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: ScrollableState.kt */
    /* loaded from: classes.dex */
    public static final class b implements u {
        b() {
        }

        @Override // u.u
        public float a(float f10) {
            if (Float.isNaN(f10)) {
                return 0.0f;
            }
            return f.this.i().invoke(Float.valueOf(f10)).floatValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(pc.l<? super Float, Float> lVar) {
        j1<Boolean> e10;
        qc.q.i(lVar, "onDelta");
        this.f23820a = lVar;
        this.f23821b = new b();
        this.f23822c = new d0();
        e10 = d3.e(Boolean.FALSE, null, 2, null);
        this.f23823d = e10;
    }

    @Override // u.x
    public /* synthetic */ boolean a() {
        return w.b(this);
    }

    @Override // u.x
    public boolean b() {
        return this.f23823d.getValue().booleanValue();
    }

    @Override // u.x
    public Object c(b0 b0Var, pc.p<? super u, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object e10 = l0.e(new a(b0Var, pVar, null), continuation);
        d10 = ic.d.d();
        if (e10 == d10) {
            return e10;
        }
        return dc.w.f13270a;
    }

    @Override // u.x
    public /* synthetic */ boolean d() {
        return w.a(this);
    }

    @Override // u.x
    public float e(float f10) {
        return this.f23820a.invoke(Float.valueOf(f10)).floatValue();
    }

    public final pc.l<Float, Float> i() {
        return this.f23820a;
    }
}
