package t5;

import ec.b0;
import ec.h0;
import ec.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.g;
import q5.h;

/* compiled from: JSONUtil.kt */
/* loaded from: classes.dex */
public final class o {
    public static final void a(JSONObject jSONObject, String str, Object obj) {
        qc.q.i(jSONObject, "<this>");
        qc.q.i(str, "key");
        if (obj != null) {
            jSONObject.put(str, obj);
        }
    }

    public static final Set<Integer> b(JSONObject jSONObject) {
        Set<Integer> H0;
        qc.q.i(jSONObject, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        qc.q.h(keys, "this.keys()");
        while (keys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(keys.next());
            qc.q.h(jSONArray, "this.getJSONArray(fieldKey)");
            int[] g10 = g(jSONArray);
            int length = g10.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = g10[i10];
                i10++;
                arrayList.add(Integer.valueOf(i11));
            }
        }
        H0 = b0.H0(arrayList);
        return H0;
    }

    public static final String c(JSONObject jSONObject, String str, String str2) {
        qc.q.i(jSONObject, "<this>");
        qc.q.i(str, "key");
        qc.q.i(str2, "defaultValue");
        if (jSONObject.has(str)) {
            String string = jSONObject.getString(str);
            qc.q.h(string, "this.getString(key)");
            return string;
        }
        return str2;
    }

    public static final dc.l<String, String> d(JSONArray jSONArray) {
        vc.f s10;
        qc.q.i(jSONArray, "<this>");
        int length = jSONArray.length() / 2;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        s10 = vc.l.s(0, jSONArray.length());
        Iterator<Integer> it = s10.iterator();
        while (it.hasNext()) {
            int a10 = ((h0) it).a();
            if (a10 < length) {
                jSONArray2.put(jSONArray.getJSONObject(a10));
            } else {
                jSONArray3.put(jSONArray.getJSONObject(a10));
            }
        }
        String jSONArray4 = jSONArray2.toString();
        qc.q.h(jSONArray4, "firstHalf.toString()");
        String jSONArray5 = jSONArray3.toString();
        qc.q.h(jSONArray5, "secondHalf.toString()");
        return new dc.l<>(jSONArray4, jSONArray5);
    }

    public static final q5.a e(JSONObject jSONObject) {
        String str;
        String str2;
        Long l10;
        JSONObject jSONObject2;
        Map<String, Object> t10;
        JSONObject jSONObject3;
        Map<String, Object> t11;
        JSONObject jSONObject4;
        Map<String, Object> t12;
        JSONObject jSONObject5;
        Map<String, Object> t13;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Double d10;
        Integer num;
        Double d11;
        String str16;
        String str17;
        Double d12;
        Double d13;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        Long l11;
        String str23;
        String str24;
        String str25;
        q5.h hVar;
        qc.q.i(jSONObject, "<this>");
        q5.a aVar = new q5.a();
        String string = jSONObject.getString("event_type");
        qc.q.h(string, "this.getString(\"event_type\")");
        aVar.K0(string);
        q5.g gVar = null;
        if (jSONObject.has("user_id")) {
            str = jSONObject.getString("user_id");
        } else {
            str = null;
        }
        aVar.A0(str);
        if (jSONObject.has("device_id")) {
            str2 = jSONObject.getString("device_id");
        } else {
            str2 = null;
        }
        aVar.Y(str2);
        if (jSONObject.has("time")) {
            l10 = Long.valueOf(jSONObject.getLong("time"));
        } else {
            l10 = null;
        }
        aVar.z0(l10);
        if (jSONObject.has("event_properties")) {
            jSONObject2 = jSONObject.getJSONObject("event_properties");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            t10 = n0.t(m.g(jSONObject2));
        } else {
            t10 = null;
        }
        aVar.J0(t10);
        if (jSONObject.has("user_properties")) {
            jSONObject3 = jSONObject.getJSONObject("user_properties");
        } else {
            jSONObject3 = null;
        }
        if (jSONObject3 != null) {
            t11 = n0.t(m.g(jSONObject3));
        } else {
            t11 = null;
        }
        aVar.N0(t11);
        if (jSONObject.has("groups")) {
            jSONObject4 = jSONObject.getJSONObject("groups");
        } else {
            jSONObject4 = null;
        }
        if (jSONObject4 != null) {
            t12 = n0.t(m.g(jSONObject4));
        } else {
            t12 = null;
        }
        aVar.M0(t12);
        if (jSONObject.has("group_properties")) {
            jSONObject5 = jSONObject.getJSONObject("group_properties");
        } else {
            jSONObject5 = null;
        }
        if (jSONObject5 != null) {
            t13 = n0.t(m.g(jSONObject5));
        } else {
            t13 = null;
        }
        aVar.L0(t13);
        if (jSONObject.has("app_version")) {
            str3 = jSONObject.getString("app_version");
        } else {
            str3 = null;
        }
        aVar.R(str3);
        if (jSONObject.has("platform")) {
            str4 = jSONObject.getString("platform");
        } else {
            str4 = null;
        }
        aVar.r0(str4);
        if (jSONObject.has("os_name")) {
            str5 = jSONObject.getString("os_name");
        } else {
            str5 = null;
        }
        aVar.n0(str5);
        if (jSONObject.has("os_version")) {
            str6 = jSONObject.getString("os_version");
        } else {
            str6 = null;
        }
        aVar.o0(str6);
        if (jSONObject.has("device_brand")) {
            str7 = jSONObject.getString("device_brand");
        } else {
            str7 = null;
        }
        aVar.X(str7);
        if (jSONObject.has("device_manufacturer")) {
            str8 = jSONObject.getString("device_manufacturer");
        } else {
            str8 = null;
        }
        aVar.Z(str8);
        if (jSONObject.has("device_model")) {
            str9 = jSONObject.getString("device_model");
        } else {
            str9 = null;
        }
        aVar.a0(str9);
        if (jSONObject.has("carrier")) {
            str10 = jSONObject.getString("carrier");
        } else {
            str10 = null;
        }
        aVar.U(str10);
        if (jSONObject.has("country")) {
            str11 = jSONObject.getString("country");
        } else {
            str11 = null;
        }
        aVar.W(str11);
        if (jSONObject.has("region")) {
            str12 = jSONObject.getString("region");
        } else {
            str12 = null;
        }
        aVar.v0(str12);
        if (jSONObject.has("city")) {
            str13 = jSONObject.getString("city");
        } else {
            str13 = null;
        }
        aVar.V(str13);
        if (jSONObject.has("dma")) {
            str14 = jSONObject.getString("dma");
        } else {
            str14 = null;
        }
        aVar.b0(str14);
        if (jSONObject.has("language")) {
            str15 = jSONObject.getString("language");
        } else {
            str15 = null;
        }
        aVar.j0(str15);
        if (jSONObject.has("price")) {
            d10 = Double.valueOf(jSONObject.getDouble("price"));
        } else {
            d10 = null;
        }
        aVar.s0(d10);
        if (jSONObject.has("quantity")) {
            num = Integer.valueOf(jSONObject.getInt("quantity"));
        } else {
            num = null;
        }
        aVar.u0(num);
        if (jSONObject.has("revenue")) {
            d11 = Double.valueOf(jSONObject.getDouble("revenue"));
        } else {
            d11 = null;
        }
        aVar.w0(d11);
        if (jSONObject.has("productId")) {
            str16 = jSONObject.getString("productId");
        } else {
            str16 = null;
        }
        aVar.t0(str16);
        if (jSONObject.has("revenueType")) {
            str17 = jSONObject.getString("revenueType");
        } else {
            str17 = null;
        }
        aVar.x0(str17);
        if (jSONObject.has("location_lat")) {
            d12 = Double.valueOf(jSONObject.getDouble("location_lat"));
        } else {
            d12 = null;
        }
        aVar.l0(d12);
        if (jSONObject.has("location_lng")) {
            d13 = Double.valueOf(jSONObject.getDouble("location_lng"));
        } else {
            d13 = null;
        }
        aVar.m0(d13);
        if (jSONObject.has("ip")) {
            str18 = jSONObject.getString("ip");
        } else {
            str18 = null;
        }
        aVar.i0(str18);
        if (jSONObject.has("idfa")) {
            str19 = jSONObject.getString("idfa");
        } else {
            str19 = null;
        }
        aVar.e0(str19);
        if (jSONObject.has("idfv")) {
            str20 = jSONObject.getString("idfv");
        } else {
            str20 = null;
        }
        aVar.f0(str20);
        if (jSONObject.has("adid")) {
            str21 = jSONObject.getString("adid");
        } else {
            str21 = null;
        }
        aVar.O(str21);
        if (jSONObject.has("android_id")) {
            str22 = jSONObject.getString("android_id");
        } else {
            str22 = null;
        }
        aVar.P(str22);
        aVar.Q(jSONObject.optString("android_app_set_id", null));
        if (jSONObject.has("event_id")) {
            l11 = Long.valueOf(jSONObject.getLong("event_id"));
        } else {
            l11 = null;
        }
        aVar.c0(l11);
        aVar.y0(jSONObject.getLong("session_id"));
        if (jSONObject.has("insert_id")) {
            str23 = jSONObject.getString("insert_id");
        } else {
            str23 = null;
        }
        aVar.h0(str23);
        if (jSONObject.has("library")) {
            str24 = jSONObject.getString("library");
        } else {
            str24 = null;
        }
        aVar.k0(str24);
        if (jSONObject.has("partner_id")) {
            str25 = jSONObject.getString("partner_id");
        } else {
            str25 = null;
        }
        aVar.p0(str25);
        if (jSONObject.has("plan")) {
            h.a aVar2 = q5.h.f21478e;
            JSONObject jSONObject6 = jSONObject.getJSONObject("plan");
            qc.q.h(jSONObject6, "this.getJSONObject(\"plan\")");
            hVar = aVar2.a(jSONObject6);
        } else {
            hVar = null;
        }
        aVar.q0(hVar);
        if (jSONObject.has("ingestion_metadata")) {
            g.a aVar3 = q5.g.f21475c;
            JSONObject jSONObject7 = jSONObject.getJSONObject("ingestion_metadata");
            qc.q.h(jSONObject7, "this.getJSONObject(\"ingestion_metadata\")");
            gVar = aVar3.a(jSONObject7);
        }
        aVar.g0(gVar);
        return aVar;
    }

    public static final List<q5.a> f(JSONArray jSONArray) {
        vc.f s10;
        qc.q.i(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        s10 = vc.l.s(0, jSONArray.length());
        Iterator<Integer> it = s10.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(((h0) it).a());
            qc.q.h(jSONObject, "this.getJSONObject(it)");
            arrayList.add(e(jSONObject));
        }
        return arrayList;
    }

    public static final int[] g(JSONArray jSONArray) {
        qc.q.i(jSONArray, "<this>");
        int length = jSONArray.length();
        int[] iArr = new int[length];
        int i10 = length - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                iArr[i11] = jSONArray.optInt(i11);
                if (i12 > i10) {
                    break;
                }
                i11 = i12;
            }
        }
        return iArr;
    }
}
