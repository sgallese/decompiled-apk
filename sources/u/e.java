package u;

import ad.k0;
import kotlin.coroutines.Continuation;
import qc.c0;
import s.c1;

/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class e implements m {

    /* renamed from: a  reason: collision with root package name */
    private final s.y<Float> f23808a;

    /* renamed from: b  reason: collision with root package name */
    private final v0.g f23809b;

    /* renamed from: c  reason: collision with root package name */
    private int f23810c;

    /* compiled from: Scrollable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {603}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super Float>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f23811f;

        /* renamed from: m  reason: collision with root package name */
        int f23812m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ float f23813p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ e f23814q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ u f23815r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Scrollable.kt */
        /* renamed from: u.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0554a extends qc.r implements pc.l<s.i<Float, s.n>, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ c0 f23816f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ u f23817m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ c0 f23818p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ e f23819q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0554a(c0 c0Var, u uVar, c0 c0Var2, e eVar) {
                super(1);
                this.f23816f = c0Var;
                this.f23817m = uVar;
                this.f23818p = c0Var2;
                this.f23819q = eVar;
            }

            public final void a(s.i<Float, s.n> iVar) {
                qc.q.i(iVar, "$this$animateDecay");
                float floatValue = iVar.e().floatValue() - this.f23816f.f21658f;
                float a10 = this.f23817m.a(floatValue);
                this.f23816f.f21658f = iVar.e().floatValue();
                this.f23818p.f21658f = iVar.f().floatValue();
                if (Math.abs(floatValue - a10) > 0.5f) {
                    iVar.a();
                }
                e eVar = this.f23819q;
                eVar.d(eVar.c() + 1);
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(s.i<Float, s.n> iVar) {
                a(iVar);
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, e eVar, u uVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f23813p = f10;
            this.f23814q = eVar;
            this.f23815r = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f23813p, this.f23814q, this.f23815r, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super Float> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            float f10;
            c0 c0Var;
            d10 = ic.d.d();
            int i10 = this.f23812m;
            if (i10 != 0) {
                if (i10 == 1) {
                    c0Var = (c0) this.f23811f;
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                if (Math.abs(this.f23813p) > 1.0f) {
                    c0 c0Var2 = new c0();
                    c0Var2.f21658f = this.f23813p;
                    c0 c0Var3 = new c0();
                    s.l b10 = s.m.b(0.0f, this.f23813p, 0L, 0L, false, 28, null);
                    s.y yVar = this.f23814q.f23808a;
                    C0554a c0554a = new C0554a(c0Var3, this.f23815r, c0Var2, this.f23814q);
                    this.f23811f = c0Var2;
                    this.f23812m = 1;
                    if (c1.h(b10, yVar, false, c0554a, this, 2, null) == d10) {
                        return d10;
                    }
                    c0Var = c0Var2;
                } else {
                    f10 = this.f23813p;
                    return kotlin.coroutines.jvm.internal.b.c(f10);
                }
            }
            f10 = c0Var.f21658f;
            return kotlin.coroutines.jvm.internal.b.c(f10);
        }
    }

    public e(s.y<Float> yVar, v0.g gVar) {
        qc.q.i(yVar, "flingDecay");
        qc.q.i(gVar, "motionDurationScale");
        this.f23808a = yVar;
        this.f23809b = gVar;
    }

    @Override // u.m
    public Object a(u uVar, float f10, Continuation<? super Float> continuation) {
        this.f23810c = 0;
        return ad.g.g(this.f23809b, new a(f10, this, uVar, null), continuation);
    }

    public final int c() {
        return this.f23810c;
    }

    public final void d(int i10) {
        this.f23810c = i10;
    }

    public /* synthetic */ e(s.y yVar, v0.g gVar, int i10, qc.h hVar) {
        this(yVar, (i10 & 2) != 0 ? androidx.compose.foundation.gestures.d.f() : gVar);
    }
}
