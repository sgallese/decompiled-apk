package androidx.compose.ui;

import j0.v;
import p1.u0;
import qc.q;

/* compiled from: ComposedModifier.kt */
/* loaded from: classes.dex */
public final class CompositionLocalMapInjectionElement extends u0<d> {

    /* renamed from: c  reason: collision with root package name */
    private final v f2315c;

    public CompositionLocalMapInjectionElement(v vVar) {
        q.i(vVar, "map");
        this.f2315c = vVar;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof CompositionLocalMapInjectionElement) && q.d(((CompositionLocalMapInjectionElement) obj).f2315c, this.f2315c)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2315c.hashCode();
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public d e() {
        return new d(this.f2315c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(d dVar) {
        q.i(dVar, "node");
        dVar.I1(this.f2315c);
    }
}
