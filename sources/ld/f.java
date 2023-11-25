package ld;

import okio.c;
import okio.e1;
import okio.f1;
import okio.o0;
import okio.v0;
import qc.q;

/* compiled from: -Buffer.kt */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a */
    private static final byte[] f19680a = e1.a("0123456789abcdef");

    public static final c.a a(okio.c cVar, c.a aVar) {
        boolean z10;
        q.i(cVar, "<this>");
        q.i(aVar, "unsafeCursor");
        c.a g10 = f1.g(aVar);
        if (g10.f20604f == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            g10.f20604f = cVar;
            g10.f20605m = true;
            return g10;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    public static final byte[] b() {
        return f19680a;
    }

    public static final boolean c(v0 v0Var, int i10, byte[] bArr, int i11, int i12) {
        q.i(v0Var, "segment");
        q.i(bArr, "bytes");
        int i13 = v0Var.f20689c;
        byte[] bArr2 = v0Var.f20687a;
        while (i11 < i12) {
            if (i10 == i13) {
                v0Var = v0Var.f20692f;
                q.f(v0Var);
                byte[] bArr3 = v0Var.f20687a;
                bArr2 = bArr3;
                i10 = v0Var.f20688b;
                i13 = v0Var.f20689c;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String d(okio.c cVar, long j10) {
        q.i(cVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (cVar.B(j11) == 13) {
                String h10 = cVar.h(j11);
                cVar.skip(2L);
                return h10;
            }
        }
        String h11 = cVar.h(j10);
        cVar.skip(1L);
        return h11;
    }

    public static final int e(okio.c cVar, o0 o0Var, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        v0 v0Var;
        q.i(cVar, "<this>");
        q.i(o0Var, "options");
        v0 v0Var2 = cVar.f20602f;
        if (v0Var2 == null) {
            if (z10) {
                return -2;
            }
            return -1;
        }
        byte[] bArr = v0Var2.f20687a;
        int i14 = v0Var2.f20688b;
        int i15 = v0Var2.f20689c;
        int[] i16 = o0Var.i();
        v0 v0Var3 = v0Var2;
        int i17 = 0;
        int i18 = -1;
        loop0: while (true) {
            int i19 = i17 + 1;
            int i20 = i16[i17];
            int i21 = i19 + 1;
            int i22 = i16[i19];
            if (i22 != -1) {
                i18 = i22;
            }
            if (v0Var3 == null) {
                break;
            }
            if (i20 < 0) {
                int i23 = i21 + (i20 * (-1));
                while (true) {
                    int i24 = i14 + 1;
                    int i25 = i21 + 1;
                    if ((bArr[i14] & 255) != i16[i21]) {
                        return i18;
                    }
                    if (i25 == i23) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i24 == i15) {
                        q.f(v0Var3);
                        v0 v0Var4 = v0Var3.f20692f;
                        q.f(v0Var4);
                        i13 = v0Var4.f20688b;
                        byte[] bArr2 = v0Var4.f20687a;
                        i12 = v0Var4.f20689c;
                        if (v0Var4 == v0Var2) {
                            if (!z11) {
                                break loop0;
                            }
                            bArr = bArr2;
                            v0Var = null;
                        } else {
                            v0Var = v0Var4;
                            bArr = bArr2;
                        }
                    } else {
                        v0 v0Var5 = v0Var3;
                        i12 = i15;
                        i13 = i24;
                        v0Var = v0Var5;
                    }
                    if (z11) {
                        i11 = i16[i25];
                        i10 = i13;
                        i15 = i12;
                        v0Var3 = v0Var;
                        break;
                    }
                    i14 = i13;
                    i15 = i12;
                    i21 = i25;
                    v0Var3 = v0Var;
                }
            } else {
                i10 = i14 + 1;
                int i26 = bArr[i14] & 255;
                int i27 = i21 + i20;
                while (i21 != i27) {
                    if (i26 == i16[i21]) {
                        i11 = i16[i21 + i20];
                        if (i10 == i15) {
                            v0Var3 = v0Var3.f20692f;
                            q.f(v0Var3);
                            i10 = v0Var3.f20688b;
                            bArr = v0Var3.f20687a;
                            i15 = v0Var3.f20689c;
                            if (v0Var3 == v0Var2) {
                                v0Var3 = null;
                            }
                        }
                    } else {
                        i21++;
                    }
                }
                return i18;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i18;
    }

    public static /* synthetic */ int f(okio.c cVar, o0 o0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(cVar, o0Var, z10);
    }
}
