package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: CustomTabColorSchemeParams.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f1745a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f1746b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f1747c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f1748d;

    /* compiled from: CustomTabColorSchemeParams.java */
    /* renamed from: androidx.browser.customtabs.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0016a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f1749a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f1750b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f1751c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f1752d;

        public a a() {
            return new a(this.f1749a, this.f1750b, this.f1751c, this.f1752d);
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f1745a = num;
        this.f1746b = num2;
        this.f1747c = num3;
        this.f1748d = num4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f1745a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f1746b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f1747c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f1748d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
