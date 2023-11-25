package x5;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.android.billingclient.api.Purchase;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: com.android.billingclient:billing-ktx@@6.0.1 */
/* loaded from: classes.dex */
public final class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.android.billingclient:billing-ktx@@6.0.1 */
    /* loaded from: classes.dex */
    public static final class a implements x5.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad.v<com.android.billingclient.api.d> f25811a;

        a(ad.v<com.android.billingclient.api.d> vVar) {
            this.f25811a = vVar;
        }

        @Override // x5.b
        public final void a(com.android.billingclient.api.d dVar) {
            ad.v<com.android.billingclient.api.d> vVar = this.f25811a;
            qc.q.h(dVar, "it");
            vVar.i0(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.android.billingclient:billing-ktx@@6.0.1 */
    /* loaded from: classes.dex */
    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad.v<h> f25812a;

        b(ad.v<h> vVar) {
            this.f25812a = vVar;
        }

        @Override // x5.g
        public final void a(com.android.billingclient.api.d dVar, String str) {
            qc.q.h(dVar, "billingResult");
            this.f25812a.i0(new h(dVar, str));
        }
    }

    /* compiled from: com.android.billingclient:billing-ktx@@6.0.1 */
    /* loaded from: classes.dex */
    static final class c implements j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad.v<k> f25813a;

        c(ad.v<k> vVar) {
            this.f25813a = vVar;
        }

        @Override // x5.j
        public final void a(com.android.billingclient.api.d dVar, List<com.android.billingclient.api.e> list) {
            qc.q.h(dVar, "billingResult");
            this.f25813a.i0(new k(dVar, list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.android.billingclient:billing-ktx@@6.0.1 */
    /* renamed from: x5.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0587d implements l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad.v<m> f25814a;

        C0587d(ad.v<m> vVar) {
            this.f25814a = vVar;
        }

        @Override // x5.l
        public final void onQueryPurchasesResponse(com.android.billingclient.api.d dVar, List<Purchase> list) {
            qc.q.h(dVar, "billingResult");
            qc.q.h(list, "purchases");
            this.f25814a.i0(new m(dVar, list));
        }
    }

    @RecentlyNullable
    public static final Object a(@RecentlyNonNull com.android.billingclient.api.a aVar, @RecentlyNonNull x5.a aVar2, @RecentlyNonNull Continuation<? super com.android.billingclient.api.d> continuation) {
        ad.v b10 = ad.x.b(null, 1, null);
        aVar.a(aVar2, new a(b10));
        return b10.E(continuation);
    }

    @RecentlyNullable
    public static final Object b(@RecentlyNonNull com.android.billingclient.api.a aVar, @RecentlyNonNull f fVar, @RecentlyNonNull Continuation<? super h> continuation) {
        ad.v b10 = ad.x.b(null, 1, null);
        aVar.b(fVar, new b(b10));
        return b10.E(continuation);
    }

    @RecentlyNullable
    public static final Object c(@RecentlyNonNull com.android.billingclient.api.a aVar, @RecentlyNonNull com.android.billingclient.api.f fVar, @RecentlyNonNull Continuation<? super k> continuation) {
        ad.v b10 = ad.x.b(null, 1, null);
        aVar.h(fVar, new c(b10));
        return b10.E(continuation);
    }

    @RecentlyNullable
    public static final Object d(@RecentlyNonNull com.android.billingclient.api.a aVar, @RecentlyNonNull o oVar, @RecentlyNonNull Continuation<? super m> continuation) {
        ad.v b10 = ad.x.b(null, 1, null);
        aVar.i(oVar, new C0587d(b10));
        return b10.E(continuation);
    }
}
