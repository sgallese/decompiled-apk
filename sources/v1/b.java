package v1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import g2.e;
import g2.f;
import g2.j;
import w1.n1;

/* compiled from: AndroidParagraph.android.kt */
/* loaded from: classes.dex */
public final class b {
    public static final /* synthetic */ CharSequence a(CharSequence charSequence) {
        return i(charSequence);
    }

    public static final /* synthetic */ int b(n1 n1Var, int i10) {
        return j(n1Var, i10);
    }

    public static final /* synthetic */ boolean c(k0 k0Var, boolean z10) {
        return k(k0Var, z10);
    }

    public static final /* synthetic */ int d(g2.j jVar) {
        return l(jVar);
    }

    public static final /* synthetic */ int e(f.b bVar) {
        return m(bVar);
    }

    public static final /* synthetic */ int f(g2.e eVar) {
        return n(eVar);
    }

    public static final /* synthetic */ int g(f.c cVar) {
        return o(cVar);
    }

    public static final /* synthetic */ int h(f.d dVar) {
        return p(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(CharSequence charSequence) {
        boolean z10;
        Spannable spannableString;
        if (charSequence.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        e2.g.t(spannableString, new y1.c(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(n1 n1Var, int i10) {
        int k10 = n1Var.k();
        for (int i11 = 0; i11 < k10; i11++) {
            if (n1Var.j(i11) > i10) {
                return i11;
            }
        }
        return n1Var.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(k0 k0Var, boolean z10) {
        boolean j10;
        boolean j11;
        if (!z10 || j2.s.e(k0Var.q(), j2.t.g(0)) || j2.s.e(k0Var.q(), j2.s.f19004b.a()) || k0Var.z() == null) {
            return false;
        }
        g2.j z11 = k0Var.z();
        j.a aVar = g2.j.f16057b;
        int f10 = aVar.f();
        if (z11 == null) {
            j10 = false;
        } else {
            j10 = g2.j.j(z11.m(), f10);
        }
        if (j10) {
            return false;
        }
        g2.j z12 = k0Var.z();
        int c10 = aVar.c();
        if (z12 == null) {
            j11 = false;
        } else {
            j11 = g2.j.j(z12.m(), c10);
        }
        if (j11) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(g2.j jVar) {
        boolean j10;
        boolean j11;
        boolean j12;
        boolean j13;
        boolean j14;
        j.a aVar = g2.j.f16057b;
        int d10 = aVar.d();
        if (jVar == null) {
            j10 = false;
        } else {
            j10 = g2.j.j(jVar.m(), d10);
        }
        if (j10) {
            return 3;
        }
        int e10 = aVar.e();
        if (jVar == null) {
            j11 = false;
        } else {
            j11 = g2.j.j(jVar.m(), e10);
        }
        if (j11) {
            return 4;
        }
        int a10 = aVar.a();
        if (jVar == null) {
            j12 = false;
        } else {
            j12 = g2.j.j(jVar.m(), a10);
        }
        if (j12) {
            return 2;
        }
        int f10 = aVar.f();
        if (jVar == null) {
            j13 = false;
        } else {
            j13 = g2.j.j(jVar.m(), f10);
        }
        if (j13) {
            return 0;
        }
        int b10 = aVar.b();
        if (jVar == null) {
            j14 = false;
        } else {
            j14 = g2.j.j(jVar.m(), b10);
        }
        if (!j14) {
            return 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(f.b bVar) {
        boolean g10;
        boolean g11;
        boolean g12;
        f.b.a aVar = f.b.f16028b;
        int c10 = aVar.c();
        if (bVar == null) {
            g10 = false;
        } else {
            g10 = f.b.g(bVar.j(), c10);
        }
        if (g10) {
            return 0;
        }
        int b10 = aVar.b();
        if (bVar == null) {
            g11 = false;
        } else {
            g11 = f.b.g(bVar.j(), b10);
        }
        if (g11) {
            return 1;
        }
        int a10 = aVar.a();
        if (bVar == null) {
            g12 = false;
        } else {
            g12 = f.b.g(bVar.j(), a10);
        }
        if (!g12) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(g2.e eVar) {
        boolean f10;
        e.a aVar = g2.e.f16019b;
        int a10 = aVar.a();
        if (eVar == null) {
            f10 = false;
        } else {
            f10 = g2.e.f(eVar.i(), a10);
        }
        if (f10) {
            if (Build.VERSION.SDK_INT <= 32) {
                return 2;
            }
            return 4;
        }
        int b10 = aVar.b();
        if (eVar == null) {
            return 0;
        }
        g2.e.f(eVar.i(), b10);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(f.c cVar) {
        boolean h10;
        boolean h11;
        boolean h12;
        boolean h13;
        f.c.a aVar = f.c.f16033b;
        int a10 = aVar.a();
        if (cVar == null) {
            h10 = false;
        } else {
            h10 = f.c.h(cVar.k(), a10);
        }
        if (h10) {
            return 0;
        }
        int b10 = aVar.b();
        if (cVar == null) {
            h11 = false;
        } else {
            h11 = f.c.h(cVar.k(), b10);
        }
        if (h11) {
            return 1;
        }
        int c10 = aVar.c();
        if (cVar == null) {
            h12 = false;
        } else {
            h12 = f.c.h(cVar.k(), c10);
        }
        if (h12) {
            return 2;
        }
        int d10 = aVar.d();
        if (cVar == null) {
            h13 = false;
        } else {
            h13 = f.c.h(cVar.k(), d10);
        }
        if (!h13) {
            return 0;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(f.d dVar) {
        boolean f10;
        boolean f11;
        f.d.a aVar = f.d.f16039b;
        int a10 = aVar.a();
        if (dVar == null) {
            f10 = false;
        } else {
            f10 = f.d.f(dVar.i(), a10);
        }
        if (f10) {
            return 0;
        }
        int b10 = aVar.b();
        if (dVar == null) {
            f11 = false;
        } else {
            f11 = f.d.f(dVar.i(), b10);
        }
        if (!f11) {
            return 0;
        }
        return 1;
    }
}
