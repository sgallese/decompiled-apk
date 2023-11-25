package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.e;
import dc.w;
import f0.e1;
import f0.m0;
import j0.f;
import j0.g1;
import j0.i2;
import j0.l;
import j0.l3;
import j0.n;
import j0.o2;
import j0.v;
import java.util.Arrays;
import n1.i0;
import n1.x;
import p1.g;
import pc.p;
import pc.q;
import qc.r;
import w.s;

/* compiled from: PreviewActivity.kt */
/* loaded from: classes.dex */
public final class PreviewActivity extends ComponentActivity {

    /* renamed from: f  reason: collision with root package name */
    private final String f3012f = "PreviewActivity";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreviewActivity.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements p<l, Integer, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f3013f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f3014m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(2);
            this.f3013f = str;
            this.f3014m = str2;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (n.K()) {
                n.V(-161032931, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.kt:75)");
            }
            h2.a.f16444a.g(this.f3013f, this.f3014m, lVar, new Object[0]);
            if (n.K()) {
                n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreviewActivity.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements p<l, Integer, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object[] f3015f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f3016m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f3017p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PreviewActivity.kt */
        /* loaded from: classes.dex */
        public static final class a extends r implements p<l, Integer, w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g1 f3018f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ Object[] f3019m;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PreviewActivity.kt */
            /* renamed from: androidx.compose.ui.tooling.PreviewActivity$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0046a extends r implements pc.a<w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ g1 f3020f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ Object[] f3021m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0046a(g1 g1Var, Object[] objArr) {
                    super(0);
                    this.f3020f = g1Var;
                    this.f3021m = objArr;
                }

                @Override // pc.a
                public /* bridge */ /* synthetic */ w invoke() {
                    invoke2();
                    return w.f13270a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    g1 g1Var = this.f3020f;
                    g1Var.i((g1Var.d() + 1) % this.f3021m.length);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g1 g1Var, Object[] objArr) {
                super(2);
                this.f3018f = g1Var;
                this.f3019m = objArr;
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
                invoke(lVar, num.intValue());
                return w.f13270a;
            }

            public final void invoke(l lVar, int i10) {
                if ((i10 & 11) == 2 && lVar.t()) {
                    lVar.z();
                    return;
                }
                if (n.K()) {
                    n.V(2137630662, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.kt:122)");
                }
                m0.a(h2.b.f16445a.a(), new C0046a(this.f3018f, this.f3019m), null, null, null, null, 0L, 0L, null, lVar, 6, 508);
                if (n.K()) {
                    n.U();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PreviewActivity.kt */
        /* renamed from: androidx.compose.ui.tooling.PreviewActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0047b extends r implements q<s, l, Integer, w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f3022f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ String f3023m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ Object[] f3024p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ g1 f3025q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0047b(String str, String str2, Object[] objArr, g1 g1Var) {
                super(3);
                this.f3022f = str;
                this.f3023m = str2;
                this.f3024p = objArr;
                this.f3025q = g1Var;
            }

            @Override // pc.q
            public /* bridge */ /* synthetic */ w invoke(s sVar, l lVar, Integer num) {
                invoke(sVar, lVar, num.intValue());
                return w.f13270a;
            }

            public final void invoke(s sVar, l lVar, int i10) {
                int i11;
                qc.q.i(sVar, "padding");
                if ((i10 & 14) == 0) {
                    i11 = (lVar.Q(sVar) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 91) == 18 && lVar.t()) {
                    lVar.z();
                    return;
                }
                if (n.K()) {
                    n.V(-1578412612, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.kt:112)");
                }
                e h10 = j.h(e.f2335a, sVar);
                String str = this.f3022f;
                String str2 = this.f3023m;
                Object[] objArr = this.f3024p;
                g1 g1Var = this.f3025q;
                lVar.e(733328855);
                i0 h11 = d.h(v0.b.f24258a.n(), false, lVar, 0);
                lVar.e(-1323940314);
                int a10 = j0.j.a(lVar, 0);
                v F = lVar.F();
                g.a aVar = g.f20790l;
                pc.a<g> a11 = aVar.a();
                q<i2<g>, l, Integer, w> a12 = x.a(h10);
                if (!(lVar.u() instanceof f)) {
                    j0.j.c();
                }
                lVar.s();
                if (lVar.n()) {
                    lVar.B(a11);
                } else {
                    lVar.H();
                }
                l a13 = l3.a(lVar);
                l3.b(a13, h11, aVar.e());
                l3.b(a13, F, aVar.g());
                p<g, Integer, w> b10 = aVar.b();
                if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
                    a13.J(Integer.valueOf(a10));
                    a13.I(Integer.valueOf(a10), b10);
                }
                a12.invoke(i2.a(i2.b(lVar)), lVar, 0);
                lVar.e(2058660585);
                androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2083a;
                h2.a.f16444a.g(str, str2, lVar, objArr[g1Var.d()]);
                lVar.N();
                lVar.O();
                lVar.N();
                lVar.N();
                if (n.K()) {
                    n.U();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object[] objArr, String str, String str2) {
            super(2);
            this.f3015f = objArr;
            this.f3016m = str;
            this.f3017p = str2;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (n.K()) {
                n.V(-1735847170, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.kt:108)");
            }
            lVar.e(-492369756);
            Object f10 = lVar.f();
            if (f10 == l.f18688a.a()) {
                f10 = o2.a(0);
                lVar.J(f10);
            }
            lVar.N();
            g1 g1Var = (g1) f10;
            e1.a(null, null, null, null, null, q0.c.b(lVar, 2137630662, true, new a(g1Var, this.f3015f)), 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, q0.c.b(lVar, -1578412612, true, new C0047b(this.f3016m, this.f3017p, this.f3015f, g1Var)), lVar, 196608, 12582912, 131039);
            if (n.K()) {
                n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreviewActivity.kt */
    /* loaded from: classes.dex */
    public static final class c extends r implements p<l, Integer, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f3026f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f3027m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Object[] f3028p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, Object[] objArr) {
            super(2);
            this.f3026f = str;
            this.f3027m = str2;
            this.f3028p = objArr;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (n.K()) {
                n.V(1507674311, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.kt:133)");
            }
            h2.a aVar = h2.a.f16444a;
            String str = this.f3026f;
            String str2 = this.f3027m;
            Object[] objArr = this.f3028p;
            aVar.g(str, str2, lVar, Arrays.copyOf(objArr, objArr.length));
            if (n.K()) {
                n.U();
            }
        }
    }

    private final void d(String str) {
        String R0;
        String K0;
        Log.d(this.f3012f, "PreviewActivity has composable " + str);
        R0 = yc.w.R0(str, '.', null, 2, null);
        K0 = yc.w.K0(str, '.', null, 2, null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            e(R0, K0, stringExtra);
            return;
        }
        Log.d(this.f3012f, "Previewing '" + K0 + "' without a parameter provider.");
        d.b.b(this, null, q0.c.c(-161032931, true, new a(R0, K0)), 1, null);
    }

    private final void e(String str, String str2, String str3) {
        Log.d(this.f3012f, "Previewing '" + str2 + "' with parameter provider: '" + str3 + '\'');
        Object[] b10 = h2.d.b(h2.d.a(str3), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (b10.length > 1) {
            d.b.b(this, null, q0.c.c(-1735847170, true, new b(b10, str, str2)), 1, null);
        } else {
            d.b.b(this, null, q0.c.c(1507674311, true, new c(str, str2, b10)), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.f3012f, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("composable")) != null) {
            d(stringExtra);
        }
    }
}
