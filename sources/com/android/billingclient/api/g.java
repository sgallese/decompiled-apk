package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
final class g implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f9195a = Executors.defaultThreadFactory();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f9196b = new AtomicInteger(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(b bVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f9195a.newThread(runnable);
        newThread.setName("PlayBillingLibrary-" + this.f9196b.getAndIncrement());
        return newThread;
    }
}
