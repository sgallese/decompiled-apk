package sb;

import android.os.Handler;
import io.reactivex.Scheduler;

/* compiled from: HandlerScheduler.java */
/* loaded from: classes4.dex */
final class c extends Scheduler {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f23063a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f23064b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Handler handler, boolean z10) {
        this.f23063a = handler;
        this.f23064b = z10;
    }
}
