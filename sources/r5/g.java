package r5;

import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import dc.r;
import dc.w;
import ec.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import pc.l;
import qc.q;
import r5.f;

/* compiled from: Timeline.kt */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final Map<f.b, d> f22177a;

    /* renamed from: b  reason: collision with root package name */
    public p5.a f22178b;

    public g() {
        Map<f.b, d> k10;
        k10 = n0.k(r.a(f.b.Before, new d(new ArrayList())), r.a(f.b.Enrichment, new d(new ArrayList())), r.a(f.b.Destination, new d(new ArrayList())), r.a(f.b.Utility, new d(new ArrayList())));
        this.f22177a = k10;
    }

    private final q5.a c(d dVar, q5.a aVar) {
        q5.a c10;
        if (aVar != null) {
            if (dVar == null) {
                c10 = null;
            } else {
                c10 = dVar.c(aVar);
            }
            return c10;
        }
        return aVar;
    }

    public final void a(f fVar) {
        q.i(fVar, "plugin");
        fVar.b(e());
        d dVar = this.f22177a.get(fVar.getType());
        if (dVar != null) {
            dVar.a(fVar);
        }
    }

    public final void b(l<? super f, w> lVar) {
        q.i(lVar, "closure");
        Iterator<Map.Entry<f.b, d>> it = this.f22177a.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().b(lVar);
        }
    }

    public final q5.a d(f.b bVar, q5.a aVar) {
        q.i(bVar, TaskFormActivity.TASK_TYPE_KEY);
        return c(this.f22177a.get(bVar), aVar);
    }

    public final p5.a e() {
        p5.a aVar = this.f22178b;
        if (aVar != null) {
            return aVar;
        }
        q.z("amplitude");
        return null;
    }

    public void f(q5.a aVar) {
        q.i(aVar, "incomingEvent");
        d(f.b.Destination, d(f.b.Enrichment, d(f.b.Before, aVar)));
    }

    public final void g(p5.a aVar) {
        q.i(aVar, "<set-?>");
        this.f22178b = aVar;
    }
}
