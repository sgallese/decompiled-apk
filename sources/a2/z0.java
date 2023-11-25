package a2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j0.g3;

/* compiled from: FontFamilyResolver.kt */
/* loaded from: classes.dex */
public interface z0 extends g3<Object> {

    /* compiled from: FontFamilyResolver.kt */
    /* loaded from: classes.dex */
    public static final class a implements z0, g3<Object> {

        /* renamed from: f  reason: collision with root package name */
        private final g f358f;

        public a(g gVar) {
            qc.q.i(gVar, "current");
            this.f358f = gVar;
        }

        @Override // a2.z0
        public boolean g() {
            return this.f358f.f();
        }

        @Override // j0.g3
        public Object getValue() {
            return this.f358f.getValue();
        }
    }

    boolean g();

    /* compiled from: FontFamilyResolver.kt */
    /* loaded from: classes.dex */
    public static final class b implements z0 {

        /* renamed from: f  reason: collision with root package name */
        private final Object f359f;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f360m;

        public b(Object obj, boolean z10) {
            qc.q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this.f359f = obj;
            this.f360m = z10;
        }

        @Override // a2.z0
        public boolean g() {
            return this.f360m;
        }

        @Override // j0.g3
        public Object getValue() {
            return this.f359f;
        }

        public /* synthetic */ b(Object obj, boolean z10, int i10, qc.h hVar) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }
    }
}
