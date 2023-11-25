package o6;

import java.util.concurrent.Executor;
import p6.x;

/* compiled from: DefaultScheduler_Factory.java */
/* loaded from: classes.dex */
public final class d implements k6.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final cc.a<Executor> f20555a;

    /* renamed from: b  reason: collision with root package name */
    private final cc.a<j6.e> f20556b;

    /* renamed from: c  reason: collision with root package name */
    private final cc.a<x> f20557c;

    /* renamed from: d  reason: collision with root package name */
    private final cc.a<q6.d> f20558d;

    /* renamed from: e  reason: collision with root package name */
    private final cc.a<r6.a> f20559e;

    public d(cc.a<Executor> aVar, cc.a<j6.e> aVar2, cc.a<x> aVar3, cc.a<q6.d> aVar4, cc.a<r6.a> aVar5) {
        this.f20555a = aVar;
        this.f20556b = aVar2;
        this.f20557c = aVar3;
        this.f20558d = aVar4;
        this.f20559e = aVar5;
    }

    public static d a(cc.a<Executor> aVar, cc.a<j6.e> aVar2, cc.a<x> aVar3, cc.a<q6.d> aVar4, cc.a<r6.a> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, j6.e eVar, x xVar, q6.d dVar, r6.a aVar) {
        return new c(executor, eVar, xVar, dVar, aVar);
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f20555a.get(), this.f20556b.get(), this.f20557c.get(), this.f20558d.get(), this.f20559e.get());
    }
}
