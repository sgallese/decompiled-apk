package n4;

import androidx.work.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkSpec.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: s  reason: collision with root package name */
    private static final String f20190s = androidx.work.l.f("WorkSpec");

    /* renamed from: t  reason: collision with root package name */
    public static final n.a<List<c>, List<androidx.work.u>> f20191t = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f20192a;

    /* renamed from: b  reason: collision with root package name */
    public u.a f20193b;

    /* renamed from: c  reason: collision with root package name */
    public String f20194c;

    /* renamed from: d  reason: collision with root package name */
    public String f20195d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.work.e f20196e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.work.e f20197f;

    /* renamed from: g  reason: collision with root package name */
    public long f20198g;

    /* renamed from: h  reason: collision with root package name */
    public long f20199h;

    /* renamed from: i  reason: collision with root package name */
    public long f20200i;

    /* renamed from: j  reason: collision with root package name */
    public androidx.work.c f20201j;

    /* renamed from: k  reason: collision with root package name */
    public int f20202k;

    /* renamed from: l  reason: collision with root package name */
    public androidx.work.a f20203l;

    /* renamed from: m  reason: collision with root package name */
    public long f20204m;

    /* renamed from: n  reason: collision with root package name */
    public long f20205n;

    /* renamed from: o  reason: collision with root package name */
    public long f20206o;

    /* renamed from: p  reason: collision with root package name */
    public long f20207p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f20208q;

    /* renamed from: r  reason: collision with root package name */
    public androidx.work.p f20209r;

    /* compiled from: WorkSpec.java */
    /* loaded from: classes.dex */
    class a implements n.a<List<c>, List<androidx.work.u>> {
        a() {
        }

        @Override // n.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public List<androidx.work.u> apply(List<c> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<c> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            return arrayList;
        }
    }

    /* compiled from: WorkSpec.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f20210a;

        /* renamed from: b  reason: collision with root package name */
        public u.a f20211b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f20211b != bVar.f20211b) {
                return false;
            }
            return this.f20210a.equals(bVar.f20210a);
        }

        public int hashCode() {
            return (this.f20210a.hashCode() * 31) + this.f20211b.hashCode();
        }
    }

    /* compiled from: WorkSpec.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f20212a;

        /* renamed from: b  reason: collision with root package name */
        public u.a f20213b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.work.e f20214c;

        /* renamed from: d  reason: collision with root package name */
        public int f20215d;

        /* renamed from: e  reason: collision with root package name */
        public List<String> f20216e;

        /* renamed from: f  reason: collision with root package name */
        public List<androidx.work.e> f20217f;

        public androidx.work.u a() {
            androidx.work.e eVar;
            List<androidx.work.e> list = this.f20217f;
            if (list != null && !list.isEmpty()) {
                eVar = this.f20217f.get(0);
            } else {
                eVar = androidx.work.e.f7444c;
            }
            return new androidx.work.u(UUID.fromString(this.f20212a), this.f20213b, this.f20214c, this.f20216e, eVar, this.f20215d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f20215d != cVar.f20215d) {
                return false;
            }
            String str = this.f20212a;
            if (str == null ? cVar.f20212a != null : !str.equals(cVar.f20212a)) {
                return false;
            }
            if (this.f20213b != cVar.f20213b) {
                return false;
            }
            androidx.work.e eVar = this.f20214c;
            if (eVar == null ? cVar.f20214c != null : !eVar.equals(cVar.f20214c)) {
                return false;
            }
            List<String> list = this.f20216e;
            if (list == null ? cVar.f20216e != null : !list.equals(cVar.f20216e)) {
                return false;
            }
            List<androidx.work.e> list2 = this.f20217f;
            List<androidx.work.e> list3 = cVar.f20217f;
            if (list2 != null) {
                return list2.equals(list3);
            }
            if (list3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12;
            int i13;
            String str = this.f20212a;
            int i14 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i15 = i10 * 31;
            u.a aVar = this.f20213b;
            if (aVar != null) {
                i11 = aVar.hashCode();
            } else {
                i11 = 0;
            }
            int i16 = (i15 + i11) * 31;
            androidx.work.e eVar = this.f20214c;
            if (eVar != null) {
                i12 = eVar.hashCode();
            } else {
                i12 = 0;
            }
            int i17 = (((i16 + i12) * 31) + this.f20215d) * 31;
            List<String> list = this.f20216e;
            if (list != null) {
                i13 = list.hashCode();
            } else {
                i13 = 0;
            }
            int i18 = (i17 + i13) * 31;
            List<androidx.work.e> list2 = this.f20217f;
            if (list2 != null) {
                i14 = list2.hashCode();
            }
            return i18 + i14;
        }
    }

    public p(String str, String str2) {
        this.f20193b = u.a.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f7444c;
        this.f20196e = eVar;
        this.f20197f = eVar;
        this.f20201j = androidx.work.c.f7423i;
        this.f20203l = androidx.work.a.EXPONENTIAL;
        this.f20204m = 30000L;
        this.f20207p = -1L;
        this.f20209r = androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f20192a = str;
        this.f20194c = str2;
    }

    public long a() {
        long j10;
        long scalb;
        boolean z10 = false;
        if (c()) {
            if (this.f20203l == androidx.work.a.LINEAR) {
                z10 = true;
            }
            if (z10) {
                scalb = this.f20204m * this.f20202k;
            } else {
                scalb = Math.scalb((float) this.f20204m, this.f20202k - 1);
            }
            return this.f20205n + Math.min(18000000L, scalb);
        }
        long j11 = 0;
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j12 = this.f20205n;
            if (j12 == 0) {
                j10 = currentTimeMillis + this.f20198g;
            } else {
                j10 = j12;
            }
            long j13 = this.f20200i;
            long j14 = this.f20199h;
            if (j13 != j14) {
                z10 = true;
            }
            if (z10) {
                if (j12 == 0) {
                    j11 = j13 * (-1);
                }
                return j10 + j14 + j11;
            }
            if (j12 != 0) {
                j11 = j14;
            }
            return j10 + j11;
        }
        long j15 = this.f20205n;
        if (j15 == 0) {
            j15 = System.currentTimeMillis();
        }
        return j15 + this.f20198g;
    }

    public boolean b() {
        return !androidx.work.c.f7423i.equals(this.f20201j);
    }

    public boolean c() {
        if (this.f20193b == u.a.ENQUEUED && this.f20202k > 0) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.f20199h != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f20198g != pVar.f20198g || this.f20199h != pVar.f20199h || this.f20200i != pVar.f20200i || this.f20202k != pVar.f20202k || this.f20204m != pVar.f20204m || this.f20205n != pVar.f20205n || this.f20206o != pVar.f20206o || this.f20207p != pVar.f20207p || this.f20208q != pVar.f20208q || !this.f20192a.equals(pVar.f20192a) || this.f20193b != pVar.f20193b || !this.f20194c.equals(pVar.f20194c)) {
            return false;
        }
        String str = this.f20195d;
        if (str == null ? pVar.f20195d != null : !str.equals(pVar.f20195d)) {
            return false;
        }
        if (this.f20196e.equals(pVar.f20196e) && this.f20197f.equals(pVar.f20197f) && this.f20201j.equals(pVar.f20201j) && this.f20203l == pVar.f20203l && this.f20209r == pVar.f20209r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((((this.f20192a.hashCode() * 31) + this.f20193b.hashCode()) * 31) + this.f20194c.hashCode()) * 31;
        String str = this.f20195d;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (((((hashCode + i10) * 31) + this.f20196e.hashCode()) * 31) + this.f20197f.hashCode()) * 31;
        long j10 = this.f20198g;
        int i11 = (hashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f20199h;
        int i12 = (i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f20200i;
        int hashCode3 = (((((((i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f20201j.hashCode()) * 31) + this.f20202k) * 31) + this.f20203l.hashCode()) * 31;
        long j13 = this.f20204m;
        int i13 = (hashCode3 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f20205n;
        int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f20206o;
        int i15 = (i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f20207p;
        return ((((i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f20208q ? 1 : 0)) * 31) + this.f20209r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f20192a + "}";
    }

    public p(p pVar) {
        this.f20193b = u.a.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f7444c;
        this.f20196e = eVar;
        this.f20197f = eVar;
        this.f20201j = androidx.work.c.f7423i;
        this.f20203l = androidx.work.a.EXPONENTIAL;
        this.f20204m = 30000L;
        this.f20207p = -1L;
        this.f20209r = androidx.work.p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f20192a = pVar.f20192a;
        this.f20194c = pVar.f20194c;
        this.f20193b = pVar.f20193b;
        this.f20195d = pVar.f20195d;
        this.f20196e = new androidx.work.e(pVar.f20196e);
        this.f20197f = new androidx.work.e(pVar.f20197f);
        this.f20198g = pVar.f20198g;
        this.f20199h = pVar.f20199h;
        this.f20200i = pVar.f20200i;
        this.f20201j = new androidx.work.c(pVar.f20201j);
        this.f20202k = pVar.f20202k;
        this.f20203l = pVar.f20203l;
        this.f20204m = pVar.f20204m;
        this.f20205n = pVar.f20205n;
        this.f20206o = pVar.f20206o;
        this.f20207p = pVar.f20207p;
        this.f20208q = pVar.f20208q;
        this.f20209r = pVar.f20209r;
    }
}
