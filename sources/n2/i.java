package n2;

import java.util.Arrays;
import java.util.HashSet;

/* compiled from: SolverVariable.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: o  reason: collision with root package name */
    private static int f20104o = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f20105a;

    /* renamed from: b  reason: collision with root package name */
    private String f20106b;

    /* renamed from: f  reason: collision with root package name */
    public float f20110f;

    /* renamed from: j  reason: collision with root package name */
    a f20114j;

    /* renamed from: c  reason: collision with root package name */
    public int f20107c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f20108d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f20109e = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f20111g = false;

    /* renamed from: h  reason: collision with root package name */
    float[] f20112h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    float[] f20113i = new float[9];

    /* renamed from: k  reason: collision with root package name */
    b[] f20115k = new b[16];

    /* renamed from: l  reason: collision with root package name */
    int f20116l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f20117m = 0;

    /* renamed from: n  reason: collision with root package name */
    HashSet<b> f20118n = null;

    /* compiled from: SolverVariable.java */
    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f20114j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        f20104o++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f20116l;
            if (i10 < i11) {
                if (this.f20115k[i10] == bVar) {
                    return;
                }
                i10++;
            } else {
                b[] bVarArr = this.f20115k;
                if (i11 >= bVarArr.length) {
                    this.f20115k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f20115k;
                int i12 = this.f20116l;
                bVarArr2[i12] = bVar;
                this.f20116l = i12 + 1;
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i10 = this.f20116l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f20115k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f20115k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f20116l--;
                return;
            }
            i11++;
        }
    }

    public void d() {
        this.f20106b = null;
        this.f20114j = a.UNKNOWN;
        this.f20109e = 0;
        this.f20107c = -1;
        this.f20108d = -1;
        this.f20110f = 0.0f;
        this.f20111g = false;
        int i10 = this.f20116l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f20115k[i11] = null;
        }
        this.f20116l = 0;
        this.f20117m = 0;
        this.f20105a = false;
        Arrays.fill(this.f20113i, 0.0f);
    }

    public void e(d dVar, float f10) {
        this.f20110f = f10;
        this.f20111g = true;
        int i10 = this.f20116l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f20115k[i11].B(dVar, this, false);
        }
        this.f20116l = 0;
    }

    public void f(a aVar, String str) {
        this.f20114j = aVar;
    }

    public final void g(b bVar) {
        int i10 = this.f20116l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f20115k[i11].C(bVar, false);
        }
        this.f20116l = 0;
    }

    public String toString() {
        if (this.f20106b != null) {
            return "" + this.f20106b;
        }
        return "" + this.f20107c;
    }
}
