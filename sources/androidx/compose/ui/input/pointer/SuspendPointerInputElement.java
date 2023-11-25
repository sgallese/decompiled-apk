package androidx.compose.ui.input.pointer;

import dc.w;
import java.util.Arrays;
import k1.l0;
import k1.w0;
import kotlin.coroutines.Continuation;
import p1.u0;
import pc.p;
import qc.h;
import qc.q;

/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends u0<w0> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f2465c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f2466d;

    /* renamed from: e  reason: collision with root package name */
    private final Object[] f2467e;

    /* renamed from: f  reason: collision with root package name */
    private final p<l0, Continuation<? super w>, Object> f2468f;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, p pVar, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? null : objArr, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!q.d(this.f2465c, suspendPointerInputElement.f2465c) || !q.d(this.f2466d, suspendPointerInputElement.f2466d)) {
            return false;
        }
        Object[] objArr = this.f2467e;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f2467e;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f2467e != null) {
            return false;
        }
        return true;
    }

    @Override // p1.u0
    public int hashCode() {
        int i10;
        int i11;
        Object obj = this.f2465c;
        int i12 = 0;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Object obj2 = this.f2466d;
        if (obj2 != null) {
            i11 = obj2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        Object[] objArr = this.f2467e;
        if (objArr != null) {
            i12 = Arrays.hashCode(objArr);
        }
        return i14 + i12;
    }

    @Override // p1.u0
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public w0 e() {
        return new w0(this.f2468f);
    }

    @Override // p1.u0
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void m(w0 w0Var) {
        q.i(w0Var, "node");
        w0Var.N1(this.f2468f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, p<? super l0, ? super Continuation<? super w>, ? extends Object> pVar) {
        q.i(pVar, "pointerInputHandler");
        this.f2465c = obj;
        this.f2466d = obj2;
        this.f2467e = objArr;
        this.f2468f = pVar;
    }
}
