package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.a;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import androidx.work.u;
import g4.f;
import g4.h;
import g4.j;
import i4.m;
import java.util.List;
import java.util.concurrent.TimeUnit;
import n4.n;
import n4.p;
import n4.q;
import o4.d;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    private static final String f7550q = l.f("ForceStopRunnable");

    /* renamed from: r  reason: collision with root package name */
    private static final long f7551r = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: f  reason: collision with root package name */
    private final Context f7552f;

    /* renamed from: m  reason: collision with root package name */
    private final j f7553m;

    /* renamed from: p  reason: collision with root package name */
    private int f7554p = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f7555a = l.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                l.c().g(f7555a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, j jVar) {
        this.f7552f = context.getApplicationContext();
        this.f7553m = jVar;
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context) {
        int i10;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (a.b()) {
            i10 = 167772160;
        } else {
            i10 = 134217728;
        }
        PendingIntent d10 = d(context, i10);
        long currentTimeMillis = System.currentTimeMillis() + f7551r;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d10);
        }
    }

    public boolean a() {
        boolean z10;
        boolean z11;
        if (Build.VERSION.SDK_INT >= 23) {
            z10 = m.i(this.f7552f, this.f7553m);
        } else {
            z10 = false;
        }
        WorkDatabase o10 = this.f7553m.o();
        q B = o10.B();
        n A = o10.A();
        o10.c();
        try {
            List<p> j10 = B.j();
            if (j10 != null && !j10.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                for (p pVar : j10) {
                    B.b(u.a.ENQUEUED, pVar.f20192a);
                    B.c(pVar.f20192a, -1L);
                }
            }
            A.c();
            o10.r();
            if (!z11 && !z10) {
                return false;
            }
            return true;
        } finally {
            o10.g();
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            l.c().a(f7550q, "Rescheduling Workers.", new Throwable[0]);
            this.f7553m.s();
            this.f7553m.l().c(false);
        } else if (e()) {
            l.c().a(f7550q, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f7553m.s();
        } else if (a10) {
            l.c().a(f7550q, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.f7553m.i(), this.f7553m.o(), this.f7553m.n());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        int i10;
        List historicalProcessExitReasons;
        int reason;
        try {
            if (a.b()) {
                i10 = 570425344;
            } else {
                i10 = 536870912;
            }
            PendingIntent d10 = d(this.f7552f, i10);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d10 != null) {
                    d10.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.f7552f.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        reason = d.a(historicalProcessExitReasons.get(i11)).getReason();
                        if (reason == 10) {
                            return true;
                        }
                    }
                }
            } else if (d10 == null) {
                g(this.f7552f);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            l.c().h(f7550q, "Ignoring exception", e10);
            return true;
        }
    }

    public boolean f() {
        b i10 = this.f7553m.i();
        if (TextUtils.isEmpty(i10.c())) {
            l.c().a(f7550q, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b10 = o4.j.b(this.f7552f, i10);
        l.c().a(f7550q, String.format("Is default app process = %s", Boolean.valueOf(b10)), new Throwable[0]);
        return b10;
    }

    boolean h() {
        return this.f7553m.l().a();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (!f()) {
                return;
            }
            while (true) {
                h.e(this.f7552f);
                l.c().a(f7550q, "Performing cleanup operations.", new Throwable[0]);
                try {
                    b();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    i10 = this.f7554p + 1;
                    this.f7554p = i10;
                    if (i10 < 3) {
                        l.c().a(f7550q, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                        i(this.f7554p * 300);
                    } else {
                        l.c().b(f7550q, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        this.f7553m.i().d();
                        throw illegalStateException;
                    }
                }
                l.c().a(f7550q, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                i(this.f7554p * 300);
            }
        } finally {
            this.f7553m.r();
        }
    }
}
