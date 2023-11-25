package g4;

import android.os.Handler;
import android.os.Looper;
import androidx.work.s;

/* compiled from: DefaultRunnableScheduler.java */
/* loaded from: classes.dex */
public class a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f16108a = androidx.core.os.i.a(Looper.getMainLooper());

    @Override // androidx.work.s
    public void a(long j10, Runnable runnable) {
        this.f16108a.postDelayed(runnable, j10);
    }

    @Override // androidx.work.s
    public void b(Runnable runnable) {
        this.f16108a.removeCallbacks(runnable);
    }
}
