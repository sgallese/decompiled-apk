package n2;

import java.util.Arrays;
import java.util.Comparator;
import n2.b;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public class h extends n2.b {

    /* renamed from: g  reason: collision with root package name */
    private int f20094g;

    /* renamed from: h  reason: collision with root package name */
    private i[] f20095h;

    /* renamed from: i  reason: collision with root package name */
    private i[] f20096i;

    /* renamed from: j  reason: collision with root package name */
    private int f20097j;

    /* renamed from: k  reason: collision with root package name */
    b f20098k;

    /* renamed from: l  reason: collision with root package name */
    c f20099l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f20107c - iVar2.f20107c;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    class b implements Comparable {

        /* renamed from: f  reason: collision with root package name */
        i f20101f;

        /* renamed from: m  reason: collision with root package name */
        h f20102m;

        public b(h hVar) {
            this.f20102m = hVar;
        }

        public boolean b(i iVar, float f10) {
            boolean z10 = true;
            if (this.f20101f.f20105a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr = this.f20101f.f20113i;
                    float f11 = fArr[i10] + (iVar.f20113i[i10] * f10);
                    fArr[i10] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        this.f20101f.f20113i[i10] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    h.this.G(this.f20101f);
                }
                return false;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float f12 = iVar.f20113i[i11];
                if (f12 != 0.0f) {
                    float f13 = f12 * f10;
                    if (Math.abs(f13) < 1.0E-4f) {
                        f13 = 0.0f;
                    }
                    this.f20101f.f20113i[i11] = f13;
                } else {
                    this.f20101f.f20113i[i11] = 0.0f;
                }
            }
            return true;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f20101f.f20107c - ((i) obj).f20107c;
        }

        public void d(i iVar) {
            this.f20101f = iVar;
        }

        public final boolean f() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f20101f.f20113i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean g(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f20113i[i10];
                float f11 = this.f20101f.f20113i[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void i() {
            Arrays.fill(this.f20101f.f20113i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f20101f != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f20101f.f20113i[i10] + " ";
                }
            }
            return str + "] " + this.f20101f;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f20094g = 128;
        this.f20095h = new i[128];
        this.f20096i = new i[128];
        this.f20097j = 0;
        this.f20098k = new b(this);
        this.f20099l = cVar;
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f20097j + 1;
        i[] iVarArr = this.f20095h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f20095h = iVarArr2;
            this.f20096i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f20095h;
        int i12 = this.f20097j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f20097j = i13;
        if (i13 > 1 && iVarArr3[i13 - 1].f20107c > iVar.f20107c) {
            int i14 = 0;
            while (true) {
                i10 = this.f20097j;
                if (i14 >= i10) {
                    break;
                }
                this.f20096i[i14] = this.f20095h[i14];
                i14++;
            }
            Arrays.sort(this.f20096i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f20097j; i15++) {
                this.f20095h[i15] = this.f20096i[i15];
            }
        }
        iVar.f20105a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f20097j) {
            if (this.f20095h[i10] == iVar) {
                while (true) {
                    int i11 = this.f20097j;
                    if (i10 < i11 - 1) {
                        i[] iVarArr = this.f20095h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    } else {
                        this.f20097j = i11 - 1;
                        iVar.f20105a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // n2.b
    public void C(n2.b bVar, boolean z10) {
        i iVar = bVar.f20061a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f20065e;
        int a10 = aVar.a();
        for (int i10 = 0; i10 < a10; i10++) {
            i b10 = aVar.b(i10);
            float d10 = aVar.d(i10);
            this.f20098k.d(b10);
            if (this.f20098k.b(iVar, d10)) {
                F(b10);
            }
            this.f20062b += bVar.f20062b * d10;
        }
        G(iVar);
    }

    @Override // n2.b, n2.d.a
    public void a(i iVar) {
        this.f20098k.d(iVar);
        this.f20098k.i();
        iVar.f20113i[iVar.f20109e] = 1.0f;
        F(iVar);
    }

    @Override // n2.b, n2.d.a
    public i b(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f20097j; i11++) {
            i iVar = this.f20095h[i11];
            if (!zArr[iVar.f20107c]) {
                this.f20098k.d(iVar);
                if (i10 == -1) {
                    if (!this.f20098k.f()) {
                    }
                    i10 = i11;
                } else {
                    if (!this.f20098k.g(this.f20095h[i10])) {
                    }
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f20095h[i10];
    }

    @Override // n2.b, n2.d.a
    public void clear() {
        this.f20097j = 0;
        this.f20062b = 0.0f;
    }

    @Override // n2.b
    public String toString() {
        String str = " goal -> (" + this.f20062b + ") : ";
        for (int i10 = 0; i10 < this.f20097j; i10++) {
            this.f20098k.d(this.f20095h[i10]);
            str = str + this.f20098k + " ";
        }
        return str;
    }
}
