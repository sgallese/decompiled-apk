package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f4847a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final FragmentManager f4848b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentLifecycleCallbacksDispatcher.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final FragmentManager.k f4849a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f4850b;

        a(FragmentManager.k kVar, boolean z10) {
            this.f4849a = kVar;
            this.f4850b = z10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(FragmentManager fragmentManager) {
        this.f4848b = fragmentManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.a(this.f4848b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Fragment fragment, boolean z10) {
        Context f10 = this.f4848b.z0().f();
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().b(fragment, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.b(this.f4848b, fragment, f10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.c(this.f4848b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Fragment fragment, boolean z10) {
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().d(fragment, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.d(this.f4848b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Fragment fragment, boolean z10) {
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().e(fragment, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.e(this.f4848b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Fragment fragment, boolean z10) {
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().f(fragment, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.f(this.f4848b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Fragment fragment, boolean z10) {
        Context f10 = this.f4848b.z0().f();
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().g(fragment, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.g(this.f4848b, fragment, f10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.h(this.f4848b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Fragment fragment, boolean z10) {
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().i(fragment, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.i(this.f4848b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.j(this.f4848b, fragment, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Fragment fragment, boolean z10) {
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().k(fragment, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.k(this.f4848b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Fragment fragment, boolean z10) {
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().l(fragment, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.l(this.f4848b, fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.m(this.f4848b, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(Fragment fragment, boolean z10) {
        Fragment C0 = this.f4848b.C0();
        if (C0 != null) {
            C0.getParentFragmentManager().B0().n(fragment, true);
        }
        Iterator<a> it = this.f4847a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f4850b) {
                next.f4849a.n(this.f4848b, fragment);
            }
        }
    }

    public void o(FragmentManager.k kVar, boolean z10) {
        this.f4847a.add(new a(kVar, z10));
    }

    public void p(FragmentManager.k kVar) {
        synchronized (this.f4847a) {
            int size = this.f4847a.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (this.f4847a.get(i10).f4849a == kVar) {
                    this.f4847a.remove(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
    }
}
