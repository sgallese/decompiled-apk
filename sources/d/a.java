package d;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.m;
import androidx.activity.o;
import androidx.compose.ui.platform.j0;
import androidx.lifecycle.v;
import dc.w;
import j0.e0;
import j0.f0;
import j0.g2;
import j0.g3;
import j0.h0;
import j0.l;
import j0.y2;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: BackHandler.kt */
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BackHandler.kt */
    /* renamed from: d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0298a extends r implements pc.a<w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f12954f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f12955m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0298a(d dVar, boolean z10) {
            super(0);
            this.f12954f = dVar;
            this.f12955m = z10;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f12954f.f(this.f12955m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BackHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements l<f0, e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f12956f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v f12957m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ d f12958p;

        /* compiled from: Effects.kt */
        /* renamed from: d.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0299a implements e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f12959a;

            public C0299a(d dVar) {
                this.f12959a = dVar;
            }

            @Override // j0.e0
            public void dispose() {
                this.f12959a.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(OnBackPressedDispatcher onBackPressedDispatcher, v vVar, d dVar) {
            super(1);
            this.f12956f = onBackPressedDispatcher;
            this.f12957m = vVar;
            this.f12958p = dVar;
        }

        @Override // pc.l
        public final e0 invoke(f0 f0Var) {
            q.i(f0Var, "$this$DisposableEffect");
            this.f12956f.b(this.f12957m, this.f12958p);
            return new C0299a(this.f12958p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BackHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends r implements p<j0.l, Integer, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f12960f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.a<w> f12961m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f12962p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f12963q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, pc.a<w> aVar, int i10, int i11) {
            super(2);
            this.f12960f = z10;
            this.f12961m = aVar;
            this.f12962p = i10;
            this.f12963q = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            a.a(this.f12960f, this.f12961m, lVar, this.f12962p | 1, this.f12963q);
        }
    }

    /* compiled from: BackHandler.kt */
    /* loaded from: classes.dex */
    public static final class d extends m {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g3<pc.a<w>> f12964d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(boolean z10, g3<? extends pc.a<w>> g3Var) {
            super(z10);
            this.f12964d = g3Var;
        }

        @Override // androidx.activity.m
        public void b() {
            a.b(this.f12964d).invoke();
        }
    }

    public static final void a(boolean z10, pc.a<w> aVar, j0.l lVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        q.i(aVar, "onBack");
        j0.l q10 = lVar.q(-361453782);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (q10.c(z10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (q10.Q(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 91) == 18 && q10.t()) {
            q10.z();
        } else {
            if (i15 != 0) {
                z10 = true;
            }
            g3 m10 = y2.m(aVar, q10, (i12 >> 3) & 14);
            q10.e(-3687241);
            Object f10 = q10.f();
            l.a aVar2 = j0.l.f18688a;
            if (f10 == aVar2.a()) {
                f10 = new d(z10, m10);
                q10.J(f10);
            }
            q10.N();
            d dVar = (d) f10;
            Boolean valueOf = Boolean.valueOf(z10);
            q10.e(-3686552);
            boolean Q = q10.Q(valueOf) | q10.Q(dVar);
            Object f11 = q10.f();
            if (Q || f11 == aVar2.a()) {
                f11 = new C0298a(dVar, z10);
                q10.J(f11);
            }
            q10.N();
            h0.f((pc.a) f11, q10, 0);
            o a10 = d.c.f12966a.a(q10, 6);
            if (a10 != null) {
                OnBackPressedDispatcher onBackPressedDispatcher = a10.getOnBackPressedDispatcher();
                v vVar = (v) q10.C(j0.i());
                h0.a(vVar, onBackPressedDispatcher, new b(onBackPressedDispatcher, vVar, dVar), q10, 72);
            } else {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new c(z10, aVar, i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pc.a<w> b(g3<? extends pc.a<w>> g3Var) {
        return g3Var.getValue();
    }
}
