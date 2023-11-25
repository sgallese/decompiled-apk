package t5;

import org.json.JSONObject;

/* compiled from: Response.kt */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f23695a = new k();

    private k() {
    }

    public final q a(int i10, JSONObject jSONObject) {
        if (i10 == l.SUCCESS.getCode()) {
            return new s();
        }
        if (i10 == l.BAD_REQUEST.getCode()) {
            qc.q.f(jSONObject);
            return new b(jSONObject);
        } else if (i10 == l.PAYLOAD_TOO_LARGE.getCode()) {
            qc.q.f(jSONObject);
            return new p(jSONObject);
        } else if (i10 == l.TOO_MANY_REQUESTS.getCode()) {
            qc.q.f(jSONObject);
            return new u(jSONObject);
        } else if (i10 == l.TIMEOUT.getCode()) {
            return new t();
        } else {
            qc.q.f(jSONObject);
            return new h(jSONObject);
        }
    }
}
