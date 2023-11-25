package p6;

import java.util.concurrent.Executor;

/* compiled from: WorkInitializer_Factory.java */
/* loaded from: classes.dex */
public final class w implements k6.b<v> {

    /* renamed from: a  reason: collision with root package name */
    private final cc.a<Executor> f21165a;

    /* renamed from: b  reason: collision with root package name */
    private final cc.a<q6.d> f21166b;

    /* renamed from: c  reason: collision with root package name */
    private final cc.a<x> f21167c;

    /* renamed from: d  reason: collision with root package name */
    private final cc.a<r6.a> f21168d;

    public w(cc.a<Executor> aVar, cc.a<q6.d> aVar2, cc.a<x> aVar3, cc.a<r6.a> aVar4) {
        this.f21165a = aVar;
        this.f21166b = aVar2;
        this.f21167c = aVar3;
        this.f21168d = aVar4;
    }

    public static w a(cc.a<Executor> aVar, cc.a<q6.d> aVar2, cc.a<x> aVar3, cc.a<r6.a> aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, q6.d dVar, x xVar, r6.a aVar) {
        return new v(executor, dVar, xVar, aVar);
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f21165a.get(), this.f21166b.get(), this.f21167c.get(), this.f21168d.get());
    }
}
