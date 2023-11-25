package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* compiled from: HtmlCompat.java */
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class b {

    /* compiled from: HtmlCompat.java */
    /* loaded from: classes.dex */
    static class a {
        static Spanned a(String str, int i10) {
            return Html.fromHtml(str, i10);
        }

        static Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i10, imageGetter, tagHandler);
        }

        static String c(Spanned spanned, int i10) {
            return Html.toHtml(spanned, i10);
        }
    }

    public static String a(Spanned spanned, int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.c(spanned, i10);
        }
        return Html.toHtml(spanned);
    }
}
