package androidx.lifecycle;

import androidx.lifecycle.p;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    static final Object f4865k = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f4866a;

    /* renamed from: b  reason: collision with root package name */
    private m.b<g0<? super T>, LiveData<T>.c> f4867b;

    /* renamed from: c  reason: collision with root package name */
    int f4868c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4869d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f4870e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f4871f;

    /* renamed from: g  reason: collision with root package name */
    private int f4872g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4873h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f4874i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f4875j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements s {

        /* renamed from: r  reason: collision with root package name */
        final v f4876r;

        LifecycleBoundObserver(v vVar, g0<? super T> g0Var) {
            super(g0Var);
            this.f4876r = vVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        void b() {
            this.f4876r.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.s
        public void c(v vVar, p.a aVar) {
            p.b b10 = this.f4876r.getLifecycle().b();
            if (b10 == p.b.DESTROYED) {
                LiveData.this.o(this.f4880f);
                return;
            }
            p.b bVar = null;
            while (bVar != b10) {
                a(f());
                bVar = b10;
                b10 = this.f4876r.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean e(v vVar) {
            if (this.f4876r == vVar) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean f() {
            return this.f4876r.getLifecycle().b().isAtLeast(p.b.STARTED);
        }
    }

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f4866a) {
                obj = LiveData.this.f4871f;
                LiveData.this.f4871f = LiveData.f4865k;
            }
            LiveData.this.p(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        b(g0<? super T> g0Var) {
            super(g0Var);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean f() {
            return true;
        }
    }

    public LiveData(T t10) {
        this.f4866a = new Object();
        this.f4867b = new m.b<>();
        this.f4868c = 0;
        this.f4871f = f4865k;
        this.f4875j = new a();
        this.f4870e = t10;
        this.f4872g = 0;
    }

    static void b(String str) {
        if (l.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(LiveData<T>.c cVar) {
        if (!cVar.f4881m) {
            return;
        }
        if (!cVar.f()) {
            cVar.a(false);
            return;
        }
        int i10 = cVar.f4882p;
        int i11 = this.f4872g;
        if (i10 >= i11) {
            return;
        }
        cVar.f4882p = i11;
        cVar.f4880f.onChanged((Object) this.f4870e);
    }

    void c(int i10) {
        boolean z10;
        boolean z11;
        int i11 = this.f4868c;
        this.f4868c = i10 + i11;
        if (this.f4869d) {
            return;
        }
        this.f4869d = true;
        while (true) {
            try {
                int i12 = this.f4868c;
                if (i11 != i12) {
                    if (i11 == 0 && i12 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i11 > 0 && i12 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z10) {
                        l();
                    } else if (z11) {
                        m();
                    }
                    i11 = i12;
                } else {
                    return;
                }
            } finally {
                this.f4869d = false;
            }
        }
    }

    void e(LiveData<T>.c cVar) {
        if (this.f4873h) {
            this.f4874i = true;
            return;
        }
        this.f4873h = true;
        do {
            this.f4874i = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                m.b<g0<? super T>, LiveData<T>.c>.d f10 = this.f4867b.f();
                while (f10.hasNext()) {
                    d((c) f10.next().getValue());
                    if (this.f4874i) {
                        break;
                    }
                }
            }
        } while (this.f4874i);
        this.f4873h = false;
    }

    public T f() {
        T t10 = (T) this.f4870e;
        if (t10 != f4865k) {
            return t10;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f4872g;
    }

    public boolean h() {
        if (this.f4868c > 0) {
            return true;
        }
        return false;
    }

    public boolean i() {
        if (this.f4870e != f4865k) {
            return true;
        }
        return false;
    }

    public void j(v vVar, g0<? super T> g0Var) {
        b("observe");
        if (vVar.getLifecycle().b() == p.b.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(vVar, g0Var);
        LiveData<T>.c i10 = this.f4867b.i(g0Var, lifecycleBoundObserver);
        if (i10 != null && !i10.e(vVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (i10 != null) {
            return;
        }
        vVar.getLifecycle().a(lifecycleBoundObserver);
    }

    public void k(g0<? super T> g0Var) {
        b("observeForever");
        b bVar = new b(g0Var);
        LiveData<T>.c i10 = this.f4867b.i(g0Var, bVar);
        if (!(i10 instanceof LifecycleBoundObserver)) {
            if (i10 != null) {
                return;
            }
            bVar.a(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(T t10) {
        boolean z10;
        synchronized (this.f4866a) {
            if (this.f4871f == f4865k) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f4871f = t10;
        }
        if (!z10) {
            return;
        }
        l.c.g().c(this.f4875j);
    }

    public void o(g0<? super T> g0Var) {
        b("removeObserver");
        LiveData<T>.c j10 = this.f4867b.j(g0Var);
        if (j10 == null) {
            return;
        }
        j10.b();
        j10.a(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(T t10) {
        b("setValue");
        this.f4872g++;
        this.f4870e = t10;
        e(null);
    }

    public LiveData() {
        this.f4866a = new Object();
        this.f4867b = new m.b<>();
        this.f4868c = 0;
        Object obj = f4865k;
        this.f4871f = obj;
        this.f4875j = new a();
        this.f4870e = obj;
        this.f4872g = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: f  reason: collision with root package name */
        final g0<? super T> f4880f;

        /* renamed from: m  reason: collision with root package name */
        boolean f4881m;

        /* renamed from: p  reason: collision with root package name */
        int f4882p = -1;

        c(g0<? super T> g0Var) {
            this.f4880f = g0Var;
        }

        void a(boolean z10) {
            int i10;
            if (z10 == this.f4881m) {
                return;
            }
            this.f4881m = z10;
            LiveData liveData = LiveData.this;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            liveData.c(i10);
            if (this.f4881m) {
                LiveData.this.e(this);
            }
        }

        boolean e(v vVar) {
            return false;
        }

        abstract boolean f();

        void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l() {
    }

    protected void m() {
    }
}
