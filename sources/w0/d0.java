package w0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AutofillTree.kt */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, c0> f25257a = new LinkedHashMap();

    public final Map<Integer, c0> a() {
        return this.f25257a;
    }

    public final dc.w b(int i10, String str) {
        pc.l<String, dc.w> c10;
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c0 c0Var = this.f25257a.get(Integer.valueOf(i10));
        if (c0Var != null && (c10 = c0Var.c()) != null) {
            c10.invoke(str);
            return dc.w.f13270a;
        }
        return null;
    }
}
