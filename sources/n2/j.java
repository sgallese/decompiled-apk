package n2;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.Arrays;
import n2.b;

/* compiled from: SolverVariableValues.java */
/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n  reason: collision with root package name */
    private static float f20119n = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    private final int f20120a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f20121b = 16;

    /* renamed from: c  reason: collision with root package name */
    private int f20122c = 16;

    /* renamed from: d  reason: collision with root package name */
    int[] f20123d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    int[] f20124e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    int[] f20125f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    float[] f20126g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    int[] f20127h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    int[] f20128i = new int[16];

    /* renamed from: j  reason: collision with root package name */
    int f20129j = 0;

    /* renamed from: k  reason: collision with root package name */
    int f20130k = -1;

    /* renamed from: l  reason: collision with root package name */
    private final b f20131l;

    /* renamed from: m  reason: collision with root package name */
    protected final c f20132m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(b bVar, c cVar) {
        this.f20131l = bVar;
        this.f20132m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f20107c % this.f20122c;
        int[] iArr2 = this.f20123d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f20124e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                }
                i12 = i13;
            }
            iArr[i12] = i10;
        }
        this.f20124e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f20125f[i10] = iVar.f20107c;
        this.f20126g[i10] = f10;
        this.f20127h[i10] = -1;
        this.f20128i[i10] = -1;
        iVar.a(this.f20131l);
        iVar.f20117m++;
        this.f20129j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f20121b; i10++) {
            if (this.f20125f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f20121b * 2;
        this.f20125f = Arrays.copyOf(this.f20125f, i10);
        this.f20126g = Arrays.copyOf(this.f20126g, i10);
        this.f20127h = Arrays.copyOf(this.f20127h, i10);
        this.f20128i = Arrays.copyOf(this.f20128i, i10);
        this.f20124e = Arrays.copyOf(this.f20124e, i10);
        for (int i11 = this.f20121b; i11 < i10; i11++) {
            this.f20125f[i11] = -1;
            this.f20124e[i11] = -1;
        }
        this.f20121b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int n10 = n();
        m(n10, iVar, f10);
        if (i10 != -1) {
            this.f20127h[n10] = i10;
            int[] iArr = this.f20128i;
            iArr[n10] = iArr[i10];
            iArr[i10] = n10;
        } else {
            this.f20127h[n10] = -1;
            if (this.f20129j > 0) {
                this.f20128i[n10] = this.f20130k;
                this.f20130k = n10;
            } else {
                this.f20128i[n10] = -1;
            }
        }
        int i11 = this.f20128i[n10];
        if (i11 != -1) {
            this.f20127h[i11] = n10;
        }
        l(iVar, n10);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f20107c;
        int i12 = i11 % this.f20122c;
        int[] iArr2 = this.f20123d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f20125f[i13] == i11) {
            int[] iArr3 = this.f20124e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f20124e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f20125f[i10] == i11) {
                break;
            }
            i13 = i10;
        }
        if (i10 != -1 && this.f20125f[i10] == i11) {
            iArr[i13] = iArr[i10];
            iArr[i10] = -1;
        }
    }

    @Override // n2.b.a
    public int a() {
        return this.f20129j;
    }

    @Override // n2.b.a
    public i b(int i10) {
        int i11 = this.f20129j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f20130k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f20132m.f20070d[this.f20125f[i12]];
            }
            i12 = this.f20128i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // n2.b.a
    public void c() {
        int i10 = this.f20129j;
        int i11 = this.f20130k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f20126g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f20128i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // n2.b.a
    public void clear() {
        int i10 = this.f20129j;
        for (int i11 = 0; i11 < i10; i11++) {
            i b10 = b(i11);
            if (b10 != null) {
                b10.c(this.f20131l);
            }
        }
        for (int i12 = 0; i12 < this.f20121b; i12++) {
            this.f20125f[i12] = -1;
            this.f20124e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f20122c; i13++) {
            this.f20123d[i13] = -1;
        }
        this.f20129j = 0;
        this.f20130k = -1;
    }

    @Override // n2.b.a
    public float d(int i10) {
        int i11 = this.f20129j;
        int i12 = this.f20130k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f20126g[i12];
            }
            i12 = this.f20128i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // n2.b.a
    public float e(i iVar) {
        int p10 = p(iVar);
        if (p10 != -1) {
            return this.f20126g[p10];
        }
        return 0.0f;
    }

    @Override // n2.b.a
    public float f(b bVar, boolean z10) {
        float e10 = e(bVar.f20061a);
        j(bVar.f20061a, z10);
        j jVar = (j) bVar.f20065e;
        int a10 = jVar.a();
        int i10 = 0;
        int i11 = 0;
        while (i10 < a10) {
            int i12 = jVar.f20125f[i11];
            if (i12 != -1) {
                i(this.f20132m.f20070d[i12], jVar.f20126g[i11] * e10, z10);
                i10++;
            }
            i11++;
        }
        return e10;
    }

    @Override // n2.b.a
    public boolean g(i iVar) {
        if (p(iVar) != -1) {
            return true;
        }
        return false;
    }

    @Override // n2.b.a
    public void h(i iVar, float f10) {
        float f11 = f20119n;
        if (f10 > (-f11) && f10 < f11) {
            j(iVar, true);
            return;
        }
        if (this.f20129j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f20130k = 0;
            return;
        }
        int p10 = p(iVar);
        if (p10 != -1) {
            this.f20126g[p10] = f10;
            return;
        }
        if (this.f20129j + 1 >= this.f20121b) {
            o();
        }
        int i10 = this.f20129j;
        int i11 = this.f20130k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f20125f[i11];
            int i15 = iVar.f20107c;
            if (i14 == i15) {
                this.f20126g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f20128i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // n2.b.a
    public void i(i iVar, float f10, boolean z10) {
        float f11 = f20119n;
        if (f10 > (-f11) && f10 < f11) {
            return;
        }
        int p10 = p(iVar);
        if (p10 == -1) {
            h(iVar, f10);
            return;
        }
        float[] fArr = this.f20126g;
        float f12 = fArr[p10] + f10;
        fArr[p10] = f12;
        float f13 = f20119n;
        if (f12 > (-f13) && f12 < f13) {
            fArr[p10] = 0.0f;
            j(iVar, z10);
        }
    }

    @Override // n2.b.a
    public float j(i iVar, boolean z10) {
        int p10 = p(iVar);
        if (p10 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f20126g[p10];
        if (this.f20130k == p10) {
            this.f20130k = this.f20128i[p10];
        }
        this.f20125f[p10] = -1;
        int[] iArr = this.f20127h;
        int i10 = iArr[p10];
        if (i10 != -1) {
            int[] iArr2 = this.f20128i;
            iArr2[i10] = iArr2[p10];
        }
        int i11 = this.f20128i[p10];
        if (i11 != -1) {
            iArr[i11] = iArr[p10];
        }
        this.f20129j--;
        iVar.f20117m--;
        if (z10) {
            iVar.c(this.f20131l);
        }
        return f10;
    }

    @Override // n2.b.a
    public void k(float f10) {
        int i10 = this.f20129j;
        int i11 = this.f20130k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f20126g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f20128i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        if (this.f20129j == 0) {
            return -1;
        }
        int i10 = iVar.f20107c;
        int i11 = this.f20123d[i10 % this.f20122c];
        if (i11 == -1) {
            return -1;
        }
        if (this.f20125f[i11] == i10) {
            return i11;
        }
        do {
            i11 = this.f20124e[i11];
            if (i11 == -1) {
                break;
            }
        } while (this.f20125f[i11] != i10);
        if (i11 == -1 || this.f20125f[i11] != i10) {
            return -1;
        }
        return i11;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i10 = this.f20129j;
        for (int i11 = 0; i11 < i10; i11++) {
            i b10 = b(i11);
            if (b10 != null) {
                String str4 = str3 + b10 + " = " + d(i11) + " ";
                int p10 = p(b10);
                String str5 = str4 + "[p: ";
                if (this.f20127h[p10] != -1) {
                    str = str5 + this.f20132m.f20070d[this.f20125f[this.f20127h[p10]]];
                } else {
                    str = str5 + DevicePublicKeyStringDef.NONE;
                }
                String str6 = str + ", n: ";
                if (this.f20128i[p10] != -1) {
                    str2 = str6 + this.f20132m.f20070d[this.f20125f[this.f20128i[p10]]];
                } else {
                    str2 = str6 + DevicePublicKeyStringDef.NONE;
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
