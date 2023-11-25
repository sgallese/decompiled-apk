package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper.java */
/* loaded from: classes.dex */
public class d1 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1493c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList<WeakReference<d1>> f1494d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1495a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f1496b;

    private d1(Context context) {
        super(context);
        if (q1.d()) {
            q1 q1Var = new q1(this, context.getResources());
            this.f1495a = q1Var;
            Resources.Theme newTheme = q1Var.newTheme();
            this.f1496b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1495a = new f1(this, context.getResources());
        this.f1496b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof d1) || (context.getResources() instanceof f1) || (context.getResources() instanceof q1) || !q1.d()) {
            return false;
        }
        return true;
    }

    public static Context b(Context context) {
        d1 d1Var;
        if (a(context)) {
            synchronized (f1493c) {
                ArrayList<WeakReference<d1>> arrayList = f1494d;
                if (arrayList == null) {
                    f1494d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<d1> weakReference = f1494d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1494d.remove(size);
                        }
                    }
                    for (int size2 = f1494d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<d1> weakReference2 = f1494d.get(size2);
                        if (weakReference2 != null) {
                            d1Var = weakReference2.get();
                        } else {
                            d1Var = null;
                        }
                        if (d1Var != null && d1Var.getBaseContext() == context) {
                            return d1Var;
                        }
                    }
                }
                d1 d1Var2 = new d1(context);
                f1494d.add(new WeakReference<>(d1Var2));
                return d1Var2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1495a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1495a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1496b;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1496b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
