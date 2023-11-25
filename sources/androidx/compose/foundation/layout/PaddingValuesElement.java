package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.m1;
import dc.w;
import p1.u0;
import qc.q;
import w.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Padding.kt */
/* loaded from: classes.dex */
public final class PaddingValuesElement extends u0<l> {

    /* renamed from: c  reason: collision with root package name */
    private final s f2032c;

    /* renamed from: d  reason: collision with root package name */
    private final pc.l<m1, w> f2033d;

    /* JADX WARN: Multi-variable type inference failed */
    public PaddingValuesElement(s sVar, pc.l<? super m1, w> lVar) {
        q.i(sVar, "paddingValues");
        q.i(lVar, "inspectorInfo");
        this.f2032c = sVar;
        this.f2033d = lVar;
    }

    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if (obj instanceof PaddingValuesElement) {
            paddingValuesElement = (PaddingValuesElement) obj;
        } else {
            paddingValuesElement = null;
        }
        if (paddingValuesElement == null) {
            return false;
        }
        return q.d(this.f2032c, paddingValuesElement.f2032c);
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2032c.hashCode();
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public l e() {
        return new l(this.f2032c);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(l lVar) {
        q.i(lVar, "node");
        lVar.J1(this.f2032c);
    }
}
