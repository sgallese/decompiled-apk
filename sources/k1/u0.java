package k1;

import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: SuspendingPointerInputFilter.kt */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a */
    private static final r f19246a;

    static {
        List i10;
        i10 = ec.t.i();
        f19246a = new r(i10);
    }

    public static final v0 a(pc.p<? super l0, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        qc.q.i(pVar, "pointerInputHandler");
        return new w0(pVar);
    }

    public static final /* synthetic */ r b() {
        return f19246a;
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, Object obj, pc.p<? super l0, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        qc.q.i(eVar, "<this>");
        qc.q.i(pVar, "block");
        return eVar.a(new SuspendPointerInputElement(obj, null, null, pVar, 6, null));
    }
}
