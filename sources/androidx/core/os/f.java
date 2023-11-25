package androidx.core.os;

import android.os.CancellationSignal;

/* compiled from: CancellationSignal.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private boolean f3937a;

    /* renamed from: b  reason: collision with root package name */
    private b f3938b;

    /* renamed from: c  reason: collision with root package name */
    private Object f3939c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3940d;

    /* compiled from: CancellationSignal.java */
    /* loaded from: classes.dex */
    static class a {
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* compiled from: CancellationSignal.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    private void c() {
        while (this.f3940d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f3937a) {
                return;
            }
            this.f3937a = true;
            this.f3940d = true;
            b bVar = this.f3938b;
            Object obj = this.f3939c;
            if (bVar != null) {
                try {
                    bVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f3940d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                a.a(obj);
            }
            synchronized (this) {
                this.f3940d = false;
                notifyAll();
            }
        }
    }

    public void b(b bVar) {
        synchronized (this) {
            c();
            if (this.f3938b == bVar) {
                return;
            }
            this.f3938b = bVar;
            if (this.f3937a && bVar != null) {
                bVar.a();
            }
        }
    }
}
