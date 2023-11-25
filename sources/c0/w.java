package c0;

/* compiled from: KeyboardActions.kt */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: g  reason: collision with root package name */
    public static final a f8602g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    private static final w f8603h = new w(null, null, null, null, null, null, 63, null);

    /* renamed from: a  reason: collision with root package name */
    private final pc.l<Object, dc.w> f8604a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.l<Object, dc.w> f8605b;

    /* renamed from: c  reason: collision with root package name */
    private final pc.l<Object, dc.w> f8606c;

    /* renamed from: d  reason: collision with root package name */
    private final pc.l<Object, dc.w> f8607d;

    /* renamed from: e  reason: collision with root package name */
    private final pc.l<Object, dc.w> f8608e;

    /* renamed from: f  reason: collision with root package name */
    private final pc.l<Object, dc.w> f8609f;

    /* compiled from: KeyboardActions.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final w a() {
            return w.f8603h;
        }
    }

    public w() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final pc.l<Object, dc.w> b() {
        return this.f8604a;
    }

    public final pc.l<Object, dc.w> c() {
        return this.f8605b;
    }

    public final pc.l<Object, dc.w> d() {
        return this.f8606c;
    }

    public final pc.l<Object, dc.w> e() {
        return this.f8607d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (qc.q.d(this.f8604a, wVar.f8604a) && qc.q.d(this.f8605b, wVar.f8605b) && qc.q.d(this.f8606c, wVar.f8606c) && qc.q.d(this.f8607d, wVar.f8607d) && qc.q.d(this.f8608e, wVar.f8608e) && qc.q.d(this.f8609f, wVar.f8609f)) {
            return true;
        }
        return false;
    }

    public final pc.l<Object, dc.w> f() {
        return this.f8608e;
    }

    public final pc.l<Object, dc.w> g() {
        return this.f8609f;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        pc.l<Object, dc.w> lVar = this.f8604a;
        int i15 = 0;
        if (lVar != null) {
            i10 = lVar.hashCode();
        } else {
            i10 = 0;
        }
        int i16 = i10 * 31;
        pc.l<Object, dc.w> lVar2 = this.f8605b;
        if (lVar2 != null) {
            i11 = lVar2.hashCode();
        } else {
            i11 = 0;
        }
        int i17 = (i16 + i11) * 31;
        pc.l<Object, dc.w> lVar3 = this.f8606c;
        if (lVar3 != null) {
            i12 = lVar3.hashCode();
        } else {
            i12 = 0;
        }
        int i18 = (i17 + i12) * 31;
        pc.l<Object, dc.w> lVar4 = this.f8607d;
        if (lVar4 != null) {
            i13 = lVar4.hashCode();
        } else {
            i13 = 0;
        }
        int i19 = (i18 + i13) * 31;
        pc.l<Object, dc.w> lVar5 = this.f8608e;
        if (lVar5 != null) {
            i14 = lVar5.hashCode();
        } else {
            i14 = 0;
        }
        int i20 = (i19 + i14) * 31;
        pc.l<Object, dc.w> lVar6 = this.f8609f;
        if (lVar6 != null) {
            i15 = lVar6.hashCode();
        }
        return i20 + i15;
    }

    public w(pc.l<Object, dc.w> lVar, pc.l<Object, dc.w> lVar2, pc.l<Object, dc.w> lVar3, pc.l<Object, dc.w> lVar4, pc.l<Object, dc.w> lVar5, pc.l<Object, dc.w> lVar6) {
        this.f8604a = lVar;
        this.f8605b = lVar2;
        this.f8606c = lVar3;
        this.f8607d = lVar4;
        this.f8608e = lVar5;
        this.f8609f = lVar6;
    }

    public /* synthetic */ w(pc.l lVar, pc.l lVar2, pc.l lVar3, pc.l lVar4, pc.l lVar5, pc.l lVar6, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? null : lVar, (i10 & 2) != 0 ? null : lVar2, (i10 & 4) != 0 ? null : lVar3, (i10 & 8) != 0 ? null : lVar4, (i10 & 16) != 0 ? null : lVar5, (i10 & 32) != 0 ? null : lVar6);
    }
}
