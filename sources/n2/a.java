package n2;

import java.util.Arrays;
import n2.b;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    private static float f20049l = 0.001f;

    /* renamed from: b  reason: collision with root package name */
    private final b f20051b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f20052c;

    /* renamed from: a  reason: collision with root package name */
    int f20050a = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f20053d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f20054e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f20055f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    private int[] f20056g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    private float[] f20057h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private int f20058i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f20059j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f20060k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(b bVar, c cVar) {
        this.f20051b = bVar;
        this.f20052c = cVar;
    }

    @Override // n2.b.a
    public int a() {
        return this.f20050a;
    }

    @Override // n2.b.a
    public i b(int i10) {
        int i11 = this.f20058i;
        for (int i12 = 0; i11 != -1 && i12 < this.f20050a; i12++) {
            if (i12 == i10) {
                return this.f20052c.f20070d[this.f20055f[i11]];
            }
            i11 = this.f20056g[i11];
        }
        return null;
    }

    @Override // n2.b.a
    public void c() {
        int i10 = this.f20058i;
        for (int i11 = 0; i10 != -1 && i11 < this.f20050a; i11++) {
            float[] fArr = this.f20057h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f20056g[i10];
        }
    }

    @Override // n2.b.a
    public final void clear() {
        int i10 = this.f20058i;
        for (int i11 = 0; i10 != -1 && i11 < this.f20050a; i11++) {
            i iVar = this.f20052c.f20070d[this.f20055f[i10]];
            if (iVar != null) {
                iVar.c(this.f20051b);
            }
            i10 = this.f20056g[i10];
        }
        this.f20058i = -1;
        this.f20059j = -1;
        this.f20060k = false;
        this.f20050a = 0;
    }

    @Override // n2.b.a
    public float d(int i10) {
        int i11 = this.f20058i;
        for (int i12 = 0; i11 != -1 && i12 < this.f20050a; i12++) {
            if (i12 == i10) {
                return this.f20057h[i11];
            }
            i11 = this.f20056g[i11];
        }
        return 0.0f;
    }

    @Override // n2.b.a
    public final float e(i iVar) {
        int i10 = this.f20058i;
        for (int i11 = 0; i10 != -1 && i11 < this.f20050a; i11++) {
            if (this.f20055f[i10] == iVar.f20107c) {
                return this.f20057h[i10];
            }
            i10 = this.f20056g[i10];
        }
        return 0.0f;
    }

    @Override // n2.b.a
    public float f(b bVar, boolean z10) {
        float e10 = e(bVar.f20061a);
        j(bVar.f20061a, z10);
        b.a aVar = bVar.f20065e;
        int a10 = aVar.a();
        for (int i10 = 0; i10 < a10; i10++) {
            i b10 = aVar.b(i10);
            i(b10, aVar.e(b10) * e10, z10);
        }
        return e10;
    }

    @Override // n2.b.a
    public boolean g(i iVar) {
        int i10 = this.f20058i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f20050a; i11++) {
            if (this.f20055f[i10] == iVar.f20107c) {
                return true;
            }
            i10 = this.f20056g[i10];
        }
        return false;
    }

    @Override // n2.b.a
    public final void h(i iVar, float f10) {
        if (f10 == 0.0f) {
            j(iVar, true);
            return;
        }
        int i10 = this.f20058i;
        if (i10 == -1) {
            this.f20058i = 0;
            this.f20057h[0] = f10;
            this.f20055f[0] = iVar.f20107c;
            this.f20056g[0] = -1;
            iVar.f20117m++;
            iVar.a(this.f20051b);
            this.f20050a++;
            if (!this.f20060k) {
                int i11 = this.f20059j + 1;
                this.f20059j = i11;
                int[] iArr = this.f20055f;
                if (i11 >= iArr.length) {
                    this.f20060k = true;
                    this.f20059j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f20050a; i13++) {
            int i14 = this.f20055f[i10];
            int i15 = iVar.f20107c;
            if (i14 == i15) {
                this.f20057h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f20056g[i10];
        }
        int i16 = this.f20059j;
        int i17 = i16 + 1;
        if (this.f20060k) {
            int[] iArr2 = this.f20055f;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f20055f;
        if (i16 >= iArr3.length && this.f20050a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f20055f;
                if (i18 >= iArr4.length) {
                    break;
                } else if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr5 = this.f20055f;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f20053d * 2;
            this.f20053d = i19;
            this.f20060k = false;
            this.f20059j = i16 - 1;
            this.f20057h = Arrays.copyOf(this.f20057h, i19);
            this.f20055f = Arrays.copyOf(this.f20055f, this.f20053d);
            this.f20056g = Arrays.copyOf(this.f20056g, this.f20053d);
        }
        this.f20055f[i16] = iVar.f20107c;
        this.f20057h[i16] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f20056g;
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            this.f20056g[i16] = this.f20058i;
            this.f20058i = i16;
        }
        iVar.f20117m++;
        iVar.a(this.f20051b);
        int i20 = this.f20050a + 1;
        this.f20050a = i20;
        if (!this.f20060k) {
            this.f20059j++;
        }
        int[] iArr7 = this.f20055f;
        if (i20 >= iArr7.length) {
            this.f20060k = true;
        }
        if (this.f20059j >= iArr7.length) {
            this.f20060k = true;
            this.f20059j = iArr7.length - 1;
        }
    }

    @Override // n2.b.a
    public void i(i iVar, float f10, boolean z10) {
        float f11 = f20049l;
        if (f10 > (-f11) && f10 < f11) {
            return;
        }
        int i10 = this.f20058i;
        if (i10 == -1) {
            this.f20058i = 0;
            this.f20057h[0] = f10;
            this.f20055f[0] = iVar.f20107c;
            this.f20056g[0] = -1;
            iVar.f20117m++;
            iVar.a(this.f20051b);
            this.f20050a++;
            if (!this.f20060k) {
                int i11 = this.f20059j + 1;
                this.f20059j = i11;
                int[] iArr = this.f20055f;
                if (i11 >= iArr.length) {
                    this.f20060k = true;
                    this.f20059j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f20050a; i13++) {
            int i14 = this.f20055f[i10];
            int i15 = iVar.f20107c;
            if (i14 == i15) {
                float[] fArr = this.f20057h;
                float f12 = fArr[i10] + f10;
                float f13 = f20049l;
                if (f12 > (-f13) && f12 < f13) {
                    f12 = 0.0f;
                }
                fArr[i10] = f12;
                if (f12 == 0.0f) {
                    if (i10 == this.f20058i) {
                        this.f20058i = this.f20056g[i10];
                    } else {
                        int[] iArr2 = this.f20056g;
                        iArr2[i12] = iArr2[i10];
                    }
                    if (z10) {
                        iVar.c(this.f20051b);
                    }
                    if (this.f20060k) {
                        this.f20059j = i10;
                    }
                    iVar.f20117m--;
                    this.f20050a--;
                    return;
                }
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f20056g[i10];
        }
        int i16 = this.f20059j;
        int i17 = i16 + 1;
        if (this.f20060k) {
            int[] iArr3 = this.f20055f;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f20055f;
        if (i16 >= iArr4.length && this.f20050a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f20055f;
                if (i18 >= iArr5.length) {
                    break;
                } else if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr6 = this.f20055f;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f20053d * 2;
            this.f20053d = i19;
            this.f20060k = false;
            this.f20059j = i16 - 1;
            this.f20057h = Arrays.copyOf(this.f20057h, i19);
            this.f20055f = Arrays.copyOf(this.f20055f, this.f20053d);
            this.f20056g = Arrays.copyOf(this.f20056g, this.f20053d);
        }
        this.f20055f[i16] = iVar.f20107c;
        this.f20057h[i16] = f10;
        if (i12 != -1) {
            int[] iArr7 = this.f20056g;
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            this.f20056g[i16] = this.f20058i;
            this.f20058i = i16;
        }
        iVar.f20117m++;
        iVar.a(this.f20051b);
        this.f20050a++;
        if (!this.f20060k) {
            this.f20059j++;
        }
        int i20 = this.f20059j;
        int[] iArr8 = this.f20055f;
        if (i20 >= iArr8.length) {
            this.f20060k = true;
            this.f20059j = iArr8.length - 1;
        }
    }

    @Override // n2.b.a
    public final float j(i iVar, boolean z10) {
        if (this.f20054e == iVar) {
            this.f20054e = null;
        }
        int i10 = this.f20058i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f20050a) {
            if (this.f20055f[i10] == iVar.f20107c) {
                if (i10 == this.f20058i) {
                    this.f20058i = this.f20056g[i10];
                } else {
                    int[] iArr = this.f20056g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.c(this.f20051b);
                }
                iVar.f20117m--;
                this.f20050a--;
                this.f20055f[i10] = -1;
                if (this.f20060k) {
                    this.f20059j = i10;
                }
                return this.f20057h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f20056g[i10];
        }
        return 0.0f;
    }

    @Override // n2.b.a
    public void k(float f10) {
        int i10 = this.f20058i;
        for (int i11 = 0; i10 != -1 && i11 < this.f20050a; i11++) {
            float[] fArr = this.f20057h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f20056g[i10];
        }
    }

    public String toString() {
        int i10 = this.f20058i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f20050a; i11++) {
            str = ((str + " -> ") + this.f20057h[i10] + " : ") + this.f20052c.f20070d[this.f20055f[i10]];
            i10 = this.f20056g[i10];
        }
        return str;
    }
}
