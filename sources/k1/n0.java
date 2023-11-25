package k1;

import android.view.MotionEvent;

/* compiled from: PointerInteropFilter.android.kt */
/* loaded from: classes.dex */
public final class n0 {

    /* compiled from: PointerInteropFilter.android.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<MotionEvent, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.a f19215f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.viewinterop.a aVar) {
            super(1);
            this.f19215f = aVar;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean dispatchTouchEvent;
            qc.q.i(motionEvent, "motionEvent");
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    dispatchTouchEvent = this.f19215f.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    dispatchTouchEvent = this.f19215f.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(dispatchTouchEvent);
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, androidx.compose.ui.viewinterop.a aVar) {
        qc.q.i(eVar, "<this>");
        qc.q.i(aVar, "view");
        m0 m0Var = new m0();
        m0Var.x(new a(aVar));
        t0 t0Var = new t0();
        m0Var.z(t0Var);
        aVar.setOnRequestDisallowInterceptTouchEvent$ui_release(t0Var);
        return eVar.a(m0Var);
    }
}
