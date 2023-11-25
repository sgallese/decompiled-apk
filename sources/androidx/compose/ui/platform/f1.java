package androidx.compose.ui.platform;

import a1.p1;
import a2.x;
import a2.y;
import android.os.Parcel;
import android.util.Base64;
import j2.s;
import j2.u;

/* compiled from: AndroidClipboardManager.android.kt */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    private Parcel f2673a;

    public f1() {
        Parcel obtain = Parcel.obtain();
        qc.q.h(obtain, "obtain()");
        this.f2673a = obtain;
    }

    public final void a(byte b10) {
        this.f2673a.writeByte(b10);
    }

    public final void b(float f10) {
        this.f2673a.writeFloat(f10);
    }

    public final void c(int i10) {
        this.f2673a.writeInt(i10);
    }

    public final void d(a1.o4 o4Var) {
        qc.q.i(o4Var, "shadow");
        m(o4Var.c());
        b(z0.f.o(o4Var.d()));
        b(z0.f.p(o4Var.d()));
        b(o4Var.b());
    }

    public final void e(a2.c0 c0Var) {
        qc.q.i(c0Var, "fontWeight");
        c(c0Var.v());
    }

    public final void f(g2.k kVar) {
        qc.q.i(kVar, "textDecoration");
        c(kVar.e());
    }

    public final void g(g2.p pVar) {
        qc.q.i(pVar, "textGeometricTransform");
        b(pVar.b());
        b(pVar.c());
    }

    public final void h(String str) {
        qc.q.i(str, "string");
        this.f2673a.writeString(str);
    }

    public final void i(v1.b0 b0Var) {
        qc.q.i(b0Var, "spanStyle");
        long g10 = b0Var.g();
        p1.a aVar = a1.p1.f146b;
        if (!a1.p1.q(g10, aVar.e())) {
            a((byte) 1);
            m(b0Var.g());
        }
        long k10 = b0Var.k();
        s.a aVar2 = j2.s.f19004b;
        if (!j2.s.e(k10, aVar2.a())) {
            a((byte) 2);
            j(b0Var.k());
        }
        a2.c0 n10 = b0Var.n();
        if (n10 != null) {
            a((byte) 3);
            e(n10);
        }
        a2.x l10 = b0Var.l();
        if (l10 != null) {
            int i10 = l10.i();
            a((byte) 4);
            o(i10);
        }
        a2.y m10 = b0Var.m();
        if (m10 != null) {
            int m11 = m10.m();
            a((byte) 5);
            l(m11);
        }
        String j10 = b0Var.j();
        if (j10 != null) {
            a((byte) 6);
            h(j10);
        }
        if (!j2.s.e(b0Var.o(), aVar2.a())) {
            a((byte) 7);
            j(b0Var.o());
        }
        g2.a e10 = b0Var.e();
        if (e10 != null) {
            float h10 = e10.h();
            a((byte) 8);
            k(h10);
        }
        g2.p u10 = b0Var.u();
        if (u10 != null) {
            a((byte) 9);
            g(u10);
        }
        if (!a1.p1.q(b0Var.d(), aVar.e())) {
            a((byte) 10);
            m(b0Var.d());
        }
        g2.k s10 = b0Var.s();
        if (s10 != null) {
            a((byte) 11);
            f(s10);
        }
        a1.o4 r10 = b0Var.r();
        if (r10 != null) {
            a((byte) 12);
            d(r10);
        }
    }

    public final void j(long j10) {
        long g10 = j2.s.g(j10);
        u.a aVar = j2.u.f19008b;
        byte b10 = 0;
        if (!j2.u.g(g10, aVar.c())) {
            if (j2.u.g(g10, aVar.b())) {
                b10 = 1;
            } else if (j2.u.g(g10, aVar.a())) {
                b10 = 2;
            }
        }
        a(b10);
        if (!j2.u.g(j2.s.g(j10), aVar.c())) {
            b(j2.s.h(j10));
        }
    }

    public final void k(float f10) {
        b(f10);
    }

    public final void l(int i10) {
        y.a aVar = a2.y.f348b;
        byte b10 = 0;
        if (!a2.y.h(i10, aVar.b())) {
            if (a2.y.h(i10, aVar.a())) {
                b10 = 1;
            } else if (a2.y.h(i10, aVar.d())) {
                b10 = 2;
            } else if (a2.y.h(i10, aVar.c())) {
                b10 = 3;
            }
        }
        a(b10);
    }

    public final void m(long j10) {
        n(j10);
    }

    public final void n(long j10) {
        this.f2673a.writeLong(j10);
    }

    public final void o(int i10) {
        x.a aVar = a2.x.f339b;
        byte b10 = 0;
        if (!a2.x.f(i10, aVar.b()) && a2.x.f(i10, aVar.a())) {
            b10 = 1;
        }
        a(b10);
    }

    public final String p() {
        String encodeToString = Base64.encodeToString(this.f2673a.marshall(), 0);
        qc.q.h(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return encodeToString;
    }

    public final void q() {
        this.f2673a.recycle();
        Parcel obtain = Parcel.obtain();
        qc.q.h(obtain, "obtain()");
        this.f2673a = obtain;
    }
}
