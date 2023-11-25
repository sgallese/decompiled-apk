package id;

import dc.w;
import pc.q;

/* compiled from: Select.kt */
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Object f17142a;

    /* renamed from: b  reason: collision with root package name */
    private final q<Object, j<?>, Object, w> f17143b;

    /* renamed from: c  reason: collision with root package name */
    private final q<j<?>, Object, Object, pc.l<Throwable, w>> f17144c;

    /* renamed from: d  reason: collision with root package name */
    private final q<Object, Object, Object, Object> f17145d;

    /* JADX WARN: Multi-variable type inference failed */
    public e(Object obj, q<Object, ? super j<?>, Object, w> qVar, q<? super j<?>, Object, Object, ? extends pc.l<? super Throwable, w>> qVar2) {
        q<Object, Object, Object, Object> qVar3;
        this.f17142a = obj;
        this.f17143b = qVar;
        this.f17144c = qVar2;
        qVar3 = k.f17169a;
        this.f17145d = qVar3;
    }

    @Override // id.h
    public q<Object, j<?>, Object, w> a() {
        return this.f17143b;
    }

    @Override // id.h
    public Object b() {
        return this.f17142a;
    }

    @Override // id.h
    public q<j<?>, Object, Object, pc.l<Throwable, w>> c() {
        return this.f17144c;
    }

    @Override // id.h
    public q<Object, Object, Object, Object> d() {
        return this.f17145d;
    }

    public /* synthetic */ e(Object obj, q qVar, q qVar2, int i10, qc.h hVar) {
        this(obj, qVar, (i10 & 4) != 0 ? null : qVar2);
    }
}
