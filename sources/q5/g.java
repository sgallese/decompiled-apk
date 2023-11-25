package q5;

import org.json.JSONObject;
import qc.q;

/* compiled from: IngestionMetadata.kt */
/* loaded from: classes.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f21475c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f21476a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21477b;

    /* compiled from: IngestionMetadata.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final g a(JSONObject jSONObject) {
            q.i(jSONObject, "jsonObject");
            return new g(jSONObject.optString("source_name", null), jSONObject.optString("source_version", null));
        }
    }

    public g(String str, String str2) {
        this.f21476a = str;
        this.f21477b = str2;
    }

    public final g a() {
        return new g(this.f21476a, this.f21477b);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[Catch: JSONException -> 0x0033, TryCatch #0 {JSONException -> 0x0033, blocks: (B:3:0x0005, B:5:0x000b, B:11:0x0017, B:12:0x001e, B:14:0x0022, B:18:0x002b), top: B:22:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[Catch: JSONException -> 0x0033, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0033, blocks: (B:3:0x0005, B:5:0x000b, B:11:0x0017, B:12:0x001e, B:14:0x0022, B:18:0x002b), top: B:22:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject b() {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r5.f21476a     // Catch: org.json.JSONException -> L33
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            int r1 = r1.length()     // Catch: org.json.JSONException -> L33
            if (r1 != 0) goto L12
            goto L14
        L12:
            r1 = 0
            goto L15
        L14:
            r1 = 1
        L15:
            if (r1 != 0) goto L1e
            java.lang.String r1 = "source_name"
            java.lang.String r4 = r5.f21476a     // Catch: org.json.JSONException -> L33
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L33
        L1e:
            java.lang.String r1 = r5.f21477b     // Catch: org.json.JSONException -> L33
            if (r1 == 0) goto L28
            int r1 = r1.length()     // Catch: org.json.JSONException -> L33
            if (r1 != 0) goto L29
        L28:
            r2 = 1
        L29:
            if (r2 != 0) goto L3e
            java.lang.String r1 = "source_version"
            java.lang.String r2 = r5.f21477b     // Catch: org.json.JSONException -> L33
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L33
            goto L3e
        L33:
            o5.a$a r1 = o5.a.f20539b
            o5.a r1 = r1.a()
            java.lang.String r2 = "JSON Serialization of ingestion metadata object failed"
            r1.a(r2)
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.g.b():org.json.JSONObject");
    }
}
