package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.b;
import androidx.appcompat.app.c0;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.q1;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: f  reason: collision with root package name */
    static c0.a f789f = new c0.a(new c0.b());

    /* renamed from: m  reason: collision with root package name */
    private static int f790m = -100;

    /* renamed from: p  reason: collision with root package name */
    private static androidx.core.os.j f791p = null;

    /* renamed from: q  reason: collision with root package name */
    private static androidx.core.os.j f792q = null;

    /* renamed from: r  reason: collision with root package name */
    private static Boolean f793r = null;

    /* renamed from: s  reason: collision with root package name */
    private static boolean f794s = false;

    /* renamed from: t  reason: collision with root package name */
    private static final androidx.collection.b<WeakReference<g>> f795t = new androidx.collection.b<>();

    /* renamed from: u  reason: collision with root package name */
    private static final Object f796u = new Object();

    /* renamed from: v  reason: collision with root package name */
    private static final Object f797v = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegate.java */
    /* loaded from: classes.dex */
    public static class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppCompatDelegate.java */
    /* loaded from: classes.dex */
    public static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void F(g gVar) {
        synchronized (f796u) {
            G(gVar);
        }
    }

    private static void G(g gVar) {
        synchronized (f796u) {
            Iterator<WeakReference<g>> it = f795t.iterator();
            while (it.hasNext()) {
                g gVar2 = it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void I(boolean z10) {
        q1.c(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void S(final Context context) {
        if (!v(context)) {
            return;
        }
        if (androidx.core.os.a.c()) {
            if (!f794s) {
                f789f.execute(new Runnable() { // from class: androidx.appcompat.app.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.w(context);
                    }
                });
                return;
            }
            return;
        }
        synchronized (f797v) {
            androidx.core.os.j jVar = f791p;
            if (jVar == null) {
                if (f792q == null) {
                    f792q = androidx.core.os.j.c(c0.b(context));
                }
                if (f792q.f()) {
                    return;
                }
                f791p = f792q;
            } else if (!jVar.equals(f792q)) {
                androidx.core.os.j jVar2 = f791p;
                f792q = jVar2;
                c0.a(context, jVar2.h());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(g gVar) {
        synchronized (f796u) {
            G(gVar);
            f795t.add(new WeakReference<>(gVar));
        }
    }

    public static g h(Activity activity, e eVar) {
        return new h(activity, eVar);
    }

    public static g i(Dialog dialog, e eVar) {
        return new h(dialog, eVar);
    }

    public static androidx.core.os.j k() {
        if (androidx.core.os.a.c()) {
            Object p10 = p();
            if (p10 != null) {
                return androidx.core.os.j.j(b.a(p10));
            }
        } else {
            androidx.core.os.j jVar = f791p;
            if (jVar != null) {
                return jVar;
            }
        }
        return androidx.core.os.j.e();
    }

    public static int m() {
        return f790m;
    }

    static Object p() {
        Context l10;
        Iterator<WeakReference<g>> it = f795t.iterator();
        while (it.hasNext()) {
            g gVar = it.next().get();
            if (gVar != null && (l10 = gVar.l()) != null) {
                return l10.getSystemService("locale");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.core.os.j r() {
        return f791p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean v(Context context) {
        if (f793r == null) {
            try {
                Bundle bundle = a0.a(context).metaData;
                if (bundle != null) {
                    f793r = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f793r = Boolean.FALSE;
            }
        }
        return f793r.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(Context context) {
        c0.c(context);
        f794s = true;
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public abstract boolean H(int i10);

    public abstract void J(int i10);

    public abstract void K(View view);

    public abstract void L(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void M(int i10);

    public abstract void O(Toolbar toolbar);

    public abstract void Q(CharSequence charSequence);

    public abstract androidx.appcompat.view.b R(b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract <T extends View> T j(int i10);

    public Context l() {
        return null;
    }

    public abstract b.InterfaceC0011b n();

    public int o() {
        return -100;
    }

    public abstract MenuInflater q();

    public abstract androidx.appcompat.app.a s();

    public abstract void t();

    public abstract void u();

    public abstract void x(Configuration configuration);

    public abstract void y(Bundle bundle);

    public abstract void z();

    public void N(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void P(int i10) {
    }

    @Deprecated
    public void f(Context context) {
    }
}
