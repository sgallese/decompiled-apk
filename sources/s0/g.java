package s0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ec.n0;
import ec.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pc.l;
import qc.q;
import s0.f;
import yc.v;

/* compiled from: SaveableStateRegistry.kt */
/* loaded from: classes.dex */
final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final l<Object, Boolean> f22925a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<Object>> f22926b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, List<pc.a<Object>>> f22927c;

    /* compiled from: SaveableStateRegistry.kt */
    /* loaded from: classes.dex */
    public static final class a implements f.a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f22929b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ pc.a<Object> f22930c;

        a(String str, pc.a<? extends Object> aVar) {
            this.f22929b = str;
            this.f22930c = aVar;
        }

        @Override // s0.f.a
        public void a() {
            List list = (List) g.this.f22927c.remove(this.f22929b);
            if (list != null) {
                list.remove(this.f22930c);
            }
            if (list != null && (!list.isEmpty()) != false) {
                g.this.f22927c.put(this.f22929b, list);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        r2 = ec.n0.t(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>> r2, pc.l<java.lang.Object, java.lang.Boolean> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "canBeSaved"
            qc.q.i(r3, r0)
            r1.<init>()
            r1.f22925a = r3
            if (r2 == 0) goto L12
            java.util.Map r2 = ec.k0.t(r2)
            if (r2 != 0) goto L17
        L12:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L17:
            r1.f22926b = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.f22927c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.g.<init>(java.util.Map, pc.l):void");
    }

    @Override // s0.f
    public boolean a(Object obj) {
        q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return this.f22925a.invoke(obj).booleanValue();
    }

    @Override // s0.f
    public Map<String, List<Object>> b() {
        Map<String, List<Object>> t10;
        ArrayList e10;
        t10 = n0.t(this.f22926b);
        for (Map.Entry<String, List<pc.a<Object>>> entry : this.f22927c.entrySet()) {
            String key = entry.getKey();
            List<pc.a<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object invoke = value.get(0).invoke();
                if (invoke == null) {
                    continue;
                } else if (a(invoke)) {
                    e10 = t.e(invoke);
                    t10.put(key, e10);
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object invoke2 = value.get(i10).invoke();
                    if (invoke2 != null && !a(invoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(invoke2);
                }
                t10.put(key, arrayList);
            }
        }
        return t10;
    }

    @Override // s0.f
    public Object c(String str) {
        q.i(str, "key");
        List<Object> remove = this.f22926b.remove(str);
        if (remove != null && (!remove.isEmpty()) != false) {
            if (remove.size() > 1) {
                this.f22926b.put(str, remove.subList(1, remove.size()));
            }
            return remove.get(0);
        }
        return null;
    }

    @Override // s0.f
    public f.a d(String str, pc.a<? extends Object> aVar) {
        boolean u10;
        q.i(str, "key");
        q.i(aVar, "valueProvider");
        u10 = v.u(str);
        if ((!u10) != false) {
            Map<String, List<pc.a<Object>>> map = this.f22927c;
            List<pc.a<Object>> list = map.get(str);
            if (list == null) {
                list = new ArrayList<>();
                map.put(str, list);
            }
            list.add(aVar);
            return new a(str, aVar);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }
}
