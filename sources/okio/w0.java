package okio;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SegmentPool.kt */
/* loaded from: classes4.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final w0 f20694a = new w0();

    /* renamed from: b  reason: collision with root package name */
    private static final int f20695b = 65536;

    /* renamed from: c  reason: collision with root package name */
    private static final v0 f20696c = new v0(new byte[0], 0, 0, false, false);

    /* renamed from: d  reason: collision with root package name */
    private static final int f20697d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReference<v0>[] f20698e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f20697d = highestOneBit;
        AtomicReference<v0>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f20698e = atomicReferenceArr;
    }

    private w0() {
    }

    private final AtomicReference<v0> a() {
        return f20698e[(int) (Thread.currentThread().getId() & (f20697d - 1))];
    }

    public static final void b(v0 v0Var) {
        boolean z10;
        AtomicReference<v0> a10;
        v0 v0Var2;
        v0 andSet;
        int i10;
        qc.q.i(v0Var, "segment");
        if (v0Var.f20692f == null && v0Var.f20693g == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (v0Var.f20690d || (andSet = (a10 = f20694a.a()).getAndSet((v0Var2 = f20696c))) == v0Var2) {
                return;
            }
            if (andSet != null) {
                i10 = andSet.f20689c;
            } else {
                i10 = 0;
            }
            if (i10 >= f20695b) {
                a10.set(andSet);
                return;
            }
            v0Var.f20692f = andSet;
            v0Var.f20688b = 0;
            v0Var.f20689c = i10 + 8192;
            a10.set(v0Var);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final v0 c() {
        AtomicReference<v0> a10 = f20694a.a();
        v0 v0Var = f20696c;
        v0 andSet = a10.getAndSet(v0Var);
        if (andSet == v0Var) {
            return new v0();
        }
        if (andSet == null) {
            a10.set(null);
            return new v0();
        }
        a10.set(andSet.f20692f);
        andSet.f20692f = null;
        andSet.f20689c = 0;
        return andSet;
    }
}
