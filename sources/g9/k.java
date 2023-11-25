package g9;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import j$.time.Instant;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DesugarDate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeartBeatInfoStorage.java */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f16256a;

    public k(Context context, String str) {
        this.f16256a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        long j10 = this.f16256a.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.f16256a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f16256a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f16256a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 - 1).commit();
    }

    private synchronized String d(long j10) {
        Instant instant;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = DesugarDate.toInstant(new Date(j10));
            return instant.atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f16256a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void h(String str) {
        String e10 = e(str);
        if (e10 == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f16256a.getStringSet(e10, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f16256a.edit().remove(e10).commit();
        } else {
            this.f16256a.edit().putStringSet(e10, hashSet).commit();
        }
    }

    private synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f16256a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f16256a.edit().putStringSet(str, hashSet).commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        SharedPreferences.Editor edit = this.f16256a.edit();
        for (Map.Entry<String, ?> entry : this.f16256a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized List<l> c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f16256a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(l.a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        l(System.currentTimeMillis());
        return arrayList;
    }

    synchronized boolean f(long j10, long j11) {
        return d(j10).equals(d(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void g() {
        String d10 = d(System.currentTimeMillis());
        this.f16256a.edit().putString("last-used-date", d10).commit();
        h(d10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean i(long j10) {
        return j("fire-global", j10);
    }

    synchronized boolean j(String str, long j10) {
        if (this.f16256a.contains(str)) {
            if (!f(this.f16256a.getLong(str, -1L), j10)) {
                this.f16256a.edit().putLong(str, j10).commit();
                return true;
            }
            return false;
        }
        this.f16256a.edit().putLong(str, j10).commit();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void k(long j10, String str) {
        String d10 = d(j10);
        if (this.f16256a.getString("last-used-date", "").equals(d10)) {
            String e10 = e(d10);
            if (e10 == null) {
                return;
            }
            if (e10.equals(str)) {
                return;
            }
            m(str, d10);
            return;
        }
        long j11 = this.f16256a.getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            a();
            j11 = this.f16256a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f16256a.getStringSet(str, new HashSet()));
        hashSet.add(d10);
        this.f16256a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", d10).commit();
    }

    synchronized void l(long j10) {
        this.f16256a.edit().putLong("fire-global", j10).commit();
    }
}
