package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils.java */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final long f11544b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f11545c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    private static h f11546d;

    /* renamed from: a  reason: collision with root package name */
    private final n9.a f11547a;

    private h(n9.a aVar) {
        this.f11547a = aVar;
    }

    public static h c() {
        return d(n9.b.a());
    }

    public static h d(n9.a aVar) {
        if (f11546d == null) {
            f11546d = new h(aVar);
        }
        return f11546d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        return f11545c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f11547a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(l9.d dVar) {
        if (TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f11544b) {
            return true;
        }
        return false;
    }
}
