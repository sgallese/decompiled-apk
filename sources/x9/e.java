package x9;

import android.content.Context;
import ba.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PerfMetricValidator.java */
/* loaded from: classes3.dex */
public abstract class e {
    private static List<e> a(i iVar, Context context) {
        ArrayList arrayList = new ArrayList();
        if (iVar.f()) {
            arrayList.add(new d(iVar.g()));
        }
        if (iVar.i()) {
            arrayList.add(new c(iVar.j(), context));
        }
        if (iVar.W()) {
            arrayList.add(new a(iVar.V()));
        }
        if (iVar.a()) {
            arrayList.add(new b(iVar.l()));
        }
        return arrayList;
    }

    public static boolean b(i iVar, Context context) {
        List<e> a10 = a(iVar, context);
        if (a10.isEmpty()) {
            v9.a.e().a("No validators found for PerfMetric.");
            return false;
        }
        Iterator<e> it = a10.iterator();
        while (it.hasNext()) {
            if (!it.next().c()) {
                return false;
            }
        }
        return true;
    }

    public static void d(String str, String str2) {
        if (str != null && str.length() != 0) {
            if (str2 != null && str2.length() != 0) {
                if (str.length() <= 40) {
                    if (str2.length() <= 100) {
                        if (str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
                            return;
                        }
                        throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
            }
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        throw new IllegalArgumentException("Attribute key must not be null or empty");
    }

    public static String e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (com.google.firebase.perf.util.b bVar : com.google.firebase.perf.util.b.values()) {
            if (bVar.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    public static String f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (com.google.firebase.perf.util.c cVar : com.google.firebase.perf.util.c.values()) {
            if (cVar.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    public abstract boolean c();
}
