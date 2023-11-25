package q3;

import ad.a1;
import ad.g;
import ad.k0;
import ad.l0;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.h;
import qc.q;
import s3.n;
import s3.o;

/* compiled from: MeasurementManagerFutures.kt */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f21359a = new b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MeasurementManagerFutures.kt */
    /* renamed from: q3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0479a extends a {

        /* renamed from: b  reason: collision with root package name */
        private final n f21360b;

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {122}, m = "invokeSuspend")
        /* renamed from: q3.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0480a extends l implements p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f21361f;

            C0480a(s3.a aVar, Continuation<? super C0480a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new C0480a(null, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((C0480a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f21361f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    n nVar = C0479a.this.f21360b;
                    this.f21361f = 1;
                    if (nVar.a(null, this) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {169}, m = "invokeSuspend")
        /* renamed from: q3.a$a$b */
        /* loaded from: classes.dex */
        static final class b extends l implements p<k0, Continuation<? super Integer>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f21363f;

            b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new b(continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super Integer> continuation) {
                return ((b) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f21363f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    n nVar = C0479a.this.f21360b;
                    this.f21363f = 1;
                    obj = nVar.b(this);
                    if (obj == d10) {
                        return d10;
                    }
                }
                return obj;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {133}, m = "invokeSuspend")
        /* renamed from: q3.a$a$c */
        /* loaded from: classes.dex */
        static final class c extends l implements p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f21365f;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ Uri f21367p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ InputEvent f21368q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f21367p = uri;
                this.f21368q = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new c(this.f21367p, this.f21368q, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((c) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f21365f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    n nVar = C0479a.this.f21360b;
                    Uri uri = this.f21367p;
                    InputEvent inputEvent = this.f21368q;
                    this.f21365f = 1;
                    if (nVar.c(uri, inputEvent, this) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {141}, m = "invokeSuspend")
        /* renamed from: q3.a$a$d */
        /* loaded from: classes.dex */
        static final class d extends l implements p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f21369f;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ Uri f21371p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Uri uri, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f21371p = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new d(this.f21371p, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((d) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f21369f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    n nVar = C0479a.this.f21360b;
                    Uri uri = this.f21371p;
                    this.f21369f = 1;
                    if (nVar.d(uri, this) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {151}, m = "invokeSuspend")
        /* renamed from: q3.a$a$e */
        /* loaded from: classes.dex */
        static final class e extends l implements p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f21372f;

            e(o oVar, Continuation<? super e> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new e(null, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((e) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f21372f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    n nVar = C0479a.this.f21360b;
                    this.f21372f = 1;
                    if (nVar.e(null, this) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {161}, m = "invokeSuspend")
        /* renamed from: q3.a$a$f */
        /* loaded from: classes.dex */
        static final class f extends l implements p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f21374f;

            f(s3.p pVar, Continuation<? super f> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new f(null, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((f) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f21374f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    n nVar = C0479a.this.f21360b;
                    this.f21374f = 1;
                    if (nVar.f(null, this) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        public C0479a(n nVar) {
            q.i(nVar, "mMeasurementManager");
            this.f21360b = nVar;
        }

        @Override // q3.a
        public com.google.common.util.concurrent.a<Integer> b() {
            return p3.b.c(g.b(l0.a(a1.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // q3.a
        public com.google.common.util.concurrent.a<w> c(Uri uri, InputEvent inputEvent) {
            q.i(uri, "attributionSource");
            return p3.b.c(g.b(l0.a(a1.a()), null, null, new c(uri, inputEvent, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.a<w> e(s3.a aVar) {
            q.i(aVar, "deletionRequest");
            return p3.b.c(g.b(l0.a(a1.a()), null, null, new C0480a(aVar, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.a<w> f(Uri uri) {
            q.i(uri, "trigger");
            return p3.b.c(g.b(l0.a(a1.a()), null, null, new d(uri, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.a<w> g(o oVar) {
            q.i(oVar, "request");
            return p3.b.c(g.b(l0.a(a1.a()), null, null, new e(oVar, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.a<w> h(s3.p pVar) {
            q.i(pVar, "request");
            return p3.b.c(g.b(l0.a(a1.a()), null, null, new f(pVar, null), 3, null), null, 1, null);
        }
    }

    /* compiled from: MeasurementManagerFutures.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }

        public final a a(Context context) {
            q.i(context, "context");
            n a10 = n.f22944a.a(context);
            if (a10 != null) {
                return new C0479a(a10);
            }
            return null;
        }
    }

    public static final a a(Context context) {
        return f21359a.a(context);
    }

    public abstract com.google.common.util.concurrent.a<Integer> b();

    public abstract com.google.common.util.concurrent.a<w> c(Uri uri, InputEvent inputEvent);
}
