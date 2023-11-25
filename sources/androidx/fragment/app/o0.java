package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.p;
import androidx.lifecycle.y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
public class o0 implements androidx.lifecycle.o, w3.d, c1 {

    /* renamed from: f  reason: collision with root package name */
    private final Fragment f4788f;

    /* renamed from: m  reason: collision with root package name */
    private final b1 f4789m;

    /* renamed from: p  reason: collision with root package name */
    private final Runnable f4790p;

    /* renamed from: q  reason: collision with root package name */
    private y0.b f4791q;

    /* renamed from: r  reason: collision with root package name */
    private androidx.lifecycle.x f4792r = null;

    /* renamed from: s  reason: collision with root package name */
    private w3.c f4793s = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(Fragment fragment, b1 b1Var, Runnable runnable) {
        this.f4788f = fragment;
        this.f4789m = b1Var;
        this.f4790p = runnable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(p.a aVar) {
        this.f4792r.i(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (this.f4792r == null) {
            this.f4792r = new androidx.lifecycle.x(this);
            w3.c a10 = w3.c.a(this);
            this.f4793s = a10;
            a10.c();
            this.f4790p.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        if (this.f4792r != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.f4793s.d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f4793s.e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(p.b bVar) {
        this.f4792r.o(bVar);
    }

    @Override // androidx.lifecycle.o
    public j3.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f4788f.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        j3.d dVar = new j3.d();
        if (application != null) {
            dVar.c(y0.a.f5079g, application);
        }
        dVar.c(androidx.lifecycle.o0.f5025a, this.f4788f);
        dVar.c(androidx.lifecycle.o0.f5026b, this);
        if (this.f4788f.getArguments() != null) {
            dVar.c(androidx.lifecycle.o0.f5027c, this.f4788f.getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.o
    public y0.b getDefaultViewModelProviderFactory() {
        Application application;
        y0.b defaultViewModelProviderFactory = this.f4788f.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f4788f.mDefaultFactory)) {
            this.f4791q = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f4791q == null) {
            Context applicationContext = this.f4788f.requireContext().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            Fragment fragment = this.f4788f;
            this.f4791q = new androidx.lifecycle.r0(application, fragment, fragment.getArguments());
        }
        return this.f4791q;
    }

    @Override // androidx.lifecycle.v
    public androidx.lifecycle.p getLifecycle() {
        b();
        return this.f4792r;
    }

    @Override // w3.d
    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f4793s.b();
    }

    @Override // androidx.lifecycle.c1
    public b1 getViewModelStore() {
        b();
        return this.f4789m;
    }
}
