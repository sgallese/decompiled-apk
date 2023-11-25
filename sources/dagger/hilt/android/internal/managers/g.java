package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

/* compiled from: FragmentComponentManager.java */
/* loaded from: classes4.dex */
public class g implements ab.b<Object> {

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f13181f;

    /* renamed from: m  reason: collision with root package name */
    private final Object f13182m = new Object();

    /* renamed from: p  reason: collision with root package name */
    private final Fragment f13183p;

    /* compiled from: FragmentComponentManager.java */
    /* loaded from: classes4.dex */
    public interface a {
        wa.c fragmentComponentBuilder();
    }

    public g(Fragment fragment) {
        this.f13183p = fragment;
    }

    private Object a() {
        ab.d.c(this.f13183p.getHost(), "Hilt Fragments must be attached before creating the component.");
        ab.d.d(this.f13183p.getHost() instanceof ab.b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f13183p.getHost().getClass());
        e(this.f13183p);
        return ((a) ra.a.a(this.f13183p.getHost(), a.class)).fragmentComponentBuilder().fragment(this.f13183p).build();
    }

    public static ContextWrapper b(Context context, Fragment fragment) {
        return new ViewComponentManager$FragmentContextWrapper(context, fragment);
    }

    public static ContextWrapper c(LayoutInflater layoutInflater, Fragment fragment) {
        return new ViewComponentManager$FragmentContextWrapper(layoutInflater, fragment);
    }

    public static final Context d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // ab.b
    public Object generatedComponent() {
        if (this.f13181f == null) {
            synchronized (this.f13182m) {
                if (this.f13181f == null) {
                    this.f13181f = a();
                }
            }
        }
        return this.f13181f;
    }

    protected void e(Fragment fragment) {
    }
}
