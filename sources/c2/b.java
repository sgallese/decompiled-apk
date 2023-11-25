package c2;

import ec.s;
import java.util.List;
import java.util.Locale;
import qc.q;

/* compiled from: AndroidLocaleDelegate.android.kt */
/* loaded from: classes.dex */
public final class b implements k {
    @Override // c2.k
    public i b() {
        List d10;
        Locale locale = Locale.getDefault();
        q.h(locale, "getDefault()");
        d10 = s.d(new h(new a(locale)));
        return new i(d10);
    }

    @Override // c2.k
    public j c(String str) {
        q.i(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        q.h(forLanguageTag, "forLanguageTag(languageTag)");
        return new a(forLanguageTag);
    }
}
