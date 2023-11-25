package g2;

import a1.e1;
import a1.p1;
import a1.r1;
import v1.c0;

/* compiled from: TextForegroundStyle.kt */
/* loaded from: classes.dex */
public final class m {
    public static final o b(o oVar, o oVar2, float f10) {
        qc.q.i(oVar, "start");
        qc.q.i(oVar2, "stop");
        boolean z10 = oVar instanceof c;
        if (!z10 && !(oVar2 instanceof c)) {
            return o.f16079a.b(r1.h(oVar.e(), oVar2.e(), f10));
        }
        if (z10 && (oVar2 instanceof c)) {
            return o.f16079a.a((e1) c0.d(((c) oVar).b(), ((c) oVar2).b(), f10), k2.a.a(oVar.d(), oVar2.d(), f10));
        }
        return (o) c0.d(oVar, oVar2, f10);
    }

    public static final long c(long j10, float f10) {
        if (!Float.isNaN(f10) && f10 < 1.0f) {
            return p1.o(j10, p1.r(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f10, pc.a<Float> aVar) {
        if (Float.isNaN(f10)) {
            return aVar.invoke().floatValue();
        }
        return f10;
    }
}
