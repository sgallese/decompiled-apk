package androidx.compose.ui.platform;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: InspectableValue.kt */
/* loaded from: classes.dex */
public final class d4 implements xc.g<c4> {

    /* renamed from: a  reason: collision with root package name */
    private final List<c4> f2646a = new ArrayList();

    public final void c(String str, Object obj) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f2646a.add(new c4(str, obj));
    }

    @Override // xc.g
    public Iterator<c4> iterator() {
        return this.f2646a.iterator();
    }
}
