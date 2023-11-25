package jd;

import fd.d0;
import fd.g0;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Semaphore.kt */
/* loaded from: classes4.dex */
public final class g extends d0<g> {

    /* renamed from: r  reason: collision with root package name */
    private final AtomicReferenceArray f19118r;

    public g(long j10, g gVar, int i10) {
        super(j10, gVar, i10);
        int i11;
        i11 = f.f19117f;
        this.f19118r = new AtomicReferenceArray(i11);
    }

    @Override // fd.d0
    public int n() {
        int i10;
        i10 = f.f19117f;
        return i10;
    }

    @Override // fd.d0
    public void o(int i10, Throwable th, hc.f fVar) {
        g0 g0Var;
        g0Var = f.f19116e;
        r().set(i10, g0Var);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f19118r;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f15625p + ", hashCode=" + hashCode() + ']';
    }
}
