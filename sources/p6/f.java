package p6;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p6.c;

/* compiled from: SchedulerConfig.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class f {

    /* compiled from: SchedulerConfig.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private s6.a f21114a;

        /* renamed from: b  reason: collision with root package name */
        private Map<g6.d, b> f21115b = new HashMap();

        public a a(g6.d dVar, b bVar) {
            this.f21115b.put(dVar, bVar);
            return this;
        }

        public f b() {
            if (this.f21114a != null) {
                if (this.f21115b.keySet().size() >= g6.d.values().length) {
                    Map<g6.d, b> map = this.f21115b;
                    this.f21115b = new HashMap();
                    return f.d(this.f21114a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        public a c(s6.a aVar) {
            this.f21114a = aVar;
            return this;
        }
    }

    /* compiled from: SchedulerConfig.java */
    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class b {

        /* compiled from: SchedulerConfig.java */
        @AutoValue.Builder
        /* loaded from: classes.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new c.b().c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set<c> c();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long d();
    }

    /* compiled from: SchedulerConfig.java */
    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        long j11;
        int i11 = i10 - 1;
        if (j10 > 1) {
            j11 = j10;
        } else {
            j11 = 2;
        }
        return (long) (Math.pow(3.0d, i11) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11)));
    }

    public static a b() {
        return new a();
    }

    static f d(s6.a aVar, Map<g6.d, b> map) {
        return new p6.b(aVar, map);
    }

    public static f f(s6.a aVar) {
        return b().a(g6.d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(g6.d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(g6.d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, g6.d dVar, long j10, int i10) {
        builder.setMinimumLatency(g(dVar, j10, i10));
        j(builder, h().get(dVar).c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract s6.a e();

    public long g(g6.d dVar, long j10, int i10) {
        long a10 = j10 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i10, bVar.b()), a10), bVar.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map<g6.d, b> h();
}
