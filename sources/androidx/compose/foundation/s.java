package androidx.compose.foundation;

import dc.w;
import j0.g1;
import j0.g3;
import j0.o2;
import j0.y2;
import kotlin.coroutines.Continuation;
import t.b0;
import u.u;
import u.x;
import u.y;

/* compiled from: Scroll.kt */
/* loaded from: classes.dex */
public final class s implements x {

    /* renamed from: i  reason: collision with root package name */
    public static final c f2225i = new c(null);

    /* renamed from: j  reason: collision with root package name */
    private static final s0.i<s, ?> f2226j = s0.j.a(a.f2235f, b.f2236f);

    /* renamed from: a  reason: collision with root package name */
    private final g1 f2227a;

    /* renamed from: e  reason: collision with root package name */
    private float f2231e;

    /* renamed from: b  reason: collision with root package name */
    private final g1 f2228b = o2.a(0);

    /* renamed from: c  reason: collision with root package name */
    private final v.m f2229c = v.l.a();

    /* renamed from: d  reason: collision with root package name */
    private g1 f2230d = o2.a(Integer.MAX_VALUE);

    /* renamed from: f  reason: collision with root package name */
    private final x f2232f = y.a(new f());

    /* renamed from: g  reason: collision with root package name */
    private final g3 f2233g = y2.d(new e());

    /* renamed from: h  reason: collision with root package name */
    private final g3 f2234h = y2.d(new d());

    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.p<s0.k, s, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f2235f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Integer invoke(s0.k kVar, s sVar) {
            qc.q.i(kVar, "$this$Saver");
            qc.q.i(sVar, "it");
            return Integer.valueOf(sVar.l());
        }
    }

    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<Integer, s> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f2236f = new b();

        b() {
            super(1);
        }

        public final s a(int i10) {
            return new s(i10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ s invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(qc.h hVar) {
            this();
        }

        public final s0.i<s, ?> a() {
            return s.f2226j;
        }
    }

    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.a<Boolean> {
        d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.valueOf(s.this.l() > 0);
        }
    }

    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.a<Boolean> {
        e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.valueOf(s.this.l() < s.this.k());
        }
    }

    /* compiled from: Scroll.kt */
    /* loaded from: classes.dex */
    static final class f extends qc.r implements pc.l<Float, Float> {
        f() {
            super(1);
        }

        public final Float a(float f10) {
            float k10;
            boolean z10;
            int d10;
            float l10 = s.this.l() + f10 + s.this.f2231e;
            k10 = vc.l.k(l10, 0.0f, s.this.k());
            if (l10 == k10) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = !z10;
            float l11 = k10 - s.this.l();
            d10 = sc.c.d(l11);
            s sVar = s.this;
            sVar.n(sVar.l() + d10);
            s.this.f2231e = l11 - d10;
            if (z11) {
                f10 = l11;
            }
            return Float.valueOf(f10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    public s(int i10) {
        this.f2227a = o2.a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(int i10) {
        this.f2227a.i(i10);
    }

    @Override // u.x
    public boolean a() {
        return ((Boolean) this.f2233g.getValue()).booleanValue();
    }

    @Override // u.x
    public boolean b() {
        return this.f2232f.b();
    }

    @Override // u.x
    public Object c(b0 b0Var, pc.p<? super u, ? super Continuation<? super w>, ? extends Object> pVar, Continuation<? super w> continuation) {
        Object d10;
        Object c10 = this.f2232f.c(b0Var, pVar, continuation);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return w.f13270a;
    }

    @Override // u.x
    public boolean d() {
        return ((Boolean) this.f2234h.getValue()).booleanValue();
    }

    @Override // u.x
    public float e(float f10) {
        return this.f2232f.e(f10);
    }

    public final v.m j() {
        return this.f2229c;
    }

    public final int k() {
        return this.f2230d.d();
    }

    public final int l() {
        return this.f2227a.d();
    }

    public final void m(int i10) {
        this.f2230d.i(i10);
        if (l() > i10) {
            n(i10);
        }
    }

    public final void o(int i10) {
        this.f2228b.i(i10);
    }
}
