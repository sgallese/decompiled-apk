package a2;

/* compiled from: AndroidFontResolveInterceptor.android.kt */
/* loaded from: classes.dex */
public final class d implements j0 {

    /* renamed from: b  reason: collision with root package name */
    private final int f252b;

    public d(int i10) {
        this.f252b = i10;
    }

    @Override // a2.j0
    public /* synthetic */ int a(int i10) {
        return i0.b(this, i10);
    }

    @Override // a2.j0
    public /* synthetic */ int b(int i10) {
        return i0.c(this, i10);
    }

    @Override // a2.j0
    public c0 c(c0 c0Var) {
        int l10;
        qc.q.i(c0Var, "fontWeight");
        int i10 = this.f252b;
        if (i10 != 0 && i10 != Integer.MAX_VALUE) {
            l10 = vc.l.l(c0Var.v() + this.f252b, 1, 1000);
            return new c0(l10);
        }
        return c0Var;
    }

    @Override // a2.j0
    public /* synthetic */ l d(l lVar) {
        return i0.a(this, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && this.f252b == ((d) obj).f252b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f252b;
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f252b + ')';
    }
}
