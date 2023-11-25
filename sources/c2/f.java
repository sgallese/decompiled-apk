package c2;

import android.os.LocaleList;
import d2.r;
import d2.s;
import java.util.ArrayList;
import java.util.Locale;
import qc.q;

/* compiled from: AndroidLocaleDelegate.android.kt */
/* loaded from: classes.dex */
public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    private LocaleList f8693a;

    /* renamed from: b  reason: collision with root package name */
    private i f8694b;

    /* renamed from: c  reason: collision with root package name */
    private final s f8695c = r.a();

    @Override // c2.k
    public i b() {
        LocaleList localeList;
        int size;
        Locale locale;
        localeList = LocaleList.getDefault();
        q.h(localeList, "getDefault()");
        synchronized (this.f8695c) {
            i iVar = this.f8694b;
            if (iVar == null || localeList != this.f8693a) {
                size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    locale = localeList.get(i10);
                    q.h(locale, "platformLocaleList[position]");
                    arrayList.add(new h(new a(locale)));
                }
                i iVar2 = new i(arrayList);
                this.f8693a = localeList;
                this.f8694b = iVar2;
                return iVar2;
            }
            return iVar;
        }
    }

    @Override // c2.k
    public j c(String str) {
        q.i(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        q.h(forLanguageTag, "forLanguageTag(languageTag)");
        return new a(forLanguageTag);
    }
}
