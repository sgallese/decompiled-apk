package e1;

/* compiled from: PathNode.kt */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f13809a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13810b;

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class a extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13811c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13812d;

        /* renamed from: e  reason: collision with root package name */
        private final float f13813e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f13814f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f13815g;

        /* renamed from: h  reason: collision with root package name */
        private final float f13816h;

        /* renamed from: i  reason: collision with root package name */
        private final float f13817i;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13811c = r4
                r3.f13812d = r5
                r3.f13813e = r6
                r3.f13814f = r7
                r3.f13815g = r8
                r3.f13816h = r9
                r3.f13817i = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.a.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public final float c() {
            return this.f13816h;
        }

        public final float d() {
            return this.f13817i;
        }

        public final float e() {
            return this.f13811c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Float.compare(this.f13811c, aVar.f13811c) == 0 && Float.compare(this.f13812d, aVar.f13812d) == 0 && Float.compare(this.f13813e, aVar.f13813e) == 0 && this.f13814f == aVar.f13814f && this.f13815g == aVar.f13815g && Float.compare(this.f13816h, aVar.f13816h) == 0 && Float.compare(this.f13817i, aVar.f13817i) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f13813e;
        }

        public final float g() {
            return this.f13812d;
        }

        public final boolean h() {
            return this.f13814f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.f13811c) * 31) + Float.floatToIntBits(this.f13812d)) * 31) + Float.floatToIntBits(this.f13813e)) * 31;
            boolean z10 = this.f13814f;
            int i10 = 1;
            int i11 = z10;
            if (z10 != 0) {
                i11 = 1;
            }
            int i12 = (floatToIntBits + i11) * 31;
            boolean z11 = this.f13815g;
            if (!z11) {
                i10 = z11 ? 1 : 0;
            }
            return ((((i12 + i10) * 31) + Float.floatToIntBits(this.f13816h)) * 31) + Float.floatToIntBits(this.f13817i);
        }

        public final boolean i() {
            return this.f13815g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f13811c + ", verticalEllipseRadius=" + this.f13812d + ", theta=" + this.f13813e + ", isMoreThanHalf=" + this.f13814f + ", isPositiveArc=" + this.f13815g + ", arcStartX=" + this.f13816h + ", arcStartY=" + this.f13817i + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class b extends i {

        /* renamed from: c  reason: collision with root package name */
        public static final b f13818c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private b() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.b.<init>():void");
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class c extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13819c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13820d;

        /* renamed from: e  reason: collision with root package name */
        private final float f13821e;

        /* renamed from: f  reason: collision with root package name */
        private final float f13822f;

        /* renamed from: g  reason: collision with root package name */
        private final float f13823g;

        /* renamed from: h  reason: collision with root package name */
        private final float f13824h;

        public c(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f13819c = f10;
            this.f13820d = f11;
            this.f13821e = f12;
            this.f13822f = f13;
            this.f13823g = f14;
            this.f13824h = f15;
        }

        public final float c() {
            return this.f13819c;
        }

        public final float d() {
            return this.f13821e;
        }

        public final float e() {
            return this.f13823g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Float.compare(this.f13819c, cVar.f13819c) == 0 && Float.compare(this.f13820d, cVar.f13820d) == 0 && Float.compare(this.f13821e, cVar.f13821e) == 0 && Float.compare(this.f13822f, cVar.f13822f) == 0 && Float.compare(this.f13823g, cVar.f13823g) == 0 && Float.compare(this.f13824h, cVar.f13824h) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f13820d;
        }

        public final float g() {
            return this.f13822f;
        }

        public final float h() {
            return this.f13824h;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.f13819c) * 31) + Float.floatToIntBits(this.f13820d)) * 31) + Float.floatToIntBits(this.f13821e)) * 31) + Float.floatToIntBits(this.f13822f)) * 31) + Float.floatToIntBits(this.f13823g)) * 31) + Float.floatToIntBits(this.f13824h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f13819c + ", y1=" + this.f13820d + ", x2=" + this.f13821e + ", y2=" + this.f13822f + ", x3=" + this.f13823g + ", y3=" + this.f13824h + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class d extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13825c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13825c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.d.<init>(float):void");
        }

        public final float c() {
            return this.f13825c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && Float.compare(this.f13825c, ((d) obj).f13825c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f13825c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f13825c + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class e extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13826c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13827d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13826c = r4
                r3.f13827d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.e.<init>(float, float):void");
        }

        public final float c() {
            return this.f13826c;
        }

        public final float d() {
            return this.f13827d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (Float.compare(this.f13826c, eVar.f13826c) == 0 && Float.compare(this.f13827d, eVar.f13827d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f13826c) * 31) + Float.floatToIntBits(this.f13827d);
        }

        public String toString() {
            return "LineTo(x=" + this.f13826c + ", y=" + this.f13827d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class f extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13828c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13829d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public f(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13828c = r4
                r3.f13829d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.f.<init>(float, float):void");
        }

        public final float c() {
            return this.f13828c;
        }

        public final float d() {
            return this.f13829d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (Float.compare(this.f13828c, fVar.f13828c) == 0 && Float.compare(this.f13829d, fVar.f13829d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f13828c) * 31) + Float.floatToIntBits(this.f13829d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f13828c + ", y=" + this.f13829d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class g extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13830c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13831d;

        /* renamed from: e  reason: collision with root package name */
        private final float f13832e;

        /* renamed from: f  reason: collision with root package name */
        private final float f13833f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public g(float r4, float r5, float r6, float r7) {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                r3.f13830c = r4
                r3.f13831d = r5
                r3.f13832e = r6
                r3.f13833f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.g.<init>(float, float, float, float):void");
        }

        public final float c() {
            return this.f13830c;
        }

        public final float d() {
            return this.f13832e;
        }

        public final float e() {
            return this.f13831d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (Float.compare(this.f13830c, gVar.f13830c) == 0 && Float.compare(this.f13831d, gVar.f13831d) == 0 && Float.compare(this.f13832e, gVar.f13832e) == 0 && Float.compare(this.f13833f, gVar.f13833f) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f13833f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f13830c) * 31) + Float.floatToIntBits(this.f13831d)) * 31) + Float.floatToIntBits(this.f13832e)) * 31) + Float.floatToIntBits(this.f13833f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f13830c + ", y1=" + this.f13831d + ", x2=" + this.f13832e + ", y2=" + this.f13833f + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class h extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13834c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13835d;

        /* renamed from: e  reason: collision with root package name */
        private final float f13836e;

        /* renamed from: f  reason: collision with root package name */
        private final float f13837f;

        public h(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f13834c = f10;
            this.f13835d = f11;
            this.f13836e = f12;
            this.f13837f = f13;
        }

        public final float c() {
            return this.f13834c;
        }

        public final float d() {
            return this.f13836e;
        }

        public final float e() {
            return this.f13835d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (Float.compare(this.f13834c, hVar.f13834c) == 0 && Float.compare(this.f13835d, hVar.f13835d) == 0 && Float.compare(this.f13836e, hVar.f13836e) == 0 && Float.compare(this.f13837f, hVar.f13837f) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f13837f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f13834c) * 31) + Float.floatToIntBits(this.f13835d)) * 31) + Float.floatToIntBits(this.f13836e)) * 31) + Float.floatToIntBits(this.f13837f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f13834c + ", y1=" + this.f13835d + ", x2=" + this.f13836e + ", y2=" + this.f13837f + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* renamed from: e1.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0330i extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13838c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13839d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0330i(float r4, float r5) {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                r3.f13838c = r4
                r3.f13839d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.C0330i.<init>(float, float):void");
        }

        public final float c() {
            return this.f13838c;
        }

        public final float d() {
            return this.f13839d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0330i)) {
                return false;
            }
            C0330i c0330i = (C0330i) obj;
            if (Float.compare(this.f13838c, c0330i.f13838c) == 0 && Float.compare(this.f13839d, c0330i.f13839d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f13838c) * 31) + Float.floatToIntBits(this.f13839d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f13838c + ", y=" + this.f13839d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class j extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13840c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13841d;

        /* renamed from: e  reason: collision with root package name */
        private final float f13842e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f13843f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f13844g;

        /* renamed from: h  reason: collision with root package name */
        private final float f13845h;

        /* renamed from: i  reason: collision with root package name */
        private final float f13846i;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public j(float r4, float r5, float r6, boolean r7, boolean r8, float r9, float r10) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13840c = r4
                r3.f13841d = r5
                r3.f13842e = r6
                r3.f13843f = r7
                r3.f13844g = r8
                r3.f13845h = r9
                r3.f13846i = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.j.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public final float c() {
            return this.f13845h;
        }

        public final float d() {
            return this.f13846i;
        }

        public final float e() {
            return this.f13840c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (Float.compare(this.f13840c, jVar.f13840c) == 0 && Float.compare(this.f13841d, jVar.f13841d) == 0 && Float.compare(this.f13842e, jVar.f13842e) == 0 && this.f13843f == jVar.f13843f && this.f13844g == jVar.f13844g && Float.compare(this.f13845h, jVar.f13845h) == 0 && Float.compare(this.f13846i, jVar.f13846i) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f13842e;
        }

        public final float g() {
            return this.f13841d;
        }

        public final boolean h() {
            return this.f13843f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int floatToIntBits = ((((Float.floatToIntBits(this.f13840c) * 31) + Float.floatToIntBits(this.f13841d)) * 31) + Float.floatToIntBits(this.f13842e)) * 31;
            boolean z10 = this.f13843f;
            int i10 = 1;
            int i11 = z10;
            if (z10 != 0) {
                i11 = 1;
            }
            int i12 = (floatToIntBits + i11) * 31;
            boolean z11 = this.f13844g;
            if (!z11) {
                i10 = z11 ? 1 : 0;
            }
            return ((((i12 + i10) * 31) + Float.floatToIntBits(this.f13845h)) * 31) + Float.floatToIntBits(this.f13846i);
        }

        public final boolean i() {
            return this.f13844g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f13840c + ", verticalEllipseRadius=" + this.f13841d + ", theta=" + this.f13842e + ", isMoreThanHalf=" + this.f13843f + ", isPositiveArc=" + this.f13844g + ", arcStartDx=" + this.f13845h + ", arcStartDy=" + this.f13846i + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class k extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13847c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13848d;

        /* renamed from: e  reason: collision with root package name */
        private final float f13849e;

        /* renamed from: f  reason: collision with root package name */
        private final float f13850f;

        /* renamed from: g  reason: collision with root package name */
        private final float f13851g;

        /* renamed from: h  reason: collision with root package name */
        private final float f13852h;

        public k(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f13847c = f10;
            this.f13848d = f11;
            this.f13849e = f12;
            this.f13850f = f13;
            this.f13851g = f14;
            this.f13852h = f15;
        }

        public final float c() {
            return this.f13847c;
        }

        public final float d() {
            return this.f13849e;
        }

        public final float e() {
            return this.f13851g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (Float.compare(this.f13847c, kVar.f13847c) == 0 && Float.compare(this.f13848d, kVar.f13848d) == 0 && Float.compare(this.f13849e, kVar.f13849e) == 0 && Float.compare(this.f13850f, kVar.f13850f) == 0 && Float.compare(this.f13851g, kVar.f13851g) == 0 && Float.compare(this.f13852h, kVar.f13852h) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f13848d;
        }

        public final float g() {
            return this.f13850f;
        }

        public final float h() {
            return this.f13852h;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.f13847c) * 31) + Float.floatToIntBits(this.f13848d)) * 31) + Float.floatToIntBits(this.f13849e)) * 31) + Float.floatToIntBits(this.f13850f)) * 31) + Float.floatToIntBits(this.f13851g)) * 31) + Float.floatToIntBits(this.f13852h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f13847c + ", dy1=" + this.f13848d + ", dx2=" + this.f13849e + ", dy2=" + this.f13850f + ", dx3=" + this.f13851g + ", dy3=" + this.f13852h + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class l extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13853c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public l(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13853c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.l.<init>(float):void");
        }

        public final float c() {
            return this.f13853c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof l) && Float.compare(this.f13853c, ((l) obj).f13853c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f13853c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f13853c + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class m extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13854c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13855d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public m(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13854c = r4
                r3.f13855d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.m.<init>(float, float):void");
        }

        public final float c() {
            return this.f13854c;
        }

        public final float d() {
            return this.f13855d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (Float.compare(this.f13854c, mVar.f13854c) == 0 && Float.compare(this.f13855d, mVar.f13855d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f13854c) * 31) + Float.floatToIntBits(this.f13855d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f13854c + ", dy=" + this.f13855d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class n extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13856c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13857d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public n(float r4, float r5) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13856c = r4
                r3.f13857d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.n.<init>(float, float):void");
        }

        public final float c() {
            return this.f13856c;
        }

        public final float d() {
            return this.f13857d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (Float.compare(this.f13856c, nVar.f13856c) == 0 && Float.compare(this.f13857d, nVar.f13857d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f13856c) * 31) + Float.floatToIntBits(this.f13857d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f13856c + ", dy=" + this.f13857d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class o extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13858c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13859d;

        /* renamed from: e  reason: collision with root package name */
        private final float f13860e;

        /* renamed from: f  reason: collision with root package name */
        private final float f13861f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public o(float r4, float r5, float r6, float r7) {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                r3.f13858c = r4
                r3.f13859d = r5
                r3.f13860e = r6
                r3.f13861f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.o.<init>(float, float, float, float):void");
        }

        public final float c() {
            return this.f13858c;
        }

        public final float d() {
            return this.f13860e;
        }

        public final float e() {
            return this.f13859d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            if (Float.compare(this.f13858c, oVar.f13858c) == 0 && Float.compare(this.f13859d, oVar.f13859d) == 0 && Float.compare(this.f13860e, oVar.f13860e) == 0 && Float.compare(this.f13861f, oVar.f13861f) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f13861f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f13858c) * 31) + Float.floatToIntBits(this.f13859d)) * 31) + Float.floatToIntBits(this.f13860e)) * 31) + Float.floatToIntBits(this.f13861f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f13858c + ", dy1=" + this.f13859d + ", dx2=" + this.f13860e + ", dy2=" + this.f13861f + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class p extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13862c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13863d;

        /* renamed from: e  reason: collision with root package name */
        private final float f13864e;

        /* renamed from: f  reason: collision with root package name */
        private final float f13865f;

        public p(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f13862c = f10;
            this.f13863d = f11;
            this.f13864e = f12;
            this.f13865f = f13;
        }

        public final float c() {
            return this.f13862c;
        }

        public final float d() {
            return this.f13864e;
        }

        public final float e() {
            return this.f13863d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            if (Float.compare(this.f13862c, pVar.f13862c) == 0 && Float.compare(this.f13863d, pVar.f13863d) == 0 && Float.compare(this.f13864e, pVar.f13864e) == 0 && Float.compare(this.f13865f, pVar.f13865f) == 0) {
                return true;
            }
            return false;
        }

        public final float f() {
            return this.f13865f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f13862c) * 31) + Float.floatToIntBits(this.f13863d)) * 31) + Float.floatToIntBits(this.f13864e)) * 31) + Float.floatToIntBits(this.f13865f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f13862c + ", dy1=" + this.f13863d + ", dx2=" + this.f13864e + ", dy2=" + this.f13865f + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class q extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13866c;

        /* renamed from: d  reason: collision with root package name */
        private final float f13867d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public q(float r4, float r5) {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3.<init>(r2, r0, r0, r1)
                r3.f13866c = r4
                r3.f13867d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.q.<init>(float, float):void");
        }

        public final float c() {
            return this.f13866c;
        }

        public final float d() {
            return this.f13867d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            if (Float.compare(this.f13866c, qVar.f13866c) == 0 && Float.compare(this.f13867d, qVar.f13867d) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f13866c) * 31) + Float.floatToIntBits(this.f13867d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f13866c + ", dy=" + this.f13867d + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class r extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13868c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public r(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13868c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.r.<init>(float):void");
        }

        public final float c() {
            return this.f13868c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof r) && Float.compare(this.f13868c, ((r) obj).f13868c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f13868c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f13868c + ')';
        }
    }

    /* compiled from: PathNode.kt */
    /* loaded from: classes.dex */
    public static final class s extends i {

        /* renamed from: c  reason: collision with root package name */
        private final float f13869c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public s(float r4) {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                r3.f13869c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.i.s.<init>(float):void");
        }

        public final float c() {
            return this.f13869c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof s) && Float.compare(this.f13869c, ((s) obj).f13869c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f13869c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f13869c + ')';
        }
    }

    public /* synthetic */ i(boolean z10, boolean z11, qc.h hVar) {
        this(z10, z11);
    }

    public final boolean a() {
        return this.f13809a;
    }

    public final boolean b() {
        return this.f13810b;
    }

    private i(boolean z10, boolean z11) {
        this.f13809a = z10;
        this.f13810b = z11;
    }

    public /* synthetic */ i(boolean z10, boolean z11, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }
}
