package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.ViewStructure;

/* compiled from: ViewStructureCompat.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2633a;

    /* compiled from: ViewStructureCompat.java */
    /* loaded from: classes.dex */
    private static class a {
        static void a(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        static void b(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }

        static void c(ViewStructure viewStructure, int i10, int i11, int i12, int i13, int i14, int i15) {
            viewStructure.setDimens(i10, i11, i12, i13, i14, i15);
        }

        static void d(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }
    }

    private p(ViewStructure viewStructure) {
        this.f2633a = viewStructure;
    }

    public static p f(ViewStructure viewStructure) {
        return new p(viewStructure);
    }

    public void a(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.a(d.a(this.f2633a), str);
        }
    }

    public void b(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.b(d.a(this.f2633a), charSequence);
        }
    }

    public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.c(d.a(this.f2633a), i10, i11, i12, i13, i14, i15);
        }
    }

    public void d(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.d(d.a(this.f2633a), charSequence);
        }
    }

    public ViewStructure e() {
        return d.a(this.f2633a);
    }
}
