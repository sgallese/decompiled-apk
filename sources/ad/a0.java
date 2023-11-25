package ad;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: CompletionState.kt */
/* loaded from: classes4.dex */
public class a0 {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f461b = AtomicIntegerFieldUpdater.newUpdater(a0.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f462a;

    public a0(Throwable th, boolean z10) {
        this.f462a = th;
        this._handled = z10 ? 1 : 0;
    }

    public final boolean a() {
        if (f461b.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        return f461b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return o0.a(this) + '[' + this.f462a + ']';
    }

    public /* synthetic */ a0(Throwable th, boolean z10, int i10, qc.h hVar) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
