package androidx.compose.foundation;

import a1.e1;
import a1.p1;
import a1.q4;
import androidx.compose.ui.platform.m1;
import dc.w;
import p1.u0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Background.kt */
/* loaded from: classes.dex */
public final class BackgroundElement extends u0<d> {

    /* renamed from: c  reason: collision with root package name */
    private final long f1822c;

    /* renamed from: d  reason: collision with root package name */
    private final e1 f1823d;

    /* renamed from: e  reason: collision with root package name */
    private final float f1824e;

    /* renamed from: f  reason: collision with root package name */
    private final q4 f1825f;

    /* renamed from: g  reason: collision with root package name */
    private final pc.l<m1, w> f1826g;

    public /* synthetic */ BackgroundElement(long j10, e1 e1Var, float f10, q4 q4Var, pc.l lVar, qc.h hVar) {
        this(j10, e1Var, f10, q4Var, lVar);
    }

    public boolean equals(Object obj) {
        BackgroundElement backgroundElement;
        boolean z10;
        if (obj instanceof BackgroundElement) {
            backgroundElement = (BackgroundElement) obj;
        } else {
            backgroundElement = null;
        }
        if (backgroundElement == null || !p1.q(this.f1822c, backgroundElement.f1822c) || !qc.q.d(this.f1823d, backgroundElement.f1823d)) {
            return false;
        }
        if (this.f1824e == backgroundElement.f1824e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !qc.q.d(this.f1825f, backgroundElement.f1825f)) {
            return false;
        }
        return true;
    }

    @Override // p1.u0
    public int hashCode() {
        int i10;
        int w10 = p1.w(this.f1822c) * 31;
        e1 e1Var = this.f1823d;
        if (e1Var != null) {
            i10 = e1Var.hashCode();
        } else {
            i10 = 0;
        }
        return ((((w10 + i10) * 31) + Float.floatToIntBits(this.f1824e)) * 31) + this.f1825f.hashCode();
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public d e() {
        return new d(this.f1822c, this.f1823d, this.f1824e, this.f1825f, null);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(d dVar) {
        qc.q.i(dVar, "node");
        dVar.L1(this.f1822c);
        dVar.K1(this.f1823d);
        dVar.c(this.f1824e);
        dVar.z0(this.f1825f);
    }

    public /* synthetic */ BackgroundElement(long j10, e1 e1Var, float f10, q4 q4Var, pc.l lVar, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? p1.f146b.e() : j10, (i10 & 2) != 0 ? null : e1Var, f10, q4Var, lVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BackgroundElement(long j10, e1 e1Var, float f10, q4 q4Var, pc.l<? super m1, w> lVar) {
        qc.q.i(q4Var, "shape");
        qc.q.i(lVar, "inspectorInfo");
        this.f1822c = j10;
        this.f1823d = e1Var;
        this.f1824e = f10;
        this.f1825f = q4Var;
        this.f1826g = lVar;
    }
}
