package j4;

import android.content.Context;
import androidx.work.l;
import java.util.ArrayList;
import java.util.List;
import k4.c;
import k4.e;
import k4.f;
import k4.g;
import k4.h;
import n4.p;

/* compiled from: WorkConstraintsTracker.java */
/* loaded from: classes.dex */
public class d implements c.a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f19027d = l.f("WorkConstraintsTracker");

    /* renamed from: a  reason: collision with root package name */
    private final c f19028a;

    /* renamed from: b  reason: collision with root package name */
    private final k4.c<?>[] f19029b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f19030c;

    public d(Context context, p4.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f19028a = cVar;
        this.f19029b = new k4.c[]{new k4.a(applicationContext, aVar), new k4.b(applicationContext, aVar), new h(applicationContext, aVar), new k4.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f19030c = new Object();
    }

    @Override // k4.c.a
    public void a(List<String> list) {
        synchronized (this.f19030c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (c(str)) {
                    l.c().a(f19027d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            c cVar = this.f19028a;
            if (cVar != null) {
                cVar.f(arrayList);
            }
        }
    }

    @Override // k4.c.a
    public void b(List<String> list) {
        synchronized (this.f19030c) {
            c cVar = this.f19028a;
            if (cVar != null) {
                cVar.b(list);
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.f19030c) {
            for (k4.c<?> cVar : this.f19029b) {
                if (cVar.d(str)) {
                    l.c().a(f19027d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<p> iterable) {
        synchronized (this.f19030c) {
            for (k4.c<?> cVar : this.f19029b) {
                cVar.g(null);
            }
            for (k4.c<?> cVar2 : this.f19029b) {
                cVar2.e(iterable);
            }
            for (k4.c<?> cVar3 : this.f19029b) {
                cVar3.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f19030c) {
            for (k4.c<?> cVar : this.f19029b) {
                cVar.f();
            }
        }
    }
}
