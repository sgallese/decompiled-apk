package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4109a;

    /* renamed from: b  reason: collision with root package name */
    private a f4110b;

    /* renamed from: c  reason: collision with root package name */
    private InterfaceC0080b f4111c;

    /* compiled from: ActionProvider.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: androidx.core.view.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0080b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f4109a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f4111c = null;
        this.f4110b = null;
    }

    public void i(a aVar) {
        this.f4110b = aVar;
    }

    public void j(InterfaceC0080b interfaceC0080b) {
        if (this.f4111c != null && interfaceC0080b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f4111c = interfaceC0080b;
    }

    public void f(SubMenu subMenu) {
    }
}
