package zc;

import qc.q;

/* compiled from: DurationUnitJvm.kt */
/* loaded from: classes4.dex */
class e {
    public static final long a(long j10, d dVar, d dVar2) {
        q.i(dVar, "sourceUnit");
        q.i(dVar2, "targetUnit");
        return dVar2.getTimeUnit$kotlin_stdlib().convert(j10, dVar.getTimeUnit$kotlin_stdlib());
    }

    public static final long b(long j10, d dVar, d dVar2) {
        q.i(dVar, "sourceUnit");
        q.i(dVar2, "targetUnit");
        return dVar2.getTimeUnit$kotlin_stdlib().convert(j10, dVar.getTimeUnit$kotlin_stdlib());
    }
}
