package r3;

import ad.a1;
import ad.g;
import ad.k0;
import ad.l0;
import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.d;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.h;
import qc.q;

/* compiled from: TopicsManagerFutures.kt */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f22139a = new b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TopicsManagerFutures.kt */
    /* renamed from: r3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0497a extends a {

        /* renamed from: b  reason: collision with root package name */
        private final d f22140b;

        /* compiled from: TopicsManagerFutures.kt */
        @f(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", l = {56}, m = "invokeSuspend")
        /* renamed from: r3.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0498a extends l implements p<k0, Continuation<? super androidx.privacysandbox.ads.adservices.topics.b>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f22141f;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.a f22143p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0498a(androidx.privacysandbox.ads.adservices.topics.a aVar, Continuation<? super C0498a> continuation) {
                super(2, continuation);
                this.f22143p = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new C0498a(this.f22143p, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super androidx.privacysandbox.ads.adservices.topics.b> continuation) {
                return ((C0498a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f22141f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    n.b(obj);
                    d dVar = C0497a.this.f22140b;
                    androidx.privacysandbox.ads.adservices.topics.a aVar = this.f22143p;
                    this.f22141f = 1;
                    obj = dVar.a(aVar, this);
                    if (obj == d10) {
                        return d10;
                    }
                }
                return obj;
            }
        }

        public C0497a(d dVar) {
            q.i(dVar, "mTopicsManager");
            this.f22140b = dVar;
        }

        @Override // r3.a
        public com.google.common.util.concurrent.a<androidx.privacysandbox.ads.adservices.topics.b> b(androidx.privacysandbox.ads.adservices.topics.a aVar) {
            q.i(aVar, "request");
            return p3.b.c(g.b(l0.a(a1.c()), null, null, new C0498a(aVar, null), 3, null), null, 1, null);
        }
    }

    /* compiled from: TopicsManagerFutures.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }

        public final a a(Context context) {
            q.i(context, "context");
            d a10 = d.f6442a.a(context);
            if (a10 != null) {
                return new C0497a(a10);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f22139a.a(context);
    }

    public abstract com.google.common.util.concurrent.a<androidx.privacysandbox.ads.adservices.topics.b> b(androidx.privacysandbox.ads.adservices.topics.a aVar);
}
