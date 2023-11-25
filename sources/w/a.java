package w;

import v0.b;

/* compiled from: Arrangement.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25135a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final d f25136b = new j();

    /* renamed from: c  reason: collision with root package name */
    private static final d f25137c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final l f25138d = new k();

    /* renamed from: e  reason: collision with root package name */
    private static final l f25139e = new C0576a();

    /* renamed from: f  reason: collision with root package name */
    private static final e f25140f = new b();

    /* renamed from: g  reason: collision with root package name */
    private static final e f25141g = new h();

    /* renamed from: h  reason: collision with root package name */
    private static final e f25142h = new g();

    /* renamed from: i  reason: collision with root package name */
    private static final e f25143i = new f();

    /* compiled from: Arrangement.kt */
    /* renamed from: w.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0576a implements l {
        C0576a() {
        }

        @Override // w.a.l
        public /* synthetic */ float a() {
            return w.c.a(this);
        }

        @Override // w.a.l
        public void c(j2.e eVar, int i10, int[] iArr, int[] iArr2) {
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(iArr2, "outPositions");
            a.f25135a.i(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f25144a = j2.h.j(0);

        b() {
        }

        @Override // w.a.d, w.a.l
        public float a() {
            return this.f25144a;
        }

        @Override // w.a.d
        public void b(j2.e eVar, int i10, int[] iArr, j2.r rVar, int[] iArr2) {
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(iArr2, "outPositions");
            if (rVar == j2.r.Ltr) {
                a.f25135a.g(i10, iArr, iArr2, false);
            } else {
                a.f25135a.g(i10, iArr, iArr2, true);
            }
        }

        @Override // w.a.l
        public void c(j2.e eVar, int i10, int[] iArr, int[] iArr2) {
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(iArr2, "outPositions");
            a.f25135a.g(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class c implements d {
        c() {
        }

        @Override // w.a.d, w.a.l
        public /* synthetic */ float a() {
            return w.b.a(this);
        }

        @Override // w.a.d
        public void b(j2.e eVar, int i10, int[] iArr, j2.r rVar, int[] iArr2) {
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(iArr2, "outPositions");
            if (rVar == j2.r.Ltr) {
                a.f25135a.i(i10, iArr, iArr2, false);
            } else {
                a.f25135a.h(iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#End";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public interface d {
        float a();

        void b(j2.e eVar, int i10, int[] iArr, j2.r rVar, int[] iArr2);
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public interface e extends d, l {
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class f implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f25145a = j2.h.j(0);

        f() {
        }

        @Override // w.a.d, w.a.l
        public float a() {
            return this.f25145a;
        }

        @Override // w.a.d
        public void b(j2.e eVar, int i10, int[] iArr, j2.r rVar, int[] iArr2) {
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(iArr2, "outPositions");
            if (rVar == j2.r.Ltr) {
                a.f25135a.j(i10, iArr, iArr2, false);
            } else {
                a.f25135a.j(i10, iArr, iArr2, true);
            }
        }

        @Override // w.a.l
        public void c(j2.e eVar, int i10, int[] iArr, int[] iArr2) {
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(iArr2, "outPositions");
            a.f25135a.j(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class g implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f25146a = j2.h.j(0);

        g() {
        }

        @Override // w.a.d, w.a.l
        public float a() {
            return this.f25146a;
        }

        @Override // w.a.d
        public void b(j2.e eVar, int i10, int[] iArr, j2.r rVar, int[] iArr2) {
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(iArr2, "outPositions");
            if (rVar == j2.r.Ltr) {
                a.f25135a.k(i10, iArr, iArr2, false);
            } else {
                a.f25135a.k(i10, iArr, iArr2, true);
            }
        }

        @Override // w.a.l
        public void c(j2.e eVar, int i10, int[] iArr, int[] iArr2) {
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(iArr2, "outPositions");
            a.f25135a.k(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class h implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f25147a = j2.h.j(0);

        h() {
        }

        @Override // w.a.d, w.a.l
        public float a() {
            return this.f25147a;
        }

        @Override // w.a.d
        public void b(j2.e eVar, int i10, int[] iArr, j2.r rVar, int[] iArr2) {
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(iArr2, "outPositions");
            if (rVar == j2.r.Ltr) {
                a.f25135a.l(i10, iArr, iArr2, false);
            } else {
                a.f25135a.l(i10, iArr, iArr2, true);
            }
        }

        @Override // w.a.l
        public void c(j2.e eVar, int i10, int[] iArr, int[] iArr2) {
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(iArr2, "outPositions");
            a.f25135a.l(i10, iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class i implements e {

        /* renamed from: a  reason: collision with root package name */
        private final float f25148a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f25149b;

        /* renamed from: c  reason: collision with root package name */
        private final pc.p<Integer, j2.r, Integer> f25150c;

        /* renamed from: d  reason: collision with root package name */
        private final float f25151d;

        public /* synthetic */ i(float f10, boolean z10, pc.p pVar, qc.h hVar) {
            this(f10, z10, pVar);
        }

        @Override // w.a.d, w.a.l
        public float a() {
            return this.f25151d;
        }

        @Override // w.a.d
        public void b(j2.e eVar, int i10, int[] iArr, j2.r rVar, int[] iArr2) {
            boolean z10;
            boolean z11;
            int i11;
            int i12;
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(iArr2, "outPositions");
            if (iArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return;
            }
            int K0 = eVar.K0(this.f25148a);
            if (this.f25149b && rVar == j2.r.Rtl) {
                z11 = true;
            } else {
                z11 = false;
            }
            a aVar = a.f25135a;
            if (!z11) {
                int length = iArr.length;
                int i13 = 0;
                i11 = 0;
                i12 = 0;
                int i14 = 0;
                while (i13 < length) {
                    int i15 = iArr[i13];
                    int min = Math.min(i11, i10 - i15);
                    iArr2[i14] = min;
                    int min2 = Math.min(K0, (i10 - min) - i15);
                    int i16 = iArr2[i14] + i15 + min2;
                    i13++;
                    i14++;
                    i12 = min2;
                    i11 = i16;
                }
            } else {
                i11 = 0;
                i12 = 0;
                for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                    int i17 = iArr[length2];
                    int min3 = Math.min(i11, i10 - i17);
                    iArr2[length2] = min3;
                    i12 = Math.min(K0, (i10 - min3) - i17);
                    i11 = iArr2[length2] + i17 + i12;
                }
            }
            int i18 = i11 - i12;
            pc.p<Integer, j2.r, Integer> pVar = this.f25150c;
            if (pVar != null && i18 < i10) {
                int intValue = pVar.invoke(Integer.valueOf(i10 - i18), rVar).intValue();
                int length3 = iArr2.length;
                for (int i19 = 0; i19 < length3; i19++) {
                    iArr2[i19] = iArr2[i19] + intValue;
                }
            }
        }

        @Override // w.a.l
        public void c(j2.e eVar, int i10, int[] iArr, int[] iArr2) {
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(iArr2, "outPositions");
            b(eVar, i10, iArr, j2.r.Ltr, iArr2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (j2.h.l(this.f25148a, iVar.f25148a) && this.f25149b == iVar.f25149b && qc.q.d(this.f25150c, iVar.f25150c)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int m10 = j2.h.m(this.f25148a) * 31;
            boolean z10 = this.f25149b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (m10 + i10) * 31;
            pc.p<Integer, j2.r, Integer> pVar = this.f25150c;
            if (pVar == null) {
                hashCode = 0;
            } else {
                hashCode = pVar.hashCode();
            }
            return i11 + hashCode;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            if (this.f25149b) {
                str = "";
            } else {
                str = "Absolute";
            }
            sb2.append(str);
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) j2.h.n(this.f25148a));
            sb2.append(", ");
            sb2.append(this.f25150c);
            sb2.append(')');
            return sb2.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private i(float f10, boolean z10, pc.p<? super Integer, ? super j2.r, Integer> pVar) {
            this.f25148a = f10;
            this.f25149b = z10;
            this.f25150c = pVar;
            this.f25151d = f10;
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class j implements d {
        j() {
        }

        @Override // w.a.d, w.a.l
        public /* synthetic */ float a() {
            return w.b.a(this);
        }

        @Override // w.a.d
        public void b(j2.e eVar, int i10, int[] iArr, j2.r rVar, int[] iArr2) {
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(rVar, "layoutDirection");
            qc.q.i(iArr2, "outPositions");
            if (rVar == j2.r.Ltr) {
                a.f25135a.h(iArr, iArr2, false);
            } else {
                a.f25135a.i(i10, iArr, iArr2, true);
            }
        }

        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public static final class k implements l {
        k() {
        }

        @Override // w.a.l
        public /* synthetic */ float a() {
            return w.c.a(this);
        }

        @Override // w.a.l
        public void c(j2.e eVar, int i10, int[] iArr, int[] iArr2) {
            qc.q.i(eVar, "<this>");
            qc.q.i(iArr, "sizes");
            qc.q.i(iArr2, "outPositions");
            a.f25135a.h(iArr, iArr2, false);
        }

        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    public interface l {
        float a();

        void c(j2.e eVar, int i10, int[] iArr, int[] iArr2);
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    static final class m extends qc.r implements pc.p<Integer, j2.r, Integer> {

        /* renamed from: f  reason: collision with root package name */
        public static final m f25152f = new m();

        m() {
            super(2);
        }

        public final Integer a(int i10, j2.r rVar) {
            qc.q.i(rVar, "layoutDirection");
            return Integer.valueOf(v0.b.f24258a.j().a(0, i10, rVar));
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, j2.r rVar) {
            return a(num.intValue(), rVar);
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    static final class n extends qc.r implements pc.p<Integer, j2.r, Integer> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b.InterfaceC0571b f25153f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(b.InterfaceC0571b interfaceC0571b) {
            super(2);
            this.f25153f = interfaceC0571b;
        }

        public final Integer a(int i10, j2.r rVar) {
            qc.q.i(rVar, "layoutDirection");
            return Integer.valueOf(this.f25153f.a(0, i10, rVar));
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, j2.r rVar) {
            return a(num.intValue(), rVar);
        }
    }

    /* compiled from: Arrangement.kt */
    /* loaded from: classes.dex */
    static final class o extends qc.r implements pc.p<Integer, j2.r, Integer> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b.c f25154f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(b.c cVar) {
            super(2);
            this.f25154f = cVar;
        }

        public final Integer a(int i10, j2.r rVar) {
            qc.q.i(rVar, "<anonymous parameter 1>");
            return Integer.valueOf(this.f25154f.a(0, i10));
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, j2.r rVar) {
            return a(num.intValue(), rVar);
        }
    }

    private a() {
    }

    public final l a() {
        return f25139e;
    }

    public final e b() {
        return f25140f;
    }

    public final e c() {
        return f25142h;
    }

    public final e d() {
        return f25141g;
    }

    public final d e() {
        return f25136b;
    }

    public final l f() {
        return f25138d;
    }

    public final void g(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int d10;
        int d11;
        qc.q.i(iArr, "size");
        qc.q.i(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f10 = (i10 - i12) / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                d11 = sc.c.d(f10);
                iArr2[i14] = d11;
                f10 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i16 = iArr[length2];
                d10 = sc.c.d(f10);
                iArr2[length2] = d10;
                f10 += i16;
            } else {
                return;
            }
        }
    }

    public final void h(int[] iArr, int[] iArr2, boolean z10) {
        qc.q.i(iArr, "size");
        qc.q.i(iArr2, "outPosition");
        int i10 = 0;
        if (!z10) {
            int length = iArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = iArr[i10];
                iArr2[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i14 = iArr[length2];
                iArr2[length2] = i10;
                i10 += i14;
            } else {
                return;
            }
        }
    }

    public final void i(int i10, int[] iArr, int[] iArr2, boolean z10) {
        qc.q.i(iArr, "size");
        qc.q.i(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = iArr.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = iArr[i11];
                iArr2[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i17 = iArr[length2];
                iArr2[length2] = i14;
                i14 += i17;
            } else {
                return;
            }
        }
    }

    public final void j(int i10, int[] iArr, int[] iArr2, boolean z10) {
        boolean z11;
        float f10;
        int d10;
        int d11;
        qc.q.i(iArr, "size");
        qc.q.i(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        if (iArr.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((!z11) != false) {
            f10 = (i10 - i12) / iArr.length;
        } else {
            f10 = 0.0f;
        }
        float f11 = f10 / 2;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                d11 = sc.c.d(f11);
                iArr2[i14] = d11;
                f11 += i15 + f10;
                i11++;
                i14++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i16 = iArr[length2];
            d10 = sc.c.d(f11);
            iArr2[length2] = d10;
            f11 += i16 + f10;
        }
    }

    public final void k(int i10, int[] iArr, int[] iArr2, boolean z10) {
        boolean z11;
        int O;
        float f10;
        int d10;
        int d11;
        qc.q.i(iArr, "size");
        qc.q.i(iArr2, "outPosition");
        int i11 = 0;
        if (iArr.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return;
        }
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        O = ec.p.O(iArr);
        float max = (i10 - i12) / Math.max(O, 1);
        if (z10 && iArr.length == 1) {
            f10 = max;
        } else {
            f10 = 0.0f;
        }
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = iArr[i11];
                d11 = sc.c.d(f10);
                iArr2[i14] = d11;
                f10 += i15 + max;
                i11++;
                i14++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i16 = iArr[length2];
            d10 = sc.c.d(f10);
            iArr2[length2] = d10;
            f10 += i16 + max;
        }
    }

    public final void l(int i10, int[] iArr, int[] iArr2, boolean z10) {
        int d10;
        int d11;
        qc.q.i(iArr, "size");
        qc.q.i(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (!z10) {
            int length2 = iArr.length;
            float f10 = length;
            int i14 = 0;
            while (i11 < length2) {
                int i15 = iArr[i11];
                d11 = sc.c.d(f10);
                iArr2[i14] = d11;
                f10 += i15 + length;
                i11++;
                i14++;
            }
            return;
        }
        float f11 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i16 = iArr[length3];
            d10 = sc.c.d(f11);
            iArr2[length3] = d10;
            f11 += i16 + length;
        }
    }

    public final e m(float f10) {
        return new i(f10, true, m.f25152f, null);
    }

    public final d n(float f10, b.InterfaceC0571b interfaceC0571b) {
        qc.q.i(interfaceC0571b, "alignment");
        return new i(f10, true, new n(interfaceC0571b), null);
    }

    public final l o(float f10, b.c cVar) {
        qc.q.i(cVar, "alignment");
        return new i(f10, false, new o(cVar), null);
    }
}
