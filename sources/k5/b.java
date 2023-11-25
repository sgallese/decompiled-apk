package k5;

import dc.w;
import ec.n0;
import java.util.HashMap;
import java.util.Map;
import pc.l;
import qc.h;
import qc.q;
import qc.r;
import r5.f;

/* compiled from: AnalyticsConnectorPlugin.kt */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: q  reason: collision with root package name */
    public static final a f19344q = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final f.b f19345f = f.b.Before;

    /* renamed from: m  reason: collision with root package name */
    public p5.a f19346m;

    /* renamed from: p  reason: collision with root package name */
    private h5.a f19347p;

    /* compiled from: AnalyticsConnectorPlugin.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* compiled from: AnalyticsConnectorPlugin.kt */
    /* renamed from: k5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0434b extends r implements l<h5.b, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p5.a f19348f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0434b(p5.a aVar) {
            super(1);
            this.f19348f = aVar;
        }

        public final void a(h5.b bVar) {
            Map<String, Object> t10;
            q.i(bVar, "$dstr$eventType$eventProperties$userProperties");
            String a10 = bVar.a();
            Map<String, Object> b10 = bVar.b();
            Map<String, Map<String, Object>> c10 = bVar.c();
            q5.a aVar = new q5.a();
            aVar.K0(a10);
            Map<String, Object> map = null;
            if (b10 != null) {
                t10 = n0.t(b10);
            } else {
                t10 = null;
            }
            aVar.J0(t10);
            if (c10 != null) {
                map = n0.t(c10);
            }
            aVar.N0(map);
            p5.a.D(this.f19348f, aVar, null, null, 6, null);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(h5.b bVar) {
            a(bVar);
            return w.f13270a;
        }
    }

    @Override // r5.f
    public q5.a a(q5.a aVar) {
        q.i(aVar, "event");
        Map<String, Object> G0 = aVar.G0();
        if (G0 != null && !G0.isEmpty() && !q.d(aVar.D0(), "$exposure")) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : G0.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Map) {
                    try {
                        hashMap.put(key, (Map) value);
                    } catch (ClassCastException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            h5.a aVar2 = this.f19347p;
            if (aVar2 == null) {
                q.z("connector");
                aVar2 = null;
            }
            aVar2.d().a().d(hashMap).c();
        }
        return aVar;
    }

    @Override // r5.f
    public void b(p5.a aVar) {
        q.i(aVar, "amplitude");
        f.a.b(this, aVar);
        h5.a a10 = h5.a.f16464c.a(aVar.h().f());
        this.f19347p = a10;
        if (a10 == null) {
            q.z("connector");
            a10 = null;
        }
        a10.c().a(new C0434b(aVar));
    }

    @Override // r5.f
    public void c(p5.a aVar) {
        q.i(aVar, "<set-?>");
        this.f19346m = aVar;
    }

    @Override // r5.f
    public f.b getType() {
        return this.f19345f;
    }
}
