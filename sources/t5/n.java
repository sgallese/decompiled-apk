package t5;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSONUtil.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f23696a = new n();

    private n() {
    }

    private final String c(String str) {
        if (str.length() > 1024) {
            String substring = str.substring(0, UserVerificationMethods.USER_VERIFY_ALL);
            qc.q.h(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    private final JSONObject e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() <= 1024) {
            Iterator<String> keys = jSONObject.keys();
            qc.q.h(keys, "obj.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null) {
                    String str = next;
                    try {
                        Object obj = jSONObject.get(str);
                        if (qc.q.d(obj.getClass(), String.class)) {
                            jSONObject.put(str, c((String) obj));
                        } else if (qc.q.d(obj.getClass(), JSONObject.class)) {
                            jSONObject.put(str, e((JSONObject) obj));
                        } else if (qc.q.d(obj.getClass(), JSONArray.class)) {
                            jSONObject.put(str, d((JSONArray) obj));
                        }
                    } catch (JSONException unused) {
                        throw new IllegalArgumentException("JSON parsing error. Too long (>1024 chars) or invalid JSON");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            return jSONObject;
        }
        throw new IllegalArgumentException("Too many properties (more than 1024) in JSON");
    }

    public final JSONObject a(q5.a aVar) {
        qc.q.i(aVar, "event");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", aVar.D0());
        o.a(jSONObject, "user_id", aVar.M());
        o.a(jSONObject, "device_id", aVar.k());
        o.a(jSONObject, "time", aVar.L());
        o.a(jSONObject, "event_properties", e(m.e(aVar.C0())));
        o.a(jSONObject, "user_properties", e(m.e(aVar.G0())));
        o.a(jSONObject, "groups", e(m.e(aVar.F0())));
        o.a(jSONObject, "group_properties", e(m.e(aVar.E0())));
        o.a(jSONObject, "app_version", aVar.d());
        o.a(jSONObject, "platform", aVar.D());
        o.a(jSONObject, "os_name", aVar.z());
        o.a(jSONObject, "os_version", aVar.A());
        o.a(jSONObject, "device_brand", aVar.j());
        o.a(jSONObject, "device_manufacturer", aVar.l());
        o.a(jSONObject, "device_model", aVar.m());
        o.a(jSONObject, "carrier", aVar.g());
        o.a(jSONObject, "country", aVar.i());
        o.a(jSONObject, "region", aVar.H());
        o.a(jSONObject, "city", aVar.h());
        o.a(jSONObject, "dma", aVar.n());
        o.a(jSONObject, "language", aVar.v());
        o.a(jSONObject, "price", aVar.E());
        o.a(jSONObject, "quantity", aVar.G());
        o.a(jSONObject, "revenue", aVar.I());
        o.a(jSONObject, "productId", aVar.F());
        o.a(jSONObject, "revenueType", aVar.J());
        o.a(jSONObject, "location_lat", aVar.x());
        o.a(jSONObject, "location_lng", aVar.y());
        o.a(jSONObject, "ip", aVar.u());
        o.a(jSONObject, "version_name", aVar.N());
        o.a(jSONObject, "idfa", aVar.q());
        o.a(jSONObject, "idfv", aVar.r());
        o.a(jSONObject, "adid", aVar.a());
        o.a(jSONObject, "android_id", aVar.b());
        o.a(jSONObject, "event_id", aVar.o());
        o.a(jSONObject, "session_id", Long.valueOf(aVar.K()));
        o.a(jSONObject, "insert_id", aVar.t());
        o.a(jSONObject, "library", aVar.w());
        o.a(jSONObject, "partner_id", aVar.B());
        o.a(jSONObject, "android_app_set_id", aVar.c());
        q5.h C = aVar.C();
        if (C != null) {
            jSONObject.put("plan", C.b());
        }
        q5.g s10 = aVar.s();
        if (s10 != null) {
            jSONObject.put("ingestion_metadata", s10.b());
        }
        return jSONObject;
    }

    public final String b(q5.a aVar) {
        qc.q.i(aVar, "event");
        String jSONObject = a(aVar).toString();
        qc.q.h(jSONObject, "eventToJsonObject(event).toString()");
        return jSONObject;
    }

    public final JSONArray d(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return new JSONArray();
        }
        int length = jSONArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                Object obj = jSONArray.get(i10);
                if (qc.q.d(obj.getClass(), String.class)) {
                    jSONArray.put(i10, c((String) obj));
                } else if (qc.q.d(obj.getClass(), JSONObject.class)) {
                    jSONArray.put(i10, e((JSONObject) obj));
                } else if (qc.q.d(obj.getClass(), JSONArray.class)) {
                    jSONArray.put(i10, d((JSONArray) obj));
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return jSONArray;
    }
}
