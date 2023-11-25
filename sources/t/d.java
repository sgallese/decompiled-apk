package t;

import a1.e4;
import a1.h1;
import a1.t3;
import a1.u0;

/* compiled from: Border.kt */
/* loaded from: classes.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private t3 f23123a;

    /* renamed from: b  reason: collision with root package name */
    private h1 f23124b;

    /* renamed from: c  reason: collision with root package name */
    private c1.a f23125c;

    /* renamed from: d  reason: collision with root package name */
    private e4 f23126d;

    public d() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (qc.q.d(this.f23123a, dVar.f23123a) && qc.q.d(this.f23124b, dVar.f23124b) && qc.q.d(this.f23125c, dVar.f23125c) && qc.q.d(this.f23126d, dVar.f23126d)) {
            return true;
        }
        return false;
    }

    public final e4 g() {
        e4 e4Var = this.f23126d;
        if (e4Var == null) {
            e4 a10 = u0.a();
            this.f23126d = a10;
            return a10;
        }
        return e4Var;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        t3 t3Var = this.f23123a;
        int i10 = 0;
        if (t3Var == null) {
            hashCode = 0;
        } else {
            hashCode = t3Var.hashCode();
        }
        int i11 = hashCode * 31;
        h1 h1Var = this.f23124b;
        if (h1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = h1Var.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        c1.a aVar = this.f23125c;
        if (aVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aVar.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        e4 e4Var = this.f23126d;
        if (e4Var != null) {
            i10 = e4Var.hashCode();
        }
        return i13 + i10;
    }

    public String toString() {
        return "BorderCache(imageBitmap=" + this.f23123a + ", canvas=" + this.f23124b + ", canvasDrawScope=" + this.f23125c + ", borderPath=" + this.f23126d + ')';
    }

    public d(t3 t3Var, h1 h1Var, c1.a aVar, e4 e4Var) {
        this.f23123a = t3Var;
        this.f23124b = h1Var;
        this.f23125c = aVar;
        this.f23126d = e4Var;
    }

    public /* synthetic */ d(t3 t3Var, h1 h1Var, c1.a aVar, e4 e4Var, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? null : t3Var, (i10 & 2) != 0 ? null : h1Var, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? null : e4Var);
    }
}
