package t5;

import org.json.JSONObject;

/* compiled from: Response.kt */
/* loaded from: classes.dex */
public final class p implements q {

    /* renamed from: a  reason: collision with root package name */
    private final l f23697a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23698b;

    public p(JSONObject jSONObject) {
        qc.q.i(jSONObject, "response");
        this.f23697a = l.PAYLOAD_TOO_LARGE;
        this.f23698b = o.c(jSONObject, "error", "");
    }

    public final String a() {
        return this.f23698b;
    }

    public l b() {
        return this.f23697a;
    }
}
