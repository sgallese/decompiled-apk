package m8;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i8.a;
import java.util.Locale;

/* compiled from: CrashlyticsAnalyticsListener.java */
/* loaded from: classes3.dex */
class e implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private o8.b f19780a;

    /* renamed from: b  reason: collision with root package name */
    private o8.b f19781b;

    private static void b(o8.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.b(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        o8.b bVar;
        if ("clx".equals(bundle.getString("_o"))) {
            bVar = this.f19780a;
        } else {
            bVar = this.f19781b;
        }
        b(bVar, str, bundle);
    }

    @Override // i8.a.b
    public void a(int i10, Bundle bundle) {
        String string;
        n8.f.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle != null && (string = bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME)) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            c(string, bundle2);
        }
    }

    public void d(o8.b bVar) {
        this.f19781b = bVar;
    }

    public void e(o8.b bVar) {
        this.f19780a = bVar;
    }
}
