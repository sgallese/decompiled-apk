package t5;

import org.json.JSONObject;

/* compiled from: Response.kt */
/* loaded from: classes.dex */
public final class h implements q {

    /* renamed from: a  reason: collision with root package name */
    private final l f23672a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23673b;

    public h(JSONObject jSONObject) {
        qc.q.i(jSONObject, "response");
        this.f23672a = l.FAILED;
        this.f23673b = o.c(jSONObject, "error", "");
    }

    public final String a() {
        return this.f23673b;
    }

    public l b() {
        return this.f23672a;
    }
}
