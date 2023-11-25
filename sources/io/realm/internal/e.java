package io.realm.internal;

import io.realm.log.RealmLog;
import java.lang.ref.ReferenceQueue;

/* compiled from: FinalizerRunnable.java */
/* loaded from: classes4.dex */
class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    private final ReferenceQueue<h> f17811f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(ReferenceQueue<h> referenceQueue) {
        this.f17811f = referenceQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                ((NativeObjectReference) this.f17811f.remove()).e();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                RealmLog.c("The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore", new Object[0]);
                return;
            }
        }
    }
}
