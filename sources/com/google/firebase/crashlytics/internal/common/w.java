package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: IdManager.java */
/* loaded from: classes3.dex */
public class w implements x {

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f11490g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    private static final String f11491h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    private final y f11492a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11493b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11494c;

    /* renamed from: d  reason: collision with root package name */
    private final j9.e f11495d;

    /* renamed from: e  reason: collision with root package name */
    private final s f11496e;

    /* renamed from: f  reason: collision with root package name */
    private String f11497f;

    public w(Context context, String str, j9.e eVar, s sVar) {
        if (context != null) {
            if (str != null) {
                this.f11493b = context;
                this.f11494c = str;
                this.f11495d = eVar;
                this.f11496e = sVar;
                this.f11492a = new y();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String e10;
        e10 = e(UUID.randomUUID().toString());
        n8.f.f().i("Created new Crashlytics installation ID: " + e10 + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", e10).putString("firebase.installation.id", str).apply();
        return e10;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private String d() {
        try {
            return (String) t0.f(this.f11495d.getId());
        } catch (Exception e10) {
            n8.f.f().l("Failed to retrieve Firebase Installations ID.", e10);
            return null;
        }
    }

    private static String e(String str) {
        if (str == null) {
            return null;
        }
        return f11490g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        if (str != null && str.startsWith("SYN_")) {
            return true;
        }
        return false;
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f11491h, "");
    }

    @Override // com.google.firebase.crashlytics.internal.common.x
    public synchronized String a() {
        String str = this.f11497f;
        if (str != null) {
            return str;
        }
        n8.f.f().i("Determining Crashlytics installation ID...");
        SharedPreferences s10 = h.s(this.f11493b);
        String string = s10.getString("firebase.installation.id", null);
        n8.f.f().i("Cached Firebase Installation ID: " + string);
        if (this.f11496e.d()) {
            String d10 = d();
            n8.f.f().i("Fetched Firebase Installation ID: " + d10);
            if (d10 == null) {
                if (string == null) {
                    d10 = c();
                } else {
                    d10 = string;
                }
            }
            if (d10.equals(string)) {
                this.f11497f = l(s10);
            } else {
                this.f11497f = b(d10, s10);
            }
        } else if (k(string)) {
            this.f11497f = l(s10);
        } else {
            this.f11497f = b(c(), s10);
        }
        if (this.f11497f == null) {
            n8.f.f().k("Unable to determine Crashlytics Install Id, creating a new one.");
            this.f11497f = b(c(), s10);
        }
        n8.f.f().i("Crashlytics installation ID: " + this.f11497f);
        return this.f11497f;
    }

    public String f() {
        return this.f11494c;
    }

    public String g() {
        return this.f11492a.a(this.f11493b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }
}
