package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import g2.k;
import java.util.List;

/* compiled from: AndroidClipboardManager.android.kt */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    private final Parcel f2610a;

    public a1(String str) {
        qc.q.i(str, "string");
        Parcel obtain = Parcel.obtain();
        qc.q.h(obtain, "obtain()");
        this.f2610a = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    private final int a() {
        return this.f2610a.dataAvail();
    }

    private final float b() {
        return g2.a.c(e());
    }

    private final byte c() {
        return this.f2610a.readByte();
    }

    private final float e() {
        return this.f2610a.readFloat();
    }

    private final int i() {
        return this.f2610a.readInt();
    }

    private final a1.o4 j() {
        return new a1.o4(d(), z0.g.a(e(), e()), e(), null);
    }

    private final String l() {
        return this.f2610a.readString();
    }

    private final g2.k m() {
        boolean z10;
        boolean z11;
        List<g2.k> l10;
        int i10 = i();
        k.a aVar = g2.k.f16065b;
        if ((aVar.b().e() & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & aVar.d().e()) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            l10 = ec.t.l(aVar.b(), aVar.d());
            return aVar.a(l10);
        } else if (z10) {
            return aVar.b();
        } else {
            if (z11) {
                return aVar.d();
            }
            return aVar.c();
        }
    }

    private final g2.p n() {
        return new g2.p(e(), e());
    }

    private final long p() {
        return dc.t.d(this.f2610a.readLong());
    }

    public final long d() {
        return a1.p1.l(p());
    }

    public final int f() {
        byte c10 = c();
        if (c10 == 0) {
            return a2.x.f339b.b();
        }
        if (c10 == 1) {
            return a2.x.f339b.a();
        }
        return a2.x.f339b.b();
    }

    public final int g() {
        byte c10 = c();
        if (c10 == 0) {
            return a2.y.f348b.b();
        }
        if (c10 == 1) {
            return a2.y.f348b.a();
        }
        if (c10 == 3) {
            return a2.y.f348b.c();
        }
        if (c10 == 2) {
            return a2.y.f348b.d();
        }
        return a2.y.f348b.b();
    }

    public final a2.c0 h() {
        return new a2.c0(i());
    }

    public final v1.b0 k() {
        t1 t1Var;
        t1 t1Var2 = r15;
        t1 t1Var3 = new t1(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f2610a.dataAvail() > 1) {
            byte c10 = c();
            if (c10 == 1) {
                if (a() < 8) {
                    break;
                }
                t1Var2.c(d());
            } else {
                t1Var = t1Var2;
                if (c10 == 2) {
                    if (a() < 5) {
                        break;
                    }
                    t1Var.e(o());
                    t1Var2 = t1Var;
                } else if (c10 == 3) {
                    if (a() < 4) {
                        break;
                    }
                    t1Var.h(h());
                    t1Var2 = t1Var;
                } else if (c10 == 4) {
                    if (a() < 1) {
                        break;
                    }
                    t1Var.f(a2.x.c(f()));
                    t1Var2 = t1Var;
                } else if (c10 == 5) {
                    if (a() < 1) {
                        break;
                    }
                    t1Var.g(a2.y.e(g()));
                    t1Var2 = t1Var;
                } else {
                    if (c10 == 6) {
                        t1Var.d(l());
                    } else if (c10 == 7) {
                        if (a() < 5) {
                            break;
                        }
                        t1Var.i(o());
                    } else if (c10 == 8) {
                        if (a() < 4) {
                            break;
                        }
                        t1Var.b(g2.a.b(b()));
                    } else if (c10 == 9) {
                        if (a() < 8) {
                            break;
                        }
                        t1Var.l(n());
                    } else if (c10 == 10) {
                        if (a() < 8) {
                            break;
                        }
                        t1Var.a(d());
                    } else if (c10 == 11) {
                        if (a() < 4) {
                            break;
                        }
                        t1Var.k(m());
                    } else if (c10 == 12) {
                        if (a() < 20) {
                            break;
                        }
                        t1Var.j(j());
                    }
                    t1Var2 = t1Var;
                }
            }
        }
        t1Var = t1Var2;
        return t1Var.m();
    }

    public final long o() {
        long c10;
        byte c11 = c();
        if (c11 == 1) {
            c10 = j2.u.f19008b.b();
        } else if (c11 == 2) {
            c10 = j2.u.f19008b.a();
        } else {
            c10 = j2.u.f19008b.c();
        }
        if (j2.u.g(c10, j2.u.f19008b.c())) {
            return j2.s.f19004b.a();
        }
        return j2.t.a(e(), c10);
    }
}
