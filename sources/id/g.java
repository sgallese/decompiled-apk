package id;

import dc.w;
import pc.q;

/* compiled from: Select.kt */
/* loaded from: classes4.dex */
public final class g<Q> implements f<Q> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f17146a;

    /* renamed from: b  reason: collision with root package name */
    private final q<Object, j<?>, Object, w> f17147b;

    /* renamed from: c  reason: collision with root package name */
    private final q<Object, Object, Object, Object> f17148c;

    /* renamed from: d  reason: collision with root package name */
    private final q<j<?>, Object, Object, pc.l<Throwable, w>> f17149d;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Object obj, q<Object, ? super j<?>, Object, w> qVar, q<Object, Object, Object, ? extends Object> qVar2, q<? super j<?>, Object, Object, ? extends pc.l<? super Throwable, w>> qVar3) {
        this.f17146a = obj;
        this.f17147b = qVar;
        this.f17148c = qVar2;
        this.f17149d = qVar3;
    }

    @Override // id.h
    public q<Object, j<?>, Object, w> a() {
        return this.f17147b;
    }

    @Override // id.h
    public Object b() {
        return this.f17146a;
    }

    @Override // id.h
    public q<j<?>, Object, Object, pc.l<Throwable, w>> c() {
        return this.f17149d;
    }

    @Override // id.h
    public q<Object, Object, Object, Object> d() {
        return this.f17148c;
    }
}
