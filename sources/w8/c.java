package w8;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.m;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DefaultSettingsSpiCall.java */
/* loaded from: classes3.dex */
public class c implements k {

    /* renamed from: a  reason: collision with root package name */
    private final String f25441a;

    /* renamed from: b  reason: collision with root package name */
    private final t8.b f25442b;

    /* renamed from: c  reason: collision with root package name */
    private final n8.f f25443c;

    public c(String str, t8.b bVar) {
        this(str, bVar, n8.f.f());
    }

    private t8.a b(t8.a aVar, j jVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", jVar.f25468a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", m.i());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", jVar.f25469b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", jVar.f25470c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", jVar.f25471d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", jVar.f25472e.a());
        return aVar;
    }

    private void c(t8.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f25443c.l("Failed to parse settings JSON from " + this.f25441a, e10);
            this.f25443c.k("Settings response " + str);
            return null;
        }
    }

    private Map<String, String> f(j jVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", jVar.f25475h);
        hashMap.put("display_version", jVar.f25474g);
        hashMap.put("source", Integer.toString(jVar.f25476i));
        String str = jVar.f25473f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // w8.k
    public JSONObject a(j jVar, boolean z10) {
        if (z10) {
            try {
                Map<String, String> f10 = f(jVar);
                t8.a b10 = b(d(f10), jVar);
                this.f25443c.b("Requesting settings from " + this.f25441a);
                this.f25443c.i("Settings query params were: " + f10);
                return g(b10.c());
            } catch (IOException e10) {
                this.f25443c.e("Settings request failed.", e10);
                return null;
            }
        }
        throw new RuntimeException("An invalid data collection token was used.");
    }

    protected t8.a d(Map<String, String> map) {
        return this.f25442b.a(this.f25441a, map).d("User-Agent", "Crashlytics Android SDK/" + m.i()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(t8.c cVar) {
        int b10 = cVar.b();
        this.f25443c.i("Settings response code was: " + b10);
        if (h(b10)) {
            return e(cVar.a());
        }
        this.f25443c.d("Settings request failed; (status: " + b10 + ") from " + this.f25441a);
        return null;
    }

    boolean h(int i10) {
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            return false;
        }
        return true;
    }

    c(String str, t8.b bVar, n8.f fVar) {
        if (str != null) {
            this.f25443c = fVar;
            this.f25442b = bVar;
            this.f25441a = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }
}
