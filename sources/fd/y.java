package fd;

import kotlinx.coroutines.internal.UndeliveredElementException;

/* compiled from: OnUndeliveredElement.kt */
/* loaded from: classes4.dex */
public final class y {

    /* compiled from: OnUndeliveredElement.kt */
    /* loaded from: classes4.dex */
    static final class a extends qc.r implements pc.l<Throwable, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l<E, dc.w> f15687f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ E f15688m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ hc.f f15689p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.l<? super E, dc.w> lVar, E e10, hc.f fVar) {
            super(1);
            this.f15687f = lVar;
            this.f15688m = e10;
            this.f15689p = fVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
            invoke2(th);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            y.b(this.f15687f, this.f15688m, this.f15689p);
        }
    }

    public static final <E> pc.l<Throwable, dc.w> a(pc.l<? super E, dc.w> lVar, E e10, hc.f fVar) {
        return new a(lVar, e10, fVar);
    }

    public static final <E> void b(pc.l<? super E, dc.w> lVar, E e10, hc.f fVar) {
        UndeliveredElementException c10 = c(lVar, e10, null);
        if (c10 != null) {
            ad.i0.a(fVar, c10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException c(pc.l<? super E, dc.w> lVar, E e10, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                dc.b.a(undeliveredElementException, th);
            } else {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e10, th);
            }
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException d(pc.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(lVar, obj, undeliveredElementException);
    }
}
