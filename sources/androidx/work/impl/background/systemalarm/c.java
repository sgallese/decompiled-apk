package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n4.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConstraintsCommandHandler.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: e  reason: collision with root package name */
    private static final String f7484e = l.f("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f7485a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7486b;

    /* renamed from: c  reason: collision with root package name */
    private final e f7487c;

    /* renamed from: d  reason: collision with root package name */
    private final j4.d f7488d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, int i10, e eVar) {
        this.f7485a = context;
        this.f7486b = i10;
        this.f7487c = eVar;
        this.f7488d = new j4.d(context, eVar.f(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        List<p> g10 = this.f7487c.g().o().B().g();
        ConstraintProxy.a(this.f7485a, g10);
        this.f7488d.d(g10);
        ArrayList arrayList = new ArrayList(g10.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (p pVar : g10) {
            String str = pVar.f20192a;
            if (currentTimeMillis >= pVar.a() && (!pVar.b() || this.f7488d.c(str))) {
                arrayList.add(pVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((p) it.next()).f20192a;
            Intent b10 = b.b(this.f7485a, str2);
            l.c().a(f7484e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f7487c;
            eVar.k(new e.b(eVar, b10, this.f7486b));
        }
        this.f7488d.e();
    }
}
