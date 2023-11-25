package f6;

import f0.g2;
import f0.h1;
import f0.j;
import qc.q;

/* compiled from: MdcTheme.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final j f15551a;

    /* renamed from: b  reason: collision with root package name */
    private final g2 f15552b;

    /* renamed from: c  reason: collision with root package name */
    private final h1 f15553c;

    public c(j jVar, g2 g2Var, h1 h1Var) {
        this.f15551a = jVar;
        this.f15552b = g2Var;
        this.f15553c = h1Var;
    }

    public final j a() {
        return this.f15551a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (q.d(this.f15551a, cVar.f15551a) && q.d(this.f15552b, cVar.f15552b) && q.d(this.f15553c, cVar.f15553c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        j jVar = this.f15551a;
        int i10 = 0;
        if (jVar == null) {
            hashCode = 0;
        } else {
            hashCode = jVar.hashCode();
        }
        int i11 = hashCode * 31;
        g2 g2Var = this.f15552b;
        if (g2Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = g2Var.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        h1 h1Var = this.f15553c;
        if (h1Var != null) {
            i10 = h1Var.hashCode();
        }
        return i12 + i10;
    }

    public String toString() {
        return "ThemeParameters(colors=" + this.f15551a + ", typography=" + this.f15552b + ", shapes=" + this.f15553c + ')';
    }
}
