package androidx.lifecycle;

import androidx.lifecycle.p;
import dc.m;

/* compiled from: WithLifecycleState.kt */
/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements s {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p.b f4922f;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ p f4923m;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ ad.m<Object> f4924p;

    /* renamed from: q  reason: collision with root package name */
    final /* synthetic */ pc.a<Object> f4925q;

    @Override // androidx.lifecycle.s
    public void c(v vVar, p.a aVar) {
        Object a10;
        qc.q.i(vVar, "source");
        qc.q.i(aVar, "event");
        if (aVar == p.a.Companion.d(this.f4922f)) {
            this.f4923m.d(this);
            ad.m<Object> mVar = this.f4924p;
            pc.a<Object> aVar2 = this.f4925q;
            try {
                m.a aVar3 = dc.m.f13253f;
                a10 = dc.m.a(aVar2.invoke());
            } catch (Throwable th) {
                m.a aVar4 = dc.m.f13253f;
                a10 = dc.m.a(dc.n.a(th));
            }
            mVar.resumeWith(a10);
        } else if (aVar == p.a.ON_DESTROY) {
            this.f4923m.d(this);
            ad.m<Object> mVar2 = this.f4924p;
            m.a aVar5 = dc.m.f13253f;
            mVar2.resumeWith(dc.m.a(dc.n.a(new LifecycleDestroyedException())));
        }
    }
}
