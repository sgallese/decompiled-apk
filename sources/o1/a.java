package o1;

import qc.q;

/* compiled from: ModifierLocalModifierNode.kt */
/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private k<?> f20334a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k<?> kVar) {
        super(null);
        q.i(kVar, "element");
        this.f20334a = kVar;
    }

    @Override // o1.g
    public boolean a(c<?> cVar) {
        q.i(cVar, "key");
        if (cVar == this.f20334a.getKey()) {
            return true;
        }
        return false;
    }

    @Override // o1.g
    public <T> T b(c<T> cVar) {
        boolean z10;
        q.i(cVar, "key");
        if (cVar == this.f20334a.getKey()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return (T) this.f20334a.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void c(k<?> kVar) {
        q.i(kVar, "<set-?>");
        this.f20334a = kVar;
    }
}
