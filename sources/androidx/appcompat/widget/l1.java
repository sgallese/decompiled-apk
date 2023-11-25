package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* compiled from: TooltipCompat.java */
/* loaded from: classes.dex */
public class l1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TooltipCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        } else {
            o1.h(view, charSequence);
        }
    }
}
