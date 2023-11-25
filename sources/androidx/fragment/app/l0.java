package androidx.fragment.app;

import android.view.View;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: FragmentTransition.kt */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f4760a;

    /* renamed from: b  reason: collision with root package name */
    public static final n0 f4761b;

    /* renamed from: c  reason: collision with root package name */
    public static final n0 f4762c;

    static {
        l0 l0Var = new l0();
        f4760a = l0Var;
        f4761b = new m0();
        f4762c = l0Var.c();
    }

    private l0() {
    }

    public static final void a(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a<String, View> aVar, boolean z11) {
        androidx.core.app.x enterTransitionCallback;
        qc.q.i(fragment, "inFragment");
        qc.q.i(fragment2, "outFragment");
        qc.q.i(aVar, "sharedElements");
        if (z10) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList(aVar.size());
            Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(aVar.size());
            Iterator<Map.Entry<String, View>> it2 = aVar.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (z11) {
                enterTransitionCallback.g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.f(arrayList2, arrayList, null);
            }
        }
    }

    public static final String b(androidx.collection.a<String, String> aVar, String str) {
        Object c02;
        qc.q.i(aVar, "<this>");
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : aVar.entrySet()) {
            if (qc.q.d(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        c02 = ec.b0.c0(arrayList);
        return (String) c02;
    }

    private final n0 c() {
        try {
            qc.q.g(c4.e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (n0) c4.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void d(androidx.collection.a<String, String> aVar, androidx.collection.a<String, View> aVar2) {
        qc.q.i(aVar, "<this>");
        qc.q.i(aVar2, "namedViews");
        int size = aVar.size();
        while (true) {
            size--;
            if (-1 < size) {
                if (!aVar2.containsKey(aVar.n(size))) {
                    aVar.l(size);
                }
            } else {
                return;
            }
        }
    }

    public static final void e(List<? extends View> list, int i10) {
        qc.q.i(list, "views");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }

    public static final boolean f() {
        if (f4761b == null && f4762c == null) {
            return false;
        }
        return true;
    }
}
