package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* compiled from: MediatorLiveData.java */
/* loaded from: classes.dex */
public class d0<T> extends f0<T> {

    /* renamed from: l  reason: collision with root package name */
    private m.b<LiveData<?>, a<?>> f4958l = new m.b<>();

    /* compiled from: MediatorLiveData.java */
    /* loaded from: classes.dex */
    private static class a<V> implements g0<V> {

        /* renamed from: f  reason: collision with root package name */
        final LiveData<V> f4959f;

        /* renamed from: m  reason: collision with root package name */
        final g0<? super V> f4960m;

        /* renamed from: p  reason: collision with root package name */
        int f4961p = -1;

        a(LiveData<V> liveData, g0<? super V> g0Var) {
            this.f4959f = liveData;
            this.f4960m = g0Var;
        }

        void a() {
            this.f4959f.k(this);
        }

        void b() {
            this.f4959f.o(this);
        }

        @Override // androidx.lifecycle.g0
        public void onChanged(V v10) {
            if (this.f4961p != this.f4959f.g()) {
                this.f4961p = this.f4959f.g();
                this.f4960m.onChanged(v10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void l() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f4958l.iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void m() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f4958l.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    public <S> void q(LiveData<S> liveData, g0<? super S> g0Var) {
        if (liveData != null) {
            a<?> aVar = new a<>(liveData, g0Var);
            a<?> i10 = this.f4958l.i(liveData, aVar);
            if (i10 != null && i10.f4960m != g0Var) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (i10 == null && h()) {
                aVar.a();
                return;
            }
            return;
        }
        throw new NullPointerException("source cannot be null");
    }
}
