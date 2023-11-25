package c8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
final class q implements Executor {

    /* renamed from: f  reason: collision with root package name */
    private final Handler f8887f = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f8887f.post(runnable);
    }
}
