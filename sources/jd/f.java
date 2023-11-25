package jd;

import fd.g0;
import fd.j0;

/* compiled from: Semaphore.kt */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final int f19112a;

    /* renamed from: b  reason: collision with root package name */
    private static final g0 f19113b;

    /* renamed from: c  reason: collision with root package name */
    private static final g0 f19114c;

    /* renamed from: d  reason: collision with root package name */
    private static final g0 f19115d;

    /* renamed from: e  reason: collision with root package name */
    private static final g0 f19116e;

    /* renamed from: f  reason: collision with root package name */
    private static final int f19117f;

    static {
        int e10;
        int e11;
        e10 = j0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f19112a = e10;
        f19113b = new g0("PERMIT");
        f19114c = new g0("TAKEN");
        f19115d = new g0("BROKEN");
        f19116e = new g0("CANCELLED");
        e11 = j0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f19117f = e11;
    }

    public static final d a(int i10, int i11) {
        return new e(i10, i11);
    }

    public static /* synthetic */ d b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g j(long j10, g gVar) {
        return new g(j10, gVar, 0);
    }
}
