package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.google.android.datatransport.cct.d;
import com.google.firebase.encoders.EncodingException;
import h6.j;
import h6.k;
import h6.l;
import h6.m;
import h6.n;
import h6.o;
import h6.p;
import i6.h;
import i6.i;
import j6.f;
import j6.g;
import j6.m;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CctTransportBackend.java */
/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: a  reason: collision with root package name */
    private final b9.a f9304a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f9305b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f9306c;

    /* renamed from: d  reason: collision with root package name */
    final URL f9307d;

    /* renamed from: e  reason: collision with root package name */
    private final s6.a f9308e;

    /* renamed from: f  reason: collision with root package name */
    private final s6.a f9309f;

    /* renamed from: g  reason: collision with root package name */
    private final int f9310g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final URL f9311a;

        /* renamed from: b  reason: collision with root package name */
        final j f9312b;

        /* renamed from: c  reason: collision with root package name */
        final String f9313c;

        a(URL url, j jVar, String str) {
            this.f9311a = url;
            this.f9312b = jVar;
            this.f9313c = str;
        }

        a a(URL url) {
            return new a(url, this.f9312b, this.f9313c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f9314a;

        /* renamed from: b  reason: collision with root package name */
        final URL f9315b;

        /* renamed from: c  reason: collision with root package name */
        final long f9316c;

        b(int i10, URL url, long j10) {
            this.f9314a = i10;
            this.f9315b = url;
            this.f9316c = j10;
        }
    }

    d(Context context, s6.a aVar, s6.a aVar2, int i10) {
        this.f9304a = j.b();
        this.f9306c = context;
        this.f9305b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f9307d = n(com.google.android.datatransport.cct.a.f9295c);
        this.f9308e = aVar2;
        this.f9309f = aVar;
        this.f9310g = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        m6.a.f("CctTransportBackend", "Making request to: %s", aVar.f9311a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f9311a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f9310g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f9313c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f9304a.a(aVar.f9312b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    m6.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    m6.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    m6.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new b(responseCode, null, 0L);
                        }
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            InputStream m10 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                            try {
                                b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(m10))).c());
                                if (m10 != null) {
                                    m10.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                return bVar;
                            } finally {
                            }
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (EncodingException e10) {
            e = e10;
            m6.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e11) {
            e = e11;
            m6.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e12) {
            e = e12;
            m6.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e13) {
            e = e13;
            m6.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.getValue();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.getValue();
        }
        if (o.b.forNumber(subtype) == null) {
            return 0;
        }
        return subtype;
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.c.NONE.getValue();
        }
        return networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            m6.a.d("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a j10;
        HashMap hashMap = new HashMap();
        for (i iVar : fVar.b()) {
            String j11 = iVar.j();
            if (!hashMap.containsKey(j11)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j11, arrayList);
            } else {
                ((List) hashMap.get(j11)).add(iVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a b10 = h6.m.a().f(p.DEFAULT).g(this.f9309f.a()).h(this.f9308e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(h6.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b10.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b10.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e10 = iVar3.e();
                g6.b b11 = e10.b();
                if (b11.equals(g6.b.b("proto"))) {
                    j10 = l.j(e10.a());
                } else if (b11.equals(g6.b.b("json"))) {
                    j10 = l.i(new String(e10.a(), Charset.forName("UTF-8")));
                } else {
                    m6.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b11);
                }
                j10.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.forNumber(iVar3.g("net-type"))).b(o.b.forNumber(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    j10.b(iVar3.d());
                }
                arrayList3.add(j10.a());
            }
            b10.c(arrayList3);
            arrayList2.add(b10.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f9315b;
        if (url != null) {
            m6.a.b("CctTransportBackend", "Following redirect to: %s", url);
            return aVar.a(bVar.f9315b);
        }
        return null;
    }

    private static InputStream m(InputStream inputStream, String str) throws IOException {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // j6.m
    public g a(f fVar) {
        j i10 = i(fVar);
        URL url = this.f9307d;
        String str = null;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a c10 = com.google.android.datatransport.cct.a.c(fVar.c());
                if (c10.d() != null) {
                    str = c10.d();
                }
                if (c10.e() != null) {
                    url = n(c10.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) n6.b.a(5, new a(url, i10, str), new n6.a() { // from class: com.google.android.datatransport.cct.b
                @Override // n6.a
                public final Object apply(Object obj) {
                    d.b e10;
                    e10 = d.this.e((d.a) obj);
                    return e10;
                }
            }, new n6.c() { // from class: com.google.android.datatransport.cct.c
                @Override // n6.c
                public final Object a(Object obj, Object obj2) {
                    d.a l10;
                    l10 = d.l((d.a) obj, (d.b) obj2);
                    return l10;
                }
            });
            int i11 = bVar.f9314a;
            if (i11 == 200) {
                return g.e(bVar.f9316c);
            }
            if (i11 < 500 && i11 != 404) {
                if (i11 == 400) {
                    return g.d();
                }
                return g.a();
            }
            return g.f();
        } catch (IOException e10) {
            m6.a.d("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    @Override // j6.m
    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.f9305b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f9306c).getSimOperator()).c("application_build", Integer.toString(h(this.f9306c))).d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, s6.a aVar, s6.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
