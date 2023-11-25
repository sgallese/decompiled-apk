package t1;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SemanticsModifier.kt */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f23464a = new AtomicInteger(0);

    public static final int a() {
        return f23464a.addAndGet(1);
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, boolean z10, pc.l<? super x, dc.w> lVar) {
        qc.q.i(eVar, "<this>");
        qc.q.i(lVar, "properties");
        return eVar.a(new AppendedSemanticsElement(z10, lVar));
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, boolean z10, pc.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return b(eVar, z10, lVar);
    }
}
