package y;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j0.d3;
import j0.g2;
import j0.j1;
import j0.z1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s0.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazySaveableStateHolder.kt */
/* loaded from: classes.dex */
public final class e0 implements s0.f, s0.c {

    /* renamed from: d  reason: collision with root package name */
    public static final b f26055d = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final s0.f f26056a;

    /* renamed from: b  reason: collision with root package name */
    private final j1 f26057b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Object> f26058c;

    /* compiled from: LazySaveableStateHolder.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<Object, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s0.f f26059f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s0.f fVar) {
            super(1);
            this.f26059f = fVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.l
        public final Boolean invoke(Object obj) {
            qc.q.i(obj, "it");
            s0.f fVar = this.f26059f;
            return Boolean.valueOf(fVar != null ? fVar.a(obj) : true);
        }
    }

    /* compiled from: LazySaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* compiled from: LazySaveableStateHolder.kt */
        /* loaded from: classes.dex */
        static final class a extends qc.r implements pc.p<s0.k, e0, Map<String, ? extends List<? extends Object>>> {

            /* renamed from: f  reason: collision with root package name */
            public static final a f26060f = new a();

            a() {
                super(2);
            }

            @Override // pc.p
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final Map<String, List<Object>> invoke(s0.k kVar, e0 e0Var) {
                qc.q.i(kVar, "$this$Saver");
                qc.q.i(e0Var, "it");
                Map<String, List<Object>> b10 = e0Var.b();
                if (b10.isEmpty()) {
                    return null;
                }
                return b10;
            }
        }

        /* compiled from: LazySaveableStateHolder.kt */
        /* renamed from: y.e0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0596b extends qc.r implements pc.l<Map<String, ? extends List<? extends Object>>, e0> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ s0.f f26061f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0596b(s0.f fVar) {
                super(1);
                this.f26061f = fVar;
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final e0 invoke(Map<String, ? extends List<? extends Object>> map) {
                qc.q.i(map, "restored");
                return new e0(this.f26061f, map);
            }
        }

        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }

        public final s0.i<e0, Map<String, List<Object>>> a(s0.f fVar) {
            return s0.j.a(a.f26060f, new C0596b(fVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazySaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<j0.f0, j0.e0> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f26063m;

        /* compiled from: Effects.kt */
        /* loaded from: classes.dex */
        public static final class a implements j0.e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e0 f26064a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f26065b;

            public a(e0 e0Var, Object obj) {
                this.f26064a = e0Var;
                this.f26065b = obj;
            }

            @Override // j0.e0
            public void dispose() {
                this.f26064a.f26058c.add(this.f26065b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj) {
            super(1);
            this.f26063m = obj;
        }

        @Override // pc.l
        public final j0.e0 invoke(j0.f0 f0Var) {
            qc.q.i(f0Var, "$this$DisposableEffect");
            e0.this.f26058c.remove(this.f26063m);
            return new a(e0.this, this.f26063m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazySaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f26067m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f26068p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f26069q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Object obj, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
            super(2);
            this.f26067m = obj;
            this.f26068p = pVar;
            this.f26069q = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            e0.this.e(this.f26067m, this.f26068p, lVar, z1.a(this.f26069q | 1));
        }
    }

    public e0(s0.f fVar) {
        j1 e10;
        qc.q.i(fVar, "wrappedRegistry");
        this.f26056a = fVar;
        e10 = d3.e(null, null, 2, null);
        this.f26057b = e10;
        this.f26058c = new LinkedHashSet();
    }

    @Override // s0.f
    public boolean a(Object obj) {
        qc.q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return this.f26056a.a(obj);
    }

    @Override // s0.f
    public Map<String, List<Object>> b() {
        s0.c h10 = h();
        if (h10 != null) {
            Iterator<T> it = this.f26058c.iterator();
            while (it.hasNext()) {
                h10.f(it.next());
            }
        }
        return this.f26056a.b();
    }

    @Override // s0.f
    public Object c(String str) {
        qc.q.i(str, "key");
        return this.f26056a.c(str);
    }

    @Override // s0.f
    public f.a d(String str, pc.a<? extends Object> aVar) {
        qc.q.i(str, "key");
        qc.q.i(aVar, "valueProvider");
        return this.f26056a.d(str, aVar);
    }

    @Override // s0.c
    public void e(Object obj, pc.p<? super j0.l, ? super Integer, dc.w> pVar, j0.l lVar, int i10) {
        qc.q.i(obj, "key");
        qc.q.i(pVar, "content");
        j0.l q10 = lVar.q(-697180401);
        if (j0.n.K()) {
            j0.n.V(-697180401, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)");
        }
        s0.c h10 = h();
        if (h10 != null) {
            h10.e(obj, pVar, q10, (i10 & 112) | 520);
            j0.h0.b(obj, new c(obj), q10, 8);
            if (j0.n.K()) {
                j0.n.U();
            }
            g2 w10 = q10.w();
            if (w10 != null) {
                w10.a(new d(obj, pVar, i10));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // s0.c
    public void f(Object obj) {
        qc.q.i(obj, "key");
        s0.c h10 = h();
        if (h10 != null) {
            h10.f(obj);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final s0.c h() {
        return (s0.c) this.f26057b.getValue();
    }

    public final void i(s0.c cVar) {
        this.f26057b.setValue(cVar);
    }

    public e0(s0.f fVar, Map<String, ? extends List<? extends Object>> map) {
        this(s0.h.a(map, new a(fVar)));
    }
}
