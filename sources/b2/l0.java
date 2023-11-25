package b2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: TextInputService.kt */
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final e0 f7794a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<r0> f7795b;

    public l0(e0 e0Var) {
        qc.q.i(e0Var, "platformTextInputService");
        this.f7794a = e0Var;
        this.f7795b = new AtomicReference<>(null);
    }

    public final r0 a() {
        return this.f7795b.get();
    }

    public r0 b(j0 j0Var, p pVar, pc.l<? super List<? extends f>, dc.w> lVar, pc.l<? super o, dc.w> lVar2) {
        qc.q.i(j0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        qc.q.i(pVar, "imeOptions");
        qc.q.i(lVar, "onEditCommand");
        qc.q.i(lVar2, "onImeActionPerformed");
        this.f7794a.d(j0Var, pVar, lVar, lVar2);
        r0 r0Var = new r0(this, this.f7794a);
        this.f7795b.set(r0Var);
        return r0Var;
    }

    public void c(r0 r0Var) {
        qc.q.i(r0Var, "session");
        if (s.t0.a(this.f7795b, r0Var, null)) {
            this.f7794a.b();
        }
    }
}
