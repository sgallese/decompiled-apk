package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.m;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: ConfigAutoFetch.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Set<da.c> f11949a;

    /* renamed from: b  reason: collision with root package name */
    private final HttpURLConnection f11950b;

    /* renamed from: c  reason: collision with root package name */
    private final m f11951c;

    /* renamed from: d  reason: collision with root package name */
    private final f f11952d;

    /* renamed from: e  reason: collision with root package name */
    private final da.c f11953e;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f11954f;

    /* renamed from: g  reason: collision with root package name */
    private final Random f11955g = new Random();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigAutoFetch.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f11956f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f11957m;

        a(int i10, long j10) {
            this.f11956f = i10;
            this.f11957m = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.d(this.f11956f, this.f11957m);
        }
    }

    public b(HttpURLConnection httpURLConnection, m mVar, f fVar, Set<da.c> set, da.c cVar, ScheduledExecutorService scheduledExecutorService) {
        this.f11950b = httpURLConnection;
        this.f11951c = mVar;
        this.f11952d = fVar;
        this.f11949a = set;
        this.f11953e = cVar;
        this.f11954f = scheduledExecutorService;
    }

    private void b(int i10, long j10) {
        if (i10 == 0) {
            k(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        this.f11954f.schedule(new a(i10, j10), this.f11955g.nextInt(4), TimeUnit.SECONDS);
    }

    private synchronized void c(da.b bVar) {
        Iterator<da.c> it = this.f11949a.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
    }

    private static Boolean e(m.a aVar, long j10) {
        boolean z10 = false;
        if (aVar.d() != null) {
            if (aVar.d().i() >= j10) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        if (aVar.f() == 1) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r5 = new org.json.JSONObject(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r5.has("featureDisabled") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r5.getBoolean("featureDisabled") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        r9.f11953e.a(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (g() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r5.has("latestTemplateVersionNumber") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        r6 = r9.f11951c.r();
        r4 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r4 <= r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        b(3, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(java.io.InputStream r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L12:
            r4 = r3
        L13:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L95
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L13
            java.lang.String r4 = r9.j(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3b
            goto L13
        L3b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7b
            r5.<init>(r4)     // Catch: org.json.JSONException -> L7b
            boolean r4 = r5.has(r1)     // Catch: org.json.JSONException -> L7b
            if (r4 == 0) goto L5b
            boolean r4 = r5.getBoolean(r1)     // Catch: org.json.JSONException -> L7b
            if (r4 == 0) goto L5b
            da.c r4 = r9.f11953e     // Catch: org.json.JSONException -> L7b
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch: org.json.JSONException -> L7b
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_UNAVAILABLE     // Catch: org.json.JSONException -> L7b
            r5.<init>(r6, r7)     // Catch: org.json.JSONException -> L7b
            r4.a(r5)     // Catch: org.json.JSONException -> L7b
            goto L95
        L5b:
            boolean r4 = r9.g()     // Catch: org.json.JSONException -> L7b
            if (r4 == 0) goto L62
            goto L95
        L62:
            boolean r4 = r5.has(r0)     // Catch: org.json.JSONException -> L7b
            if (r4 == 0) goto L12
            com.google.firebase.remoteconfig.internal.m r4 = r9.f11951c     // Catch: org.json.JSONException -> L7b
            long r6 = r4.r()     // Catch: org.json.JSONException -> L7b
            long r4 = r5.getLong(r0)     // Catch: org.json.JSONException -> L7b
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L12
            r6 = 3
            r9.b(r6, r4)     // Catch: org.json.JSONException -> L7b
            goto L12
        L7b:
            r4 = move-exception
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Throwable r6 = r4.getCause()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r9.k(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L12
        L95:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.b.f(java.io.InputStream):void");
    }

    private synchronized boolean g() {
        return this.f11949a.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task h(Task task, Task task2, long j10, int i10, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.getException()));
        }
        m.a aVar = (m.a) task.getResult();
        g gVar = (g) task2.getResult();
        if (!e(aVar, j10).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            b(i10, j10);
            return Tasks.forResult(null);
        } else if (aVar.d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return Tasks.forResult(null);
        } else {
            if (gVar == null) {
                gVar = g.j().a();
            }
            Set<String> e10 = gVar.e(aVar.d());
            if (e10.isEmpty()) {
                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                return Tasks.forResult(null);
            }
            c(da.b.a(e10));
            return Tasks.forResult(null);
        }
    }

    private String j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
            return "";
        }
        return str.substring(indexOf, lastIndexOf + 1);
    }

    private synchronized void k(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<da.c> it = this.f11949a.iterator();
        while (it.hasNext()) {
            it.next().a(firebaseRemoteConfigException);
        }
    }

    public synchronized Task<Void> d(int i10, final long j10) {
        final int i11;
        final Task<m.a> n10;
        final Task<g> e10;
        i11 = i10 - 1;
        n10 = this.f11951c.n(m.b.REALTIME, 3 - i11);
        e10 = this.f11952d.e();
        return Tasks.whenAllComplete(n10, e10).continueWithTask(this.f11954f, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.a
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task h10;
                h10 = b.this.h(n10, e10, j10, i11, task);
                return h10;
            }
        });
    }

    public void i() {
        HttpURLConnection httpURLConnection = this.f11950b;
        if (httpURLConnection == null) {
            return;
        }
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                f(inputStream);
                inputStream.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e10);
            }
        } finally {
            this.f11950b.disconnect();
        }
    }
}
