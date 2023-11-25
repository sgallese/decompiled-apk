package hd;

import ad.o0;

/* compiled from: Tasks.kt */
/* loaded from: classes4.dex */
public final class k extends h {

    /* renamed from: p  reason: collision with root package name */
    public final Runnable f16639p;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.f16639p = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f16639p.run();
        } finally {
            this.f16637m.a();
        }
    }

    public String toString() {
        return "Task[" + o0.a(this.f16639p) + '@' + o0.b(this.f16639p) + ", " + this.f16636f + ", " + this.f16637m + ']';
    }
}
