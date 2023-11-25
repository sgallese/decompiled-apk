package k3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: NavArgument.kt */
/* loaded from: classes.dex */
public final class i {
    public static final List<String> a(Map<String, androidx.navigation.b> map, pc.l<? super String, Boolean> lVar) {
        qc.q.i(map, "<this>");
        qc.q.i(lVar, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, androidx.navigation.b> entry : map.entrySet()) {
            androidx.navigation.b value = entry.getValue();
            boolean z10 = false;
            if (value != null && !value.c() && !value.b()) {
                z10 = true;
            }
            if (z10) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (lVar.invoke((String) obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
