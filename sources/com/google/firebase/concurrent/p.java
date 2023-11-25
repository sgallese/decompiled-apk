package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: DelegatingScheduledFuture.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes3.dex */
class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* renamed from: u  reason: collision with root package name */
    private final ScheduledFuture<?> f11331u;

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes3.dex */
    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.t(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v10) {
            p.this.s(v10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes3.dex */
    public interface b<T> {
        void a(Throwable th);

        void set(T t10);
    }

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes3.dex */
    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(c<V> cVar) {
        this.f11331u = cVar.a(new a());
    }

    @Override // androidx.concurrent.futures.a
    protected void d() {
        this.f11331u.cancel(v());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f11331u.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* renamed from: y  reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f11331u.compareTo(delayed);
    }
}
