package f0;

import a1.s4;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.g3;
import j0.l;
import j0.y2;
import java.util.Map;
import kotlin.coroutines.Continuation;
import okhttp3.internal.http2.Http2;
import v0.b;

/* compiled from: Switch.kt */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f15113a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f15114b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f15115c;

    /* renamed from: d  reason: collision with root package name */
    private static final float f15116d;

    /* renamed from: e  reason: collision with root package name */
    private static final float f15117e;

    /* renamed from: f  reason: collision with root package name */
    private static final float f15118f;

    /* renamed from: g  reason: collision with root package name */
    private static final float f15119g;

    /* renamed from: h  reason: collision with root package name */
    private static final float f15120h;

    /* renamed from: i  reason: collision with root package name */
    private static final s.h1<Float> f15121i;

    /* renamed from: j  reason: collision with root package name */
    private static final float f15122j;

    /* renamed from: k  reason: collision with root package name */
    private static final float f15123k;

    /* renamed from: l  reason: collision with root package name */
    private static final float f15124l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Switch.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0.e<Boolean> f15125f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ float f15126m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ float f15127p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0.e<Boolean> eVar, float f10, float f11) {
            super(0);
            this.f15125f = eVar;
            this.f15126m = f10;
            this.f15127p = f11;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Map k10;
            f0.e<Boolean> eVar = this.f15125f;
            k10 = ec.n0.k(dc.r.a(Boolean.FALSE, Float.valueOf(this.f15126m)), dc.r.a(Boolean.TRUE, Float.valueOf(this.f15127p)));
            f0.e.O(eVar, k10, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Switch.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwitchKt$Switch$3$1", f = "Switch.kt", l = {126}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f15128f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ f0.e<Boolean> f15129m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ g3<Boolean> f15130p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ g3<pc.l<Boolean, dc.w>> f15131q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ j0.j1<Boolean> f15132r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Switch.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.a<Boolean> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ f0.e<Boolean> f15133f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0.e<Boolean> eVar) {
                super(0);
                this.f15133f = eVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // pc.a
            public final Boolean invoke() {
                return this.f15133f.v();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Switch.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwitchKt$Switch$3$1$2", f = "Switch.kt", l = {}, m = "invokeSuspend")
        /* renamed from: f0.v1$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0360b extends kotlin.coroutines.jvm.internal.l implements pc.p<Boolean, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f15134f;

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ boolean f15135m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ g3<Boolean> f15136p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ g3<pc.l<Boolean, dc.w>> f15137q;

            /* renamed from: r  reason: collision with root package name */
            final /* synthetic */ j0.j1<Boolean> f15138r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0360b(g3<Boolean> g3Var, g3<? extends pc.l<? super Boolean, dc.w>> g3Var2, j0.j1<Boolean> j1Var, Continuation<? super C0360b> continuation) {
                super(2, continuation);
                this.f15136p = g3Var;
                this.f15137q = g3Var2;
                this.f15138r = j1Var;
            }

            public final Object a(boolean z10, Continuation<? super dc.w> continuation) {
                return ((C0360b) create(Boolean.valueOf(z10), continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                C0360b c0360b = new C0360b(this.f15136p, this.f15137q, this.f15138r, continuation);
                c0360b.f15135m = ((Boolean) obj).booleanValue();
                return c0360b;
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super dc.w> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ic.d.d();
                if (this.f15134f == 0) {
                    dc.n.b(obj);
                    boolean z10 = this.f15135m;
                    if (v1.e(this.f15136p) != z10) {
                        pc.l d10 = v1.d(this.f15137q);
                        if (d10 != null) {
                            d10.invoke(kotlin.coroutines.jvm.internal.b.a(z10));
                        }
                        v1.c(this.f15138r, !v1.b(r2));
                    }
                    return dc.w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(f0.e<Boolean> eVar, g3<Boolean> g3Var, g3<? extends pc.l<? super Boolean, dc.w>> g3Var2, j0.j1<Boolean> j1Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f15129m = eVar;
            this.f15130p = g3Var;
            this.f15131q = g3Var2;
            this.f15132r = j1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f15129m, this.f15130p, this.f15131q, this.f15132r, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f15128f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                dd.g n10 = y2.n(new a(this.f15129m));
                C0360b c0360b = new C0360b(this.f15130p, this.f15131q, this.f15132r, null);
                this.f15128f = 1;
                if (dd.i.g(n10, c0360b, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Switch.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwitchKt$Switch$4$1", f = "Switch.kt", l = {135}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f15139f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f15140m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ f0.e<Boolean> f15141p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, f0.e<Boolean> eVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f15140m = z10;
            this.f15141p = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new c(this.f15140m, this.f15141p, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f15139f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                if (this.f15140m != this.f15141p.v().booleanValue()) {
                    f0.e<Boolean> eVar = this.f15141p;
                    Boolean a10 = kotlin.coroutines.jvm.internal.b.a(this.f15140m);
                    this.f15139f = 1;
                    if (f0.d.g(eVar, a10, 0.0f, this, 2, null) == d10) {
                        return d10;
                    }
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Switch.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.a<Float> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f0.e<Boolean> f15142f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f0.e<Boolean> eVar) {
            super(0);
            this.f15142f = eVar;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f15142f.F());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Switch.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f15143f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<Boolean, dc.w> f15144m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f15145p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ boolean f15146q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ v.m f15147r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ t1 f15148s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f15149t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f15150u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(boolean z10, pc.l<? super Boolean, dc.w> lVar, androidx.compose.ui.e eVar, boolean z11, v.m mVar, t1 t1Var, int i10, int i11) {
            super(2);
            this.f15143f = z10;
            this.f15144m = lVar;
            this.f15145p = eVar;
            this.f15146q = z11;
            this.f15147r = mVar;
            this.f15148s = t1Var;
            this.f15149t = i10;
            this.f15150u = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            v1.a(this.f15143f, this.f15144m, this.f15145p, this.f15146q, this.f15147r, this.f15148s, lVar, j0.z1.a(this.f15149t | 1), this.f15150u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Switch.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.l<Float, Float> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f15151f = new f();

        f() {
            super(1);
        }

        public final Float a(float f10) {
            return Float.valueOf(f10 * 0.7f);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Switch.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.a<Float> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f15152f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(float f10) {
            super(0);
            this.f15152f = f10;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f15152f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Switch.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SwitchKt$SwitchImpl$1$1", f = "Switch.kt", l = {223}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f15153f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v.k f15154m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ t0.r<v.j> f15155p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Switch.kt */
        /* loaded from: classes.dex */
        public static final class a implements dd.h<v.j> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ t0.r<v.j> f15156f;

            a(t0.r<v.j> rVar) {
                this.f15156f = rVar;
            }

            @Override // dd.h
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Object emit(v.j jVar, Continuation<? super dc.w> continuation) {
                if (jVar instanceof v.p) {
                    this.f15156f.add(jVar);
                } else if (jVar instanceof v.q) {
                    this.f15156f.remove(((v.q) jVar).a());
                } else if (jVar instanceof v.o) {
                    this.f15156f.remove(((v.o) jVar).a());
                } else if (jVar instanceof v.b) {
                    this.f15156f.add(jVar);
                } else if (jVar instanceof v.c) {
                    this.f15156f.remove(((v.c) jVar).a());
                } else if (jVar instanceof v.a) {
                    this.f15156f.remove(((v.a) jVar).a());
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(v.k kVar, t0.r<v.j> rVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f15154m = kVar;
            this.f15155p = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new h(this.f15154m, this.f15155p, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((h) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f15153f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                dd.g<v.j> b10 = this.f15154m.b();
                a aVar = new a(this.f15155p);
                this.f15153f = 1;
                if (b10.collect(aVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Switch.kt */
    /* loaded from: classes.dex */
    public static final class i extends qc.r implements pc.l<c1.f, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g3<a1.p1> f15157f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(g3<a1.p1> g3Var) {
            super(1);
            this.f15157f = g3Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.f fVar) {
            invoke2(fVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(c1.f fVar) {
            qc.q.i(fVar, "$this$Canvas");
            v1.r(fVar, v1.g(this.f15157f), fVar.v0(v1.t()), fVar.v0(v1.s()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Switch.kt */
    /* loaded from: classes.dex */
    public static final class j extends qc.r implements pc.l<j2.e, j2.l> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a<Float> f15158f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(pc.a<Float> aVar) {
            super(1);
            this.f15158f = aVar;
        }

        public final long a(j2.e eVar) {
            int d10;
            qc.q.i(eVar, "$this$offset");
            d10 = sc.c.d(this.f15158f.invoke().floatValue());
            return j2.m.a(d10, 0);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ j2.l invoke(j2.e eVar) {
            return j2.l.b(a(eVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Switch.kt */
    /* loaded from: classes.dex */
    public static final class k extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w.d f15159f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f15160m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f15161p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ t1 f15162q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.a<Float> f15163r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ v.k f15164s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f15165t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(w.d dVar, boolean z10, boolean z11, t1 t1Var, pc.a<Float> aVar, v.k kVar, int i10) {
            super(2);
            this.f15159f = dVar;
            this.f15160m = z10;
            this.f15161p = z11;
            this.f15162q = t1Var;
            this.f15163r = aVar;
            this.f15164s = kVar;
            this.f15165t = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            v1.f(this.f15159f, this.f15160m, this.f15161p, this.f15162q, this.f15163r, this.f15164s, lVar, j0.z1.a(this.f15165t | 1));
        }
    }

    static {
        float j10 = j2.h.j(34);
        f15113a = j10;
        f15114b = j2.h.j(14);
        float j11 = j2.h.j(20);
        f15115c = j11;
        f15116d = j2.h.j(24);
        f15117e = j2.h.j(2);
        f15118f = j10;
        f15119g = j11;
        f15120h = j2.h.j(j10 - j11);
        f15121i = new s.h1<>(100, 0, null, 6, null);
        f15122j = j2.h.j(1);
        f15123k = j2.h.j(6);
        f15124l = j2.h.j(125);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0252 A[LOOP:0: B:115:0x0250->B:116:0x0252, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0314 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r45, pc.l<? super java.lang.Boolean, dc.w> r46, androidx.compose.ui.e r47, boolean r48, v.m r49, f0.t1 r50, j0.l r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.v1.a(boolean, pc.l, androidx.compose.ui.e, boolean, v.m, f0.t1, j0.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(j0.j1<Boolean> j1Var) {
        return j1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(j0.j1<Boolean> j1Var, boolean z10) {
        j1Var.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pc.l<Boolean, dc.w> d(g3<? extends pc.l<? super Boolean, dc.w>> g3Var) {
        return (pc.l) g3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(g3<Boolean> g3Var) {
        return g3Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(w.d dVar, boolean z10, boolean z11, t1 t1Var, pc.a<Float> aVar, v.k kVar, j0.l lVar, int i10) {
        int i11;
        float f10;
        long h10;
        j0.l lVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        j0.l q10 = lVar.q(70908914);
        if ((i10 & 14) == 0) {
            if (q10.Q(dVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (q10.c(z10)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 896) == 0) {
            if (q10.c(z11)) {
                i15 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        if ((i10 & 7168) == 0) {
            if (q10.Q(t1Var)) {
                i14 = RecyclerView.m.FLAG_MOVED;
            } else {
                i14 = UserVerificationMethods.USER_VERIFY_ALL;
            }
            i11 |= i14;
        }
        if ((57344 & i10) == 0) {
            if (q10.l(aVar)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = 8192;
            }
            i11 |= i13;
        }
        if ((458752 & i10) == 0) {
            if (q10.Q(kVar)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i11 |= i12;
        }
        if ((374491 & i11) == 74898 && q10.t()) {
            q10.z();
            lVar2 = q10;
        } else {
            if (j0.n.K()) {
                j0.n.V(70908914, i11, -1, "androidx.compose.material.SwitchImpl (Switch.kt:212)");
            }
            q10.e(-492369756);
            Object f11 = q10.f();
            l.a aVar2 = j0.l.f18688a;
            if (f11 == aVar2.a()) {
                f11 = y2.e();
                q10.J(f11);
            }
            q10.N();
            t0.r rVar = (t0.r) f11;
            int i18 = (i11 >> 15) & 14;
            q10.e(511388516);
            boolean Q = q10.Q(kVar) | q10.Q(rVar);
            Object f12 = q10.f();
            if (Q || f12 == aVar2.a()) {
                f12 = new h(kVar, rVar, null);
                q10.J(f12);
            }
            q10.N();
            j0.h0.d(kVar, (pc.p) f12, q10, i18 | 64);
            if ((!rVar.isEmpty()) != false) {
                f10 = f15123k;
            } else {
                f10 = f15122j;
            }
            float f13 = f10;
            int i19 = ((i11 >> 6) & 14) | (i11 & 112) | ((i11 >> 3) & 896);
            g3<a1.p1> b10 = t1Var.b(z11, z10, q10, i19);
            e.a aVar3 = androidx.compose.ui.e.f2335a;
            b.a aVar4 = v0.b.f24258a;
            androidx.compose.ui.e f14 = androidx.compose.foundation.layout.m.f(dVar.b(aVar3, aVar4.d()), 0.0f, 1, null);
            q10.e(1157296644);
            boolean Q2 = q10.Q(b10);
            Object f15 = q10.f();
            if (Q2 || f15 == aVar2.a()) {
                f15 = new i(b10);
                q10.J(f15);
            }
            q10.N();
            t.i.a(f14, (pc.l) f15, q10, 0);
            g3<a1.p1> a10 = t1Var.a(z11, z10, q10, i19);
            e0 e0Var = (e0) q10.C(f0.d());
            float j10 = j2.h.j(((j2.h) q10.C(f0.c())).o() + f13);
            q10.e(-539243578);
            if (a1.p1.q(h(a10), s0.f15068a.a(q10, 6).n()) && e0Var != null) {
                h10 = e0Var.a(h(a10), j10, q10, 0);
            } else {
                h10 = h(a10);
            }
            q10.N();
            lVar2 = q10;
            g3<a1.p1> a11 = r.c0.a(h10, null, null, null, q10, 0, 14);
            androidx.compose.ui.e b11 = dVar.b(aVar3, aVar4.g());
            lVar2.e(1157296644);
            boolean Q3 = lVar2.Q(aVar);
            Object f16 = lVar2.f();
            if (Q3 || f16 == aVar2.a()) {
                f16 = new j(aVar);
                lVar2.J(f16);
            }
            lVar2.N();
            w.d0.a(androidx.compose.foundation.c.c(x0.m.b(androidx.compose.foundation.layout.m.m(t.x.b(androidx.compose.foundation.layout.g.a(b11, (pc.l) f16), kVar, h0.n.e(false, f15116d, 0L, lVar2, 54, 4)), f15115c), f13, b0.i.g(), false, 0L, 0L, 24, null), i(a11), b0.i.g()), lVar2, 0);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        j0.g2 w10 = lVar2.w();
        if (w10 != null) {
            w10.a(new k(dVar, z10, z11, t1Var, aVar, kVar, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(g3<a1.p1> g3Var) {
        return g3Var.getValue().y();
    }

    private static final long h(g3<a1.p1> g3Var) {
        return g3Var.getValue().y();
    }

    private static final long i(g3<a1.p1> g3Var) {
        return g3Var.getValue().y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(c1.f fVar, long j10, float f10, float f11) {
        float f12 = f11 / 2;
        c1.e.j(fVar, j10, z0.g.a(f12, z0.f.p(fVar.O0())), z0.g.a(f10 - f12, z0.f.p(fVar.O0())), f11, s4.f186b.b(), null, 0.0f, null, 0, 480, null);
    }

    public static final float s() {
        return f15114b;
    }

    public static final float t() {
        return f15113a;
    }
}
