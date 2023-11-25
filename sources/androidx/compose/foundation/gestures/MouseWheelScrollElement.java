package androidx.compose.foundation.gestures;

import j0.g3;
import p1.u0;
import qc.q;
import u.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class MouseWheelScrollElement extends u0<b> {

    /* renamed from: c  reason: collision with root package name */
    private final g3<e> f1906c;

    /* renamed from: d  reason: collision with root package name */
    private final s f1907d;

    public MouseWheelScrollElement(g3<e> g3Var, s sVar) {
        q.i(g3Var, "scrollingLogicState");
        q.i(sVar, "mouseWheelScrollConfig");
        this.f1906c = g3Var;
        this.f1907d = sVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MouseWheelScrollElement)) {
            return false;
        }
        MouseWheelScrollElement mouseWheelScrollElement = (MouseWheelScrollElement) obj;
        if (q.d(this.f1906c, mouseWheelScrollElement.f1906c) && q.d(this.f1907d, mouseWheelScrollElement.f1907d)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return (this.f1906c.hashCode() * 31) + this.f1907d.hashCode();
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public b e() {
        return new b(this.f1906c, this.f1907d);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(b bVar) {
        q.i(bVar, "node");
        bVar.Q1(this.f1906c);
        bVar.P1(this.f1907d);
    }
}
