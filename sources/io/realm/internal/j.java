package io.realm.internal;

import io.realm.internal.j.b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: ObserverPairList.java */
/* loaded from: classes4.dex */
public class j<T extends b> {

    /* renamed from: a  reason: collision with root package name */
    private List<T> f17817a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f17818b = false;

    /* compiled from: ObserverPairList.java */
    /* loaded from: classes4.dex */
    public interface a<T extends b> {
        void a(T t10, Object obj);
    }

    /* compiled from: ObserverPairList.java */
    /* loaded from: classes4.dex */
    public static abstract class b<T, S> {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<T> f17819a;

        /* renamed from: b  reason: collision with root package name */
        protected final S f17820b;

        /* renamed from: c  reason: collision with root package name */
        boolean f17821c = false;

        public b(T t10, S s10) {
            this.f17820b = s10;
            this.f17819a = new WeakReference<>(t10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f17820b.equals(bVar.f17820b) && this.f17819a.get() == bVar.f17819a.get()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            T t10 = this.f17819a.get();
            int i11 = 0;
            if (t10 != null) {
                i10 = t10.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            S s10 = this.f17820b;
            if (s10 != null) {
                i11 = s10.hashCode();
            }
            return i12 + i11;
        }
    }

    public void a(T t10) {
        if (!this.f17817a.contains(t10)) {
            this.f17817a.add(t10);
            t10.f17821c = false;
        }
        if (this.f17818b) {
            this.f17818b = false;
        }
    }

    public void b() {
        this.f17818b = true;
        this.f17817a.clear();
    }

    public void c(a<T> aVar) {
        for (T t10 : this.f17817a) {
            if (!this.f17818b) {
                Object obj = t10.f17819a.get();
                if (obj == null) {
                    this.f17817a.remove(t10);
                } else if (!t10.f17821c) {
                    aVar.a(t10, obj);
                }
            } else {
                return;
            }
        }
    }

    public boolean d() {
        return this.f17817a.isEmpty();
    }

    public <S, U> void e(S s10, U u10) {
        for (T t10 : this.f17817a) {
            if (s10 == t10.f17819a.get() && u10.equals(t10.f17820b)) {
                t10.f17821c = true;
                this.f17817a.remove(t10);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Object obj) {
        for (T t10 : this.f17817a) {
            Object obj2 = t10.f17819a.get();
            if (obj2 == null || obj2 == obj) {
                t10.f17821c = true;
                this.f17817a.remove(t10);
            }
        }
    }

    public int g() {
        return this.f17817a.size();
    }
}
