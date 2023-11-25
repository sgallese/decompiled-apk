package o8;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: BlockingAnalyticsEventLogger.java */
/* loaded from: classes3.dex */
public class c implements b, a {

    /* renamed from: a  reason: collision with root package name */
    private final e f20577a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20578b;

    /* renamed from: c  reason: collision with root package name */
    private final TimeUnit f20579c;

    /* renamed from: e  reason: collision with root package name */
    private CountDownLatch f20581e;

    /* renamed from: d  reason: collision with root package name */
    private final Object f20580d = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f20582f = false;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f20577a = eVar;
        this.f20578b = i10;
        this.f20579c = timeUnit;
    }

    @Override // o8.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f20580d) {
            n8.f.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f20581e = new CountDownLatch(1);
            this.f20582f = false;
            this.f20577a.a(str, bundle);
            n8.f.f().i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f20581e.await(this.f20578b, this.f20579c)) {
                    this.f20582f = true;
                    n8.f.f().i("App exception callback received from Analytics listener.");
                } else {
                    n8.f.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                n8.f.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f20581e = null;
        }
    }

    @Override // o8.b
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f20581e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
