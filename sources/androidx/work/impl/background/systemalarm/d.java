package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.l;
import java.util.Collections;
import java.util.List;
import n4.p;
import o4.n;
import o4.r;

/* compiled from: DelayMetCommandHandler.java */
/* loaded from: classes.dex */
public class d implements j4.c, g4.b, r.b {

    /* renamed from: w  reason: collision with root package name */
    private static final String f7489w = l.f("DelayMetCommandHandler");

    /* renamed from: f  reason: collision with root package name */
    private final Context f7490f;

    /* renamed from: m  reason: collision with root package name */
    private final int f7491m;

    /* renamed from: p  reason: collision with root package name */
    private final String f7492p;

    /* renamed from: q  reason: collision with root package name */
    private final e f7493q;

    /* renamed from: r  reason: collision with root package name */
    private final j4.d f7494r;

    /* renamed from: u  reason: collision with root package name */
    private PowerManager.WakeLock f7497u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f7498v = false;

    /* renamed from: t  reason: collision with root package name */
    private int f7496t = 0;

    /* renamed from: s  reason: collision with root package name */
    private final Object f7495s = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, int i10, String str, e eVar) {
        this.f7490f = context;
        this.f7491m = i10;
        this.f7493q = eVar;
        this.f7492p = str;
        this.f7494r = new j4.d(context, eVar.f(), this);
    }

    private void c() {
        synchronized (this.f7495s) {
            this.f7494r.e();
            this.f7493q.h().c(this.f7492p);
            PowerManager.WakeLock wakeLock = this.f7497u;
            if (wakeLock != null && wakeLock.isHeld()) {
                l.c().a(f7489w, String.format("Releasing wakelock %s for WorkSpec %s", this.f7497u, this.f7492p), new Throwable[0]);
                this.f7497u.release();
            }
        }
    }

    private void g() {
        synchronized (this.f7495s) {
            if (this.f7496t < 2) {
                this.f7496t = 2;
                l c10 = l.c();
                String str = f7489w;
                c10.a(str, String.format("Stopping work for WorkSpec %s", this.f7492p), new Throwable[0]);
                Intent g10 = b.g(this.f7490f, this.f7492p);
                e eVar = this.f7493q;
                eVar.k(new e.b(eVar, g10, this.f7491m));
                if (this.f7493q.e().g(this.f7492p)) {
                    l.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f7492p), new Throwable[0]);
                    Intent f10 = b.f(this.f7490f, this.f7492p);
                    e eVar2 = this.f7493q;
                    eVar2.k(new e.b(eVar2, f10, this.f7491m));
                } else {
                    l.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f7492p), new Throwable[0]);
                }
            } else {
                l.c().a(f7489w, String.format("Already stopped work for %s", this.f7492p), new Throwable[0]);
            }
        }
    }

    @Override // o4.r.b
    public void a(String str) {
        l.c().a(f7489w, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // j4.c
    public void b(List<String> list) {
        g();
    }

    @Override // g4.b
    public void d(String str, boolean z10) {
        l.c().a(f7489w, String.format("onExecuted %s, %s", str, Boolean.valueOf(z10)), new Throwable[0]);
        c();
        if (z10) {
            Intent f10 = b.f(this.f7490f, this.f7492p);
            e eVar = this.f7493q;
            eVar.k(new e.b(eVar, f10, this.f7491m));
        }
        if (this.f7498v) {
            Intent a10 = b.a(this.f7490f);
            e eVar2 = this.f7493q;
            eVar2.k(new e.b(eVar2, a10, this.f7491m));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f7497u = n.b(this.f7490f, String.format("%s (%s)", this.f7492p, Integer.valueOf(this.f7491m)));
        l c10 = l.c();
        String str = f7489w;
        c10.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f7497u, this.f7492p), new Throwable[0]);
        this.f7497u.acquire();
        p n10 = this.f7493q.g().o().B().n(this.f7492p);
        if (n10 == null) {
            g();
            return;
        }
        boolean b10 = n10.b();
        this.f7498v = b10;
        if (!b10) {
            l.c().a(str, String.format("No constraints for %s", this.f7492p), new Throwable[0]);
            f(Collections.singletonList(this.f7492p));
            return;
        }
        this.f7494r.d(Collections.singletonList(n10));
    }

    @Override // j4.c
    public void f(List<String> list) {
        if (!list.contains(this.f7492p)) {
            return;
        }
        synchronized (this.f7495s) {
            if (this.f7496t == 0) {
                this.f7496t = 1;
                l.c().a(f7489w, String.format("onAllConstraintsMet for %s", this.f7492p), new Throwable[0]);
                if (this.f7493q.e().j(this.f7492p)) {
                    this.f7493q.h().b(this.f7492p, 600000L, this);
                } else {
                    c();
                }
            } else {
                l.c().a(f7489w, String.format("Already started work for %s", this.f7492p), new Throwable[0]);
            }
        }
    }
}
