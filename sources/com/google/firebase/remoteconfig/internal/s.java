package com.google.firebase.remoteconfig.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: ConfigRealtimeHttpClient.java */
/* loaded from: classes3.dex */
public class s {

    /* renamed from: q  reason: collision with root package name */
    static final int[] f12042q = {2, 4, 8, 16, 32, 64, 128, UserVerificationMethods.USER_VERIFY_HANDPRINT};

    /* renamed from: r  reason: collision with root package name */
    private static final Pattern f12043r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    private final Set<da.c> f12044a;

    /* renamed from: c  reason: collision with root package name */
    private int f12046c;

    /* renamed from: g  reason: collision with root package name */
    private final ScheduledExecutorService f12050g;

    /* renamed from: h  reason: collision with root package name */
    private final m f12051h;

    /* renamed from: i  reason: collision with root package name */
    private final com.google.firebase.e f12052i;

    /* renamed from: j  reason: collision with root package name */
    private final j9.e f12053j;

    /* renamed from: k  reason: collision with root package name */
    f f12054k;

    /* renamed from: l  reason: collision with root package name */
    private final Context f12055l;

    /* renamed from: m  reason: collision with root package name */
    private final String f12056m;

    /* renamed from: p  reason: collision with root package name */
    private final p f12059p;

    /* renamed from: f  reason: collision with root package name */
    private final int f12049f = 8;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12045b = false;

    /* renamed from: n  reason: collision with root package name */
    private final Random f12057n = new Random();

    /* renamed from: o  reason: collision with root package name */
    private final Clock f12058o = DefaultClock.getInstance();

    /* renamed from: d  reason: collision with root package name */
    private boolean f12047d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12048e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigRealtimeHttpClient.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.d();
        }
    }

    public s(com.google.firebase.e eVar, j9.e eVar2, m mVar, f fVar, Context context, String str, Set<da.c> set, p pVar, ScheduledExecutorService scheduledExecutorService) {
        this.f12044a = set;
        this.f12050g = scheduledExecutorService;
        this.f12046c = Math.max(8 - pVar.h().b(), 1);
        this.f12052i = eVar;
        this.f12051h = mVar;
        this.f12053j = eVar2;
        this.f12054k = fVar;
        this.f12055l = context;
        this.f12056m = str;
        this.f12059p = pVar;
    }

    private void C(Date date) {
        int b10 = this.f12059p.h().b() + 1;
        this.f12059p.o(b10, new Date(date.getTime() + m(b10)));
    }

    private synchronized boolean e() {
        boolean z10;
        if (!this.f12044a.isEmpty() && !this.f12045b && !this.f12047d) {
            if (!this.f12048e) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    private JSONObject h() {
        HashMap hashMap = new HashMap();
        hashMap.put("project", j(this.f12052i.m().c()));
        hashMap.put("namespace", this.f12056m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.f12051h.r()));
        hashMap.put("appId", this.f12052i.m().c());
        hashMap.put("sdkVersion", "21.3.0");
        return new JSONObject(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        this.f12047d = true;
    }

    private static String j(String str) {
        Matcher matcher = f12043r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String k() {
        try {
            Context context = this.f12055l;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f12055l.getPackageName());
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f12055l.getPackageName());
            return null;
        }
    }

    private void l(final HttpURLConnection httpURLConnection) {
        this.f12053j.a(false).onSuccessTask(this.f12050g, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.r
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task q10;
                q10 = s.q(httpURLConnection, (com.google.firebase.installations.f) obj);
                return q10;
            }
        });
    }

    private long m(int i10) {
        int length = f12042q.length;
        if (i10 >= length) {
            i10 = length;
        }
        return (TimeUnit.MINUTES.toMillis(r0[i10 - 1]) / 2) + this.f12057n.nextInt((int) r0);
    }

    private String n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", j(this.f12052i.m().c()), str);
    }

    private URL o() {
        try {
            return new URL(n(this.f12056m));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    private boolean p(int i10) {
        if (i10 != 408 && i10 != 429 && i10 != 502 && i10 != 503 && i10 != 504) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task q(HttpURLConnection httpURLConnection, com.google.firebase.installations.f fVar) throws Exception {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", fVar.b());
        return Tasks.forResult(null);
    }

    private synchronized void r(long j10) {
        if (!e()) {
            return;
        }
        int i10 = this.f12046c;
        if (i10 > 0) {
            this.f12046c = i10 - 1;
            this.f12050g.schedule(new a(), j10, TimeUnit.MILLISECONDS);
        } else if (!this.f12048e) {
            t(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.a.CONFIG_UPDATE_STREAM_ERROR));
        }
    }

    private String s(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void t(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<da.c> it = this.f12044a.iterator();
        while (it.hasNext()) {
            it.next().a(firebaseRemoteConfigException);
        }
    }

    private synchronized void u() {
        this.f12046c = 8;
    }

    private void w(HttpURLConnection httpURLConnection) {
        l(httpURLConnection);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f12052i.m().b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f12055l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", k());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private synchronized void x(boolean z10) {
        this.f12045b = z10;
    }

    private void z(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        byte[] bytes = h().toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized com.google.firebase.remoteconfig.internal.b A(HttpURLConnection httpURLConnection) {
        return new com.google.firebase.remoteconfig.internal.b(httpURLConnection, this.f12051h, this.f12054k, this.f12044a, new b(), this.f12050g);
    }

    public void B() {
        r(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    @android.annotation.SuppressLint({"VisibleForTests", "DefaultLocale"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.s.d():void");
    }

    public void f(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public HttpURLConnection g() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) o().openConnection();
        w(httpURLConnection);
        z(httpURLConnection);
        return httpURLConnection;
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void v() {
        r(Math.max(0L, this.f12059p.h().a().getTime() - new Date(this.f12058o.currentTimeMillis()).getTime()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(boolean z10) {
        this.f12048e = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigRealtimeHttpClient.java */
    /* loaded from: classes3.dex */
    public class b implements da.c {
        b() {
        }

        @Override // da.c
        public void a(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            s.this.i();
            s.this.t(firebaseRemoteConfigException);
        }

        @Override // da.c
        public void b(da.b bVar) {
        }
    }
}
