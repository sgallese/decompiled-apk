package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: TextUtilsCompat.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static final Locale f4047a = new Locale("", "");

    /* compiled from: TextUtilsCompat.java */
    /* loaded from: classes.dex */
    static class a {
        static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    public static int a(Locale locale) {
        return a.a(locale);
    }
}
