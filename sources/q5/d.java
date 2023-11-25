package q5;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import qc.k0;
import qc.q;

/* compiled from: Identify.kt */
/* loaded from: classes.dex */
public class d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f21472c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f21473a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f21474b = new LinkedHashMap();

    /* compiled from: Identify.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    private final void e(f fVar, String str, Object obj) {
        boolean z10;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            o5.a.f20539b.a().d("Attempting to perform operation " + fVar.getOperationType() + " with a null or empty string property, ignoring");
        } else if (obj == null) {
            o5.a.f20539b.a().d("Attempting to perform operation " + fVar.getOperationType() + " with null value for property " + str + ", ignoring");
        } else if (this.f21474b.containsKey(f.CLEAR_ALL.getOperationType())) {
            o5.a.f20539b.a().d("This Identify already contains a $clearAll operation, ignoring operation %s");
        } else if (this.f21473a.contains(str)) {
            o5.a.f20539b.a().d("Already used property " + str + " in previous operation, ignoring operation " + fVar.getOperationType());
        } else {
            if (!this.f21474b.containsKey(fVar.getOperationType())) {
                this.f21474b.put(fVar.getOperationType(), new LinkedHashMap());
            }
            Object obj2 = this.f21474b.get(fVar.getOperationType());
            if (obj2 != null) {
                k0.d(obj2).put(str, obj);
                this.f21473a.add(str);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
        }
    }

    public final Map<String, Object> a() {
        return this.f21474b;
    }

    public final d b(String str, Object obj) {
        q.i(str, "property");
        q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        e(f.SET, str, obj);
        return this;
    }

    public final d c(String str, String str2) {
        q.i(str, "property");
        q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        e(f.SET, str, str2);
        return this;
    }

    public final d d(String str, String str2) {
        q.i(str, "property");
        q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        e(f.SET_ONCE, str, str2);
        return this;
    }
}
