package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import x5.p0;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: com.android.billingclient:billing@@6.0.1 */
    /* renamed from: com.android.billingclient.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0226a {

        /* renamed from: a  reason: collision with root package name */
        private volatile p f9074a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f9075b;

        /* renamed from: c  reason: collision with root package name */
        private volatile x5.n f9076c;

        /* synthetic */ C0226a(Context context, p0 p0Var) {
            this.f9075b = context;
        }

        public a a() {
            if (this.f9075b != null) {
                if (this.f9076c != null) {
                    if (this.f9074a != null) {
                        x5.n nVar = this.f9076c;
                        if (this.f9076c != null) {
                            return new b(null, this.f9074a, this.f9075b, this.f9076c, null, null);
                        }
                        return new b(null, this.f9074a, this.f9075b, null, null);
                    }
                    throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        public C0226a b() {
            o oVar = new o(null);
            oVar.a();
            this.f9074a = oVar.b();
            return this;
        }

        public C0226a c(x5.n nVar) {
            this.f9076c = nVar;
            return this;
        }
    }

    public static C0226a g(Context context) {
        return new C0226a(context, null);
    }

    public abstract void a(x5.a aVar, x5.b bVar);

    public abstract void b(x5.f fVar, x5.g gVar);

    public abstract void c();

    public abstract int d();

    public abstract boolean e();

    public abstract d f(Activity activity, c cVar);

    public abstract void h(f fVar, x5.j jVar);

    public abstract void i(x5.o oVar, x5.l lVar);

    public abstract void j(x5.e eVar);
}
