package androidx.work.impl;

import android.content.Context;
import androidx.room.h;
import androidx.room.i;
import androidx.work.impl.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import n4.e;
import n4.k;
import n4.n;
import n4.q;
import n4.t;
import x3.c;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends i {

    /* renamed from: l  reason: collision with root package name */
    private static final long f7450l = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c.InterfaceC0584c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f7451a;

        a(Context context) {
            this.f7451a = context;
        }

        @Override // x3.c.InterfaceC0584c
        public c a(c.b bVar) {
            c.b.a a10 = c.b.a(this.f7451a);
            a10.c(bVar.f25714b).b(bVar.f25715c).d(true);
            return new y3.c().a(a10.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends i.b {
        b() {
        }

        @Override // androidx.room.i.b
        public void c(x3.b bVar) {
            super.c(bVar);
            bVar.beginTransaction();
            try {
                bVar.o(WorkDatabase.w());
                bVar.O();
            } finally {
                bVar.e0();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z10) {
        i.a a10;
        if (z10) {
            a10 = h.c(context, WorkDatabase.class).c();
        } else {
            a10 = h.a(context, WorkDatabase.class, g4.h.d());
            a10.f(new a(context));
        }
        return (WorkDatabase) a10.g(executor).a(u()).b(androidx.work.impl.a.f7460a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.f7461b).b(androidx.work.impl.a.f7462c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.f7463d).b(androidx.work.impl.a.f7464e).b(androidx.work.impl.a.f7465f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.f7466g).e().d();
    }

    static i.b u() {
        return new b();
    }

    static long v() {
        return System.currentTimeMillis() - f7450l;
    }

    static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract n A();

    public abstract q B();

    public abstract t C();

    public abstract n4.b t();

    public abstract e x();

    public abstract n4.h y();

    public abstract k z();
}
