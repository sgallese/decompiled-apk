package p4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import o4.k;

/* compiled from: WorkManagerTaskExecutor.java */
/* loaded from: classes.dex */
public class b implements p4.a {

    /* renamed from: a  reason: collision with root package name */
    private final k f21058a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f21059b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final Executor f21060c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    /* loaded from: classes.dex */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f21058a = new k(executor);
    }

    @Override // p4.a
    public Executor a() {
        return this.f21060c;
    }

    @Override // p4.a
    public void b(Runnable runnable) {
        this.f21058a.execute(runnable);
    }

    @Override // p4.a
    public k c() {
        return this.f21058a;
    }

    public void d(Runnable runnable) {
        this.f21059b.post(runnable);
    }
}
