package h5;

import dc.w;
import ec.b0;
import ec.n0;
import h5.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import pc.l;
import qc.q;

/* compiled from: IdentityStore.kt */
/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantReadWriteLock f16478a = new ReentrantReadWriteLock(true);

    /* renamed from: b  reason: collision with root package name */
    private e f16479b = new e(null, null, null, 7, null);

    /* renamed from: c  reason: collision with root package name */
    private final Object f16480c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Set<l<e, w>> f16481d = new LinkedHashSet();

    /* compiled from: IdentityStore.kt */
    /* loaded from: classes.dex */
    public static final class a implements f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f16482a;

        /* renamed from: b  reason: collision with root package name */
        private String f16483b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, ? extends Object> f16484c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f16485d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f16486e;

        a(e eVar, g gVar) {
            this.f16485d = eVar;
            this.f16486e = gVar;
            this.f16482a = eVar.b();
            this.f16483b = eVar.a();
            this.f16484c = eVar.c();
        }

        @Override // h5.f.a
        public f.a a(String str) {
            this.f16482a = str;
            return this;
        }

        @Override // h5.f.a
        public f.a b(String str) {
            this.f16483b = str;
            return this;
        }

        @Override // h5.f.a
        public void c() {
            this.f16486e.b(new e(this.f16482a, this.f16483b, this.f16484c));
        }

        @Override // h5.f.a
        public f.a d(Map<String, ? extends Map<String, ? extends Object>> map) {
            Map<String, ? extends Object> t10;
            q.i(map, "actions");
            t10 = n0.t(this.f16484c);
            for (Map.Entry<String, ? extends Map<String, ? extends Object>> entry : map.entrySet()) {
                String key = entry.getKey();
                Map<String, ? extends Object> value = entry.getValue();
                int hashCode = key.hashCode();
                if (hashCode != 1186238) {
                    if (hashCode != 146417720) {
                        if (hashCode == 1142092165 && key.equals("$unset")) {
                            Iterator<Map.Entry<String, ? extends Object>> it = value.entrySet().iterator();
                            while (it.hasNext()) {
                                t10.remove(it.next().getKey());
                            }
                        }
                    } else if (key.equals("$clearAll")) {
                        t10.clear();
                    }
                } else if (key.equals("$set")) {
                    t10.putAll(value);
                }
            }
            this.f16484c = t10;
            return this;
        }
    }

    @Override // h5.f
    public f.a a() {
        return new a(c(), this);
    }

    /* JADX WARN: Finally extract failed */
    @Override // h5.f
    public void b(e eVar) {
        int i10;
        Set H0;
        q.i(eVar, "identity");
        e c10 = c();
        ReentrantReadWriteLock reentrantReadWriteLock = this.f16478a;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i11 = 0;
        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
            i10 = reentrantReadWriteLock.getReadHoldCount();
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.f16479b = eVar;
            w wVar = w.f13270a;
            while (i11 < i10) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            if (!q.d(eVar, c10)) {
                synchronized (this.f16480c) {
                    H0 = b0.H0(this.f16481d);
                }
                Iterator it = H0.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).invoke(eVar);
                }
            }
        } catch (Throwable th) {
            while (i11 < i10) {
                readLock.lock();
                i11++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public e c() {
        ReentrantReadWriteLock.ReadLock readLock = this.f16478a.readLock();
        readLock.lock();
        try {
            return this.f16479b;
        } finally {
            readLock.unlock();
        }
    }
}
