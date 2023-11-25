package q5;

import org.json.JSONObject;
import qc.q;

/* compiled from: Plan.kt */
/* loaded from: classes.dex */
public class h {

    /* renamed from: e  reason: collision with root package name */
    public static final a f21478e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f21479a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21480b;

    /* renamed from: c  reason: collision with root package name */
    private final String f21481c;

    /* renamed from: d  reason: collision with root package name */
    private final String f21482d;

    /* compiled from: Plan.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final h a(JSONObject jSONObject) {
            q.i(jSONObject, "jsonObject");
            return new h(jSONObject.optString("branch", null), jSONObject.optString("source", null), jSONObject.optString("version", null), jSONObject.optString("versionId", null));
        }
    }

    public h(String str, String str2, String str3, String str4) {
        this.f21479a = str;
        this.f21480b = str2;
        this.f21481c = str3;
        this.f21482d = str4;
    }

    public final h a() {
        return new h(this.f21479a, this.f21480b, this.f21481c, this.f21482d);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[Catch: JSONException -> 0x0061, TryCatch #0 {JSONException -> 0x0061, blocks: (B:3:0x0005, B:5:0x000b, B:11:0x0017, B:12:0x001e, B:14:0x0022, B:20:0x002e, B:21:0x0035, B:23:0x0039, B:29:0x0045, B:30:0x004c, B:32:0x0050, B:36:0x0059), top: B:40:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[Catch: JSONException -> 0x0061, TryCatch #0 {JSONException -> 0x0061, blocks: (B:3:0x0005, B:5:0x000b, B:11:0x0017, B:12:0x001e, B:14:0x0022, B:20:0x002e, B:21:0x0035, B:23:0x0039, B:29:0x0045, B:30:0x004c, B:32:0x0050, B:36:0x0059), top: B:40:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039 A[Catch: JSONException -> 0x0061, TryCatch #0 {JSONException -> 0x0061, blocks: (B:3:0x0005, B:5:0x000b, B:11:0x0017, B:12:0x001e, B:14:0x0022, B:20:0x002e, B:21:0x0035, B:23:0x0039, B:29:0x0045, B:30:0x004c, B:32:0x0050, B:36:0x0059), top: B:40:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045 A[Catch: JSONException -> 0x0061, TryCatch #0 {JSONException -> 0x0061, blocks: (B:3:0x0005, B:5:0x000b, B:11:0x0017, B:12:0x001e, B:14:0x0022, B:20:0x002e, B:21:0x0035, B:23:0x0039, B:29:0x0045, B:30:0x004c, B:32:0x0050, B:36:0x0059), top: B:40:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050 A[Catch: JSONException -> 0x0061, TryCatch #0 {JSONException -> 0x0061, blocks: (B:3:0x0005, B:5:0x000b, B:11:0x0017, B:12:0x001e, B:14:0x0022, B:20:0x002e, B:21:0x0035, B:23:0x0039, B:29:0x0045, B:30:0x004c, B:32:0x0050, B:36:0x0059), top: B:40:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059 A[Catch: JSONException -> 0x0061, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0061, blocks: (B:3:0x0005, B:5:0x000b, B:11:0x0017, B:12:0x001e, B:14:0x0022, B:20:0x002e, B:21:0x0035, B:23:0x0039, B:29:0x0045, B:30:0x004c, B:32:0x0050, B:36:0x0059), top: B:40:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject b() {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r5.f21479a     // Catch: org.json.JSONException -> L61
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            int r1 = r1.length()     // Catch: org.json.JSONException -> L61
            if (r1 != 0) goto L12
            goto L14
        L12:
            r1 = 0
            goto L15
        L14:
            r1 = 1
        L15:
            if (r1 != 0) goto L1e
            java.lang.String r1 = "branch"
            java.lang.String r4 = r5.f21479a     // Catch: org.json.JSONException -> L61
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L61
        L1e:
            java.lang.String r1 = r5.f21480b     // Catch: org.json.JSONException -> L61
            if (r1 == 0) goto L2b
            int r1 = r1.length()     // Catch: org.json.JSONException -> L61
            if (r1 != 0) goto L29
            goto L2b
        L29:
            r1 = 0
            goto L2c
        L2b:
            r1 = 1
        L2c:
            if (r1 != 0) goto L35
            java.lang.String r1 = "source"
            java.lang.String r4 = r5.f21480b     // Catch: org.json.JSONException -> L61
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L61
        L35:
            java.lang.String r1 = r5.f21481c     // Catch: org.json.JSONException -> L61
            if (r1 == 0) goto L42
            int r1 = r1.length()     // Catch: org.json.JSONException -> L61
            if (r1 != 0) goto L40
            goto L42
        L40:
            r1 = 0
            goto L43
        L42:
            r1 = 1
        L43:
            if (r1 != 0) goto L4c
            java.lang.String r1 = "version"
            java.lang.String r4 = r5.f21481c     // Catch: org.json.JSONException -> L61
            r0.put(r1, r4)     // Catch: org.json.JSONException -> L61
        L4c:
            java.lang.String r1 = r5.f21482d     // Catch: org.json.JSONException -> L61
            if (r1 == 0) goto L56
            int r1 = r1.length()     // Catch: org.json.JSONException -> L61
            if (r1 != 0) goto L57
        L56:
            r2 = 1
        L57:
            if (r2 != 0) goto L6c
            java.lang.String r1 = "versionId"
            java.lang.String r2 = r5.f21482d     // Catch: org.json.JSONException -> L61
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L61
            goto L6c
        L61:
            o5.a$a r1 = o5.a.f20539b
            o5.a r1 = r1.a()
            java.lang.String r2 = "JSON Serialization of tacking plan object failed"
            r1.a(r2)
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.h.b():org.json.JSONObject");
    }
}
