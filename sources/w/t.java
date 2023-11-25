package w;

/* compiled from: Padding.kt */
/* loaded from: classes.dex */
public final class t implements s {

    /* renamed from: a  reason: collision with root package name */
    private final float f25219a;

    /* renamed from: b  reason: collision with root package name */
    private final float f25220b;

    /* renamed from: c  reason: collision with root package name */
    private final float f25221c;

    /* renamed from: d  reason: collision with root package name */
    private final float f25222d;

    public /* synthetic */ t(float f10, float f11, float f12, float f13, qc.h hVar) {
        this(f10, f11, f12, f13);
    }

    @Override // w.s
    public float a() {
        return this.f25222d;
    }

    @Override // w.s
    public float b(j2.r rVar) {
        qc.q.i(rVar, "layoutDirection");
        if (rVar == j2.r.Ltr) {
            return this.f25221c;
        }
        return this.f25219a;
    }

    @Override // w.s
    public float c(j2.r rVar) {
        qc.q.i(rVar, "layoutDirection");
        if (rVar == j2.r.Ltr) {
            return this.f25219a;
        }
        return this.f25221c;
    }

    @Override // w.s
    public float d() {
        return this.f25220b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!j2.h.l(this.f25219a, tVar.f25219a) || !j2.h.l(this.f25220b, tVar.f25220b) || !j2.h.l(this.f25221c, tVar.f25221c) || !j2.h.l(this.f25222d, tVar.f25222d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((j2.h.m(this.f25219a) * 31) + j2.h.m(this.f25220b)) * 31) + j2.h.m(this.f25221c)) * 31) + j2.h.m(this.f25222d);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) j2.h.n(this.f25219a)) + ", top=" + ((Object) j2.h.n(this.f25220b)) + ", end=" + ((Object) j2.h.n(this.f25221c)) + ", bottom=" + ((Object) j2.h.n(this.f25222d)) + ')';
    }

    private t(float f10, float f11, float f12, float f13) {
        this.f25219a = f10;
        this.f25220b = f11;
        this.f25221c = f12;
        this.f25222d = f13;
    }
}
