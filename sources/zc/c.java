package zc;

import qc.q;
import vc.i;
import vc.l;

/* compiled from: Duration.kt */
/* loaded from: classes4.dex */
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(long j10, int i10) {
        return a.k((j10 << 1) + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j10) {
        return a.k((j10 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j10) {
        long n10;
        if (!new i(-4611686018426L, 4611686018426L).k(j10)) {
            n10 = l.n(j10, -4611686018427387903L, 4611686018427387903L);
            return i(n10);
        }
        return k(m(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j10) {
        return a.k(j10 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10) {
        if (new i(-4611686018426999999L, 4611686018426999999L).k(j10)) {
            return k(j10);
        }
        return i(n(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j10) {
        return j10 * 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j10) {
        return j10 / 1000000;
    }

    public static final long o(int i10, d dVar) {
        q.i(dVar, "unit");
        if (dVar.compareTo(d.SECONDS) <= 0) {
            return k(e.b(i10, dVar, d.NANOSECONDS));
        }
        return p(i10, dVar);
    }

    public static final long p(long j10, d dVar) {
        long n10;
        q.i(dVar, "unit");
        d dVar2 = d.NANOSECONDS;
        long b10 = e.b(4611686018426999999L, dVar2, dVar);
        if (!new i(-b10, b10).k(j10)) {
            n10 = l.n(e.a(j10, dVar, d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L);
            return i(n10);
        }
        return k(e.b(j10, dVar, dVar2));
    }
}
