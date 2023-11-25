package o8;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* loaded from: classes3.dex */
public class d implements b, p8.b {

    /* renamed from: a  reason: collision with root package name */
    private p8.a f20583a;

    private static String c(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // p8.b
    public void a(p8.a aVar) {
        this.f20583a = aVar;
        n8.f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // o8.b
    public void b(String str, Bundle bundle) {
        p8.a aVar = this.f20583a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                n8.f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
