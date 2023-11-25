package p6;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: Uploader_Factory.java */
/* loaded from: classes.dex */
public final class s implements k6.b<r> {

    /* renamed from: a  reason: collision with root package name */
    private final cc.a<Context> f21150a;

    /* renamed from: b  reason: collision with root package name */
    private final cc.a<j6.e> f21151b;

    /* renamed from: c  reason: collision with root package name */
    private final cc.a<q6.d> f21152c;

    /* renamed from: d  reason: collision with root package name */
    private final cc.a<x> f21153d;

    /* renamed from: e  reason: collision with root package name */
    private final cc.a<Executor> f21154e;

    /* renamed from: f  reason: collision with root package name */
    private final cc.a<r6.a> f21155f;

    /* renamed from: g  reason: collision with root package name */
    private final cc.a<s6.a> f21156g;

    /* renamed from: h  reason: collision with root package name */
    private final cc.a<s6.a> f21157h;

    /* renamed from: i  reason: collision with root package name */
    private final cc.a<q6.c> f21158i;

    public s(cc.a<Context> aVar, cc.a<j6.e> aVar2, cc.a<q6.d> aVar3, cc.a<x> aVar4, cc.a<Executor> aVar5, cc.a<r6.a> aVar6, cc.a<s6.a> aVar7, cc.a<s6.a> aVar8, cc.a<q6.c> aVar9) {
        this.f21150a = aVar;
        this.f21151b = aVar2;
        this.f21152c = aVar3;
        this.f21153d = aVar4;
        this.f21154e = aVar5;
        this.f21155f = aVar6;
        this.f21156g = aVar7;
        this.f21157h = aVar8;
        this.f21158i = aVar9;
    }

    public static s a(cc.a<Context> aVar, cc.a<j6.e> aVar2, cc.a<q6.d> aVar3, cc.a<x> aVar4, cc.a<Executor> aVar5, cc.a<r6.a> aVar6, cc.a<s6.a> aVar7, cc.a<s6.a> aVar8, cc.a<q6.c> aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, j6.e eVar, q6.d dVar, x xVar, Executor executor, r6.a aVar, s6.a aVar2, s6.a aVar3, q6.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, aVar, aVar2, aVar3, cVar);
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f21150a.get(), this.f21151b.get(), this.f21152c.get(), this.f21153d.get(), this.f21154e.get(), this.f21155f.get(), this.f21156g.get(), this.f21157h.get(), this.f21158i.get());
    }
}
