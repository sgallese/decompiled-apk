package androidx.compose.ui.semantics;

import dc.w;
import p1.u0;
import pc.l;
import qc.q;
import t1.d;
import t1.n;
import t1.x;

/* compiled from: SemanticsModifier.kt */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends u0<d> implements n {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3009c;

    /* renamed from: d  reason: collision with root package name */
    private final l<x, w> f3010d;

    /* JADX WARN: Multi-variable type inference failed */
    public AppendedSemanticsElement(boolean z10, l<? super x, w> lVar) {
        q.i(lVar, "properties");
        this.f3009c = z10;
        this.f3010d = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        if (this.f3009c == appendedSemanticsElement.f3009c && q.d(this.f3010d, appendedSemanticsElement.f3010d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // p1.u0
    public int hashCode() {
        boolean z10 = this.f3009c;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (r02 * 31) + this.f3010d.hashCode();
    }

    @Override // t1.n
    public t1.l q() {
        t1.l lVar = new t1.l();
        lVar.p(this.f3009c);
        this.f3010d.invoke(lVar);
        return lVar;
    }

    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f3009c + ", properties=" + this.f3010d + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public d e() {
        return new d(this.f3009c, false, this.f3010d);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(d dVar) {
        q.i(dVar, "node");
        dVar.I1(this.f3009c);
        dVar.J1(this.f3010d);
    }
}
