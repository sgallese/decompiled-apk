package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import dc.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: OnBackPressedDispatcher.kt */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f612a;

    /* renamed from: b  reason: collision with root package name */
    private final ec.k<m> f613b = new ec.k<>();

    /* renamed from: c  reason: collision with root package name */
    private pc.a<w> f614c;

    /* renamed from: d  reason: collision with root package name */
    private OnBackInvokedCallback f615d;

    /* renamed from: e  reason: collision with root package name */
    private OnBackInvokedDispatcher f616e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f617f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: classes.dex */
    public final class LifecycleOnBackPressedCancellable implements s, androidx.activity.a {

        /* renamed from: f  reason: collision with root package name */
        private final androidx.lifecycle.p f618f;

        /* renamed from: m  reason: collision with root package name */
        private final m f619m;

        /* renamed from: p  reason: collision with root package name */
        private androidx.activity.a f620p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f621q;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, androidx.lifecycle.p pVar, m mVar) {
            qc.q.i(pVar, "lifecycle");
            qc.q.i(mVar, "onBackPressedCallback");
            this.f621q = onBackPressedDispatcher;
            this.f618f = pVar;
            this.f619m = mVar;
            pVar.a(this);
        }

        @Override // androidx.lifecycle.s
        public void c(v vVar, p.a aVar) {
            qc.q.i(vVar, "source");
            qc.q.i(aVar, "event");
            if (aVar == p.a.ON_START) {
                this.f620p = this.f621q.c(this.f619m);
            } else if (aVar == p.a.ON_STOP) {
                androidx.activity.a aVar2 = this.f620p;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == p.a.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f618f.d(this);
            this.f619m.e(this);
            androidx.activity.a aVar = this.f620p;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f620p = null;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<w> {
        a() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.g();
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.a<w> {
        b() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.e();
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f624a = new c();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(pc.a aVar) {
            qc.q.i(aVar, "$onBackInvoked");
            aVar.invoke();
        }

        public final OnBackInvokedCallback b(final pc.a<w> aVar) {
            qc.q.i(aVar, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.n
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.c.c(pc.a.this);
                }
            };
        }

        public final void d(Object obj, int i10, Object obj2) {
            qc.q.i(obj, "dispatcher");
            qc.q.i(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            qc.q.i(obj, "dispatcher");
            qc.q.i(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OnBackPressedDispatcher.kt */
    /* loaded from: classes.dex */
    public final class d implements androidx.activity.a {

        /* renamed from: f  reason: collision with root package name */
        private final m f625f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f626m;

        public d(OnBackPressedDispatcher onBackPressedDispatcher, m mVar) {
            qc.q.i(mVar, "onBackPressedCallback");
            this.f626m = onBackPressedDispatcher;
            this.f625f = mVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f626m.f613b.remove(this.f625f);
            this.f625f.e(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f625f.g(null);
                this.f626m.g();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f612a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f614c = new a();
            this.f615d = c.f624a.b(new b());
        }
    }

    public final void b(v vVar, m mVar) {
        qc.q.i(vVar, "owner");
        qc.q.i(mVar, "onBackPressedCallback");
        androidx.lifecycle.p lifecycle = vVar.getLifecycle();
        if (lifecycle.b() == p.b.DESTROYED) {
            return;
        }
        mVar.a(new LifecycleOnBackPressedCancellable(this, lifecycle, mVar));
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            mVar.g(this.f614c);
        }
    }

    public final androidx.activity.a c(m mVar) {
        qc.q.i(mVar, "onBackPressedCallback");
        this.f613b.add(mVar);
        d dVar = new d(this, mVar);
        mVar.a(dVar);
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            mVar.g(this.f614c);
        }
        return dVar;
    }

    public final boolean d() {
        ec.k<m> kVar = this.f613b;
        if ((kVar instanceof Collection) && kVar.isEmpty()) {
            return false;
        }
        Iterator<m> it = kVar.iterator();
        while (it.hasNext()) {
            if (it.next().c()) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        m mVar;
        ec.k<m> kVar = this.f613b;
        ListIterator<m> listIterator = kVar.listIterator(kVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                mVar = listIterator.previous();
                if (mVar.c()) {
                    break;
                }
            } else {
                mVar = null;
                break;
            }
        }
        m mVar2 = mVar;
        if (mVar2 != null) {
            mVar2.b();
            return;
        }
        Runnable runnable = this.f612a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void f(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        qc.q.i(onBackInvokedDispatcher, "invoker");
        this.f616e = onBackInvokedDispatcher;
        g();
    }

    public final void g() {
        boolean d10 = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f616e;
        OnBackInvokedCallback onBackInvokedCallback = this.f615d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (d10 && !this.f617f) {
                c.f624a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f617f = true;
            } else if (!d10 && this.f617f) {
                c.f624a.e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f617f = false;
            }
        }
    }
}
