package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* compiled from: ViewCompatShims.java */
/* loaded from: classes.dex */
public class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewCompatShims.java */
    /* loaded from: classes.dex */
    public static class a {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    /* compiled from: ViewCompatShims.java */
    /* loaded from: classes.dex */
    private static class b {
        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* compiled from: ViewCompatShims.java */
    /* loaded from: classes.dex */
    private static class c {
        static void a(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }
    }

    public static androidx.compose.ui.platform.coreshims.b a(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return androidx.compose.ui.platform.coreshims.b.b(a.a(view));
        }
        return null;
    }

    public static e b(View view) {
        ContentCaptureSession a10;
        if (Build.VERSION.SDK_INT < 29 || (a10 = b.a(view)) == null) {
            return null;
        }
        return e.f(a10, view);
    }

    public static void c(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, i10);
        }
    }
}
