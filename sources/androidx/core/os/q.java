package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: classes.dex */
final class q implements l {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f3951a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Object obj) {
        this.f3951a = n.a(obj);
    }

    @Override // androidx.core.os.l
    public String a() {
        String languageTags;
        languageTags = this.f3951a.toLanguageTags();
        return languageTags;
    }

    @Override // androidx.core.os.l
    public Object b() {
        return this.f3951a;
    }

    public boolean equals(Object obj) {
        boolean equals;
        equals = this.f3951a.equals(((l) obj).b());
        return equals;
    }

    @Override // androidx.core.os.l
    public Locale get(int i10) {
        Locale locale;
        locale = this.f3951a.get(i10);
        return locale;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.f3951a.hashCode();
        return hashCode;
    }

    @Override // androidx.core.os.l
    public boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f3951a.isEmpty();
        return isEmpty;
    }

    @Override // androidx.core.os.l
    public int size() {
        int size;
        size = this.f3951a.size();
        return size;
    }

    public String toString() {
        String localeList;
        localeList = this.f3951a.toString();
        return localeList;
    }
}
