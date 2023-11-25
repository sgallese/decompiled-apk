package ad;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes4.dex */
final class z {

    /* renamed from: a  reason: collision with root package name */
    public final Object f582a;

    /* renamed from: b  reason: collision with root package name */
    public final k f583b;

    /* renamed from: c  reason: collision with root package name */
    public final pc.l<Throwable, dc.w> f584c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f585d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f586e;

    /* JADX WARN: Multi-variable type inference failed */
    public z(Object obj, k kVar, pc.l<? super Throwable, dc.w> lVar, Object obj2, Throwable th) {
        this.f582a = obj;
        this.f583b = kVar;
        this.f584c = lVar;
        this.f585d = obj2;
        this.f586e = th;
    }

    public static /* synthetic */ z b(z zVar, Object obj, k kVar, pc.l lVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = zVar.f582a;
        }
        if ((i10 & 2) != 0) {
            kVar = zVar.f583b;
        }
        k kVar2 = kVar;
        pc.l<Throwable, dc.w> lVar2 = lVar;
        if ((i10 & 4) != 0) {
            lVar2 = zVar.f584c;
        }
        pc.l lVar3 = lVar2;
        if ((i10 & 8) != 0) {
            obj2 = zVar.f585d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = zVar.f586e;
        }
        return zVar.a(obj, kVar2, lVar3, obj4, th);
    }

    public final z a(Object obj, k kVar, pc.l<? super Throwable, dc.w> lVar, Object obj2, Throwable th) {
        return new z(obj, kVar, lVar, obj2, th);
    }

    public final boolean c() {
        if (this.f586e != null) {
            return true;
        }
        return false;
    }

    public final void d(n<?> nVar, Throwable th) {
        k kVar = this.f583b;
        if (kVar != null) {
            nVar.k(kVar, th);
        }
        pc.l<Throwable, dc.w> lVar = this.f584c;
        if (lVar != null) {
            nVar.l(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (qc.q.d(this.f582a, zVar.f582a) && qc.q.d(this.f583b, zVar.f583b) && qc.q.d(this.f584c, zVar.f584c) && qc.q.d(this.f585d, zVar.f585d) && qc.q.d(this.f586e, zVar.f586e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Object obj = this.f582a;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        k kVar = this.f583b;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        pc.l<Throwable, dc.w> lVar = this.f584c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Object obj2 = this.f585d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Throwable th = this.f586e;
        if (th != null) {
            i10 = th.hashCode();
        }
        return i14 + i10;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f582a + ", cancelHandler=" + this.f583b + ", onCancellation=" + this.f584c + ", idempotentResume=" + this.f585d + ", cancelCause=" + this.f586e + ')';
    }

    public /* synthetic */ z(Object obj, k kVar, pc.l lVar, Object obj2, Throwable th, int i10, qc.h hVar) {
        this(obj, (i10 & 2) != 0 ? null : kVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
