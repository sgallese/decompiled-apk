package t5;

import ec.u0;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Response.kt */
/* loaded from: classes.dex */
public final class u implements q {

    /* renamed from: a  reason: collision with root package name */
    private final l f23701a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23702b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23703c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f23704d;

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f23705e;

    /* renamed from: f  reason: collision with root package name */
    private Set<Integer> f23706f;

    /* renamed from: g  reason: collision with root package name */
    private Set<String> f23707g;

    /* renamed from: h  reason: collision with root package name */
    private Set<String> f23708h;

    public u(JSONObject jSONObject) {
        Set<String> b10;
        Set<String> b11;
        Set<Integer> b12;
        Set<String> b13;
        Set<String> b14;
        Set<Integer> e02;
        qc.q.i(jSONObject, "response");
        this.f23701a = l.TOO_MANY_REQUESTS;
        this.f23702b = o.c(jSONObject, "error", "");
        this.f23703c = jSONObject.getInt("eps_threshold");
        b10 = u0.b();
        this.f23704d = b10;
        b11 = u0.b();
        this.f23705e = b11;
        b12 = u0.b();
        this.f23706f = b12;
        b13 = u0.b();
        this.f23707g = b13;
        b14 = u0.b();
        this.f23708h = b14;
        if (jSONObject.has("exceeded_daily_quota_users")) {
            Set<String> keySet = jSONObject.getJSONObject("exceeded_daily_quota_users").keySet();
            qc.q.h(keySet, "response.getJSONObject(\"…ly_quota_users\").keySet()");
            this.f23704d = keySet;
        }
        if (jSONObject.has("exceeded_daily_quota_devices")) {
            Set<String> keySet2 = jSONObject.getJSONObject("exceeded_daily_quota_devices").keySet();
            qc.q.h(keySet2, "response.getJSONObject(\"…_quota_devices\").keySet()");
            this.f23705e = keySet2;
        }
        if (jSONObject.has("throttled_events")) {
            JSONArray jSONArray = jSONObject.getJSONArray("throttled_events");
            qc.q.h(jSONArray, "response.getJSONArray(\"throttled_events\")");
            e02 = ec.p.e0(o.g(jSONArray));
            this.f23706f = e02;
        }
        if (jSONObject.has("throttled_users")) {
            Set<String> keySet3 = jSONObject.getJSONObject("throttled_users").keySet();
            qc.q.h(keySet3, "response.getJSONObject(\"throttled_users\").keySet()");
            this.f23708h = keySet3;
        }
        if (jSONObject.has("throttled_devices")) {
            Set<String> keySet4 = jSONObject.getJSONObject("throttled_devices").keySet();
            qc.q.h(keySet4, "response.getJSONObject(\"…ottled_devices\").keySet()");
            this.f23707g = keySet4;
        }
    }

    public final String a() {
        return this.f23702b;
    }

    public l b() {
        return this.f23701a;
    }
}
