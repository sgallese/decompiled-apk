package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    private static Configuration f948f;

    /* renamed from: a  reason: collision with root package name */
    private int f949a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f950b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f951c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f952d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f953e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ContextThemeWrapper.java */
    /* loaded from: classes.dex */
    public static class a {
        static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d() {
        super(null);
    }

    private Resources b() {
        if (this.f953e == null) {
            Configuration configuration = this.f952d;
            if (configuration != null && (Build.VERSION.SDK_INT < 26 || !e(configuration))) {
                this.f953e = a.a(this, this.f952d).getResources();
            } else {
                this.f953e = super.getResources();
            }
        }
        return this.f953e;
    }

    private void d() {
        boolean z10;
        if (this.f950b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f950b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f950b.setTo(theme);
            }
        }
        f(this.f950b, this.f949a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f948f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f948f = configuration2;
        }
        return configuration.equals(f948f);
    }

    public void a(Configuration configuration) {
        if (this.f953e == null) {
            if (this.f952d == null) {
                this.f952d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f949a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f951c == null) {
                this.f951c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f951c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f950b;
        if (theme != null) {
            return theme;
        }
        if (this.f949a == 0) {
            this.f949a = g.i.f15831f;
        }
        d();
        return this.f950b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f949a != i10) {
            this.f949a = i10;
            d();
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f949a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f950b = theme;
    }
}
