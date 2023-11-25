package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* loaded from: classes3.dex */
class c {

    /* renamed from: e  reason: collision with root package name */
    private static c f10358e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f10359a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f10360b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private C0241c f10361c;

    /* renamed from: d  reason: collision with root package name */
    private C0241c f10362d;

    /* compiled from: SnackbarManager.java */
    /* loaded from: classes3.dex */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            c.this.d((C0241c) message.obj);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnackbarManager.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(int i10);

        void c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnackbarManager.java */
    /* renamed from: com.google.android.material.snackbar.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0241c {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<b> f10364a;

        /* renamed from: b  reason: collision with root package name */
        int f10365b;

        /* renamed from: c  reason: collision with root package name */
        boolean f10366c;

        C0241c(int i10, b bVar) {
            this.f10364a = new WeakReference<>(bVar);
            this.f10365b = i10;
        }

        boolean a(b bVar) {
            if (bVar != null && this.f10364a.get() == bVar) {
                return true;
            }
            return false;
        }
    }

    private c() {
    }

    private boolean a(C0241c c0241c, int i10) {
        b bVar = c0241c.f10364a.get();
        if (bVar != null) {
            this.f10360b.removeCallbacksAndMessages(c0241c);
            bVar.a(i10);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c c() {
        if (f10358e == null) {
            f10358e = new c();
        }
        return f10358e;
    }

    private boolean g(b bVar) {
        C0241c c0241c = this.f10361c;
        if (c0241c != null && c0241c.a(bVar)) {
            return true;
        }
        return false;
    }

    private boolean h(b bVar) {
        C0241c c0241c = this.f10362d;
        if (c0241c != null && c0241c.a(bVar)) {
            return true;
        }
        return false;
    }

    private void m(C0241c c0241c) {
        int i10 = c0241c.f10365b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            if (i10 == -1) {
                i10 = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            } else {
                i10 = 2750;
            }
        }
        this.f10360b.removeCallbacksAndMessages(c0241c);
        Handler handler = this.f10360b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0241c), i10);
    }

    private void o() {
        C0241c c0241c = this.f10362d;
        if (c0241c != null) {
            this.f10361c = c0241c;
            this.f10362d = null;
            b bVar = c0241c.f10364a.get();
            if (bVar != null) {
                bVar.c();
            } else {
                this.f10361c = null;
            }
        }
    }

    public void b(b bVar, int i10) {
        synchronized (this.f10359a) {
            if (g(bVar)) {
                a(this.f10361c, i10);
            } else if (h(bVar)) {
                a(this.f10362d, i10);
            }
        }
    }

    void d(C0241c c0241c) {
        synchronized (this.f10359a) {
            if (this.f10361c == c0241c || this.f10362d == c0241c) {
                a(c0241c, 2);
            }
        }
    }

    public boolean e(b bVar) {
        boolean g10;
        synchronized (this.f10359a) {
            g10 = g(bVar);
        }
        return g10;
    }

    public boolean f(b bVar) {
        boolean z10;
        synchronized (this.f10359a) {
            if (!g(bVar) && !h(bVar)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public void i(b bVar) {
        synchronized (this.f10359a) {
            if (g(bVar)) {
                this.f10361c = null;
                if (this.f10362d != null) {
                    o();
                }
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f10359a) {
            if (g(bVar)) {
                m(this.f10361c);
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f10359a) {
            if (g(bVar)) {
                C0241c c0241c = this.f10361c;
                if (!c0241c.f10366c) {
                    c0241c.f10366c = true;
                    this.f10360b.removeCallbacksAndMessages(c0241c);
                }
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.f10359a) {
            if (g(bVar)) {
                C0241c c0241c = this.f10361c;
                if (c0241c.f10366c) {
                    c0241c.f10366c = false;
                    m(c0241c);
                }
            }
        }
    }

    public void n(int i10, b bVar) {
        synchronized (this.f10359a) {
            if (g(bVar)) {
                C0241c c0241c = this.f10361c;
                c0241c.f10365b = i10;
                this.f10360b.removeCallbacksAndMessages(c0241c);
                m(this.f10361c);
                return;
            }
            if (h(bVar)) {
                this.f10362d.f10365b = i10;
            } else {
                this.f10362d = new C0241c(i10, bVar);
            }
            C0241c c0241c2 = this.f10361c;
            if (c0241c2 != null && a(c0241c2, 4)) {
                return;
            }
            this.f10361c = null;
            o();
        }
    }
}
