package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.platform.p4;
import androidx.compose.ui.platform.q4;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dc.w;
import j0.p;
import pc.l;
import qc.h;
import qc.q;
import qc.r;
import s0.f;

/* compiled from: AndroidView.android.kt */
/* loaded from: classes.dex */
public final class f<T extends View> extends androidx.compose.ui.viewinterop.a implements q4 {
    private final T J;
    private final j1.c K;
    private final s0.f L;
    private final int M;
    private final String N;
    private f.a O;
    private l<? super T, w> P;
    private l<? super T, w> Q;
    private l<? super T, w> R;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements pc.a<Object> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f<T> f3106f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<T> fVar) {
            super(0);
            this.f3106f = fVar;
        }

        @Override // pc.a
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ((f) this.f3106f).J.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements pc.a<w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f<T> f3107f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f<T> fVar) {
            super(0);
            this.f3107f = fVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f3107f.getReleaseBlock().invoke(((f) this.f3107f).J);
            this.f3107f.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends r implements pc.a<w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f<T> f3108f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f<T> fVar) {
            super(0);
            this.f3108f = fVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f3108f.getResetBlock().invoke(((f) this.f3108f).J);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidView.android.kt */
    /* loaded from: classes.dex */
    public static final class d extends r implements pc.a<w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f<T> f3109f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f<T> fVar) {
            super(0);
            this.f3109f = fVar;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f3109f.getUpdateBlock().invoke(((f) this.f3109f).J);
        }
    }

    /* synthetic */ f(Context context, p pVar, View view, j1.c cVar, s0.f fVar, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : pVar, view, (i11 & 8) != 0 ? new j1.c() : cVar, fVar, i10);
    }

    private final void n() {
        s0.f fVar = this.L;
        if (fVar != null) {
            setSavableRegistryEntry(fVar.d(this.N, new a(this)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(f.a aVar) {
        f.a aVar2 = this.O;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.O = aVar;
    }

    public final j1.c getDispatcher() {
        return this.K;
    }

    public final l<T, w> getReleaseBlock() {
        return (l<? super T, w>) this.R;
    }

    public final l<T, w> getResetBlock() {
        return (l<? super T, w>) this.Q;
    }

    public /* bridge */ /* synthetic */ androidx.compose.ui.platform.a getSubCompositionView() {
        return p4.a(this);
    }

    public final l<T, w> getUpdateBlock() {
        return (l<? super T, w>) this.P;
    }

    public final void setReleaseBlock(l<? super T, w> lVar) {
        q.i(lVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.R = lVar;
        setRelease(new b(this));
    }

    public final void setResetBlock(l<? super T, w> lVar) {
        q.i(lVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.Q = lVar;
        setReset(new c(this));
    }

    public final void setUpdateBlock(l<? super T, w> lVar) {
        q.i(lVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.P = lVar;
        setUpdate(new d(this));
    }

    private f(Context context, p pVar, T t10, j1.c cVar, s0.f fVar, int i10) {
        super(context, pVar, i10, cVar, t10);
        this.J = t10;
        this.K = cVar;
        this.L = fVar;
        this.M = i10;
        setClipChildren(false);
        String valueOf = String.valueOf(i10);
        this.N = valueOf;
        Object c10 = fVar != null ? fVar.c(valueOf) : null;
        SparseArray<Parcelable> sparseArray = c10 instanceof SparseArray ? (SparseArray) c10 : null;
        if (sparseArray != null) {
            t10.restoreHierarchyState(sparseArray);
        }
        n();
        this.P = e.e();
        this.Q = e.e();
        this.R = e.e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context, l<? super Context, ? extends T> lVar, p pVar, s0.f fVar, int i10) {
        this(context, pVar, lVar.invoke(context), null, fVar, i10, 8, null);
        q.i(context, "context");
        q.i(lVar, "factory");
    }

    public View getViewRoot() {
        return this;
    }
}
