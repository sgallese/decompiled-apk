package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.l;
import java.util.HashMap;
import java.util.Map;
import n4.p;

/* compiled from: CommandHandler.java */
/* loaded from: classes.dex */
public class b implements g4.b {

    /* renamed from: q  reason: collision with root package name */
    private static final String f7480q = l.f("CommandHandler");

    /* renamed from: f  reason: collision with root package name */
    private final Context f7481f;

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, g4.b> f7482m = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private final Object f7483p = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        this.f7481f = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent c(Context context, String str, boolean z10) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void h(Intent intent, int i10, e eVar) {
        l.c().a(f7480q, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.f7481f, i10, eVar).a();
    }

    private void i(Intent intent, int i10, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f7483p) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            l c10 = l.c();
            String str = f7480q;
            c10.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (!this.f7482m.containsKey(string)) {
                d dVar = new d(this.f7481f, i10, string, eVar);
                this.f7482m.put(string, dVar);
                dVar.e();
            } else {
                l.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            }
        }
    }

    private void j(Intent intent, int i10) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z10 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        l.c().a(f7480q, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        d(string, z10);
    }

    private void k(Intent intent, int i10, e eVar) {
        l.c().a(f7480q, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        eVar.g().s();
    }

    private void l(Intent intent, int i10, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        l c10 = l.c();
        String str = f7480q;
        c10.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase o10 = eVar.g().o();
        o10.c();
        try {
            p n10 = o10.B().n(string);
            if (n10 == null) {
                l.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (n10.f20193b.isFinished()) {
                l.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
            } else {
                long a10 = n10.a();
                if (!n10.b()) {
                    l.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a10)), new Throwable[0]);
                    a.c(this.f7481f, eVar.g(), string, a10);
                } else {
                    l.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a10)), new Throwable[0]);
                    a.c(this.f7481f, eVar.g(), string, a10);
                    eVar.k(new e.b(eVar, a(this.f7481f), i10));
                }
                o10.r();
            }
        } finally {
            o10.g();
        }
    }

    private void m(Intent intent, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        l.c().a(f7480q, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        eVar.g().x(string);
        a.a(this.f7481f, eVar.g(), string);
        eVar.d(string, false);
    }

    private static boolean n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // g4.b
    public void d(String str, boolean z10) {
        synchronized (this.f7483p) {
            g4.b remove = this.f7482m.remove(str);
            if (remove != null) {
                remove.d(str, z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        boolean z10;
        synchronized (this.f7483p) {
            if (!this.f7482m.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Intent intent, int i10, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i10, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i10, eVar);
        } else if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            l.c().b(f7480q, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i10, eVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i10, eVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i10);
        } else {
            l.c().h(f7480q, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
