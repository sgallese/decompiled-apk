package c2;

import java.util.Locale;
import qc.q;

/* compiled from: AndroidLocaleDelegate.android.kt */
/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Locale f8692a;

    public a(Locale locale) {
        q.i(locale, "javaLocale");
        this.f8692a = locale;
    }

    @Override // c2.j
    public String a() {
        String languageTag = this.f8692a.toLanguageTag();
        q.h(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    public final Locale b() {
        return this.f8692a;
    }
}
