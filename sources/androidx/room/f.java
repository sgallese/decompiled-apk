package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: InvalidationTracker.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f6979m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b  reason: collision with root package name */
    final String[] f6981b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Set<String>> f6982c;

    /* renamed from: d  reason: collision with root package name */
    final i f6983d;

    /* renamed from: g  reason: collision with root package name */
    volatile x3.f f6986g;

    /* renamed from: h  reason: collision with root package name */
    private b f6987h;

    /* renamed from: i  reason: collision with root package name */
    private final e f6988i;

    /* renamed from: k  reason: collision with root package name */
    private g f6990k;

    /* renamed from: e  reason: collision with root package name */
    AtomicBoolean f6984e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f6985f = false;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: j  reason: collision with root package name */
    final m.b<c, d> f6989j = new m.b<>();

    /* renamed from: l  reason: collision with root package name */
    Runnable f6991l = new a();

    /* renamed from: a  reason: collision with root package name */
    final HashMap<String, Integer> f6980a = new HashMap<>();

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor p10 = f.this.f6983d.p(new x3.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (p10.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(p10.getInt(0)));
                } catch (Throwable th) {
                    p10.close();
                    throw th;
                }
            }
            p10.close();
            if (!hashSet.isEmpty()) {
                f.this.f6986g.u();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock h10 = f.this.f6983d.h();
            Set<Integer> set = null;
            try {
                try {
                    h10.lock();
                } finally {
                    h10.unlock();
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
            }
            if (!f.this.c()) {
                return;
            }
            if (!f.this.f6984e.compareAndSet(true, false)) {
                return;
            }
            if (f.this.f6983d.k()) {
                return;
            }
            i iVar = f.this.f6983d;
            if (iVar.f7030g) {
                x3.b X = iVar.i().X();
                X.beginTransaction();
                try {
                    set = a();
                    X.O();
                    X.e0();
                } catch (Throwable th) {
                    X.e0();
                    throw th;
                }
            } else {
                set = a();
            }
            if (set != null && !set.isEmpty()) {
                synchronized (f.this.f6989j) {
                    Iterator<Map.Entry<c, d>> it = f.this.f6989j.iterator();
                    while (it.hasNext()) {
                        it.next().getValue().a(set);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final long[] f6993a;

        /* renamed from: b  reason: collision with root package name */
        final boolean[] f6994b;

        /* renamed from: c  reason: collision with root package name */
        final int[] f6995c;

        /* renamed from: d  reason: collision with root package name */
        boolean f6996d;

        /* renamed from: e  reason: collision with root package name */
        boolean f6997e;

        b(int i10) {
            long[] jArr = new long[i10];
            this.f6993a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f6994b = zArr;
            this.f6995c = new int[i10];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        int[] a() {
            boolean z10;
            synchronized (this) {
                if (this.f6996d && !this.f6997e) {
                    int length = this.f6993a.length;
                    int i10 = 0;
                    while (true) {
                        int i11 = 1;
                        if (i10 < length) {
                            if (this.f6993a[i10] > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            boolean[] zArr = this.f6994b;
                            if (z10 != zArr[i10]) {
                                int[] iArr = this.f6995c;
                                if (!z10) {
                                    i11 = 2;
                                }
                                iArr[i10] = i11;
                            } else {
                                this.f6995c[i10] = 0;
                            }
                            zArr[i10] = z10;
                            i10++;
                        } else {
                            this.f6997e = true;
                            this.f6996d = false;
                            return this.f6995c;
                        }
                    }
                }
                return null;
            }
        }

        boolean b(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f6993a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        z10 = true;
                        this.f6996d = true;
                    }
                }
            }
            return z10;
        }

        boolean c(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f6993a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        z10 = true;
                        this.f6996d = true;
                    }
                }
            }
            return z10;
        }

        void d() {
            synchronized (this) {
                this.f6997e = false;
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String[] f6998a;

        public c(String[] strArr) {
            this.f6998a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        final int[] f6999a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f7000b;

        /* renamed from: c  reason: collision with root package name */
        final c f7001c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<String> f7002d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f7001c = cVar;
            this.f6999a = iArr;
            this.f7000b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.f7002d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f7002d = null;
        }

        void a(Set<Integer> set) {
            int length = this.f6999a.length;
            Set<String> set2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (set.contains(Integer.valueOf(this.f6999a[i10]))) {
                    if (length == 1) {
                        set2 = this.f7002d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet<>(length);
                        }
                        set2.add(this.f7000b[i10]);
                    }
                }
            }
            if (set2 != null) {
                this.f7001c.b(set2);
            }
        }

        void b(String[] strArr) {
            Set<String> set = null;
            if (this.f7000b.length == 1) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    } else if (strArr[i10].equalsIgnoreCase(this.f7000b[0])) {
                        set = this.f7002d;
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f7000b;
                    int length2 = strArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            String str2 = strArr2[i11];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i11++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f7001c.b(set);
            }
        }
    }

    public f(i iVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f6983d = iVar;
        this.f6987h = new b(strArr.length);
        this.f6982c = map2;
        this.f6988i = new e(iVar);
        int length = strArr.length;
        this.f6981b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f6980a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f6981b[i10] = str2.toLowerCase(locale);
            } else {
                this.f6981b[i10] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.f6980a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f6980a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb2, String str, String str2) {
        sb2.append("`");
        sb2.append("room_table_modification_trigger_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("`");
    }

    private String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f6982c.containsKey(lowerCase)) {
                hashSet.addAll(this.f6982c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void j(x3.b bVar, int i10) {
        bVar.o("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f6981b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f6979m) {
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb2, str, str2);
            sb2.append(" AFTER ");
            sb2.append(str2);
            sb2.append(" ON `");
            sb2.append(str);
            sb2.append("` BEGIN UPDATE ");
            sb2.append("room_table_modification_log");
            sb2.append(" SET ");
            sb2.append("invalidated");
            sb2.append(" = 1");
            sb2.append(" WHERE ");
            sb2.append("table_id");
            sb2.append(" = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            bVar.o(sb2.toString());
        }
    }

    private void k(x3.b bVar, int i10) {
        String str = this.f6981b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : f6979m) {
            sb2.setLength(0);
            sb2.append("DROP TRIGGER IF EXISTS ");
            b(sb2, str, str2);
            bVar.o(sb2.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d i10;
        String[] h10 = h(cVar.f6998a);
        int[] iArr = new int[h10.length];
        int length = h10.length;
        for (int i11 = 0; i11 < length; i11++) {
            Integer num = this.f6980a.get(h10[i11].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i11] = num.intValue();
            } else {
                throw new IllegalArgumentException("There is no table with name " + h10[i11]);
            }
        }
        d dVar = new d(cVar, iArr, h10);
        synchronized (this.f6989j) {
            i10 = this.f6989j.i(cVar, dVar);
        }
        if (i10 == null && this.f6987h.b(iArr)) {
            l();
        }
    }

    boolean c() {
        if (!this.f6983d.o()) {
            return false;
        }
        if (!this.f6985f) {
            this.f6983d.i().X();
        }
        if (!this.f6985f) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(x3.b bVar) {
        synchronized (this) {
            if (this.f6985f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            bVar.o("PRAGMA temp_store = MEMORY;");
            bVar.o("PRAGMA recursive_triggers='ON';");
            bVar.o("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            m(bVar);
            this.f6986g = bVar.v("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            this.f6985f = true;
        }
    }

    public void e(String... strArr) {
        synchronized (this.f6989j) {
            Iterator<Map.Entry<c, d>> it = this.f6989j.iterator();
            while (it.hasNext()) {
                Map.Entry<c, d> next = it.next();
                if (!next.getKey().a()) {
                    next.getValue().b(strArr);
                }
            }
        }
    }

    public void f() {
        if (this.f6984e.compareAndSet(false, true)) {
            this.f6983d.j().execute(this.f6991l);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void g(c cVar) {
        d j10;
        synchronized (this.f6989j) {
            j10 = this.f6989j.j(cVar);
        }
        if (j10 != null && this.f6987h.c(j10.f6999a)) {
            l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Context context, String str) {
        this.f6990k = new g(context, str, this, this.f6983d.j());
    }

    void l() {
        if (!this.f6983d.o()) {
            return;
        }
        m(this.f6983d.i().X());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(x3.b bVar) {
        if (bVar.w0()) {
            return;
        }
        while (true) {
            try {
                Lock h10 = this.f6983d.h();
                h10.lock();
                try {
                    int[] a10 = this.f6987h.a();
                    if (a10 == null) {
                        return;
                    }
                    int length = a10.length;
                    bVar.beginTransaction();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = a10[i10];
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    k(bVar, i10);
                                }
                            } else {
                                j(bVar, i10);
                            }
                        } finally {
                        }
                    }
                    bVar.O();
                    bVar.e0();
                    this.f6987h.d();
                } finally {
                    h10.unlock();
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                return;
            }
        }
    }
}
