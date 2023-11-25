package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* compiled from: ConfigurationCompat.java */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: ConfigurationCompat.java */
    /* loaded from: classes.dex */
    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        static void b(Configuration configuration, j jVar) {
            configuration.setLocales((LocaleList) jVar.i());
        }
    }

    public static j a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return j.j(a.a(configuration));
        }
        return j.a(configuration.locale);
    }
}
