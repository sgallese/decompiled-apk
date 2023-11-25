package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LifecycleRegistry.kt */
/* loaded from: classes.dex */
public class x extends p {

    /* renamed from: j  reason: collision with root package name */
    public static final a f5058j = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5059b;

    /* renamed from: c  reason: collision with root package name */
    private m.a<u, b> f5060c;

    /* renamed from: d  reason: collision with root package name */
    private p.b f5061d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<v> f5062e;

    /* renamed from: f  reason: collision with root package name */
    private int f5063f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5064g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5065h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<p.b> f5066i;

    /* compiled from: LifecycleRegistry.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final p.b a(p.b bVar, p.b bVar2) {
            qc.q.i(bVar, "state1");
            if (bVar2 != null && bVar2.compareTo(bVar) < 0) {
                return bVar2;
            }
            return bVar;
        }
    }

    /* compiled from: LifecycleRegistry.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private p.b f5067a;

        /* renamed from: b  reason: collision with root package name */
        private s f5068b;

        public b(u uVar, p.b bVar) {
            qc.q.i(bVar, "initialState");
            qc.q.f(uVar);
            this.f5068b = a0.f(uVar);
            this.f5067a = bVar;
        }

        public final void a(v vVar, p.a aVar) {
            qc.q.i(aVar, "event");
            p.b targetState = aVar.getTargetState();
            this.f5067a = x.f5058j.a(this.f5067a, targetState);
            s sVar = this.f5068b;
            qc.q.f(vVar);
            sVar.c(vVar, aVar);
            this.f5067a = targetState;
        }

        public final p.b b() {
            return this.f5067a;
        }
    }

    private x(v vVar, boolean z10) {
        this.f5059b = z10;
        this.f5060c = new m.a<>();
        this.f5061d = p.b.INITIALIZED;
        this.f5066i = new ArrayList<>();
        this.f5062e = new WeakReference<>(vVar);
    }

    private final void e(v vVar) {
        Iterator<Map.Entry<u, b>> descendingIterator = this.f5060c.descendingIterator();
        qc.q.h(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f5065h) {
            Map.Entry<u, b> next = descendingIterator.next();
            qc.q.h(next, "next()");
            u key = next.getKey();
            b value = next.getValue();
            while (value.b().compareTo(this.f5061d) > 0 && !this.f5065h && this.f5060c.contains(key)) {
                p.a a10 = p.a.Companion.a(value.b());
                if (a10 != null) {
                    n(a10.getTargetState());
                    value.a(vVar, a10);
                    m();
                } else {
                    throw new IllegalStateException("no event down from " + value.b());
                }
            }
        }
    }

    private final p.b f(u uVar) {
        p.b bVar;
        b value;
        Map.Entry<u, b> k10 = this.f5060c.k(uVar);
        p.b bVar2 = null;
        if (k10 != null && (value = k10.getValue()) != null) {
            bVar = value.b();
        } else {
            bVar = null;
        }
        if ((!this.f5066i.isEmpty()) != false) {
            bVar2 = this.f5066i.get(r0.size() - 1);
        }
        a aVar = f5058j;
        return aVar.a(aVar.a(this.f5061d, bVar), bVar2);
    }

    @SuppressLint({"RestrictedApi"})
    private final void g(String str) {
        if (this.f5059b && !l.c.g().b()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    private final void h(v vVar) {
        m.b<u, b>.d f10 = this.f5060c.f();
        qc.q.h(f10, "observerMap.iteratorWithAdditions()");
        while (f10.hasNext() && !this.f5065h) {
            Map.Entry next = f10.next();
            u uVar = (u) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.b().compareTo(this.f5061d) < 0 && !this.f5065h && this.f5060c.contains(uVar)) {
                n(bVar.b());
                p.a c10 = p.a.Companion.c(bVar.b());
                if (c10 != null) {
                    bVar.a(vVar, c10);
                    m();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
            }
        }
    }

    private final boolean j() {
        if (this.f5060c.size() == 0) {
            return true;
        }
        Map.Entry<u, b> a10 = this.f5060c.a();
        qc.q.f(a10);
        p.b b10 = a10.getValue().b();
        Map.Entry<u, b> g10 = this.f5060c.g();
        qc.q.f(g10);
        p.b b11 = g10.getValue().b();
        if (b10 == b11 && this.f5061d == b11) {
            return true;
        }
        return false;
    }

    private final void l(p.b bVar) {
        boolean z10;
        p.b bVar2 = this.f5061d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == p.b.INITIALIZED && bVar == p.b.DESTROYED) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f5061d = bVar;
            if (!this.f5064g && this.f5063f == 0) {
                this.f5064g = true;
                p();
                this.f5064g = false;
                if (this.f5061d == p.b.DESTROYED) {
                    this.f5060c = new m.a<>();
                    return;
                }
                return;
            }
            this.f5065h = true;
            return;
        }
        throw new IllegalStateException(("no event down from " + this.f5061d + " in component " + this.f5062e.get()).toString());
    }

    private final void m() {
        this.f5066i.remove(r0.size() - 1);
    }

    private final void n(p.b bVar) {
        this.f5066i.add(bVar);
    }

    private final void p() {
        v vVar = this.f5062e.get();
        if (vVar != null) {
            while (!j()) {
                this.f5065h = false;
                p.b bVar = this.f5061d;
                Map.Entry<u, b> a10 = this.f5060c.a();
                qc.q.f(a10);
                if (bVar.compareTo(a10.getValue().b()) < 0) {
                    e(vVar);
                }
                Map.Entry<u, b> g10 = this.f5060c.g();
                if (!this.f5065h && g10 != null && this.f5061d.compareTo(g10.getValue().b()) > 0) {
                    h(vVar);
                }
            }
            this.f5065h = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.p
    public void a(u uVar) {
        v vVar;
        boolean z10;
        qc.q.i(uVar, "observer");
        g("addObserver");
        p.b bVar = this.f5061d;
        p.b bVar2 = p.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = p.b.INITIALIZED;
        }
        b bVar3 = new b(uVar, bVar2);
        if (this.f5060c.i(uVar, bVar3) != null || (vVar = this.f5062e.get()) == null) {
            return;
        }
        if (this.f5063f == 0 && !this.f5064g) {
            z10 = false;
        } else {
            z10 = true;
        }
        p.b f10 = f(uVar);
        this.f5063f++;
        while (bVar3.b().compareTo(f10) < 0 && this.f5060c.contains(uVar)) {
            n(bVar3.b());
            p.a c10 = p.a.Companion.c(bVar3.b());
            if (c10 != null) {
                bVar3.a(vVar, c10);
                m();
                f10 = f(uVar);
            } else {
                throw new IllegalStateException("no event up from " + bVar3.b());
            }
        }
        if (!z10) {
            p();
        }
        this.f5063f--;
    }

    @Override // androidx.lifecycle.p
    public p.b b() {
        return this.f5061d;
    }

    @Override // androidx.lifecycle.p
    public void d(u uVar) {
        qc.q.i(uVar, "observer");
        g("removeObserver");
        this.f5060c.j(uVar);
    }

    public void i(p.a aVar) {
        qc.q.i(aVar, "event");
        g("handleLifecycleEvent");
        l(aVar.getTargetState());
    }

    public void k(p.b bVar) {
        qc.q.i(bVar, "state");
        g("markState");
        o(bVar);
    }

    public void o(p.b bVar) {
        qc.q.i(bVar, "state");
        g("setCurrentState");
        l(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(v vVar) {
        this(vVar, true);
        qc.q.i(vVar, "provider");
    }
}
