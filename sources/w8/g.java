package w8;

import com.google.firebase.crashlytics.internal.common.r;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsJsonParser.java */
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final r f25467a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(r rVar) {
        this.f25467a = rVar;
    }

    private static h a(int i10) {
        if (i10 != 3) {
            n8.f.f().d("Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.");
            return new b();
        }
        return new l();
    }

    public d b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt("settings_version")).a(this.f25467a, jSONObject);
    }
}
