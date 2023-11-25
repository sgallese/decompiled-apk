package androidx.compose.ui.input.key;

import p1.u0;
import pc.l;
import qc.q;

/* compiled from: KeyInputModifier.kt */
/* loaded from: classes.dex */
final class KeyInputElement extends u0<b> {

    /* renamed from: c  reason: collision with root package name */
    private final l<i1.b, Boolean> f2461c;

    /* renamed from: d  reason: collision with root package name */
    private final l<i1.b, Boolean> f2462d;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(l<? super i1.b, Boolean> lVar, l<? super i1.b, Boolean> lVar2) {
        this.f2461c = lVar;
        this.f2462d = lVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        if (q.d(this.f2461c, keyInputElement.f2461c) && q.d(this.f2462d, keyInputElement.f2462d)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        int hashCode;
        l<i1.b, Boolean> lVar = this.f2461c;
        int i10 = 0;
        if (lVar == null) {
            hashCode = 0;
        } else {
            hashCode = lVar.hashCode();
        }
        int i11 = hashCode * 31;
        l<i1.b, Boolean> lVar2 = this.f2462d;
        if (lVar2 != null) {
            i10 = lVar2.hashCode();
        }
        return i11 + i10;
    }

    public String toString() {
        return "KeyInputElement(onKeyEvent=" + this.f2461c + ", onPreKeyEvent=" + this.f2462d + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public b e() {
        return new b(this.f2461c, this.f2462d);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(b bVar) {
        q.i(bVar, "node");
        bVar.I1(this.f2461c);
        bVar.J1(this.f2462d);
    }
}
