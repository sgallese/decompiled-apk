package k1;

import android.view.MotionEvent;

/* compiled from: PointerInteropUtils.android.kt */
/* loaded from: classes.dex */
public final class o0 {
    public static final void a(long j10, pc.l<? super MotionEvent, dc.w> lVar) {
        qc.q.i(lVar, "block");
        MotionEvent obtain = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        obtain.setSource(0);
        qc.q.h(obtain, "motionEvent");
        lVar.invoke(obtain);
        obtain.recycle();
    }

    public static final void b(r rVar, long j10, pc.l<? super MotionEvent, dc.w> lVar) {
        qc.q.i(rVar, "$this$toCancelMotionEventScope");
        qc.q.i(lVar, "block");
        d(rVar, j10, lVar, true);
    }

    public static final void c(r rVar, long j10, pc.l<? super MotionEvent, dc.w> lVar) {
        qc.q.i(rVar, "$this$toMotionEventScope");
        qc.q.i(lVar, "block");
        d(rVar, j10, lVar, false);
    }

    private static final void d(r rVar, long j10, pc.l<? super MotionEvent, dc.w> lVar, boolean z10) {
        MotionEvent e10 = rVar.e();
        if (e10 != null) {
            int action = e10.getAction();
            if (z10) {
                e10.setAction(3);
            }
            e10.offsetLocation(-z0.f.o(j10), -z0.f.p(j10));
            lVar.invoke(e10);
            e10.offsetLocation(z0.f.o(j10), z0.f.p(j10));
            e10.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }
}
