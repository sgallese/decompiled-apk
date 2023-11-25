package e6;

import a2.c0;
import a2.l;
import qc.h;
import qc.q;

/* compiled from: ResourceUtils.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final l f14028a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f14029b;

    public a(l lVar, c0 c0Var) {
        q.i(lVar, "fontFamily");
        q.i(c0Var, "weight");
        this.f14028a = lVar;
        this.f14029b = c0Var;
    }

    public final l a() {
        return this.f14028a;
    }

    public final c0 b() {
        return this.f14029b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (q.d(this.f14028a, aVar.f14028a) && q.d(this.f14029b, aVar.f14029b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f14028a.hashCode() * 31) + this.f14029b.hashCode();
    }

    public String toString() {
        return "FontFamilyWithWeight(fontFamily=" + this.f14028a + ", weight=" + this.f14029b + ')';
    }

    public /* synthetic */ a(l lVar, c0 c0Var, int i10, h hVar) {
        this(lVar, (i10 & 2) != 0 ? c0.f239m.e() : c0Var);
    }
}
