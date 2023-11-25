package c0;

import a2.l;

/* compiled from: TextFieldSize.kt */
/* loaded from: classes.dex */
final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private j2.r f8559a;

    /* renamed from: b  reason: collision with root package name */
    private j2.e f8560b;

    /* renamed from: c  reason: collision with root package name */
    private l.b f8561c;

    /* renamed from: d  reason: collision with root package name */
    private v1.k0 f8562d;

    /* renamed from: e  reason: collision with root package name */
    private Object f8563e;

    /* renamed from: f  reason: collision with root package name */
    private long f8564f;

    public r0(j2.r rVar, j2.e eVar, l.b bVar, v1.k0 k0Var, Object obj) {
        qc.q.i(rVar, "layoutDirection");
        qc.q.i(eVar, "density");
        qc.q.i(bVar, "fontFamilyResolver");
        qc.q.i(k0Var, "resolvedStyle");
        qc.q.i(obj, "typeface");
        this.f8559a = rVar;
        this.f8560b = eVar;
        this.f8561c = bVar;
        this.f8562d = k0Var;
        this.f8563e = obj;
        this.f8564f = a();
    }

    private final long a() {
        return i0.b(this.f8562d, this.f8560b, this.f8561c, null, 0, 24, null);
    }

    public final long b() {
        return this.f8564f;
    }

    public final void c(j2.r rVar, j2.e eVar, l.b bVar, v1.k0 k0Var, Object obj) {
        qc.q.i(rVar, "layoutDirection");
        qc.q.i(eVar, "density");
        qc.q.i(bVar, "fontFamilyResolver");
        qc.q.i(k0Var, "resolvedStyle");
        qc.q.i(obj, "typeface");
        if (rVar != this.f8559a || !qc.q.d(eVar, this.f8560b) || !qc.q.d(bVar, this.f8561c) || !qc.q.d(k0Var, this.f8562d) || !qc.q.d(obj, this.f8563e)) {
            this.f8559a = rVar;
            this.f8560b = eVar;
            this.f8561c = bVar;
            this.f8562d = k0Var;
            this.f8563e = obj;
            this.f8564f = a();
        }
    }
}
