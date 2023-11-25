package s0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: Saver.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final i<Object, Object> f22933a = a(a.f22934f, b.f22935f);

    /* compiled from: Saver.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements p<k, Object, Object> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f22934f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(k kVar, Object obj) {
            q.i(kVar, "$this$Saver");
            return obj;
        }
    }

    /* compiled from: Saver.kt */
    /* loaded from: classes.dex */
    static final class b extends r implements l<Object, Object> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f22935f = new b();

        b() {
            super(1);
        }

        @Override // pc.l
        public final Object invoke(Object obj) {
            q.i(obj, "it");
            return obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    /* compiled from: Saver.kt */
    /* loaded from: classes.dex */
    public static final class c<Original, Saveable> implements i<Original, Saveable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<k, Original, Saveable> f22936a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l<Saveable, Original> f22937b;

        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super k, ? super Original, ? extends Saveable> pVar, l<? super Saveable, ? extends Original> lVar) {
            this.f22936a = pVar;
            this.f22937b = lVar;
        }

        @Override // s0.i
        public Original a(Saveable saveable) {
            q.i(saveable, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            return this.f22937b.invoke(saveable);
        }

        @Override // s0.i
        public Saveable b(k kVar, Original original) {
            q.i(kVar, "<this>");
            return this.f22936a.invoke(kVar, original);
        }
    }

    public static final <Original, Saveable> i<Original, Saveable> a(p<? super k, ? super Original, ? extends Saveable> pVar, l<? super Saveable, ? extends Original> lVar) {
        q.i(pVar, "save");
        q.i(lVar, "restore");
        return new c(pVar, lVar);
    }

    public static final <T> i<T, Object> b() {
        i<T, Object> iVar = (i<T, Object>) f22933a;
        q.g(iVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return iVar;
    }
}
