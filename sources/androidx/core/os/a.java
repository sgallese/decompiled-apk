package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* compiled from: BuildCompat.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3929a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final int f3930b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f3931c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f3932d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f3933e;

    /* compiled from: BuildCompat.kt */
    /* renamed from: androidx.core.os.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0072a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0072a f3934a = new C0072a();

        private C0072a() {
        }

        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10;
        int i11;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        int i14 = 0;
        if (i13 >= 30) {
            i10 = C0072a.f3934a.a(30);
        } else {
            i10 = 0;
        }
        f3930b = i10;
        if (i13 >= 30) {
            i11 = C0072a.f3934a.a(31);
        } else {
            i11 = 0;
        }
        f3931c = i11;
        if (i13 >= 30) {
            i12 = C0072a.f3934a.a(33);
        } else {
            i12 = 0;
        }
        f3932d = i12;
        if (i13 >= 30) {
            i14 = C0072a.f3934a.a(1000000);
        }
        f3933e = i14;
    }

    private a() {
    }

    public static final boolean a(String str, String str2) {
        qc.q.i(str, "codename");
        qc.q.i(str2, "buildCodename");
        if (qc.q.d("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        qc.q.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        qc.q.h(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.compareTo(upperCase2) < 0) {
            return false;
        }
        return true;
    }

    public static final boolean b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            if (i10 >= 30) {
                String str = Build.VERSION.CODENAME;
                qc.q.h(str, "CODENAME");
                if (a("S", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (i10 >= 32) {
                String str = Build.VERSION.CODENAME;
                qc.q.h(str, "CODENAME");
                if (a("Tiramisu", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 34) {
            if (i10 >= 33) {
                String str = Build.VERSION.CODENAME;
                qc.q.h(str, "CODENAME");
                if (a("UpsideDownCake", str)) {
                }
            }
            return false;
        }
        return true;
    }
}
