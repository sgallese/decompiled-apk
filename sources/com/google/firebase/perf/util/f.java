package com.google.firebase.perf.util;

import android.os.Bundle;

/* compiled from: ImmutableBundle.java */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    private static final v9.a f11889b = v9.a.e();

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f11890a;

    public f() {
        this(new Bundle());
    }

    private g<Integer> d(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Integer) this.f11890a.get(str));
        } catch (ClassCastException e10) {
            f11889b.b("Metadata key %s contains type other than int: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public boolean a(String str) {
        if (str != null && this.f11890a.containsKey(str)) {
            return true;
        }
        return false;
    }

    public g<Boolean> b(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Boolean) this.f11890a.get(str));
        } catch (ClassCastException e10) {
            f11889b.b("Metadata key %s contains type other than boolean: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public g<Float> c(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Float) this.f11890a.get(str));
        } catch (ClassCastException e10) {
            f11889b.b("Metadata key %s contains type other than float: %s", str, e10.getMessage());
            return g.a();
        }
    }

    public g<Long> e(String str) {
        if (d(str).d()) {
            return g.e(Long.valueOf(r3.c().intValue()));
        }
        return g.a();
    }

    public f(Bundle bundle) {
        this.f11890a = (Bundle) bundle.clone();
    }
}
