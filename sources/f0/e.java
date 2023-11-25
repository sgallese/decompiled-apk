package f0;

import j0.d3;
import j0.g3;
import j0.y2;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes.dex */
public final class e<T> {

    /* renamed from: r */
    public static final c f14562r = new c(null);

    /* renamed from: a */
    private final pc.l<Float, Float> f14563a;

    /* renamed from: b */
    private final pc.a<Float> f14564b;

    /* renamed from: c */
    private final s.j<Float> f14565c;

    /* renamed from: d */
    private final pc.l<T, Boolean> f14566d;

    /* renamed from: e */
    private final p0 f14567e;

    /* renamed from: f */
    private final u.l f14568f;

    /* renamed from: g */
    private final j0.j1 f14569g;

    /* renamed from: h */
    private final g3 f14570h;

    /* renamed from: i */
    private final g3 f14571i;

    /* renamed from: j */
    private final j0.j1 f14572j;

    /* renamed from: k */
    private final g3 f14573k;

    /* renamed from: l */
    private final j0.e1 f14574l;

    /* renamed from: m */
    private final g3 f14575m;

    /* renamed from: n */
    private final g3 f14576n;

    /* renamed from: o */
    private final j0.j1 f14577o;

    /* renamed from: p */
    private final j0.j1 f14578p;

    /* renamed from: q */
    private final f0.b f14579q;

    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<T, Boolean> {

        /* renamed from: f */
        public static final a f14580f = new a();

        a() {
            super(1);
        }

        @Override // pc.l
        public final Boolean invoke(T t10) {
            return Boolean.TRUE;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((a) obj);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(T t10, Map<T, Float> map, Map<T, Float> map2);
    }

    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(qc.h hVar) {
            this();
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public static final class d implements f0.b {

        /* renamed from: a */
        final /* synthetic */ e<T> f14581a;

        d(e<T> eVar) {
            this.f14581a = eVar;
        }

        @Override // f0.b
        public void a(float f10, float f11) {
            this.f14581a.K(f10);
            this.f14581a.J(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnchoredDraggable.kt */
    /* renamed from: f0.e$e */
    /* loaded from: classes.dex */
    public static final class C0347e extends qc.r implements pc.a<T> {

        /* renamed from: f */
        final /* synthetic */ e<T> f14582f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0347e(e<T> eVar) {
            super(0);
            this.f14582f = eVar;
        }

        @Override // pc.a
        public final T invoke() {
            T t10 = (T) this.f14582f.s();
            if (t10 == null) {
                e<T> eVar = this.f14582f;
                float A = eVar.A();
                if (!Float.isNaN(A)) {
                    return (T) eVar.n(A, eVar.v());
                }
                return eVar.v();
            }
            return t10;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2", f = "AnchoredDraggable.kt", l = {441}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        int f14583f;

        /* renamed from: m */
        final /* synthetic */ T f14584m;

        /* renamed from: p */
        final /* synthetic */ e<T> f14585p;

        /* renamed from: q */
        final /* synthetic */ t.b0 f14586q;

        /* renamed from: r */
        final /* synthetic */ pc.q<f0.b, Map<T, Float>, Continuation<? super dc.w>, Object> f14587r;

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2$1", f = "AnchoredDraggable.kt", l = {443}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.l<Continuation<? super dc.w>, Object> {

            /* renamed from: f */
            int f14588f;

            /* renamed from: m */
            final /* synthetic */ T f14589m;

            /* renamed from: p */
            final /* synthetic */ e<T> f14590p;

            /* renamed from: q */
            final /* synthetic */ pc.q<f0.b, Map<T, Float>, Continuation<? super dc.w>, Object> f14591q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(T t10, e<T> eVar, pc.q<? super f0.b, ? super Map<T, Float>, ? super Continuation<? super dc.w>, ? extends Object> qVar, Continuation<? super a> continuation) {
                super(1, continuation);
                this.f14589m = t10;
                this.f14590p = eVar;
                this.f14591q = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Continuation<?> continuation) {
                return new a(this.f14589m, this.f14590p, this.f14591q, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f14588f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    T t10 = this.f14589m;
                    if (t10 != null) {
                        this.f14590p.H(t10);
                    }
                    pc.q<f0.b, Map<T, Float>, Continuation<? super dc.w>, Object> qVar = this.f14591q;
                    f0.b bVar = ((e) this.f14590p).f14579q;
                    Map<T, Float> q10 = this.f14590p.q();
                    this.f14588f = 1;
                    if (qVar.invoke(bVar, q10, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }

            @Override // pc.l
            public final Object invoke(Continuation<? super dc.w> continuation) {
                return ((a) create(continuation)).invokeSuspend(dc.w.f13270a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(T t10, e<T> eVar, t.b0 b0Var, pc.q<? super f0.b, ? super Map<T, Float>, ? super Continuation<? super dc.w>, ? extends Object> qVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f14584m = t10;
            this.f14585p = eVar;
            this.f14586q = b0Var;
            this.f14587r = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new f(this.f14584m, this.f14585p, this.f14586q, this.f14587r, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((f) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        /* JADX WARN: Finally extract failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            T t10;
            boolean z10;
            T t11;
            boolean z11;
            d10 = ic.d.d();
            int i10 = this.f14583f;
            Object obj2 = null;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    if (this.f14584m == null || this.f14585p.q().containsKey(this.f14584m)) {
                        p0 p0Var = ((e) this.f14585p).f14567e;
                        t.b0 b0Var = this.f14586q;
                        a aVar = new a(this.f14584m, this.f14585p, this.f14587r, null);
                        this.f14583f = 1;
                        if (p0Var.d(b0Var, aVar, this) == d10) {
                            return d10;
                        }
                    } else {
                        if (this.f14585p.u().invoke(this.f14584m).booleanValue()) {
                            this.f14585p.I(this.f14584m);
                        }
                        return dc.w.f13270a;
                    }
                }
                if (this.f14584m != null) {
                    this.f14585p.H(null);
                }
                Set<Map.Entry<T, Float>> entrySet = this.f14585p.q().entrySet();
                e<T> eVar = this.f14585p;
                Iterator<T> it = entrySet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        t11 = it.next();
                        if (Math.abs(((Number) ((Map.Entry) t11).getValue()).floatValue() - eVar.A()) < 0.5f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            break;
                        }
                    } else {
                        t11 = null;
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) t11;
                if (entry != null) {
                    obj2 = entry.getKey();
                }
                if (obj2 != null && this.f14585p.u().invoke(obj2).booleanValue()) {
                    this.f14585p.I(obj2);
                }
                return dc.w.f13270a;
            } catch (Throwable th) {
                if (this.f14584m != null) {
                    this.f14585p.H(null);
                }
                Set<Map.Entry<T, Float>> entrySet2 = this.f14585p.q().entrySet();
                e<T> eVar2 = this.f14585p;
                Iterator<T> it2 = entrySet2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        t10 = it2.next();
                        if (Math.abs(((Number) ((Map.Entry) t10).getValue()).floatValue() - eVar2.A()) < 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            break;
                        }
                    } else {
                        t10 = null;
                        break;
                    }
                }
                Map.Entry entry2 = (Map.Entry) t10;
                if (entry2 != null) {
                    obj2 = entry2.getKey();
                }
                if (obj2 != null && this.f14585p.u().invoke(obj2).booleanValue()) {
                    this.f14585p.I(obj2);
                }
                throw th;
            }
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public static final class g implements u.l {

        /* renamed from: a */
        private final b f14592a;

        /* renamed from: b */
        final /* synthetic */ e<T> f14593b;

        /* compiled from: AnchoredDraggable.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {150}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        static final class a extends kotlin.coroutines.jvm.internal.l implements pc.q<f0.b, Map<T, ? extends Float>, Continuation<? super dc.w>, Object> {

            /* renamed from: f */
            int f14594f;

            /* renamed from: p */
            final /* synthetic */ pc.p<u.i, Continuation<? super dc.w>, Object> f14596p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(pc.p pVar, Continuation continuation) {
                super(3, continuation);
                g.this = r1;
                this.f14596p = pVar;
            }

            @Override // pc.q
            /* renamed from: a */
            public final Object invoke(f0.b bVar, Map<T, Float> map, Continuation<? super dc.w> continuation) {
                return new a(this.f14596p, continuation).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f14594f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    b bVar = g.this.f14592a;
                    pc.p<u.i, Continuation<? super dc.w>, Object> pVar = this.f14596p;
                    this.f14594f = 1;
                    if (pVar.invoke(bVar, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* compiled from: AnchoredDraggable.kt */
        /* loaded from: classes.dex */
        public static final class b implements u.i {

            /* renamed from: a */
            final /* synthetic */ e<T> f14597a;

            b(e<T> eVar) {
                this.f14597a = eVar;
            }

            @Override // u.i
            public void b(float f10) {
                f0.a.a(((e) this.f14597a).f14579q, this.f14597a.E(f10), 0.0f, 2, null);
            }
        }

        g(e<T> eVar) {
            this.f14593b = eVar;
            this.f14592a = new b(eVar);
        }

        @Override // u.l
        public Object a(t.b0 b0Var, pc.p<? super u.i, ? super Continuation<? super dc.w>, ? extends Object> pVar, Continuation<? super dc.w> continuation) {
            Object d10;
            Object k10 = this.f14593b.k(b0Var, new a(pVar, null), continuation);
            d10 = ic.d.d();
            if (k10 == d10) {
                return k10;
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public static final class h extends qc.r implements pc.a<Float> {

        /* renamed from: f */
        final /* synthetic */ e<T> f14598f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(e<T> eVar) {
            super(0);
            this.f14598f = eVar;
        }

        @Override // pc.a
        /* renamed from: a */
        public final Float invoke() {
            Float i10;
            float f10;
            i10 = f0.d.i(this.f14598f.q());
            if (i10 != null) {
                f10 = i10.floatValue();
            } else {
                f10 = Float.POSITIVE_INFINITY;
            }
            return Float.valueOf(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public static final class i extends qc.r implements pc.a<Float> {

        /* renamed from: f */
        final /* synthetic */ e<T> f14599f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(e<T> eVar) {
            super(0);
            this.f14599f = eVar;
        }

        @Override // pc.a
        /* renamed from: a */
        public final Float invoke() {
            Float j10;
            float f10;
            j10 = f0.d.j(this.f14599f.q());
            if (j10 != null) {
                f10 = j10.floatValue();
            } else {
                f10 = Float.NEGATIVE_INFINITY;
            }
            return Float.valueOf(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public static final class j extends qc.r implements pc.a<Float> {

        /* renamed from: f */
        final /* synthetic */ e<T> f14600f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(e<T> eVar) {
            super(0);
            this.f14600f = eVar;
        }

        @Override // pc.a
        /* renamed from: a */
        public final Float invoke() {
            float f10;
            float f11;
            Float f12 = this.f14600f.q().get(this.f14600f.v());
            float f13 = 0.0f;
            if (f12 != null) {
                f10 = f12.floatValue();
            } else {
                f10 = 0.0f;
            }
            Float f14 = this.f14600f.q().get(this.f14600f.t());
            if (f14 != null) {
                f11 = f14.floatValue();
            } else {
                f11 = 0.0f;
            }
            float f15 = f11 - f10;
            if (Math.abs(f15) > 1.0E-6f) {
                float F = (this.f14600f.F() - f10) / f15;
                if (F >= 1.0E-6f) {
                    if (F <= 0.999999f) {
                        f13 = F;
                    }
                }
                return Float.valueOf(f13);
            }
            f13 = 1.0f;
            return Float.valueOf(f13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public static final class k extends qc.r implements pc.a<T> {

        /* renamed from: f */
        final /* synthetic */ e<T> f14601f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(e<T> eVar) {
            super(0);
            this.f14601f = eVar;
        }

        @Override // pc.a
        public final T invoke() {
            T t10 = (T) this.f14601f.s();
            if (t10 == null) {
                e<T> eVar = this.f14601f;
                float A = eVar.A();
                if (!Float.isNaN(A)) {
                    return (T) eVar.m(A, eVar.v(), 0.0f);
                }
                return eVar.v();
            }
            return t10;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public static final class l extends qc.r implements pc.a<dc.w> {

        /* renamed from: f */
        final /* synthetic */ e<T> f14602f;

        /* renamed from: m */
        final /* synthetic */ T f14603m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(e<T> eVar, T t10) {
            super(0);
            this.f14602f = eVar;
            this.f14603m = t10;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            f0.b bVar = ((e) this.f14602f).f14579q;
            e<T> eVar = this.f14602f;
            T t10 = this.f14603m;
            Float f10 = eVar.q().get(t10);
            if (f10 != null) {
                f0.a.a(bVar, f10.floatValue(), 0.0f, 2, null);
                eVar.H(null);
            }
            eVar.I(t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(T t10, pc.l<? super Float, Float> lVar, pc.a<Float> aVar, s.j<Float> jVar, pc.l<? super T, Boolean> lVar2) {
        j0.j1 e10;
        j0.j1 e11;
        j0.j1 e12;
        Map h10;
        j0.j1 e13;
        qc.q.i(lVar, "positionalThreshold");
        qc.q.i(aVar, "velocityThreshold");
        qc.q.i(jVar, "animationSpec");
        qc.q.i(lVar2, "confirmValueChange");
        this.f14563a = lVar;
        this.f14564b = aVar;
        this.f14565c = jVar;
        this.f14566d = lVar2;
        this.f14567e = new p0();
        this.f14568f = new g(this);
        e10 = d3.e(t10, null, 2, null);
        this.f14569g = e10;
        this.f14570h = y2.d(new k(this));
        this.f14571i = y2.d(new C0347e(this));
        e11 = d3.e(Float.valueOf(Float.NaN), null, 2, null);
        this.f14572j = e11;
        this.f14573k = y2.c(y2.o(), new j(this));
        this.f14574l = j0.q1.a(0.0f);
        this.f14575m = y2.d(new i(this));
        this.f14576n = y2.d(new h(this));
        e12 = d3.e(null, null, 2, null);
        this.f14577o = e12;
        h10 = ec.n0.h();
        e13 = d3.e(h10, null, 2, null);
        this.f14578p = e13;
        this.f14579q = new d(this);
    }

    public final void H(T t10) {
        this.f14577o.setValue(t10);
    }

    public final void I(T t10) {
        this.f14569g.setValue(t10);
    }

    public final void J(float f10) {
        this.f14574l.h(f10);
    }

    public final void K(float f10) {
        this.f14572j.setValue(Float.valueOf(f10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void O(e eVar, Map map, b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        eVar.N(map, bVar);
    }

    public static /* synthetic */ Object l(e eVar, Object obj, t.b0 b0Var, pc.q qVar, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            b0Var = t.b0.Default;
        }
        return eVar.j(obj, b0Var, qVar, continuation);
    }

    public final T m(float f10, T t10, float f11) {
        Object h10;
        Object i10;
        Object i11;
        Object h11;
        Object h12;
        Map<T, Float> q10 = q();
        Float f12 = q10.get(t10);
        float floatValue = this.f14564b.invoke().floatValue();
        if (!qc.q.c(f12, f10) && f12 != null) {
            if (f12.floatValue() < f10) {
                if (f11 >= floatValue) {
                    h12 = f0.d.h(q10, f10, true);
                    return (T) h12;
                }
                h10 = f0.d.h(q10, f10, true);
                i11 = ec.n0.i(q10, h10);
                if (f10 < Math.abs(f12.floatValue() + Math.abs(this.f14563a.invoke(Float.valueOf(Math.abs(((Number) i11).floatValue() - f12.floatValue()))).floatValue()))) {
                    return t10;
                }
            } else if (f11 <= (-floatValue)) {
                h11 = f0.d.h(q10, f10, false);
                return (T) h11;
            } else {
                h10 = f0.d.h(q10, f10, false);
                float floatValue2 = f12.floatValue();
                i10 = ec.n0.i(q10, h10);
                float abs = Math.abs(f12.floatValue() - Math.abs(this.f14563a.invoke(Float.valueOf(Math.abs(floatValue2 - ((Number) i10).floatValue()))).floatValue()));
                if (f10 < 0.0f) {
                    if (Math.abs(f10) < abs) {
                        return t10;
                    }
                } else if (f10 > abs) {
                    return t10;
                }
            }
            return (T) h10;
        }
        return t10;
    }

    public final T n(float f10, T t10) {
        Object h10;
        Object h11;
        Map<T, Float> q10 = q();
        Float f11 = q10.get(t10);
        if (!qc.q.c(f11, f10) && f11 != null) {
            if (f11.floatValue() < f10) {
                h11 = f0.d.h(q10, f10, true);
                return (T) h11;
            }
            h10 = f0.d.h(q10, f10, false);
            return (T) h10;
        }
        return t10;
    }

    private final Object p(T t10, t.b0 b0Var, pc.q<? super f0.b, ? super Map<T, Float>, ? super Continuation<? super dc.w>, ? extends Object> qVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object e10 = ad.l0.e(new f(t10, this, b0Var, qVar, null), continuation);
        d10 = ic.d.d();
        if (e10 == d10) {
            return e10;
        }
        return dc.w.f13270a;
    }

    public final T s() {
        return this.f14577o.getValue();
    }

    public final float A() {
        return ((Number) this.f14572j.getValue()).floatValue();
    }

    public final T B() {
        return (T) this.f14570h.getValue();
    }

    public final boolean C(T t10) {
        return q().containsKey(t10);
    }

    public final boolean D() {
        if (s() != null) {
            return true;
        }
        return false;
    }

    public final float E(float f10) {
        float A;
        float k10;
        if (Float.isNaN(A())) {
            A = 0.0f;
        } else {
            A = A();
        }
        k10 = vc.l.k(A + f10, z(), y());
        return k10;
    }

    public final float F() {
        if ((!Float.isNaN(A())) != false) {
            return A();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final void G(Map<T, Float> map) {
        qc.q.i(map, "<set-?>");
        this.f14578p.setValue(map);
    }

    public final Object L(float f10, Continuation<? super dc.w> continuation) {
        Object d10;
        Object d11;
        T v10 = v();
        T m10 = m(F(), v10, f10);
        if (this.f14566d.invoke(m10).booleanValue()) {
            Object f11 = f0.d.f(this, m10, f10, continuation);
            d11 = ic.d.d();
            if (f11 == d11) {
                return f11;
            }
            return dc.w.f13270a;
        }
        Object f12 = f0.d.f(this, v10, f10, continuation);
        d10 = ic.d.d();
        if (f12 == d10) {
            return f12;
        }
        return dc.w.f13270a;
    }

    public final boolean M(T t10) {
        return this.f14567e.e(new l(this, t10));
    }

    public final void N(Map<T, Float> map, b<T> bVar) {
        boolean z10;
        qc.q.i(map, "newAnchors");
        if (!qc.q.d(q(), map)) {
            Map<T, Float> q10 = q();
            T B = B();
            boolean isEmpty = q().isEmpty();
            G(map);
            if (q().get(v()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEmpty && z10) {
                M(v());
            } else if (bVar != null) {
                bVar.a(B, q10, map);
            }
        }
    }

    public final Object j(T t10, t.b0 b0Var, pc.q<? super f0.b, ? super Map<T, Float>, ? super Continuation<? super dc.w>, ? extends Object> qVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object p10 = p(t10, b0Var, qVar, continuation);
        d10 = ic.d.d();
        if (p10 == d10) {
            return p10;
        }
        return dc.w.f13270a;
    }

    public final Object k(t.b0 b0Var, pc.q<? super f0.b, ? super Map<T, Float>, ? super Continuation<? super dc.w>, ? extends Object> qVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object p10 = p(null, b0Var, qVar, continuation);
        d10 = ic.d.d();
        if (p10 == d10) {
            return p10;
        }
        return dc.w.f13270a;
    }

    public final float o(float f10) {
        float A;
        float E = E(f10);
        if (Float.isNaN(A())) {
            A = 0.0f;
        } else {
            A = A();
        }
        K(E);
        return E - A;
    }

    public final Map<T, Float> q() {
        return (Map) this.f14578p.getValue();
    }

    public final s.j<Float> r() {
        return this.f14565c;
    }

    public final T t() {
        return (T) this.f14571i.getValue();
    }

    public final pc.l<T, Boolean> u() {
        return this.f14566d;
    }

    public final T v() {
        return this.f14569g.getValue();
    }

    public final u.l w() {
        return this.f14568f;
    }

    public final float x() {
        return this.f14574l.b();
    }

    public final float y() {
        return ((Number) this.f14576n.getValue()).floatValue();
    }

    public final float z() {
        return ((Number) this.f14575m.getValue()).floatValue();
    }

    public /* synthetic */ e(Object obj, pc.l lVar, pc.a aVar, s.j jVar, pc.l lVar2, int i10, qc.h hVar) {
        this(obj, lVar, aVar, (i10 & 8) != 0 ? f0.c.f14464a.a() : jVar, (i10 & 16) != 0 ? a.f14580f : lVar2);
    }
}
