package androidx.core.view;

import android.os.Build;
import android.view.Menu;

/* compiled from: MenuCompat.java */
/* loaded from: classes.dex */
public final class t {

    /* compiled from: MenuCompat.java */
    /* loaded from: classes.dex */
    static class a {
        static void a(Menu menu, boolean z10) {
            menu.setGroupDividerEnabled(z10);
        }
    }

    public static void a(Menu menu, boolean z10) {
        if (menu instanceof s2.a) {
            ((s2.a) menu).setGroupDividerEnabled(z10);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a.a(menu, z10);
        }
    }
}
