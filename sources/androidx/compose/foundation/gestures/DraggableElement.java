package androidx.compose.foundation.gestures;

import ad.k0;
import dc.w;
import j2.v;
import k1.c0;
import kotlin.coroutines.Continuation;
import p1.u0;
import pc.q;
import u.k;
import u.l;
import u.o;
import v.m;
import z0.f;

/* compiled from: Draggable.kt */
/* loaded from: classes.dex */
public final class DraggableElement extends u0<k> {

    /* renamed from: c  reason: collision with root package name */
    private final l f1897c;

    /* renamed from: d  reason: collision with root package name */
    private final pc.l<c0, Boolean> f1898d;

    /* renamed from: e  reason: collision with root package name */
    private final o f1899e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1900f;

    /* renamed from: g  reason: collision with root package name */
    private final m f1901g;

    /* renamed from: h  reason: collision with root package name */
    private final pc.a<Boolean> f1902h;

    /* renamed from: i  reason: collision with root package name */
    private final q<k0, f, Continuation<? super w>, Object> f1903i;

    /* renamed from: j  reason: collision with root package name */
    private final q<k0, v, Continuation<? super w>, Object> f1904j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f1905k;

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(l lVar, pc.l<? super c0, Boolean> lVar2, o oVar, boolean z10, m mVar, pc.a<Boolean> aVar, q<? super k0, ? super f, ? super Continuation<? super w>, ? extends Object> qVar, q<? super k0, ? super v, ? super Continuation<? super w>, ? extends Object> qVar2, boolean z11) {
        qc.q.i(lVar, "state");
        qc.q.i(lVar2, "canDrag");
        qc.q.i(oVar, "orientation");
        qc.q.i(aVar, "startDragImmediately");
        qc.q.i(qVar, "onDragStarted");
        qc.q.i(qVar2, "onDragStopped");
        this.f1897c = lVar;
        this.f1898d = lVar2;
        this.f1899e = oVar;
        this.f1900f = z10;
        this.f1901g = mVar;
        this.f1902h = aVar;
        this.f1903i = qVar;
        this.f1904j = qVar2;
        this.f1905k = z11;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!qc.q.d(DraggableElement.class, cls)) {
            return false;
        }
        qc.q.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DraggableElement");
        DraggableElement draggableElement = (DraggableElement) obj;
        if (qc.q.d(this.f1897c, draggableElement.f1897c) && qc.q.d(this.f1898d, draggableElement.f1898d) && this.f1899e == draggableElement.f1899e && this.f1900f == draggableElement.f1900f && qc.q.d(this.f1901g, draggableElement.f1901g) && qc.q.d(this.f1902h, draggableElement.f1902h) && qc.q.d(this.f1903i, draggableElement.f1903i) && qc.q.d(this.f1904j, draggableElement.f1904j) && this.f1905k == draggableElement.f1905k) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        int i10;
        int hashCode = ((((((this.f1897c.hashCode() * 31) + this.f1898d.hashCode()) * 31) + this.f1899e.hashCode()) * 31) + t.k.a(this.f1900f)) * 31;
        m mVar = this.f1901g;
        if (mVar != null) {
            i10 = mVar.hashCode();
        } else {
            i10 = 0;
        }
        return ((((((((hashCode + i10) * 31) + this.f1902h.hashCode()) * 31) + this.f1903i.hashCode()) * 31) + this.f1904j.hashCode()) * 31) + t.k.a(this.f1905k);
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public k e() {
        return new k(this.f1897c, this.f1898d, this.f1899e, this.f1900f, this.f1901g, this.f1902h, this.f1903i, this.f1904j, this.f1905k);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(k kVar) {
        qc.q.i(kVar, "node");
        kVar.e2(this.f1897c, this.f1898d, this.f1899e, this.f1900f, this.f1901g, this.f1902h, this.f1903i, this.f1904j, this.f1905k);
    }
}
