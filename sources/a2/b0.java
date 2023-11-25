package a2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: FontVariation.kt */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<a0> f234a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f235b;

    public b0(a0... a0VarArr) {
        String k02;
        qc.q.i(a0VarArr, "settings");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z10 = false;
        for (a0 a0Var : a0VarArr) {
            String c10 = a0Var.c();
            Object obj = linkedHashMap.get(c10);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c10, obj);
            }
            ((List) obj).add(a0Var);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() == 1) {
                    ec.y.w(arrayList, list);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('\'');
                    sb2.append(str);
                    sb2.append("' must be unique. Actual [ [");
                    k02 = ec.b0.k0(list, null, null, null, 0, null, null, 63, null);
                    sb2.append(k02);
                    sb2.append(']');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                this.f234a = arrayList2;
                int size = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    } else if (((a0) arrayList2.get(i10)).a()) {
                        z10 = true;
                        break;
                    } else {
                        i10++;
                    }
                }
                this.f235b = z10;
                return;
            }
        }
    }

    public final List<a0> a() {
        return this.f234a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b0) && qc.q.d(this.f234a, ((b0) obj).f234a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f234a.hashCode();
    }
}
