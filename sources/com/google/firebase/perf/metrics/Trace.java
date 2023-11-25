package com.google.firebase.perf.metrics;

import aa.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import x9.e;

/* loaded from: classes3.dex */
public class Trace extends com.google.firebase.perf.application.b implements Parcelable, z9.a {

    /* renamed from: f  reason: collision with root package name */
    private final WeakReference<z9.a> f11818f;

    /* renamed from: m  reason: collision with root package name */
    private final Trace f11819m;

    /* renamed from: p  reason: collision with root package name */
    private final GaugeManager f11820p;

    /* renamed from: q  reason: collision with root package name */
    private final String f11821q;

    /* renamed from: r  reason: collision with root package name */
    private final Map<String, Counter> f11822r;

    /* renamed from: s  reason: collision with root package name */
    private final Map<String, String> f11823s;

    /* renamed from: t  reason: collision with root package name */
    private final List<PerfSession> f11824t;

    /* renamed from: u  reason: collision with root package name */
    private final List<Trace> f11825u;

    /* renamed from: v  reason: collision with root package name */
    private final k f11826v;

    /* renamed from: w  reason: collision with root package name */
    private final com.google.firebase.perf.util.a f11827w;

    /* renamed from: x  reason: collision with root package name */
    private Timer f11828x;

    /* renamed from: y  reason: collision with root package name */
    private Timer f11829y;

    /* renamed from: z  reason: collision with root package name */
    private static final v9.a f11817z = v9.a.e();
    private static final Map<String, Trace> A = new ConcurrentHashMap();
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();
    @VisibleForTesting
    static final Parcelable.Creator<Trace> B = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<Trace> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    /* loaded from: classes3.dex */
    class b implements Parcelable.Creator<Trace> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z10, a aVar) {
        this(parcel, z10);
    }

    private void b(String str, String str2) {
        if (!n()) {
            if (!this.f11823s.containsKey(str) && this.f11823s.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            e.d(str, str2);
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f11821q));
    }

    public static Trace c(String str) {
        return new Trace(str);
    }

    private Counter o(String str) {
        Counter counter = this.f11822r.get(str);
        if (counter == null) {
            Counter counter2 = new Counter(str);
            this.f11822r.put(str, counter2);
            return counter2;
        }
        return counter;
    }

    private void p(Timer timer) {
        if (this.f11825u.isEmpty()) {
            return;
        }
        Trace trace = this.f11825u.get(this.f11825u.size() - 1);
        if (trace.f11829y == null) {
            trace.f11829y = timer;
        }
    }

    @Override // z9.a
    public void a(PerfSession perfSession) {
        if (perfSession == null) {
            f11817z.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (k() && !n()) {
            this.f11824t.add(perfSession);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public Map<String, Counter> d() {
        return this.f11822r;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public Timer e() {
        return this.f11829y;
    }

    @VisibleForTesting
    public String f() {
        return this.f11821q;
    }

    protected void finalize() throws Throwable {
        try {
            if (l()) {
                f11817z.k("Trace '%s' is started but not stopped when it is destructed!", this.f11821q);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public List<PerfSession> g() {
        List<PerfSession> unmodifiableList;
        synchronized (this.f11824t) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession perfSession : this.f11824t) {
                if (perfSession != null) {
                    arrayList.add(perfSession);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    @Keep
    public String getAttribute(String str) {
        return this.f11823s.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f11823s);
    }

    @Keep
    public long getLongMetric(String str) {
        Counter counter;
        if (str != null) {
            counter = this.f11822r.get(str.trim());
        } else {
            counter = null;
        }
        if (counter == null) {
            return 0L;
        }
        return counter.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public Timer h() {
        return this.f11828x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public List<Trace> i() {
        return this.f11825u;
    }

    @Keep
    public void incrementMetric(String str, long j10) {
        String e10 = e.e(str);
        if (e10 != null) {
            f11817z.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, e10);
        } else if (!k()) {
            f11817z.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f11821q);
        } else if (n()) {
            f11817z.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f11821q);
        } else {
            Counter o10 = o(str.trim());
            o10.c(j10);
            f11817z.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(o10.a()), this.f11821q);
        }
    }

    @VisibleForTesting
    boolean k() {
        if (this.f11828x != null) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    boolean l() {
        if (k() && !n()) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    boolean n() {
        if (this.f11829y != null) {
            return true;
        }
        return false;
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z10 = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            f11817z.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f11821q);
            z10 = true;
        } catch (Exception e10) {
            f11817z.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
        }
        if (z10) {
            this.f11823s.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j10) {
        String e10 = e.e(str);
        if (e10 != null) {
            f11817z.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, e10);
        } else if (!k()) {
            f11817z.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f11821q);
        } else if (n()) {
            f11817z.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f11821q);
        } else {
            o(str.trim()).d(j10);
            f11817z.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), this.f11821q);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (n()) {
            f11817z.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f11823s.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.a.g().K()) {
            f11817z.a("Trace feature is disabled.");
            return;
        }
        String f10 = e.f(this.f11821q);
        if (f10 != null) {
            f11817z.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f11821q, f10);
        } else if (this.f11828x != null) {
            f11817z.d("Trace '%s' has already started, should not start again!", this.f11821q);
        } else {
            this.f11828x = this.f11827w.a();
            registerForAppState();
            PerfSession perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f11818f);
            a(perfSession);
            if (perfSession.f()) {
                this.f11820p.collectGaugeMetricOnce(perfSession.d());
            }
        }
    }

    @Keep
    public void stop() {
        if (!k()) {
            f11817z.d("Trace '%s' has not been started so unable to stop!", this.f11821q);
        } else if (n()) {
            f11817z.d("Trace '%s' has already stopped, should not stop again!", this.f11821q);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f11818f);
            unregisterForAppState();
            Timer a10 = this.f11827w.a();
            this.f11829y = a10;
            if (this.f11819m == null) {
                p(a10);
                if (!this.f11821q.isEmpty()) {
                    this.f11826v.C(new com.google.firebase.perf.metrics.a(this).a(), getAppState());
                    if (SessionManager.getInstance().perfSession().f()) {
                        this.f11820p.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
                        return;
                    }
                    return;
                }
                f11817z.c("Trace name is empty, no log is sent to server");
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f11819m, 0);
        parcel.writeString(this.f11821q);
        parcel.writeList(this.f11825u);
        parcel.writeMap(this.f11822r);
        parcel.writeParcelable(this.f11828x, 0);
        parcel.writeParcelable(this.f11829y, 0);
        synchronized (this.f11824t) {
            parcel.writeList(this.f11824t);
        }
    }

    private Trace(String str) {
        this(str, k.k(), new com.google.firebase.perf.util.a(), com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.application.a aVar2) {
        this(str, kVar, aVar, aVar2, GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.application.a aVar2, GaugeManager gaugeManager) {
        super(aVar2);
        this.f11818f = new WeakReference<>(this);
        this.f11819m = null;
        this.f11821q = str.trim();
        this.f11825u = new ArrayList();
        this.f11822r = new ConcurrentHashMap();
        this.f11823s = new ConcurrentHashMap();
        this.f11827w = aVar;
        this.f11826v = kVar;
        this.f11824t = Collections.synchronizedList(new ArrayList());
        this.f11820p = gaugeManager;
    }

    private Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : com.google.firebase.perf.application.a.b());
        this.f11818f = new WeakReference<>(this);
        this.f11819m = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f11821q = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f11825u = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f11822r = concurrentHashMap;
        this.f11823s = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f11828x = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f11829y = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List<PerfSession> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f11824t = synchronizedList;
        parcel.readList(synchronizedList, PerfSession.class.getClassLoader());
        if (z10) {
            this.f11826v = null;
            this.f11827w = null;
            this.f11820p = null;
            return;
        }
        this.f11826v = k.k();
        this.f11827w = new com.google.firebase.perf.util.a();
        this.f11820p = GaugeManager.getInstance();
    }
}
