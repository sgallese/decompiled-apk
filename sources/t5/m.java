package t5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JSON.kt */
/* loaded from: classes.dex */
public final class m {
    private static final Object a(Object obj) {
        if (obj instanceof JSONObject) {
            return g((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return f((JSONArray) obj);
        }
        if (obj instanceof BigDecimal) {
            return Double.valueOf(((BigDecimal) obj).doubleValue());
        }
        if (qc.q.d(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    private static final Object b(Object obj) {
        if (obj instanceof Map) {
            return e((Map) obj);
        }
        if (obj instanceof Collection) {
            return c((Collection) obj);
        }
        if (obj instanceof Object[]) {
            return d((Object[]) obj);
        }
        return obj;
    }

    public static final JSONArray c(Collection<?> collection) {
        if (collection == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            jSONArray.put(b(it.next()));
        }
        return jSONArray;
    }

    public static final JSONArray d(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator a10 = qc.c.a(objArr);
        while (a10.hasNext()) {
            jSONArray.put(b(a10.next()));
        }
        return jSONArray;
    }

    public static final JSONObject e(Map<?, ?> map) {
        String str;
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                str = (String) key;
            } else {
                str = null;
            }
            if (str != null) {
                jSONObject.put(str, b(entry.getValue()));
            }
        }
        return jSONObject;
    }

    public static final List<Object> f(JSONArray jSONArray) {
        qc.q.i(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                arrayList.add(a(jSONArray.get(i10)));
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> g(JSONObject jSONObject) {
        qc.q.i(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        qc.q.h(keys, "this.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            qc.q.h(next, "key");
            linkedHashMap.put(next, a(jSONObject.get(next)));
        }
        return linkedHashMap;
    }
}
