package androidx.compose.ui;

import androidx.compose.ui.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j0.v;
import p1.k;
import qc.q;

/* compiled from: ComposedModifier.kt */
/* loaded from: classes.dex */
public final class d extends e.c {
    private v A;

    public d(v vVar) {
        q.i(vVar, "map");
        this.A = vVar;
    }

    public final void I1(v vVar) {
        q.i(vVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.A = vVar;
        k.k(this).h(vVar);
    }

    @Override // androidx.compose.ui.e.c
    public void s1() {
        k.k(this).h(this.A);
    }
}
