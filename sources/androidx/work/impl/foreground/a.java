package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.g;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import g4.j;
import j4.c;
import j4.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import n4.p;

/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public class a implements c, g4.b {

    /* renamed from: x  reason: collision with root package name */
    static final String f7536x = l.f("SystemFgDispatcher");

    /* renamed from: f  reason: collision with root package name */
    private Context f7537f;

    /* renamed from: m  reason: collision with root package name */
    private j f7538m;

    /* renamed from: p  reason: collision with root package name */
    private final p4.a f7539p;

    /* renamed from: q  reason: collision with root package name */
    final Object f7540q = new Object();

    /* renamed from: r  reason: collision with root package name */
    String f7541r;

    /* renamed from: s  reason: collision with root package name */
    final Map<String, g> f7542s;

    /* renamed from: t  reason: collision with root package name */
    final Map<String, p> f7543t;

    /* renamed from: u  reason: collision with root package name */
    final Set<p> f7544u;

    /* renamed from: v  reason: collision with root package name */
    final d f7545v;

    /* renamed from: w  reason: collision with root package name */
    private b f7546w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemForegroundDispatcher.java */
    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0169a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ WorkDatabase f7547f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f7548m;

        RunnableC0169a(WorkDatabase workDatabase, String str) {
            this.f7547f = workDatabase;
            this.f7548m = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p n10 = this.f7547f.B().n(this.f7548m);
            if (n10 != null && n10.b()) {
                synchronized (a.this.f7540q) {
                    a.this.f7543t.put(this.f7548m, n10);
                    a.this.f7544u.add(n10);
                    a aVar = a.this;
                    aVar.f7545v.d(aVar.f7544u);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemForegroundDispatcher.java */
    /* loaded from: classes.dex */
    public interface b {
        void b(int i10, int i11, Notification notification);

        void c(int i10, Notification notification);

        void d(int i10);

        void stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f7537f = context;
        j k10 = j.k(context);
        this.f7538m = k10;
        p4.a p10 = k10.p();
        this.f7539p = p10;
        this.f7541r = null;
        this.f7542s = new LinkedHashMap();
        this.f7544u = new HashSet();
        this.f7543t = new HashMap();
        this.f7545v = new d(this.f7537f, p10, this);
        this.f7538m.m().c(this);
    }

    public static Intent a(Context context, String str, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        l.c().d(f7536x, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f7538m.f(UUID.fromString(stringExtra));
        }
    }

    private void h(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        l.c().a(f7536x, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification != null && this.f7546w != null) {
            this.f7542s.put(stringExtra, new g(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.f7541r)) {
                this.f7541r = stringExtra;
                this.f7546w.b(intExtra, intExtra2, notification);
                return;
            }
            this.f7546w.c(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator<Map.Entry<String, g>> it = this.f7542s.entrySet().iterator();
                while (it.hasNext()) {
                    i10 |= it.next().getValue().a();
                }
                g gVar = this.f7542s.get(this.f7541r);
                if (gVar != null) {
                    this.f7546w.b(gVar.c(), i10, gVar.b());
                }
            }
        }
    }

    private void i(Intent intent) {
        l.c().d(f7536x, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f7539p.b(new RunnableC0169a(this.f7538m.o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // j4.c
    public void b(List<String> list) {
        if (!list.isEmpty()) {
            for (String str : list) {
                l.c().a(f7536x, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                this.f7538m.w(str);
            }
        }
    }

    @Override // g4.b
    public void d(String str, boolean z10) {
        boolean z11;
        Map.Entry<String, g> entry;
        synchronized (this.f7540q) {
            p remove = this.f7543t.remove(str);
            if (remove != null) {
                z11 = this.f7544u.remove(remove);
            } else {
                z11 = false;
            }
            if (z11) {
                this.f7545v.d(this.f7544u);
            }
        }
        g remove2 = this.f7542s.remove(str);
        if (str.equals(this.f7541r) && this.f7542s.size() > 0) {
            Iterator<Map.Entry<String, g>> it = this.f7542s.entrySet().iterator();
            Map.Entry<String, g> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f7541r = entry.getKey();
            if (this.f7546w != null) {
                g value = entry.getValue();
                this.f7546w.b(value.c(), value.a(), value.b());
                this.f7546w.d(value.c());
            }
        }
        b bVar = this.f7546w;
        if (remove2 != null && bVar != null) {
            l.c().a(f7536x, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.c()), str, Integer.valueOf(remove2.a())), new Throwable[0]);
            bVar.d(remove2.c());
        }
    }

    void j(Intent intent) {
        l.c().d(f7536x, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f7546w;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        this.f7546w = null;
        synchronized (this.f7540q) {
            this.f7545v.e();
        }
        this.f7538m.m().i(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(b bVar) {
        if (this.f7546w != null) {
            l.c().b(f7536x, "A callback already exists.", new Throwable[0]);
        } else {
            this.f7546w = bVar;
        }
    }

    @Override // j4.c
    public void f(List<String> list) {
    }
}
