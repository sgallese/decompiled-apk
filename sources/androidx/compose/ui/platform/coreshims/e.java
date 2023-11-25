package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import j$.util.Objects;
import java.util.List;

/* compiled from: ContentCaptureSessionCompat.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2625a;

    /* renamed from: b  reason: collision with root package name */
    private final View f2626b;

    /* compiled from: ContentCaptureSessionCompat.java */
    /* loaded from: classes.dex */
    private static class a {
        static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    /* compiled from: ContentCaptureSessionCompat.java */
    /* loaded from: classes.dex */
    private static class b {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newAutofillId(autofillId, j10);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j10) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j10);
        }

        static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    private e(ContentCaptureSession contentCaptureSession, View view) {
        this.f2625a = contentCaptureSession;
        this.f2626b = view;
    }

    public static e f(ContentCaptureSession contentCaptureSession, View view) {
        return new e(contentCaptureSession, view);
    }

    public AutofillId a(long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession a10 = androidx.compose.ui.platform.coreshims.c.a(this.f2625a);
            androidx.compose.ui.platform.coreshims.b a11 = o.a(this.f2626b);
            Objects.requireNonNull(a11);
            return b.a(a10, a11.a(), j10);
        }
        return null;
    }

    public p b(AutofillId autofillId, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return p.f(b.c(androidx.compose.ui.platform.coreshims.c.a(this.f2625a), autofillId, j10));
        }
        return null;
    }

    public void c(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.e(androidx.compose.ui.platform.coreshims.c.a(this.f2625a), autofillId, charSequence);
        }
    }

    public void d(List<ViewStructure> list) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            c.a(androidx.compose.ui.platform.coreshims.c.a(this.f2625a), list);
        } else if (i10 >= 29) {
            ViewStructure b10 = b.b(androidx.compose.ui.platform.coreshims.c.a(this.f2625a), this.f2626b);
            a.a(b10).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(androidx.compose.ui.platform.coreshims.c.a(this.f2625a), b10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                b.d(androidx.compose.ui.platform.coreshims.c.a(this.f2625a), d.a(list.get(i11)));
            }
            ViewStructure b11 = b.b(androidx.compose.ui.platform.coreshims.c.a(this.f2625a), this.f2626b);
            a.a(b11).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(androidx.compose.ui.platform.coreshims.c.a(this.f2625a), b11);
        }
    }

    public void e(long[] jArr) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            ContentCaptureSession a10 = androidx.compose.ui.platform.coreshims.c.a(this.f2625a);
            androidx.compose.ui.platform.coreshims.b a11 = o.a(this.f2626b);
            Objects.requireNonNull(a11);
            b.f(a10, a11.a(), jArr);
        } else if (i10 >= 29) {
            ViewStructure b10 = b.b(androidx.compose.ui.platform.coreshims.c.a(this.f2625a), this.f2626b);
            a.a(b10).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            b.d(androidx.compose.ui.platform.coreshims.c.a(this.f2625a), b10);
            ContentCaptureSession a12 = androidx.compose.ui.platform.coreshims.c.a(this.f2625a);
            androidx.compose.ui.platform.coreshims.b a13 = o.a(this.f2626b);
            Objects.requireNonNull(a13);
            b.f(a12, a13.a(), jArr);
            ViewStructure b11 = b.b(androidx.compose.ui.platform.coreshims.c.a(this.f2625a), this.f2626b);
            a.a(b11).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            b.d(androidx.compose.ui.platform.coreshims.c.a(this.f2625a), b11);
        }
    }

    /* compiled from: ContentCaptureSessionCompat.java */
    /* loaded from: classes.dex */
    private static class c {
        static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
        }
    }
}
