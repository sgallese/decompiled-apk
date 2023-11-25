package q6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i6.i;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import l6.a;
import l6.c;
import r6.a;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
public class m0 implements q6.d, r6.a, q6.c {

    /* renamed from: s  reason: collision with root package name */
    private static final g6.b f21517s = g6.b.b("proto");

    /* renamed from: f  reason: collision with root package name */
    private final t0 f21518f;

    /* renamed from: m  reason: collision with root package name */
    private final s6.a f21519m;

    /* renamed from: p  reason: collision with root package name */
    private final s6.a f21520p;

    /* renamed from: q  reason: collision with root package name */
    private final e f21521q;

    /* renamed from: r  reason: collision with root package name */
    private final cc.a<String> f21522r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes.dex */
    public interface b<T, U> {
        U apply(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final String f21523a;

        /* renamed from: b  reason: collision with root package name */
        final String f21524b;

        private c(String str, String str2) {
            this.f21523a = str;
            this.f21524b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(s6.a aVar, s6.a aVar2, e eVar, t0 t0Var, cc.a<String> aVar3) {
        this.f21518f = t0Var;
        this.f21519m = aVar;
        this.f21520p = aVar2;
        this.f21521q = eVar;
        this.f21522r = aVar3;
    }

    private List<k> A1(SQLiteDatabase sQLiteDatabase, final i6.p pVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long X0 = X0(sQLiteDatabase, pVar);
        if (X0 == null) {
            return arrayList;
        }
        I1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{X0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: q6.y
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Object q12;
                q12 = m0.this.q1(arrayList, pVar, (Cursor) obj);
                return q12;
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> B1(SQLiteDatabase sQLiteDatabase, List<k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        I1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE}, sb2.toString(), null, null, null, null), new b() { // from class: q6.t
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Object r12;
                r12 = m0.r1(hashMap, (Cursor) obj);
                return r12;
            }
        });
        return hashMap;
    }

    private c.b C0(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        m6.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private static byte[] C1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void D0(final SQLiteDatabase sQLiteDatabase) {
        F1(new d() { // from class: q6.g0
            @Override // q6.m0.d
            public final Object a() {
                Object d12;
                d12 = m0.d1(sQLiteDatabase);
                return d12;
            }
        }, new b() { // from class: q6.h0
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Object e12;
                e12 = m0.e1((Throwable) obj);
                return e12;
            }
        });
    }

    private void D1(a.C0437a c0437a, Map<String, List<l6.c>> map) {
        for (Map.Entry<String, List<l6.c>> entry : map.entrySet()) {
            c0437a.a(l6.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] E1(long j10) {
        return (byte[]) I1(J0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: q6.a0
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                byte[] t12;
                t12 = m0.t1((Cursor) obj);
                return t12;
            }
        });
    }

    private long F0(SQLiteDatabase sQLiteDatabase, i6.p pVar) {
        Long X0 = X0(sQLiteDatabase, pVar);
        if (X0 != null) {
            return X0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(t6.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    private <T> T F1(d<T> dVar, b<Throwable, T> bVar) {
        long a10 = this.f21520p.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f21520p.a() >= this.f21521q.b() + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static g6.b G1(String str) {
        if (str == null) {
            return f21517s;
        }
        return g6.b.b(str);
    }

    private static String H1(Iterable<k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static <T> T I1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private l6.b N0() {
        return l6.b.b().b(l6.e.c().b(I0()).c(e.f21501a.f()).a()).a();
    }

    private long R0() {
        return J0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private long T0() {
        return J0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    private l6.f V0() {
        final long a10 = this.f21519m.a();
        return (l6.f) Y0(new b() { // from class: q6.c0
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                l6.f i12;
                i12 = m0.i1(a10, (SQLiteDatabase) obj);
                return i12;
            }
        });
    }

    private Long X0(SQLiteDatabase sQLiteDatabase, i6.p pVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(t6.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) I1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: q6.s
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Long j12;
                j12 = m0.j1((Cursor) obj);
                return j12;
            }
        });
    }

    private boolean Z0() {
        if (R0() * T0() >= this.f21521q.f()) {
            return true;
        }
        return false;
    }

    private List<k> a1(List<k> list, Map<Long, Set<c>> map) {
        ListIterator<k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a l10 = next.b().l();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    l10.c(cVar.f21523a, cVar.f21524b);
                }
                listIterator.set(k.a(next.c(), next.d(), l10.d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object b1(Cursor cursor) {
        while (cursor.moveToNext()) {
            c(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer c1(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        I1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: q6.r
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Object b12;
                b12 = m0.this.b1((Cursor) obj);
                return b12;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object d1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object e1(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase f1(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long g1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l6.f h1(long j10, Cursor cursor) {
        cursor.moveToNext();
        return l6.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l6.f i1(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (l6.f) I1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: q6.d0
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                l6.f h12;
                h12 = m0.h1(j10, (Cursor) obj);
                return h12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long j1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean k1(i6.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long X0 = X0(sQLiteDatabase, pVar);
        if (X0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) I1(J0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{X0.toString()}), new b() { // from class: q6.z
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List l1(SQLiteDatabase sQLiteDatabase) {
        return (List) I1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: q6.k0
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                List m12;
                m12 = m0.m1((Cursor) obj);
                return m12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List m1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(i6.p.a().b(cursor.getString(1)).d(t6.a.b(cursor.getInt(2))).c(C1(cursor.getString(3))).a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List n1(i6.p pVar, SQLiteDatabase sQLiteDatabase) {
        List<k> A1 = A1(sQLiteDatabase, pVar, this.f21521q.d());
        for (g6.d dVar : g6.d.values()) {
            if (dVar != pVar.d()) {
                int d10 = this.f21521q.d() - A1.size();
                if (d10 <= 0) {
                    break;
                }
                A1.addAll(A1(sQLiteDatabase, pVar.f(dVar), d10));
            }
        }
        return a1(A1, B1(sQLiteDatabase, A1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ l6.a o1(Map map, a.C0437a c0437a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b C0 = C0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(l6.c.c().c(C0).b(j10).a());
        }
        D1(c0437a, map);
        c0437a.e(V0());
        c0437a.d(N0());
        c0437a.c(this.f21522r.get());
        return c0437a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ l6.a p1(String str, final Map map, final a.C0437a c0437a, SQLiteDatabase sQLiteDatabase) {
        return (l6.a) I1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: q6.b0
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                l6.a o12;
                o12 = m0.this.o1(map, c0437a, (Cursor) obj);
                return o12;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q1(List list, i6.p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z10 = false;
            long j10 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z10 = true;
            }
            i.a k10 = i6.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                k10.h(new i6.h(G1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k10.h(new i6.h(G1(cursor.getString(4)), E1(j10)));
            }
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(k.a(j10, pVar, k10.d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long s1(i6.i iVar, i6.p pVar, SQLiteDatabase sQLiteDatabase) {
        boolean z10;
        byte[] bArr;
        if (Z0()) {
            c(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long F0 = F0(sQLiteDatabase, pVar);
        int e10 = this.f21521q.e();
        byte[] a10 = iVar.e().a();
        if (a10.length <= e10) {
            z10 = true;
        } else {
            z10 = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(F0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        if (z10) {
            bArr = a10;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(a10.length / e10);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put(AppMeasurementSdk.ConditionalUserProperty.NAME, entry.getKey());
            contentValues3.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] t1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object u1(Cursor cursor) {
        while (cursor.moveToNext()) {
            c(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object v1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        I1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: q6.x
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Object u12;
                u12 = m0.this.u1((Cursor) obj);
                return u12;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean w1(Cursor cursor) {
        boolean z10;
        if (cursor.getCount() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object x1(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) I1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: q6.v
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Boolean w12;
                w12 = m0.w1((Cursor) obj);
                return w12;
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object y1(long j10, i6.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(t6.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(t6.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object z1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f21519m.a()).execute();
        return null;
    }

    @Override // q6.d
    public Iterable<i6.p> F() {
        return (Iterable) Y0(new b() { // from class: q6.l
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                List l12;
                l12 = m0.l1((SQLiteDatabase) obj);
                return l12;
            }
        });
    }

    @Override // q6.d
    public void G(final i6.p pVar, final long j10) {
        Y0(new b() { // from class: q6.n
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Object y12;
                y12 = m0.y1(j10, pVar, (SQLiteDatabase) obj);
                return y12;
            }
        });
    }

    long I0() {
        return R0() * T0();
    }

    SQLiteDatabase J0() {
        final t0 t0Var = this.f21518f;
        Objects.requireNonNull(t0Var);
        return (SQLiteDatabase) F1(new d() { // from class: q6.w
            @Override // q6.m0.d
            public final Object a() {
                return t0.this.getWritableDatabase();
            }
        }, new b() { // from class: q6.e0
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                SQLiteDatabase f12;
                f12 = m0.f1((Throwable) obj);
                return f12;
            }
        });
    }

    @Override // q6.d
    public void M0(Iterable<k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + H1(iterable);
        final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
        Y0(new b() { // from class: q6.q
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Object v12;
                v12 = m0.this.v1(str, str2, (SQLiteDatabase) obj);
                return v12;
            }
        });
    }

    <T> T Y0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase J0 = J0();
        J0.beginTransaction();
        try {
            T apply = bVar.apply(J0);
            J0.setTransactionSuccessful();
            return apply;
        } finally {
            J0.endTransaction();
        }
    }

    @Override // q6.c
    public void b() {
        Y0(new b() { // from class: q6.o
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Object z12;
                z12 = m0.this.z1((SQLiteDatabase) obj);
                return z12;
            }
        });
    }

    @Override // q6.c
    public void c(final long j10, final c.b bVar, final String str) {
        Y0(new b() { // from class: q6.m
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Object x12;
                x12 = m0.x1(str, bVar, j10, (SQLiteDatabase) obj);
                return x12;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21518f.close();
    }

    @Override // r6.a
    public <T> T d(a.InterfaceC0500a<T> interfaceC0500a) {
        SQLiteDatabase J0 = J0();
        D0(J0);
        try {
            T execute = interfaceC0500a.execute();
            J0.setTransactionSuccessful();
            return execute;
        } finally {
            J0.endTransaction();
        }
    }

    @Override // q6.c
    public l6.a e() {
        final a.C0437a e10 = l6.a.e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (l6.a) Y0(new b() { // from class: q6.u
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                l6.a p12;
                p12 = m0.this.p1(str, hashMap, e10, (SQLiteDatabase) obj);
                return p12;
            }
        });
    }

    @Override // q6.d
    public int f() {
        final long a10 = this.f21519m.a() - this.f21521q.c();
        return ((Integer) Y0(new b() { // from class: q6.j0
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Integer c12;
                c12 = m0.this.c1(a10, (SQLiteDatabase) obj);
                return c12;
            }
        })).intValue();
    }

    @Override // q6.d
    public k g(final i6.p pVar, final i6.i iVar) {
        m6.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.j(), pVar.b());
        long longValue = ((Long) Y0(new b() { // from class: q6.i0
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Long s12;
                s12 = m0.this.s1(iVar, pVar, (SQLiteDatabase) obj);
                return s12;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return k.a(longValue, pVar, iVar);
    }

    @Override // q6.d
    public void i(Iterable<k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        J0().compileStatement("DELETE FROM events WHERE _id in " + H1(iterable)).execute();
    }

    @Override // q6.d
    public long n0(i6.p pVar) {
        return ((Long) I1(J0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(t6.a.a(pVar.d()))}), new b() { // from class: q6.f0
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Long g12;
                g12 = m0.g1((Cursor) obj);
                return g12;
            }
        })).longValue();
    }

    @Override // q6.d
    public Iterable<k> o0(final i6.p pVar) {
        return (Iterable) Y0(new b() { // from class: q6.p
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                List n12;
                n12 = m0.this.n1(pVar, (SQLiteDatabase) obj);
                return n12;
            }
        });
    }

    @Override // q6.d
    public boolean s(final i6.p pVar) {
        return ((Boolean) Y0(new b() { // from class: q6.l0
            @Override // q6.m0.b
            public final Object apply(Object obj) {
                Boolean k12;
                k12 = m0.this.k1(pVar, (SQLiteDatabase) obj);
                return k12;
            }
        })).booleanValue();
    }
}
