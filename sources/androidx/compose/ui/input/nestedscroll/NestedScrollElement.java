package androidx.compose.ui.input.nestedscroll;

import j1.b;
import j1.c;
import j1.d;
import p1.u0;
import qc.q;

/* compiled from: NestedScrollModifier.kt */
/* loaded from: classes.dex */
final class NestedScrollElement extends u0<d> {

    /* renamed from: c  reason: collision with root package name */
    private final b f2463c;

    /* renamed from: d  reason: collision with root package name */
    private final c f2464d;

    public NestedScrollElement(b bVar, c cVar) {
        q.i(bVar, "connection");
        this.f2463c = bVar;
        this.f2464d = cVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        if (!q.d(nestedScrollElement.f2463c, this.f2463c) || !q.d(nestedScrollElement.f2464d, this.f2464d)) {
            return false;
        }
        return true;
    }

    @Override // p1.u0
    public int hashCode() {
        int i10;
        int hashCode = this.f2463c.hashCode() * 31;
        c cVar = this.f2464d;
        if (cVar != null) {
            i10 = cVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public d e() {
        return new d(this.f2463c, this.f2464d);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(d dVar) {
        q.i(dVar, "node");
        dVar.P1(this.f2463c, this.f2464d);
    }
}
