package c8;

import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class t implements u {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f8893a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ t(s sVar) {
    }

    public final void a() throws InterruptedException {
        this.f8893a.await();
    }

    @Override // c8.b
    public final void onFailure(Exception exc) {
        this.f8893a.countDown();
    }

    @Override // c8.c
    public final void onSuccess(Object obj) {
        this.f8893a.countDown();
    }
}
