package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzm;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9109a;

    /* renamed from: b  reason: collision with root package name */
    private String f9110b;

    /* renamed from: c  reason: collision with root package name */
    private String f9111c;

    /* renamed from: d  reason: collision with root package name */
    private C0227c f9112d;

    /* renamed from: e  reason: collision with root package name */
    private zzu f9113e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f9114f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9115g;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f9116a;

        /* renamed from: b  reason: collision with root package name */
        private String f9117b;

        /* renamed from: c  reason: collision with root package name */
        private List f9118c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList f9119d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f9120e;

        /* renamed from: f  reason: collision with root package name */
        private C0227c.a f9121f;

        /* synthetic */ a(x5.r rVar) {
            C0227c.a a10 = C0227c.a();
            C0227c.a.b(a10);
            this.f9121f = a10;
        }

        public c a() {
            boolean z10;
            boolean z11;
            ArrayList arrayList;
            zzu zzk;
            ArrayList arrayList2 = this.f9119d;
            boolean z12 = true;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            List list = this.f9118c;
            if (list != null && !list.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && !z11) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z10 && z11) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            x5.w wVar = null;
            if (z10) {
                if (!this.f9119d.contains(null)) {
                    if (this.f9119d.size() > 1) {
                        SkuDetails skuDetails = (SkuDetails) this.f9119d.get(0);
                        String b10 = skuDetails.b();
                        ArrayList arrayList3 = this.f9119d;
                        int size = arrayList3.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i10);
                            if (!b10.equals("play_pass_subs") && !skuDetails2.b().equals("play_pass_subs") && !b10.equals(skuDetails2.b())) {
                                throw new IllegalArgumentException("SKUs should have the same type.");
                            }
                        }
                        String f10 = skuDetails.f();
                        ArrayList arrayList4 = this.f9119d;
                        int size2 = arrayList4.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i11);
                            if (!b10.equals("play_pass_subs") && !skuDetails3.b().equals("play_pass_subs") && !f10.equals(skuDetails3.f())) {
                                throw new IllegalArgumentException("All SKUs must have the same package name.");
                            }
                        }
                    }
                } else {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
            } else {
                b bVar = (b) this.f9118c.get(0);
                for (int i12 = 0; i12 < this.f9118c.size(); i12++) {
                    b bVar2 = (b) this.f9118c.get(i12);
                    if (bVar2 != null) {
                        if (i12 != 0 && !bVar2.b().c().equals(bVar.b().c()) && !bVar2.b().c().equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    } else {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                }
                String e10 = bVar.b().e();
                for (b bVar3 : this.f9118c) {
                    if (!bVar.b().c().equals("play_pass_subs") && !bVar3.b().c().equals("play_pass_subs") && !e10.equals(bVar3.b().e())) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            }
            c cVar = new c(wVar);
            if ((!z10 || ((SkuDetails) this.f9119d.get(0)).f().isEmpty()) && (!z11 || ((b) this.f9118c.get(0)).b().e().isEmpty())) {
                z12 = false;
            }
            cVar.f9109a = z12;
            cVar.f9110b = this.f9116a;
            cVar.f9111c = this.f9117b;
            cVar.f9112d = this.f9121f.a();
            ArrayList arrayList5 = this.f9119d;
            if (arrayList5 != null) {
                arrayList = new ArrayList(arrayList5);
            } else {
                arrayList = new ArrayList();
            }
            cVar.f9114f = arrayList;
            cVar.f9115g = this.f9120e;
            List list2 = this.f9118c;
            if (list2 != null) {
                zzk = zzu.zzj(list2);
            } else {
                zzk = zzu.zzk();
            }
            cVar.f9113e = zzk;
            return cVar;
        }

        public a b(List<b> list) {
            this.f9118c = new ArrayList(list);
            return this;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final e f9122a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9123b;

        /* compiled from: com.android.billingclient:billing@@6.0.1 */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private e f9124a;

            /* renamed from: b  reason: collision with root package name */
            private String f9125b;

            /* synthetic */ a(x5.s sVar) {
            }

            public b a() {
                zzm.zzc(this.f9124a, "ProductDetails is required for constructing ProductDetailsParams.");
                zzm.zzc(this.f9125b, "offerToken is required for constructing ProductDetailsParams.");
                return new b(this, null);
            }

            public a b(String str) {
                this.f9125b = str;
                return this;
            }

            public a c(e eVar) {
                this.f9124a = eVar;
                if (eVar.a() != null) {
                    eVar.a().getClass();
                    this.f9125b = eVar.a().c();
                }
                return this;
            }
        }

        /* synthetic */ b(a aVar, x5.t tVar) {
            this.f9122a = aVar.f9124a;
            this.f9123b = aVar.f9125b;
        }

        public static a a() {
            return new a(null);
        }

        public final e b() {
            return this.f9122a;
        }

        public final String c() {
            return this.f9123b;
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* renamed from: com.android.billingclient.api.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0227c {

        /* renamed from: a  reason: collision with root package name */
        private String f9126a;

        /* renamed from: b  reason: collision with root package name */
        private String f9127b;

        /* renamed from: c  reason: collision with root package name */
        private int f9128c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f9129d = 0;

        /* compiled from: com.android.billingclient:billing@@6.0.1 */
        /* renamed from: com.android.billingclient.api.c$c$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private String f9130a;

            /* renamed from: b  reason: collision with root package name */
            private String f9131b;

            /* renamed from: c  reason: collision with root package name */
            private boolean f9132c;

            /* renamed from: d  reason: collision with root package name */
            private int f9133d = 0;

            /* renamed from: e  reason: collision with root package name */
            private int f9134e = 0;

            /* synthetic */ a(x5.u uVar) {
            }

            static /* synthetic */ a b(a aVar) {
                aVar.f9132c = true;
                return aVar;
            }

            public C0227c a() {
                boolean z10;
                x5.v vVar = null;
                if (TextUtils.isEmpty(this.f9130a) && TextUtils.isEmpty(null)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                boolean isEmpty = true ^ TextUtils.isEmpty(this.f9131b);
                if (z10 && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f9132c && !z10 && !isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C0227c c0227c = new C0227c(vVar);
                c0227c.f9126a = this.f9130a;
                c0227c.f9128c = this.f9133d;
                c0227c.f9129d = this.f9134e;
                c0227c.f9127b = this.f9131b;
                return c0227c;
            }
        }

        /* synthetic */ C0227c(x5.v vVar) {
        }

        public static a a() {
            return new a(null);
        }

        @Deprecated
        final int b() {
            return this.f9128c;
        }

        final int c() {
            return this.f9129d;
        }

        final String d() {
            return this.f9126a;
        }

        final String e() {
            return this.f9127b;
        }
    }

    /* synthetic */ c(x5.w wVar) {
    }

    public static a a() {
        return new a(null);
    }

    @Deprecated
    public final int b() {
        return this.f9112d.b();
    }

    public final int c() {
        return this.f9112d.c();
    }

    public final String d() {
        return this.f9110b;
    }

    public final String e() {
        return this.f9111c;
    }

    public final String f() {
        return this.f9112d.d();
    }

    public final String g() {
        return this.f9112d.e();
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f9114f);
        return arrayList;
    }

    public final List i() {
        return this.f9113e;
    }

    public final boolean q() {
        return this.f9115g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r() {
        if (this.f9110b == null && this.f9111c == null && this.f9112d.e() == null && this.f9112d.b() == 0 && this.f9112d.c() == 0 && !this.f9109a && !this.f9115g) {
            return false;
        }
        return true;
    }
}
