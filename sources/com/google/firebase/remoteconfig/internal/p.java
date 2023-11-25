package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import da.k;
import java.util.Date;

/* compiled from: ConfigMetadataClient.java */
/* loaded from: classes3.dex */
public class p {

    /* renamed from: e  reason: collision with root package name */
    static final Date f12021e = new Date(-1);

    /* renamed from: f  reason: collision with root package name */
    static final Date f12022f = new Date(-1);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f12023a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f12024b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Object f12025c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Object f12026d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigMetadataClient.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f12027a;

        /* renamed from: b  reason: collision with root package name */
        private Date f12028b;

        a(int i10, Date date) {
            this.f12027a = i10;
            this.f12028b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Date a() {
            return this.f12028b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f12027a;
        }
    }

    /* compiled from: ConfigMetadataClient.java */
    /* loaded from: classes3.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f12029a;

        /* renamed from: b  reason: collision with root package name */
        private Date f12030b;

        b(int i10, Date date) {
            this.f12029a = i10;
            this.f12030b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Date a() {
            return this.f12030b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f12029a;
        }
    }

    public p(SharedPreferences sharedPreferences) {
        this.f12023a = sharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a() {
        a aVar;
        synchronized (this.f12025c) {
            aVar = new a(this.f12023a.getInt("num_failed_fetches", 0), new Date(this.f12023a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long b() {
        return this.f12023a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public da.j c() {
        v a10;
        synchronized (this.f12024b) {
            long j10 = this.f12023a.getLong("last_fetch_time_in_millis", -1L);
            int i10 = this.f12023a.getInt("last_fetch_status", 0);
            a10 = v.b().c(i10).d(j10).b(new k.b().d(this.f12023a.getLong("fetch_timeout_in_seconds", 60L)).e(this.f12023a.getLong("minimum_fetch_interval_in_seconds", m.f11996j)).c()).a();
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f12023a.getString("last_fetch_etag", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Date e() {
        return new Date(this.f12023a.getLong("last_fetch_time_in_millis", -1L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long f() {
        return this.f12023a.getLong("last_template_version", 0L);
    }

    public long g() {
        return this.f12023a.getLong("minimum_fetch_interval_in_seconds", m.f11996j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b h() {
        b bVar;
        synchronized (this.f12026d) {
            bVar = new b(this.f12023a.getInt("num_failed_realtime_streams", 0), new Date(this.f12023a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        k(0, f12022f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        o(0, f12022f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(int i10, Date date) {
        synchronized (this.f12025c) {
            this.f12023a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void l(da.k kVar) {
        synchronized (this.f12024b) {
            this.f12023a.edit().putLong("fetch_timeout_in_seconds", kVar.a()).putLong("minimum_fetch_interval_in_seconds", kVar.b()).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(String str) {
        synchronized (this.f12024b) {
            this.f12023a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(long j10) {
        synchronized (this.f12024b) {
            this.f12023a.edit().putLong("last_template_version", j10).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(int i10, Date date) {
        synchronized (this.f12026d) {
            this.f12023a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f12024b) {
            this.f12023a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Date date) {
        synchronized (this.f12024b) {
            this.f12023a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        synchronized (this.f12024b) {
            this.f12023a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
