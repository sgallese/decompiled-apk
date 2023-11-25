package s3;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.core.os.s;
import dc.w;
import kotlin.coroutines.Continuation;
import qc.q;

/* compiled from: MeasurementManager.kt */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final b f22944a = new b(null);

    /* compiled from: MeasurementManager.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final n a(Context context) {
            q.i(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            o3.b bVar = o3.b.f20470a;
            sb2.append(bVar.a());
            Log.d("MeasurementManager", sb2.toString());
            if (bVar.a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }

    public abstract Object a(s3.a aVar, Continuation<? super w> continuation);

    public abstract Object b(Continuation<? super Integer> continuation);

    public abstract Object c(Uri uri, InputEvent inputEvent, Continuation<? super w> continuation);

    public abstract Object d(Uri uri, Continuation<? super w> continuation);

    public abstract Object e(o oVar, Continuation<? super w> continuation);

    public abstract Object f(p pVar, Continuation<? super w> continuation);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MeasurementManager.kt */
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* loaded from: classes.dex */
    public static final class a extends n {

        /* renamed from: b  reason: collision with root package name */
        private final MeasurementManager f22945b;

        public a(MeasurementManager measurementManager) {
            q.i(measurementManager, "mMeasurementManager");
            this.f22945b = measurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeletionRequest k(s3.a aVar) {
            c.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(o oVar) {
            k.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(p pVar) {
            l.a();
            throw null;
        }

        @Override // s3.n
        public Object a(s3.a aVar, Continuation<? super w> continuation) {
            Continuation c10;
            Object d10;
            Object d11;
            c10 = ic.c.c(continuation);
            ad.n nVar = new ad.n(c10, 1);
            nVar.A();
            this.f22945b.deleteRegistrations(k(aVar), new m(), s.a(nVar));
            Object x10 = nVar.x();
            d10 = ic.d.d();
            if (x10 == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            d11 = ic.d.d();
            if (x10 == d11) {
                return x10;
            }
            return w.f13270a;
        }

        @Override // s3.n
        public Object b(Continuation<? super Integer> continuation) {
            Continuation c10;
            Object d10;
            c10 = ic.c.c(continuation);
            ad.n nVar = new ad.n(c10, 1);
            nVar.A();
            this.f22945b.getMeasurementApiStatus(new m(), s.a(nVar));
            Object x10 = nVar.x();
            d10 = ic.d.d();
            if (x10 == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            return x10;
        }

        @Override // s3.n
        public Object c(Uri uri, InputEvent inputEvent, Continuation<? super w> continuation) {
            Continuation c10;
            Object d10;
            Object d11;
            c10 = ic.c.c(continuation);
            ad.n nVar = new ad.n(c10, 1);
            nVar.A();
            this.f22945b.registerSource(uri, inputEvent, new m(), s.a(nVar));
            Object x10 = nVar.x();
            d10 = ic.d.d();
            if (x10 == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            d11 = ic.d.d();
            if (x10 == d11) {
                return x10;
            }
            return w.f13270a;
        }

        @Override // s3.n
        public Object d(Uri uri, Continuation<? super w> continuation) {
            Continuation c10;
            Object d10;
            Object d11;
            c10 = ic.c.c(continuation);
            ad.n nVar = new ad.n(c10, 1);
            nVar.A();
            this.f22945b.registerTrigger(uri, new m(), s.a(nVar));
            Object x10 = nVar.x();
            d10 = ic.d.d();
            if (x10 == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            d11 = ic.d.d();
            if (x10 == d11) {
                return x10;
            }
            return w.f13270a;
        }

        @Override // s3.n
        public Object e(o oVar, Continuation<? super w> continuation) {
            Continuation c10;
            Object d10;
            Object d11;
            c10 = ic.c.c(continuation);
            ad.n nVar = new ad.n(c10, 1);
            nVar.A();
            this.f22945b.registerWebSource(l(oVar), new m(), s.a(nVar));
            Object x10 = nVar.x();
            d10 = ic.d.d();
            if (x10 == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            d11 = ic.d.d();
            if (x10 == d11) {
                return x10;
            }
            return w.f13270a;
        }

        @Override // s3.n
        public Object f(p pVar, Continuation<? super w> continuation) {
            Continuation c10;
            Object d10;
            Object d11;
            c10 = ic.c.c(continuation);
            ad.n nVar = new ad.n(c10, 1);
            nVar.A();
            this.f22945b.registerWebTrigger(m(pVar), new m(), s.a(nVar));
            Object x10 = nVar.x();
            d10 = ic.d.d();
            if (x10 == d10) {
                kotlin.coroutines.jvm.internal.h.c(continuation);
            }
            d11 = ic.d.d();
            if (x10 == d11) {
                return x10;
            }
            return w.f13270a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                qc.q.i(r2, r0)
                java.lang.Class r0 = s3.i.a()
                java.lang.Object r2 = w0.b.a(r2, r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                qc.q.h(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = s3.j.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s3.n.a.<init>(android.content.Context):void");
        }
    }
}
