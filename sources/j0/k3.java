package j0;

import android.os.Trace;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: ActualAndroid.android.kt */
/* loaded from: classes.dex */
public final class k3 {

    /* renamed from: a  reason: collision with root package name */
    public static final k3 f18687a = new k3();

    private k3() {
    }

    public final Object a(String str) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Trace.beginSection(str);
        return null;
    }

    public final void b(Object obj) {
        Trace.endSection();
    }
}
