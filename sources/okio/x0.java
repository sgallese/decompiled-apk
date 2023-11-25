package okio;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import java.security.MessageDigest;

/* compiled from: SegmentedByteString.kt */
/* loaded from: classes4.dex */
public final class x0 extends f {

    /* renamed from: s  reason: collision with root package name */
    private final transient byte[][] f20699s;

    /* renamed from: t  reason: collision with root package name */
    private final transient int[] f20700t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(byte[][] bArr, int[] iArr) {
        super(f.f20622r.j());
        qc.q.i(bArr, "segments");
        qc.q.i(iArr, "directory");
        this.f20699s = bArr;
        this.f20700t = iArr;
    }

    private final f N() {
        return new f(M());
    }

    @Override // okio.f
    public f F(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        Object[] p10;
        int e10 = f1.e(this, i11);
        int i12 = 0;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (e10 <= D()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i13 = e10 - i10;
                if (i13 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (i10 == 0 && e10 == D()) {
                        return this;
                    }
                    if (i10 == e10) {
                        return f.f20622r;
                    }
                    int b10 = ld.j.b(this, i10);
                    int b11 = ld.j.b(this, e10 - 1);
                    p10 = ec.o.p(L(), b10, b11 + 1);
                    byte[][] bArr = (byte[][]) p10;
                    int[] iArr = new int[bArr.length * 2];
                    if (b10 <= b11) {
                        int i14 = b10;
                        int i15 = 0;
                        while (true) {
                            iArr[i15] = Math.min(K()[i14] - i10, i13);
                            int i16 = i15 + 1;
                            iArr[i15 + bArr.length] = K()[L().length + i14];
                            if (i14 == b11) {
                                break;
                            }
                            i14++;
                            i15 = i16;
                        }
                    }
                    if (b10 != 0) {
                        i12 = K()[b10 - 1];
                    }
                    int length = bArr.length;
                    iArr[length] = iArr[length] + (i10 - i12);
                    return new x0(bArr, iArr);
                }
                throw new IllegalArgumentException(("endIndex=" + e10 + " < beginIndex=" + i10).toString());
            }
            throw new IllegalArgumentException(("endIndex=" + e10 + " > length(" + D() + ')').toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
    }

    @Override // okio.f
    public f H() {
        return N().H();
    }

    @Override // okio.f
    public void J(c cVar, int i10, int i11) {
        int i12;
        qc.q.i(cVar, "buffer");
        int i13 = i10 + i11;
        int b10 = ld.j.b(this, i10);
        while (i10 < i13) {
            if (b10 == 0) {
                i12 = 0;
            } else {
                i12 = K()[b10 - 1];
            }
            int i14 = K()[b10] - i12;
            int i15 = K()[L().length + b10];
            int min = Math.min(i13, i14 + i12) - i10;
            int i16 = i15 + (i10 - i12);
            v0 v0Var = new v0(L()[b10], i16, i16 + min, true, false);
            v0 v0Var2 = cVar.f20602f;
            if (v0Var2 == null) {
                v0Var.f20693g = v0Var;
                v0Var.f20692f = v0Var;
                cVar.f20602f = v0Var;
            } else {
                qc.q.f(v0Var2);
                v0 v0Var3 = v0Var2.f20693g;
                qc.q.f(v0Var3);
                v0Var3.c(v0Var);
            }
            i10 += min;
            b10++;
        }
        cVar.q0(cVar.s0() + i11);
    }

    public final int[] K() {
        return this.f20700t;
    }

    public final byte[][] L() {
        return this.f20699s;
    }

    public byte[] M() {
        byte[] bArr = new byte[D()];
        int length = L().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = K()[length + i10];
            int i14 = K()[i10];
            int i15 = i14 - i11;
            ec.o.d(L()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // okio.f
    public String b() {
        return N().b();
    }

    @Override // okio.f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.D() == D() && x(0, fVar, 0, D())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.f
    public f f(String str) {
        qc.q.i(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = L().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = K()[length + i10];
            int i13 = K()[i10];
            messageDigest.update(L()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = messageDigest.digest();
        qc.q.h(digest, "digestBytes");
        return new f(digest);
    }

    @Override // okio.f
    public int hashCode() {
        int k10 = k();
        if (k10 == 0) {
            int length = L().length;
            int i10 = 0;
            int i11 = 1;
            int i12 = 0;
            while (i10 < length) {
                int i13 = K()[length + i10];
                int i14 = K()[i10];
                byte[] bArr = L()[i10];
                int i15 = (i14 - i12) + i13;
                while (i13 < i15) {
                    i11 = (i11 * 31) + bArr[i13];
                    i13++;
                }
                i10++;
                i12 = i14;
            }
            z(i11);
            return i11;
        }
        return k10;
    }

    @Override // okio.f
    public int l() {
        return K()[L().length - 1];
    }

    @Override // okio.f
    public String n() {
        return N().n();
    }

    @Override // okio.f
    public int p(byte[] bArr, int i10) {
        qc.q.i(bArr, TaskSetupFragment.TYPE_OTHER);
        return N().p(bArr, i10);
    }

    @Override // okio.f
    public byte[] r() {
        return M();
    }

    @Override // okio.f
    public byte s(int i10) {
        int i11;
        f1.b(K()[L().length - 1], i10, 1L);
        int b10 = ld.j.b(this, i10);
        if (b10 == 0) {
            i11 = 0;
        } else {
            i11 = K()[b10 - 1];
        }
        return L()[b10][(i10 - i11) + K()[L().length + b10]];
    }

    @Override // okio.f
    public String toString() {
        return N().toString();
    }

    @Override // okio.f
    public int u(byte[] bArr, int i10) {
        qc.q.i(bArr, TaskSetupFragment.TYPE_OTHER);
        return N().u(bArr, i10);
    }

    @Override // okio.f
    public boolean x(int i10, f fVar, int i11, int i12) {
        int i13;
        qc.q.i(fVar, TaskSetupFragment.TYPE_OTHER);
        if (i10 < 0 || i10 > D() - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int b10 = ld.j.b(this, i10);
        while (i10 < i14) {
            if (b10 == 0) {
                i13 = 0;
            } else {
                i13 = K()[b10 - 1];
            }
            int i15 = K()[b10] - i13;
            int i16 = K()[L().length + b10];
            int min = Math.min(i14, i15 + i13) - i10;
            if (!fVar.y(i11, L()[b10], i16 + (i10 - i13), min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }

    @Override // okio.f
    public boolean y(int i10, byte[] bArr, int i11, int i12) {
        int i13;
        qc.q.i(bArr, TaskSetupFragment.TYPE_OTHER);
        if (i10 < 0 || i10 > D() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i14 = i12 + i10;
        int b10 = ld.j.b(this, i10);
        while (i10 < i14) {
            if (b10 == 0) {
                i13 = 0;
            } else {
                i13 = K()[b10 - 1];
            }
            int i15 = K()[b10] - i13;
            int i16 = K()[L().length + b10];
            int min = Math.min(i14, i15 + i13) - i10;
            if (!f1.a(L()[b10], i16 + (i10 - i13), bArr, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            b10++;
        }
        return true;
    }
}
