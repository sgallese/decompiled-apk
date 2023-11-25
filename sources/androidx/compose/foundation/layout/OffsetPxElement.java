package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.m1;
import dc.w;
import p1.u0;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Offset.kt */
/* loaded from: classes.dex */
public final class OffsetPxElement extends u0<i> {

    /* renamed from: c  reason: collision with root package name */
    private final pc.l<j2.e, j2.l> f2023c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2024d;

    /* renamed from: e  reason: collision with root package name */
    private final pc.l<m1, w> f2025e;

    /* JADX WARN: Multi-variable type inference failed */
    public OffsetPxElement(pc.l<? super j2.e, j2.l> lVar, boolean z10, pc.l<? super m1, w> lVar2) {
        q.i(lVar, "offset");
        q.i(lVar2, "inspectorInfo");
        this.f2023c = lVar;
        this.f2024d = z10;
        this.f2025e = lVar2;
    }

    public boolean equals(Object obj) {
        OffsetPxElement offsetPxElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxElement) {
            offsetPxElement = (OffsetPxElement) obj;
        } else {
            offsetPxElement = null;
        }
        if (offsetPxElement != null && q.d(this.f2023c, offsetPxElement.f2023c) && this.f2024d == offsetPxElement.f2024d) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return (this.f2023c.hashCode() * 31) + t.k.a(this.f2024d);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.f2023c + ", rtlAware=" + this.f2024d + ')';
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public i e() {
        return new i(this.f2023c, this.f2024d);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(i iVar) {
        q.i(iVar, "node");
        iVar.K1(this.f2023c);
        iVar.L1(this.f2024d);
    }
}
