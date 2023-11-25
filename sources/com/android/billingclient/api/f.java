package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzu;
import java.util.HashSet;
import java.util.List;
import x5.j0;
import x5.k0;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final zzu f9186a;

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private zzu f9187a;

        /* synthetic */ a(x5.h0 h0Var) {
        }

        public f a() {
            return new f(this, null);
        }

        public a b(List<b> list) {
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (b bVar : list) {
                    if (!"play_pass_subs".equals(bVar.c())) {
                        hashSet.add(bVar.c());
                    }
                }
                if (hashSet.size() <= 1) {
                    this.f9187a = zzu.zzj(list);
                    return this;
                }
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
    }

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f9188a;

        /* renamed from: b  reason: collision with root package name */
        private final String f9189b;

        /* compiled from: com.android.billingclient:billing@@6.0.1 */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private String f9190a;

            /* renamed from: b  reason: collision with root package name */
            private String f9191b;

            /* synthetic */ a(x5.i0 i0Var) {
            }

            public b a() {
                if (!"first_party".equals(this.f9191b)) {
                    if (this.f9190a != null) {
                        if (this.f9191b != null) {
                            return new b(this, null);
                        }
                        throw new IllegalArgumentException("Product type must be provided.");
                    }
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
            }

            public a b(String str) {
                this.f9190a = str;
                return this;
            }

            public a c(String str) {
                this.f9191b = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, j0 j0Var) {
            this.f9188a = aVar.f9190a;
            this.f9189b = aVar.f9191b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.f9188a;
        }

        public final String c() {
            return this.f9189b;
        }
    }

    /* synthetic */ f(a aVar, k0 k0Var) {
        this.f9186a = aVar.f9187a;
    }

    public static a a() {
        return new a(null);
    }

    public final zzu b() {
        return this.f9186a;
    }

    public final String c() {
        return ((b) this.f9186a.get(0)).c();
    }
}
