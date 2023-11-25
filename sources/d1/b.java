package d1;

import a1.q3;
import a1.t3;
import j2.l;
import qc.q;

/* compiled from: BitmapPainter.kt */
/* loaded from: classes.dex */
public final class b {
    public static final a a(t3 t3Var, long j10, long j11, int i10) {
        q.i(t3Var, "image");
        a aVar = new a(t3Var, j10, j11, null);
        aVar.n(i10);
        return aVar;
    }

    public static /* synthetic */ a b(t3 t3Var, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = l.f18992b.a();
        }
        long j12 = j10;
        if ((i11 & 4) != 0) {
            j11 = j2.q.a(t3Var.getWidth(), t3Var.getHeight());
        }
        long j13 = j11;
        if ((i11 & 8) != 0) {
            i10 = q3.f165a.a();
        }
        return a(t3Var, j12, j13, i10);
    }
}
