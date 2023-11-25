package w;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import v0.b;

/* compiled from: Column.kt */
/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public static final k f25176a = new k();

    private k() {
    }

    @Override // w.j
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

    @Override // w.j
    public androidx.compose.ui.e b(androidx.compose.ui.e eVar, b.InterfaceC0571b interfaceC0571b) {
        qc.q.i(eVar, "<this>");
        qc.q.i(interfaceC0571b, "alignment");
        return eVar.a(new HorizontalAlignElement(interfaceC0571b));
    }
}
