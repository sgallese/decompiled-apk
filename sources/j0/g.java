package j0;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ActualJvm.jvm.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f18636a;

    public g(int i10) {
        this.f18636a = new AtomicInteger(i10);
    }

    public final int a(int i10) {
        return this.f18636a.addAndGet(i10);
    }
}
