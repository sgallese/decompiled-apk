package androidx.compose.ui.graphics;

import dc.w;
import p1.u0;
import pc.l;
import qc.q;

/* compiled from: GraphicsLayerModifier.kt */
/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends u0<a> {

    /* renamed from: c  reason: collision with root package name */
    private final l<d, w> f2419c;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(l<? super d, w> lVar) {
        q.i(lVar, "block");
        this.f2419c = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BlockGraphicsLayerElement) && q.d(this.f2419c, ((BlockGraphicsLayerElement) obj).f2419c)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2419c.hashCode();
    }

    public String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f2419c + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public a e() {
        return new a(this.f2419c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(a aVar) {
        q.i(aVar, "node");
        aVar.K1(this.f2419c);
        aVar.J1();
    }
}
