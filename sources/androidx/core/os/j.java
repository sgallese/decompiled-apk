package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    private static final j f3942b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    private final l f3943a;

    /* compiled from: LocaleListCompat.java */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Locale[] f3944a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : f3944a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String a10 = androidx.core.text.c.a(locale);
            if (a10.isEmpty()) {
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
                return false;
            }
            return a10.equals(androidx.core.text.c.a(locale2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocaleListCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private j(l lVar) {
        this.f3943a = lVar;
    }

    public static j a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return j(b.a(localeArr));
        }
        return new j(new k(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static j c(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i10 = 0; i10 < length; i10++) {
                localeArr[i10] = a.a(split[i10]);
            }
            return a(localeArr);
        }
        return e();
    }

    public static j e() {
        return f3942b;
    }

    public static j j(LocaleList localeList) {
        return new j(new q(localeList));
    }

    public Locale d(int i10) {
        return this.f3943a.get(i10);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof j) && this.f3943a.equals(((j) obj).f3943a)) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.f3943a.isEmpty();
    }

    public int g() {
        return this.f3943a.size();
    }

    public String h() {
        return this.f3943a.a();
    }

    public int hashCode() {
        return this.f3943a.hashCode();
    }

    public Object i() {
        return this.f3943a.b();
    }

    public String toString() {
        return this.f3943a.toString();
    }
}
