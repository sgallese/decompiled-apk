package androidx.compose.ui.draw;

import dc.w;
import p1.u0;
import pc.l;
import qc.q;
import x0.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawModifier.kt */
/* loaded from: classes.dex */
public final class DrawBehindElement extends u0<f> {

    /* renamed from: c  reason: collision with root package name */
    private final l<c1.f, w> f2323c;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(l<? super c1.f, w> lVar) {
        q.i(lVar, "onDraw");
        this.f2323c = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DrawBehindElement) && q.d(this.f2323c, ((DrawBehindElement) obj).f2323c)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2323c.hashCode();
    }

    public String toString() {
        return "DrawBehindElement(onDraw=" + this.f2323c + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public f e() {
        return new f(this.f2323c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(f fVar) {
        q.i(fVar, "node");
        fVar.I1(this.f2323c);
    }
}
