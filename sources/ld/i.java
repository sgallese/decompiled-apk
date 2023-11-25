package ld;

import ec.b0;
import ec.y;
import java.util.ArrayList;
import okio.f;
import okio.r0;
import qc.q;

/* compiled from: -Path.kt */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a */
    private static final okio.f f19682a;

    /* renamed from: b */
    private static final okio.f f19683b;

    /* renamed from: c */
    private static final okio.f f19684c;

    /* renamed from: d */
    private static final okio.f f19685d;

    /* renamed from: e */
    private static final okio.f f19686e;

    static {
        f.a aVar = okio.f.f20621q;
        f19682a = aVar.d("/");
        f19683b = aVar.d("\\");
        f19684c = aVar.d("/\\");
        f19685d = aVar.d(".");
        f19686e = aVar.d("..");
    }

    public static final r0 j(r0 r0Var, r0 r0Var2, boolean z10) {
        q.i(r0Var, "<this>");
        q.i(r0Var2, "child");
        if (!r0Var2.i() && r0Var2.r() == null) {
            okio.f m10 = m(r0Var);
            if (m10 == null && (m10 = m(r0Var2)) == null) {
                m10 = s(r0.f20671p);
            }
            okio.c cVar = new okio.c();
            cVar.B0(r0Var.d());
            if (cVar.s0() > 0) {
                cVar.B0(m10);
            }
            cVar.B0(r0Var2.d());
            return q(cVar, z10);
        }
        return r0Var2;
    }

    public static final r0 k(String str, boolean z10) {
        q.i(str, "<this>");
        return q(new okio.c().W(str), z10);
    }

    public static final int l(r0 r0Var) {
        int v10 = okio.f.v(r0Var.d(), f19682a, 0, 2, null);
        if (v10 != -1) {
            return v10;
        }
        return okio.f.v(r0Var.d(), f19683b, 0, 2, null);
    }

    public static final okio.f m(r0 r0Var) {
        okio.f d10 = r0Var.d();
        okio.f fVar = f19682a;
        if (okio.f.q(d10, fVar, 0, 2, null) == -1) {
            okio.f d11 = r0Var.d();
            okio.f fVar2 = f19683b;
            if (okio.f.q(d11, fVar2, 0, 2, null) == -1) {
                return null;
            }
            return fVar2;
        }
        return fVar;
    }

    public static final boolean n(r0 r0Var) {
        if (!r0Var.d().g(f19686e) || (r0Var.d().D() != 2 && !r0Var.d().x(r0Var.d().D() - 3, f19682a, 0, 1) && !r0Var.d().x(r0Var.d().D() - 3, f19683b, 0, 1))) {
            return false;
        }
        return true;
    }

    public static final int o(r0 r0Var) {
        boolean z10;
        if (r0Var.d().D() == 0) {
            return -1;
        }
        boolean z11 = false;
        if (r0Var.d().i(0) == 47) {
            return 1;
        }
        if (r0Var.d().i(0) == 92) {
            if (r0Var.d().D() <= 2 || r0Var.d().i(1) != 92) {
                return 1;
            }
            int o10 = r0Var.d().o(f19683b, 2);
            if (o10 == -1) {
                return r0Var.d().D();
            }
            return o10;
        } else if (r0Var.d().D() <= 2 || r0Var.d().i(1) != 58 || r0Var.d().i(2) != 92) {
            return -1;
        } else {
            char i10 = (char) r0Var.d().i(0);
            if ('a' <= i10 && i10 < '{') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if ('A' <= i10 && i10 < '[') {
                    z11 = true;
                }
                if (!z11) {
                    return -1;
                }
                return 3;
            }
            return 3;
        }
    }

    private static final boolean p(okio.c cVar, okio.f fVar) {
        boolean z10;
        boolean z11;
        if (!q.d(fVar, f19683b) || cVar.s0() < 2 || cVar.B(1L) != 58) {
            return false;
        }
        char B = (char) cVar.B(0L);
        if ('a' <= B && B < '{') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if ('A' <= B && B < '[') {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
        }
        return true;
    }

    public static final r0 q(okio.c cVar, boolean z10) {
        okio.f fVar;
        boolean z11;
        boolean z12;
        okio.f l10;
        Object m02;
        q.i(cVar, "<this>");
        okio.c cVar2 = new okio.c();
        okio.f fVar2 = null;
        int i10 = 0;
        while (true) {
            if (!cVar.a0(0L, f19682a)) {
                fVar = f19683b;
                if (!cVar.a0(0L, fVar)) {
                    break;
                }
            }
            byte readByte = cVar.readByte();
            if (fVar2 == null) {
                fVar2 = r(readByte);
            }
            i10++;
        }
        if (i10 >= 2 && q.d(fVar2, fVar)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            q.f(fVar2);
            cVar2.B0(fVar2);
            cVar2.B0(fVar2);
        } else if (i10 > 0) {
            q.f(fVar2);
            cVar2.B0(fVar2);
        } else {
            long R = cVar.R(f19684c);
            if (fVar2 == null) {
                if (R == -1) {
                    fVar2 = s(r0.f20671p);
                } else {
                    fVar2 = r(cVar.B(R));
                }
            }
            if (p(cVar, fVar2)) {
                if (R == 2) {
                    cVar2.write(cVar, 3L);
                } else {
                    cVar2.write(cVar, 2L);
                }
            }
        }
        if (cVar2.s0() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (!cVar.C()) {
            long R2 = cVar.R(f19684c);
            if (R2 == -1) {
                l10 = cVar.j0();
            } else {
                l10 = cVar.l(R2);
                cVar.readByte();
            }
            okio.f fVar3 = f19686e;
            if (q.d(l10, fVar3)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (z10) {
                        if (!z12) {
                            if (!arrayList.isEmpty()) {
                                m02 = b0.m0(arrayList);
                                if (q.d(m02, fVar3)) {
                                }
                            }
                        }
                        if (!z11 || arrayList.size() != 1) {
                            y.G(arrayList);
                        }
                    }
                    arrayList.add(l10);
                }
            } else if (!q.d(l10, f19685d) && !q.d(l10, okio.f.f20622r)) {
                arrayList.add(l10);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                cVar2.B0(fVar2);
            }
            cVar2.B0((okio.f) arrayList.get(i11));
        }
        if (cVar2.s0() == 0) {
            cVar2.B0(f19685d);
        }
        return new r0(cVar2.j0());
    }

    private static final okio.f r(byte b10) {
        if (b10 != 47) {
            if (b10 == 92) {
                return f19683b;
            }
            throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
        }
        return f19682a;
    }

    public static final okio.f s(String str) {
        if (q.d(str, "/")) {
            return f19682a;
        }
        if (q.d(str, "\\")) {
            return f19683b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
