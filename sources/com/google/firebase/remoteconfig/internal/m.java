package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.p;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: ConfigFetchHandler.java */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: j  reason: collision with root package name */
    public static final long f11996j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k  reason: collision with root package name */
    static final int[] f11997k = {2, 4, 8, 16, 32, 64, 128, UserVerificationMethods.USER_VERIFY_HANDPRINT};

    /* renamed from: a  reason: collision with root package name */
    private final j9.e f11998a;

    /* renamed from: b  reason: collision with root package name */
    private final i9.b<i8.a> f11999b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f12000c;

    /* renamed from: d  reason: collision with root package name */
    private final Clock f12001d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f12002e;

    /* renamed from: f  reason: collision with root package name */
    private final f f12003f;

    /* renamed from: g  reason: collision with root package name */
    private final ConfigFetchHttpClient f12004g;

    /* renamed from: h  reason: collision with root package name */
    private final p f12005h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f12006i;

    /* compiled from: ConfigFetchHandler.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Date f12007a;

        /* renamed from: b  reason: collision with root package name */
        private final int f12008b;

        /* renamed from: c  reason: collision with root package name */
        private final g f12009c;

        /* renamed from: d  reason: collision with root package name */
        private final String f12010d;

        private a(Date date, int i10, g gVar, String str) {
            this.f12007a = date;
            this.f12008b = i10;
            this.f12009c = gVar;
            this.f12010d = str;
        }

        public static a a(Date date, g gVar) {
            return new a(date, 1, gVar, null);
        }

        public static a b(g gVar, String str) {
            return new a(gVar.g(), 0, gVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public g d() {
            return this.f12009c;
        }

        String e() {
            return this.f12010d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int f() {
            return this.f12008b;
        }
    }

    /* compiled from: ConfigFetchHandler.java */
    /* loaded from: classes3.dex */
    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        b(String str) {
            this.value = str;
        }

        String getValue() {
            return this.value;
        }
    }

    public m(j9.e eVar, i9.b<i8.a> bVar, Executor executor, Clock clock, Random random, f fVar, ConfigFetchHttpClient configFetchHttpClient, p pVar, Map<String, String> map) {
        this.f11998a = eVar;
        this.f11999b = bVar;
        this.f12000c = executor;
        this.f12001d = clock;
        this.f12002e = random;
        this.f12003f = fVar;
        this.f12004g = configFetchHttpClient;
        this.f12005h = pVar;
        this.f12006i = map;
    }

    private p.a A(int i10, Date date) {
        if (t(i10)) {
            B(date);
        }
        return this.f12005h.a();
    }

    private void B(Date date) {
        int b10 = this.f12005h.a().b() + 1;
        this.f12005h.k(b10, new Date(date.getTime() + q(b10)));
    }

    private void C(Task<a> task, Date date) {
        if (task.isSuccessful()) {
            this.f12005h.q(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f12005h.r();
        } else {
            this.f12005h.p();
        }
    }

    private boolean f(long j10, Date date) {
        Date e10 = this.f12005h.e();
        if (e10.equals(p.f12021e)) {
            return false;
        }
        return date.before(new Date(e10.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    private FirebaseRemoteConfigServerException g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int a10 = firebaseRemoteConfigServerException.a();
        if (a10 != 401) {
            if (a10 != 403) {
                if (a10 != 429) {
                    if (a10 != 500) {
                        switch (a10) {
                            case 502:
                            case 503:
                            case 504:
                                str = "The server is unavailable. Please try again later.";
                                break;
                            default:
                                str = "The server returned an unexpected error.";
                                break;
                        }
                    } else {
                        str = "There was an internal server error.";
                    }
                } else {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
            } else {
                str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        } else {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.a(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private String h(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    private a k(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigException {
        try {
            a fetch = this.f12004g.fetch(this.f12004g.d(), str, str2, s(), this.f12005h.d(), map, p(), date);
            if (fetch.d() != null) {
                this.f12005h.n(fetch.d().i());
            }
            if (fetch.e() != null) {
                this.f12005h.m(fetch.e());
            }
            this.f12005h.i();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e10) {
            p.a A = A(e10.a(), date);
            if (z(A, e10.a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(A.a().getTime());
            }
            throw g(e10);
        }
    }

    private Task<a> l(String str, String str2, Date date, Map<String, String> map) {
        try {
            final a k10 = k(str, str2, date, map);
            if (k10.f() != 0) {
                return Tasks.forResult(k10);
            }
            return this.f12003f.k(k10.d()).onSuccessTask(this.f12000c, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.l
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task forResult;
                    g gVar = (g) obj;
                    forResult = Tasks.forResult(m.a.this);
                    return forResult;
                }
            });
        } catch (FirebaseRemoteConfigException e10) {
            return Tasks.forException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public Task<a> u(Task<g> task, long j10, final Map<String, String> map) {
        Task continueWithTask;
        final Date date = new Date(this.f12001d.currentTimeMillis());
        if (task.isSuccessful() && f(j10, date)) {
            return Tasks.forResult(a.c(date));
        }
        Date o10 = o(date);
        if (o10 != null) {
            continueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(h(o10.getTime() - date.getTime()), o10.getTime()));
        } else {
            final Task<String> id2 = this.f11998a.getId();
            final Task<com.google.firebase.installations.f> a10 = this.f11998a.a(false);
            continueWithTask = Tasks.whenAllComplete(id2, a10).continueWithTask(this.f12000c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.j
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task w10;
                    w10 = m.this.w(id2, a10, date, map, task2);
                    return w10;
                }
            });
        }
        return continueWithTask.continueWithTask(this.f12000c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task x10;
                x10 = m.this.x(date, task2);
                return x10;
            }
        });
    }

    private Date o(Date date) {
        Date a10 = this.f12005h.a().a();
        if (date.before(a10)) {
            return a10;
        }
        return null;
    }

    private Long p() {
        i8.a aVar = this.f11999b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.a(true).get("_fot");
    }

    private long q(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f11997k;
        return (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f12002e.nextInt((int) r0);
    }

    private Map<String, String> s() {
        HashMap hashMap = new HashMap();
        i8.a aVar = this.f11999b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : aVar.a(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private boolean t(int i10) {
        if (i10 != 429 && i10 != 502 && i10 != 503 && i10 != 504) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task w(Task task, Task task2, Date date, Map map, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException()));
        }
        return l((String) task.getResult(), ((com.google.firebase.installations.f) task2.getResult()).b(), date, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task x(Date date, Task task) throws Exception {
        C(task, date);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task y(Map map, Task task) throws Exception {
        return u(task, 0L, map);
    }

    private boolean z(p.a aVar, int i10) {
        if (aVar.b() > 1 || i10 == 429) {
            return true;
        }
        return false;
    }

    public Task<a> i() {
        return j(this.f12005h.g());
    }

    public Task<a> j(final long j10) {
        final HashMap hashMap = new HashMap(this.f12006i);
        hashMap.put("X-Firebase-RC-Fetch-Type", b.BASE.getValue() + "/1");
        return this.f12003f.e().continueWithTask(this.f12000c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task u10;
                u10 = m.this.u(j10, hashMap, task);
                return u10;
            }
        });
    }

    public Task<a> n(b bVar, int i10) {
        final HashMap hashMap = new HashMap(this.f12006i);
        hashMap.put("X-Firebase-RC-Fetch-Type", bVar.getValue() + "/" + i10);
        return this.f12003f.e().continueWithTask(this.f12000c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.i
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task y10;
                y10 = m.this.y(hashMap, task);
                return y10;
            }
        });
    }

    public long r() {
        return this.f12005h.f();
    }
}
