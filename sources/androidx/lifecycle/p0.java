package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class p0 implements a.c {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.savedstate.a f5032a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5033b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f5034c;

    /* renamed from: d  reason: collision with root package name */
    private final dc.f f5035d;

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<q0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c1 f5036f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c1 c1Var) {
            super(0);
            this.f5036f = c1Var;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final q0 invoke() {
            return o0.e(this.f5036f);
        }
    }

    public p0(androidx.savedstate.a aVar, c1 c1Var) {
        dc.f b10;
        qc.q.i(aVar, "savedStateRegistry");
        qc.q.i(c1Var, "viewModelStoreOwner");
        this.f5032a = aVar;
        b10 = dc.h.b(new a(c1Var));
        this.f5035d = b10;
    }

    private final q0 b() {
        return (q0) this.f5035d.getValue();
    }

    public final Bundle a(String str) {
        Bundle bundle;
        qc.q.i(str, "key");
        c();
        Bundle bundle2 = this.f5034c;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(str);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.f5034c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f5034c;
        boolean z10 = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z10 = true;
        }
        if (z10) {
            this.f5034c = null;
        }
        return bundle;
    }

    public final void c() {
        if (!this.f5033b) {
            Bundle b10 = this.f5032a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f5034c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (b10 != null) {
                bundle.putAll(b10);
            }
            this.f5034c = bundle;
            this.f5033b = true;
            b();
        }
    }

    @Override // androidx.savedstate.a.c
    public Bundle saveState() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5034c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, n0> entry : b().b().entrySet()) {
            String key = entry.getKey();
            Bundle saveState = entry.getValue().h().saveState();
            if (!qc.q.d(saveState, Bundle.EMPTY)) {
                bundle.putBundle(key, saveState);
            }
        }
        this.f5033b = false;
        return bundle;
    }
}
