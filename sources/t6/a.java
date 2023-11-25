package t6;

import android.util.SparseArray;
import g6.d;
import java.util.HashMap;

/* compiled from: PriorityMapping.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<d> f23709a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<d, Integer> f23710b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f23710b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f23710b.put(d.VERY_LOW, 1);
        f23710b.put(d.HIGHEST, 2);
        for (d dVar : f23710b.keySet()) {
            f23709a.append(f23710b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f23710b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f23709a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
