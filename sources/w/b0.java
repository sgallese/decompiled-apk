package w;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import v0.b;

/* compiled from: Row.kt */
/* loaded from: classes.dex */
public final class b0 implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f25155a = new b0();

    private b0() {
    }

    @Override // w.a0
    public androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, boolean z10) {
        boolean z11;
        qc.q.i(eVar, "<this>");
        if (f10 > 0.0d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return eVar.a(new LayoutWeightElement(f10, z10));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // w.a0
    public androidx.compose.ui.e b(androidx.compose.ui.e eVar, b.c cVar) {
        qc.q.i(eVar, "<this>");
        qc.q.i(cVar, "alignment");
        return eVar.a(new VerticalAlignElement(cVar));
    }
}
