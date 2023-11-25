package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: ForwardingTimeout.kt */
/* loaded from: classes4.dex */
public class n extends a1 {

    /* renamed from: a  reason: collision with root package name */
    private a1 f20652a;

    public n(a1 a1Var) {
        qc.q.i(a1Var, "delegate");
        this.f20652a = a1Var;
    }

    public final a1 a() {
        return this.f20652a;
    }

    public final n b(a1 a1Var) {
        qc.q.i(a1Var, "delegate");
        this.f20652a = a1Var;
        return this;
    }

    @Override // okio.a1
    public a1 clearDeadline() {
        return this.f20652a.clearDeadline();
    }

    @Override // okio.a1
    public a1 clearTimeout() {
        return this.f20652a.clearTimeout();
    }

    @Override // okio.a1
    public long deadlineNanoTime() {
        return this.f20652a.deadlineNanoTime();
    }

    @Override // okio.a1
    public boolean hasDeadline() {
        return this.f20652a.hasDeadline();
    }

    @Override // okio.a1
    public void throwIfReached() throws IOException {
        this.f20652a.throwIfReached();
    }

    @Override // okio.a1
    public a1 timeout(long j10, TimeUnit timeUnit) {
        qc.q.i(timeUnit, "unit");
        return this.f20652a.timeout(j10, timeUnit);
    }

    @Override // okio.a1
    public long timeoutNanos() {
        return this.f20652a.timeoutNanos();
    }

    @Override // okio.a1
    public a1 deadlineNanoTime(long j10) {
        return this.f20652a.deadlineNanoTime(j10);
    }
}
