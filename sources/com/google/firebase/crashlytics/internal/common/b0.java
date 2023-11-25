package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: OnDemandCounter.java */
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f11348a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f11349b = new AtomicInteger();

    public void a() {
        this.f11349b.getAndIncrement();
    }

    public void b() {
        this.f11348a.getAndIncrement();
    }

    public void c() {
        this.f11349b.set(0);
    }
}
