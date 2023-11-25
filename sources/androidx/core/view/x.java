package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper.java */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f4266a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<a0> f4267b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<a0, a> f4268c = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MenuHostHelper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final androidx.lifecycle.p f4269a;

        /* renamed from: b  reason: collision with root package name */
        private androidx.lifecycle.s f4270b;

        a(androidx.lifecycle.p pVar, androidx.lifecycle.s sVar) {
            this.f4269a = pVar;
            this.f4270b = sVar;
            pVar.a(sVar);
        }

        void a() {
            this.f4269a.d(this.f4270b);
            this.f4270b = null;
        }
    }

    public x(Runnable runnable) {
        this.f4266a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(a0 a0Var, androidx.lifecycle.v vVar, p.a aVar) {
        if (aVar == p.a.ON_DESTROY) {
            l(a0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(p.b bVar, a0 a0Var, androidx.lifecycle.v vVar, p.a aVar) {
        if (aVar == p.a.upTo(bVar)) {
            c(a0Var);
        } else if (aVar == p.a.ON_DESTROY) {
            l(a0Var);
        } else if (aVar == p.a.downFrom(bVar)) {
            this.f4267b.remove(a0Var);
            this.f4266a.run();
        }
    }

    public void c(a0 a0Var) {
        this.f4267b.add(a0Var);
        this.f4266a.run();
    }

    public void d(final a0 a0Var, androidx.lifecycle.v vVar) {
        c(a0Var);
        androidx.lifecycle.p lifecycle = vVar.getLifecycle();
        a remove = this.f4268c.remove(a0Var);
        if (remove != null) {
            remove.a();
        }
        this.f4268c.put(a0Var, new a(lifecycle, new androidx.lifecycle.s() { // from class: androidx.core.view.v
            @Override // androidx.lifecycle.s
            public final void c(androidx.lifecycle.v vVar2, p.a aVar) {
                x.this.f(a0Var, vVar2, aVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    public void e(final a0 a0Var, androidx.lifecycle.v vVar, final p.b bVar) {
        androidx.lifecycle.p lifecycle = vVar.getLifecycle();
        a remove = this.f4268c.remove(a0Var);
        if (remove != null) {
            remove.a();
        }
        this.f4268c.put(a0Var, new a(lifecycle, new androidx.lifecycle.s() { // from class: androidx.core.view.w
            @Override // androidx.lifecycle.s
            public final void c(androidx.lifecycle.v vVar2, p.a aVar) {
                x.this.g(bVar, a0Var, vVar2, aVar);
            }
        }));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator<a0> it = this.f4267b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator<a0> it = this.f4267b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator<a0> it = this.f4267b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator<a0> it = this.f4267b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void l(a0 a0Var) {
        this.f4267b.remove(a0Var);
        a remove = this.f4268c.remove(a0Var);
        if (remove != null) {
            remove.a();
        }
        this.f4266a.run();
    }
}
