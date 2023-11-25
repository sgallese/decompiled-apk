package com.google.firebase.perf.util;

import java.util.NoSuchElementException;

/* compiled from: Optional.java */
/* loaded from: classes3.dex */
public final class g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f11891a;

    private g() {
        this.f11891a = null;
    }

    public static <T> g<T> a() {
        return new g<>();
    }

    public static <T> g<T> b(T t10) {
        if (t10 == null) {
            return a();
        }
        return e(t10);
    }

    public static <T> g<T> e(T t10) {
        return new g<>(t10);
    }

    public T c() {
        T t10 = this.f11891a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean d() {
        if (this.f11891a != null) {
            return true;
        }
        return false;
    }

    private g(T t10) {
        if (t10 != null) {
            this.f11891a = t10;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
