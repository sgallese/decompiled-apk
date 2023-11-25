package o4;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import java.util.UUID;

/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public class p implements androidx.work.h {

    /* renamed from: d  reason: collision with root package name */
    private static final String f20513d = androidx.work.l.f("WMFgUpdater");

    /* renamed from: a  reason: collision with root package name */
    private final p4.a f20514a;

    /* renamed from: b  reason: collision with root package name */
    final m4.a f20515b;

    /* renamed from: c  reason: collision with root package name */
    final n4.q f20516c;

    /* compiled from: WorkForegroundUpdater.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f20517f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ UUID f20518m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.work.g f20519p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ Context f20520q;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, androidx.work.g gVar, Context context) {
            this.f20517f = cVar;
            this.f20518m = uuid;
            this.f20519p = gVar;
            this.f20520q = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f20517f.isCancelled()) {
                    String uuid = this.f20518m.toString();
                    u.a m10 = p.this.f20516c.m(uuid);
                    if (m10 != null && !m10.isFinished()) {
                        p.this.f20515b.a(uuid, this.f20519p);
                        this.f20520q.startService(androidx.work.impl.foreground.a.a(this.f20520q, uuid, this.f20519p));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.f20517f.o(null);
            } catch (Throwable th) {
                this.f20517f.p(th);
            }
        }
    }

    public p(WorkDatabase workDatabase, m4.a aVar, p4.a aVar2) {
        this.f20515b = aVar;
        this.f20514a = aVar2;
        this.f20516c = workDatabase.B();
    }

    @Override // androidx.work.h
    public com.google.common.util.concurrent.a<Void> a(Context context, UUID uuid, androidx.work.g gVar) {
        androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
        this.f20514a.b(new a(s10, uuid, gVar, context));
        return s10;
    }
}
