package t5;

import ec.b0;
import ec.u0;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Response.kt */
/* loaded from: classes.dex */
public final class b implements q {

    /* renamed from: a  reason: collision with root package name */
    private final l f23631a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23632b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23633c;

    /* renamed from: d  reason: collision with root package name */
    private Set<Integer> f23634d;

    /* renamed from: e  reason: collision with root package name */
    private Set<Integer> f23635e;

    /* renamed from: f  reason: collision with root package name */
    private Set<Integer> f23636f;

    /* renamed from: g  reason: collision with root package name */
    private Set<String> f23637g;

    public b(JSONObject jSONObject) {
        Set<Integer> b10;
        Set<Integer> b11;
        Set<Integer> b12;
        Set<String> b13;
        Set<Integer> e02;
        Set<String> H0;
        qc.q.i(jSONObject, "response");
        this.f23631a = l.BAD_REQUEST;
        this.f23632b = o.c(jSONObject, "error", "");
        this.f23633c = o.c(jSONObject, "missing_field", "");
        b10 = u0.b();
        this.f23634d = b10;
        b11 = u0.b();
        this.f23635e = b11;
        b12 = u0.b();
        this.f23636f = b12;
        b13 = u0.b();
        this.f23637g = b13;
        if (jSONObject.has("events_with_invalid_fields")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events_with_invalid_fields");
            qc.q.h(jSONObject2, "response.getJSONObject(\"…nts_with_invalid_fields\")");
            this.f23634d = o.b(jSONObject2);
        }
        if (jSONObject.has("events_with_missing_fields")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("events_with_missing_fields");
            qc.q.h(jSONObject3, "response.getJSONObject(\"…nts_with_missing_fields\")");
            this.f23635e = o.b(jSONObject3);
        }
        if (jSONObject.has("silenced_devices")) {
            JSONArray jSONArray = jSONObject.getJSONArray("silenced_devices");
            qc.q.h(jSONArray, "response.getJSONArray(\"silenced_devices\")");
            H0 = b0.H0((Iterable) jSONArray);
            this.f23637g = H0;
        }
        if (jSONObject.has("silenced_events")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("silenced_events");
            qc.q.h(jSONArray2, "response.getJSONArray(\"silenced_events\")");
            e02 = ec.p.e0(o.g(jSONArray2));
            this.f23636f = e02;
        }
    }

    public final String a() {
        return this.f23632b;
    }

    public final Set<Integer> b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f23634d);
        linkedHashSet.addAll(this.f23635e);
        linkedHashSet.addAll(this.f23636f);
        return linkedHashSet;
    }

    public final Set<String> c() {
        return this.f23637g;
    }

    public l d() {
        return this.f23631a;
    }

    public final boolean e(q5.a aVar) {
        qc.q.i(aVar, "event");
        String k10 = aVar.k();
        if (k10 == null) {
            return false;
        }
        return c().contains(k10);
    }
}
