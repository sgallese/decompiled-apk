package k3;

import android.os.Bundle;
import dc.w;
import dd.l0;
import dd.n0;
import dd.x;
import ec.b0;
import ec.t;
import ec.u0;
import ec.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: NavigatorState.kt */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantLock f19317a = new ReentrantLock(true);

    /* renamed from: b  reason: collision with root package name */
    private final x<List<androidx.navigation.c>> f19318b;

    /* renamed from: c  reason: collision with root package name */
    private final x<Set<androidx.navigation.c>> f19319c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f19320d;

    /* renamed from: e  reason: collision with root package name */
    private final l0<List<androidx.navigation.c>> f19321e;

    /* renamed from: f  reason: collision with root package name */
    private final l0<Set<androidx.navigation.c>> f19322f;

    public p() {
        List i10;
        Set b10;
        i10 = t.i();
        x<List<androidx.navigation.c>> a10 = n0.a(i10);
        this.f19318b = a10;
        b10 = u0.b();
        x<Set<androidx.navigation.c>> a11 = n0.a(b10);
        this.f19319c = a11;
        this.f19321e = dd.i.b(a10);
        this.f19322f = dd.i.b(a11);
    }

    public abstract androidx.navigation.c a(androidx.navigation.i iVar, Bundle bundle);

    public final l0<List<androidx.navigation.c>> b() {
        return this.f19321e;
    }

    public final l0<Set<androidx.navigation.c>> c() {
        return this.f19322f;
    }

    public final boolean d() {
        return this.f19320d;
    }

    public void e(androidx.navigation.c cVar) {
        Set<androidx.navigation.c> f10;
        qc.q.i(cVar, "entry");
        x<Set<androidx.navigation.c>> xVar = this.f19319c;
        f10 = v0.f(xVar.getValue(), cVar);
        xVar.setValue(f10);
    }

    public void f(androidx.navigation.c cVar) {
        List<androidx.navigation.c> F0;
        int i10;
        qc.q.i(cVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f19317a;
        reentrantLock.lock();
        try {
            F0 = b0.F0(this.f19321e.getValue());
            ListIterator<androidx.navigation.c> listIterator = F0.listIterator(F0.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (qc.q.d(listIterator.previous().f(), cVar.f())) {
                        i10 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            F0.set(i10, cVar);
            this.f19318b.setValue(F0);
            w wVar = w.f13270a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void g(androidx.navigation.c cVar) {
        Set g10;
        Set<androidx.navigation.c> g11;
        qc.q.i(cVar, "backStackEntry");
        List<androidx.navigation.c> value = this.f19321e.getValue();
        ListIterator<androidx.navigation.c> listIterator = value.listIterator(value.size());
        while (listIterator.hasPrevious()) {
            androidx.navigation.c previous = listIterator.previous();
            if (qc.q.d(previous.f(), cVar.f())) {
                x<Set<androidx.navigation.c>> xVar = this.f19319c;
                g10 = v0.g(xVar.getValue(), previous);
                g11 = v0.g(g10, cVar);
                xVar.setValue(g11);
                f(cVar);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void h(androidx.navigation.c cVar, boolean z10) {
        qc.q.i(cVar, "popUpTo");
        ReentrantLock reentrantLock = this.f19317a;
        reentrantLock.lock();
        try {
            x<List<androidx.navigation.c>> xVar = this.f19318b;
            List<androidx.navigation.c> value = xVar.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if ((!qc.q.d((androidx.navigation.c) obj, cVar)) != true) {
                    break;
                }
                arrayList.add(obj);
            }
            xVar.setValue(arrayList);
            w wVar = w.f13270a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void i(androidx.navigation.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        Set<androidx.navigation.c> g10;
        androidx.navigation.c cVar2;
        Set<androidx.navigation.c> g11;
        boolean z13;
        boolean z14;
        boolean z15;
        qc.q.i(cVar, "popUpTo");
        Set<androidx.navigation.c> value = this.f19319c.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((androidx.navigation.c) it.next()) == cVar) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (z12) {
            List<androidx.navigation.c> value2 = this.f19321e.getValue();
            if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                Iterator<T> it2 = value2.iterator();
                while (it2.hasNext()) {
                    if (((androidx.navigation.c) it2.next()) == cVar) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        z15 = false;
                        break;
                    }
                }
            }
            z15 = true;
            if (z15) {
                return;
            }
        }
        x<Set<androidx.navigation.c>> xVar = this.f19319c;
        g10 = v0.g(xVar.getValue(), cVar);
        xVar.setValue(g10);
        List<androidx.navigation.c> value3 = this.f19321e.getValue();
        ListIterator<androidx.navigation.c> listIterator = value3.listIterator(value3.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                cVar2 = listIterator.previous();
                androidx.navigation.c cVar3 = cVar2;
                if (!qc.q.d(cVar3, cVar) && this.f19321e.getValue().lastIndexOf(cVar3) < this.f19321e.getValue().lastIndexOf(cVar)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    break;
                }
            } else {
                cVar2 = null;
                break;
            }
        }
        androidx.navigation.c cVar4 = cVar2;
        if (cVar4 != null) {
            x<Set<androidx.navigation.c>> xVar2 = this.f19319c;
            g11 = v0.g(xVar2.getValue(), cVar4);
            xVar2.setValue(g11);
        }
        h(cVar, z10);
    }

    public void j(androidx.navigation.c cVar) {
        Set<androidx.navigation.c> g10;
        qc.q.i(cVar, "entry");
        x<Set<androidx.navigation.c>> xVar = this.f19319c;
        g10 = v0.g(xVar.getValue(), cVar);
        xVar.setValue(g10);
    }

    public void k(androidx.navigation.c cVar) {
        List<androidx.navigation.c> s02;
        qc.q.i(cVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f19317a;
        reentrantLock.lock();
        try {
            x<List<androidx.navigation.c>> xVar = this.f19318b;
            s02 = b0.s0(xVar.getValue(), cVar);
            xVar.setValue(s02);
            w wVar = w.f13270a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void l(androidx.navigation.c cVar) {
        boolean z10;
        boolean z11;
        Object n02;
        Set<androidx.navigation.c> g10;
        Set<androidx.navigation.c> g11;
        boolean z12;
        qc.q.i(cVar, "backStackEntry");
        Set<androidx.navigation.c> value = this.f19319c.getValue();
        boolean z13 = true;
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                if (((androidx.navigation.c) it.next()) == cVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (z11) {
            List<androidx.navigation.c> value2 = this.f19321e.getValue();
            if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                Iterator<T> it2 = value2.iterator();
                while (it2.hasNext()) {
                    if (((androidx.navigation.c) it2.next()) == cVar) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        break;
                    }
                }
            }
            z13 = false;
            if (z13) {
                return;
            }
        }
        n02 = b0.n0(this.f19321e.getValue());
        androidx.navigation.c cVar2 = (androidx.navigation.c) n02;
        if (cVar2 != null) {
            x<Set<androidx.navigation.c>> xVar = this.f19319c;
            g11 = v0.g(xVar.getValue(), cVar2);
            xVar.setValue(g11);
        }
        x<Set<androidx.navigation.c>> xVar2 = this.f19319c;
        g10 = v0.g(xVar2.getValue(), cVar);
        xVar2.setValue(g10);
        k(cVar);
    }

    public final void m(boolean z10) {
        this.f19320d = z10;
    }
}
