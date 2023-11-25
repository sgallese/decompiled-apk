package androidx.compose.ui.input.rotary;

import p1.u0;
import pc.l;
import qc.q;

/* compiled from: RotaryInputModifier.kt */
/* loaded from: classes.dex */
final class RotaryInputElement extends u0<b> {

    /* renamed from: c  reason: collision with root package name */
    private final l<m1.b, Boolean> f2469c;

    /* renamed from: d  reason: collision with root package name */
    private final l<m1.b, Boolean> f2470d;

    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputElement(l<? super m1.b, Boolean> lVar, l<? super m1.b, Boolean> lVar2) {
        this.f2469c = lVar;
        this.f2470d = lVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        if (q.d(this.f2469c, rotaryInputElement.f2469c) && q.d(this.f2470d, rotaryInputElement.f2470d)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        int hashCode;
        l<m1.b, Boolean> lVar = this.f2469c;
        int i10 = 0;
        if (lVar == null) {
            hashCode = 0;
        } else {
            hashCode = lVar.hashCode();
        }
        int i11 = hashCode * 31;
        l<m1.b, Boolean> lVar2 = this.f2470d;
        if (lVar2 != null) {
            i10 = lVar2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.f2469c + ", onPreRotaryScrollEvent=" + this.f2470d + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public b e() {
        return new b(this.f2469c, this.f2470d);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(b bVar) {
        q.i(bVar, "node");
        bVar.I1(this.f2469c);
        bVar.J1(this.f2470d);
    }
}
