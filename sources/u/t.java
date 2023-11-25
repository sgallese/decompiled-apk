package u;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import qc.c0;
import s.c1;

/* compiled from: ScrollExtensions.kt */
/* loaded from: classes.dex */
public final class t {

    /* compiled from: ScrollExtensions.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", f = "ScrollExtensions.kt", l = {40}, m = "animateScrollBy")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f */
        Object f23978f;

        /* renamed from: m */
        /* synthetic */ Object f23979m;

        /* renamed from: p */
        int f23980p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23979m = obj;
            this.f23980p |= RecyclerView.UNDEFINED_DURATION;
            return t.a(null, 0.0f, null, this);
        }
    }

    /* compiled from: ScrollExtensions.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<u, Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        int f23981f;

        /* renamed from: m */
        private /* synthetic */ Object f23982m;

        /* renamed from: p */
        final /* synthetic */ float f23983p;

        /* renamed from: q */
        final /* synthetic */ s.j<Float> f23984q;

        /* renamed from: r */
        final /* synthetic */ c0 f23985r;

        /* compiled from: ScrollExtensions.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.p<Float, Float, dc.w> {

            /* renamed from: f */
            final /* synthetic */ c0 f23986f;

            /* renamed from: m */
            final /* synthetic */ u f23987m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, u uVar) {
                super(2);
                this.f23986f = c0Var;
                this.f23987m = uVar;
            }

            public final void a(float f10, float f11) {
                c0 c0Var = this.f23986f;
                float f12 = c0Var.f21658f;
                c0Var.f21658f = f12 + this.f23987m.a(f10 - f12);
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ dc.w invoke(Float f10, Float f11) {
                a(f10.floatValue(), f11.floatValue());
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, s.j<Float> jVar, c0 c0Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f23983p = f10;
            this.f23984q = jVar;
            this.f23985r = c0Var;
        }

        @Override // pc.p
        /* renamed from: a */
        public final Object invoke(u uVar, Continuation<? super dc.w> continuation) {
            return ((b) create(uVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f23983p, this.f23984q, this.f23985r, continuation);
            bVar.f23982m = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f23981f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                u uVar = (u) this.f23982m;
                float f10 = this.f23983p;
                s.j<Float> jVar = this.f23984q;
                a aVar = new a(this.f23985r, uVar);
                this.f23981f = 1;
                if (c1.e(0.0f, f10, 0.0f, jVar, aVar, this, 4, null) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(u.x r7, float r8, s.j<java.lang.Float> r9, kotlin.coroutines.Continuation<? super java.lang.Float> r10) {
        /*
            boolean r0 = r10 instanceof u.t.a
            if (r0 == 0) goto L13
            r0 = r10
            u.t$a r0 = (u.t.a) r0
            int r1 = r0.f23980p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23980p = r1
            goto L18
        L13:
            u.t$a r0 = new u.t$a
            r0.<init>(r10)
        L18:
            r4 = r0
            java.lang.Object r10 = r4.f23979m
            java.lang.Object r0 = ic.b.d()
            int r1 = r4.f23980p
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r7 = r4.f23978f
            qc.c0 r7 = (qc.c0) r7
            dc.n.b(r10)
            goto L57
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            dc.n.b(r10)
            qc.c0 r10 = new qc.c0
            r10.<init>()
            r3 = 0
            u.t$b r5 = new u.t$b
            r1 = 0
            r5.<init>(r8, r9, r10, r1)
            r8 = 1
            r6 = 0
            r4.f23978f = r10
            r4.f23980p = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = u.w.c(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            r7 = r10
        L57:
            float r7 = r7.f21658f
            java.lang.Float r7 = kotlin.coroutines.jvm.internal.b.c(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u.t.a(u.x, float, s.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object b(x xVar, float f10, s.j jVar, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            jVar = s.k.g(0.0f, 0.0f, null, 7, null);
        }
        return a(xVar, f10, jVar, continuation);
    }
}
