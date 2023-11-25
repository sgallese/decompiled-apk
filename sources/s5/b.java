package s5;

import java.util.Map;
import q5.g;
import qc.h;
import qc.q;
import r5.f;

/* compiled from: GetAmpliExtrasPlugin.kt */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: p  reason: collision with root package name */
    public static final a f23029p = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final f.b f23030f = f.b.Enrichment;

    /* renamed from: m  reason: collision with root package name */
    public p5.a f23031m;

    /* compiled from: GetAmpliExtrasPlugin.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    @Override // r5.f
    public q5.a a(q5.a aVar) {
        Object obj;
        q.i(aVar, "event");
        Map<String, Object> p10 = aVar.p();
        if (p10 == null) {
            obj = null;
        } else {
            obj = p10.get("ampli");
        }
        if (obj == null) {
            return aVar;
        }
        try {
            Object obj2 = ((Map) obj).get("ingestionMetadata");
            if (obj2 != null) {
                Map map = (Map) obj2;
                aVar.g0(new g((String) map.get("sourceName"), (String) map.get("sourceVersion")));
                return aVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        } catch (Throwable unused) {
            return aVar;
        }
    }

    @Override // r5.f
    public void b(p5.a aVar) {
        q.i(aVar, "amplitude");
        f.a.b(this, aVar);
    }

    @Override // r5.f
    public void c(p5.a aVar) {
        q.i(aVar, "<set-?>");
        this.f23031m = aVar;
    }

    @Override // r5.f
    public f.b getType() {
        return this.f23030f;
    }
}
