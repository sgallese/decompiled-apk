package b3;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.g;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimationHandler.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadLocal<a> f7872g = new ThreadLocal<>();

    /* renamed from: d  reason: collision with root package name */
    private c f7876d;

    /* renamed from: a  reason: collision with root package name */
    private final g<b, Long> f7873a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f7874b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final C0180a f7875c = new C0180a();

    /* renamed from: e  reason: collision with root package name */
    long f7877e = 0;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7878f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimationHandler.java */
    /* renamed from: b3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0180a {
        C0180a() {
        }

        void a() {
            a.this.f7877e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f7877e);
            if (a.this.f7874b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(long j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final C0180a f7880a;

        c(C0180a c0180a) {
            this.f7880a = c0180a;
        }

        abstract void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        private final Choreographer f7881b;

        /* renamed from: c  reason: collision with root package name */
        private final Choreographer.FrameCallback f7882c;

        /* compiled from: AnimationHandler.java */
        /* renamed from: b3.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class ChoreographerFrameCallbackC0181a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0181a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                d.this.f7880a.a();
            }
        }

        d(C0180a c0180a) {
            super(c0180a);
            this.f7881b = Choreographer.getInstance();
            this.f7882c = new ChoreographerFrameCallbackC0181a();
        }

        @Override // b3.a.c
        void a() {
            this.f7881b.postFrameCallback(this.f7882c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f7878f) {
            for (int size = this.f7874b.size() - 1; size >= 0; size--) {
                if (this.f7874b.get(size) == null) {
                    this.f7874b.remove(size);
                }
            }
            this.f7878f = false;
        }
    }

    public static a d() {
        ThreadLocal<a> threadLocal = f7872g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean f(b bVar, long j10) {
        Long l10 = this.f7873a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() < j10) {
            this.f7873a.remove(bVar);
            return true;
        }
        return false;
    }

    public void a(b bVar, long j10) {
        if (this.f7874b.size() == 0) {
            e().a();
        }
        if (!this.f7874b.contains(bVar)) {
            this.f7874b.add(bVar);
        }
        if (j10 > 0) {
            this.f7873a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    void c(long j10) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f7874b.size(); i10++) {
            b bVar = this.f7874b.get(i10);
            if (bVar != null && f(bVar, uptimeMillis)) {
                bVar.a(j10);
            }
        }
        b();
    }

    c e() {
        if (this.f7876d == null) {
            this.f7876d = new d(this.f7875c);
        }
        return this.f7876d;
    }

    public void g(b bVar) {
        this.f7873a.remove(bVar);
        int indexOf = this.f7874b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f7874b.set(indexOf, null);
            this.f7878f = true;
        }
    }
}
