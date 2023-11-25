package r5;

import dc.w;
import java.util.Iterator;
import java.util.List;
import pc.l;
import qc.q;

/* compiled from: Mediator.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final List<f> f22175a;

    public d(List<f> list) {
        q.i(list, "plugins");
        this.f22175a = list;
    }

    public final boolean a(f fVar) {
        boolean add;
        q.i(fVar, "plugin");
        synchronized (this.f22175a) {
            add = d().add(fVar);
        }
        return add;
    }

    public final void b(l<? super f, w> lVar) {
        q.i(lVar, "closure");
        synchronized (this.f22175a) {
            Iterator<T> it = d().iterator();
            while (it.hasNext()) {
                lVar.invoke((f) it.next());
            }
            w wVar = w.f13270a;
        }
    }

    public final q5.a c(q5.a aVar) {
        q.i(aVar, "event");
        synchronized (this.f22175a) {
            for (f fVar : d()) {
                if (aVar != null) {
                    if (fVar instanceof a) {
                        try {
                            ((a) fVar).j(aVar);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    } else if (fVar instanceof c) {
                        aVar = fVar.a(aVar);
                        if (aVar instanceof q5.e) {
                            c cVar = (c) fVar;
                            if (aVar != null) {
                                aVar = cVar.g((q5.e) aVar);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.amplitude.core.events.IdentifyEvent");
                            }
                        } else if (aVar instanceof q5.c) {
                            c cVar2 = (c) fVar;
                            if (aVar != null) {
                                aVar = cVar2.d((q5.c) aVar);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.amplitude.core.events.GroupIdentifyEvent");
                            }
                        } else if (aVar instanceof q5.i) {
                            c cVar3 = (c) fVar;
                            if (aVar != null) {
                                aVar = cVar3.e((q5.i) aVar);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.amplitude.core.events.RevenueEvent");
                            }
                        } else if (aVar != null) {
                            aVar = ((c) fVar).f(aVar);
                        }
                    } else {
                        aVar = fVar.a(aVar);
                    }
                }
            }
        }
        return aVar;
    }

    public final List<f> d() {
        return this.f22175a;
    }
}
