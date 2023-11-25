package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.l;
import n4.p;

/* compiled from: SystemAlarmScheduler.java */
/* loaded from: classes.dex */
public class f implements g4.e {

    /* renamed from: m  reason: collision with root package name */
    private static final String f7515m = l.f("SystemAlarmScheduler");

    /* renamed from: f  reason: collision with root package name */
    private final Context f7516f;

    public f(Context context) {
        this.f7516f = context.getApplicationContext();
    }

    private void b(p pVar) {
        l.c().a(f7515m, String.format("Scheduling work with workSpecId %s", pVar.f20192a), new Throwable[0]);
        this.f7516f.startService(b.f(this.f7516f, pVar.f20192a));
    }

    @Override // g4.e
    public void a(p... pVarArr) {
        for (p pVar : pVarArr) {
            b(pVar);
        }
    }

    @Override // g4.e
    public boolean c() {
        return true;
    }

    @Override // g4.e
    public void e(String str) {
        this.f7516f.startService(b.g(this.f7516f, str));
    }
}
