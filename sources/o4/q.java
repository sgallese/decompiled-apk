package o4;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import java.util.UUID;

/* compiled from: WorkProgressUpdater.java */
/* loaded from: classes.dex */
public class q implements androidx.work.q {

    /* renamed from: c  reason: collision with root package name */
    static final String f20522c = androidx.work.l.f("WorkProgressUpdater");

    /* renamed from: a  reason: collision with root package name */
    final WorkDatabase f20523a;

    /* renamed from: b  reason: collision with root package name */
    final p4.a f20524b;

    /* compiled from: WorkProgressUpdater.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ UUID f20525f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.work.e f20526m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f20527p;

        a(UUID uuid, androidx.work.e eVar, androidx.work.impl.utils.futures.c cVar) {
            this.f20525f = uuid;
            this.f20526m = eVar;
            this.f20527p = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            n4.p n10;
            String uuid = this.f20525f.toString();
            androidx.work.l c10 = androidx.work.l.c();
            String str = q.f20522c;
            c10.a(str, String.format("Updating progress for %s (%s)", this.f20525f, this.f20526m), new Throwable[0]);
            q.this.f20523a.c();
            try {
                n10 = q.this.f20523a.B().n(uuid);
            } finally {
                try {
                    return;
                } finally {
                }
            }
            if (n10 != null) {
                if (n10.f20193b == u.a.RUNNING) {
                    q.this.f20523a.A().b(new n4.m(uuid, this.f20526m));
                } else {
                    androidx.work.l.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
                }
                this.f20527p.o(null);
                q.this.f20523a.r();
                return;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
    }

    public q(WorkDatabase workDatabase, p4.a aVar) {
        this.f20523a = workDatabase;
        this.f20524b = aVar;
    }

    @Override // androidx.work.q
    public com.google.common.util.concurrent.a<Void> a(Context context, UUID uuid, androidx.work.e eVar) {
        androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
        this.f20524b.b(new a(uuid, eVar, s10));
        return s10;
    }
}
