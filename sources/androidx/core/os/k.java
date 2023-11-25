package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: LocaleListCompatWrapper.java */
/* loaded from: classes.dex */
final class k implements l {

    /* renamed from: c  reason: collision with root package name */
    private static final Locale[] f3945c = new Locale[0];

    /* renamed from: d  reason: collision with root package name */
    private static final Locale f3946d = new Locale("en", "XA");

    /* renamed from: e  reason: collision with root package name */
    private static final Locale f3947e = new Locale("ar", "XB");

    /* renamed from: f  reason: collision with root package name */
    private static final Locale f3948f = j.b("en-Latn");

    /* renamed from: a  reason: collision with root package name */
    private final Locale[] f3949a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3950b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f3949a = f3945c;
            this.f3950b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    c(sb2, locale2);
                    if (i10 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i10 + "] is null");
            }
        }
        this.f3949a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f3950b = sb2.toString();
    }

    static void c(StringBuilder sb2, Locale locale) {
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb2.append('-');
            sb2.append(locale.getCountry());
        }
    }

    @Override // androidx.core.os.l
    public String a() {
        return this.f3950b;
    }

    @Override // androidx.core.os.l
    public Object b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        Locale[] localeArr = ((k) obj).f3949a;
        if (this.f3949a.length != localeArr.length) {
            return false;
        }
        int i10 = 0;
        while (true) {
            Locale[] localeArr2 = this.f3949a;
            if (i10 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
            i10++;
        }
    }

    @Override // androidx.core.os.l
    public Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f3949a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
        }
        return null;
    }

    public int hashCode() {
        int i10 = 1;
        for (Locale locale : this.f3949a) {
            i10 = (i10 * 31) + locale.hashCode();
        }
        return i10;
    }

    @Override // androidx.core.os.l
    public boolean isEmpty() {
        if (this.f3949a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.os.l
    public int size() {
        return this.f3949a.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f3949a;
            if (i10 < localeArr.length) {
                sb2.append(localeArr[i10]);
                if (i10 < this.f3949a.length - 1) {
                    sb2.append(',');
                }
                i10++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
