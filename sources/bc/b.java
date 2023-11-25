package bc;

import android.os.Looper;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.realm.a1;
import io.realm.g1;
import io.realm.n;
import io.realm.o0;
import io.realm.p;
import io.realm.v0;
import io.realm.x0;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: RealmObservableFactory.java */
/* loaded from: classes4.dex */
public class b implements bc.c {

    /* renamed from: e  reason: collision with root package name */
    private static final BackpressureStrategy f8119e = BackpressureStrategy.LATEST;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f8120a;

    /* renamed from: b  reason: collision with root package name */
    private ThreadLocal<h<g1>> f8121b = new e();

    /* renamed from: c  reason: collision with root package name */
    private ThreadLocal<h<x0>> f8122c = new f();

    /* renamed from: d  reason: collision with root package name */
    private ThreadLocal<h<a1>> f8123d = new g();

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: RealmObservableFactory.java */
    /* loaded from: classes4.dex */
    class a<E> implements FlowableOnSubscribe<E> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o0 f8124a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v0 f8125b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a1 f8126c;

        a(o0 o0Var, v0 v0Var, a1 a1Var) {
            this.f8124a = o0Var;
            this.f8125b = v0Var;
            this.f8126c = a1Var;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: RealmObservableFactory.java */
    /* renamed from: bc.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0189b<E> implements ObservableOnSubscribe<bc.a<E>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a1 f8128a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v0 f8129b;

        C0189b(a1 a1Var, v0 v0Var) {
            this.f8128a = a1Var;
            this.f8129b = v0Var;
        }
    }

    /* compiled from: RealmObservableFactory.java */
    /* loaded from: classes4.dex */
    class c implements FlowableOnSubscribe<p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f8131a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v0 f8132b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f8133c;

        c(n nVar, v0 v0Var, p pVar) {
            this.f8131a = nVar;
            this.f8132b = v0Var;
            this.f8133c = pVar;
        }
    }

    /* compiled from: RealmObservableFactory.java */
    /* loaded from: classes4.dex */
    class d implements ObservableOnSubscribe<bc.a<p>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f8135a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v0 f8136b;

        d(p pVar, v0 v0Var) {
            this.f8135a = pVar;
            this.f8136b = v0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealmObservableFactory.java */
    /* loaded from: classes4.dex */
    public class e extends ThreadLocal<h<g1>> {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public h<g1> initialValue() {
            return new h<>(null);
        }
    }

    /* compiled from: RealmObservableFactory.java */
    /* loaded from: classes4.dex */
    class f extends ThreadLocal<h<x0>> {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public h<x0> initialValue() {
            return new h<>(null);
        }
    }

    /* compiled from: RealmObservableFactory.java */
    /* loaded from: classes4.dex */
    class g extends ThreadLocal<h<a1>> {
        g() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public h<a1> initialValue() {
            return new h<>(null);
        }
    }

    public b(boolean z10) {
        this.f8120a = z10;
    }

    private Scheduler e() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return sb.b.a(myLooper);
        }
        throw new IllegalStateException("No looper found");
    }

    @Override // bc.c
    public <E extends a1> Flowable<E> a(o0 o0Var, E e10) {
        if (o0Var.Y()) {
            return Flowable.just(e10);
        }
        v0 L = o0Var.L();
        Scheduler e11 = e();
        return Flowable.create(new a(o0Var, L, e10), f8119e).subscribeOn(e11).unsubscribeOn(e11);
    }

    @Override // bc.c
    public Flowable<p> b(n nVar, p pVar) {
        if (nVar.Y()) {
            return Flowable.just(pVar);
        }
        v0 L = nVar.L();
        Scheduler e10 = e();
        return Flowable.create(new c(nVar, L, pVar), f8119e).subscribeOn(e10).unsubscribeOn(e10);
    }

    @Override // bc.c
    public Observable<bc.a<p>> c(n nVar, p pVar) {
        if (nVar.Y()) {
            return Observable.just(new bc.a(pVar, null));
        }
        v0 L = nVar.L();
        Scheduler e10 = e();
        return Observable.create(new d(pVar, L)).subscribeOn(e10).unsubscribeOn(e10);
    }

    @Override // bc.c
    public <E extends a1> Observable<bc.a<E>> d(o0 o0Var, E e10) {
        if (o0Var.Y()) {
            return Observable.just(new bc.a(e10, null));
        }
        v0 L = o0Var.L();
        Scheduler e11 = e();
        return Observable.create(new C0189b(e10, L)).subscribeOn(e11).unsubscribeOn(e11);
    }

    public boolean equals(Object obj) {
        return obj instanceof b;
    }

    public int hashCode() {
        return 37;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RealmObservableFactory.java */
    /* loaded from: classes4.dex */
    public static class h<K> {

        /* renamed from: a  reason: collision with root package name */
        private final Map<K, Integer> f8141a;

        private h() {
            this.f8141a = new IdentityHashMap();
        }

        /* synthetic */ h(e eVar) {
            this();
        }
    }
}
