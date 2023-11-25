package o6;

import android.content.Context;
import p6.x;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* loaded from: classes.dex */
public final class i implements k6.b<x> {

    /* renamed from: a  reason: collision with root package name */
    private final cc.a<Context> f20561a;

    /* renamed from: b  reason: collision with root package name */
    private final cc.a<q6.d> f20562b;

    /* renamed from: c  reason: collision with root package name */
    private final cc.a<p6.f> f20563c;

    /* renamed from: d  reason: collision with root package name */
    private final cc.a<s6.a> f20564d;

    public i(cc.a<Context> aVar, cc.a<q6.d> aVar2, cc.a<p6.f> aVar3, cc.a<s6.a> aVar4) {
        this.f20561a = aVar;
        this.f20562b = aVar2;
        this.f20563c = aVar3;
        this.f20564d = aVar4;
    }

    public static i a(cc.a<Context> aVar, cc.a<q6.d> aVar2, cc.a<p6.f> aVar3, cc.a<s6.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, q6.d dVar, p6.f fVar, s6.a aVar) {
        return (x) k6.d.c(h.a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // cc.a
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f20561a.get(), this.f20562b.get(), this.f20563c.get(), this.f20564d.get());
    }
}
