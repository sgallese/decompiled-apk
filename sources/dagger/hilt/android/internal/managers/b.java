package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.c1;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;

/* compiled from: ActivityRetainedComponentManager.java */
/* loaded from: classes4.dex */
final class b implements ab.b<ta.b> {

    /* renamed from: f  reason: collision with root package name */
    private final c1 f13171f;

    /* renamed from: m  reason: collision with root package name */
    private final Context f13172m;

    /* renamed from: p  reason: collision with root package name */
    private volatile ta.b f13173p;

    /* renamed from: q  reason: collision with root package name */
    private final Object f13174q = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityRetainedComponentManager.java */
    /* loaded from: classes4.dex */
    public class a implements y0.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f13175a;

        a(Context context) {
            this.f13175a = context;
        }

        @Override // androidx.lifecycle.y0.b
        public <T extends v0> T a(Class<T> cls) {
            return new c(((InterfaceC0303b) sa.b.a(this.f13175a, InterfaceC0303b.class)).retainedComponentBuilder().build());
        }

        @Override // androidx.lifecycle.y0.b
        public /* synthetic */ v0 b(Class cls, j3.a aVar) {
            return z0.b(this, cls, aVar);
        }
    }

    /* compiled from: ActivityRetainedComponentManager.java */
    /* renamed from: dagger.hilt.android.internal.managers.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0303b {
        wa.b retainedComponentBuilder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityRetainedComponentManager.java */
    /* loaded from: classes4.dex */
    public static final class c extends v0 {

        /* renamed from: a  reason: collision with root package name */
        private final ta.b f13177a;

        c(ta.b bVar) {
            this.f13177a = bVar;
        }

        ta.b b() {
            return this.f13177a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.v0
        public void onCleared() {
            super.onCleared();
            ((xa.e) ((d) ra.a.a(this.f13177a, d.class)).getActivityRetainedLifecycle()).a();
        }
    }

    /* compiled from: ActivityRetainedComponentManager.java */
    /* loaded from: classes4.dex */
    public interface d {
        sa.a getActivityRetainedLifecycle();
    }

    /* compiled from: ActivityRetainedComponentManager.java */
    /* loaded from: classes4.dex */
    static abstract class e {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static sa.a a() {
            return new xa.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ComponentActivity componentActivity) {
        this.f13171f = componentActivity;
        this.f13172m = componentActivity;
    }

    private ta.b a() {
        return ((c) c(this.f13171f, this.f13172m).a(c.class)).b();
    }

    private y0 c(c1 c1Var, Context context) {
        return new y0(c1Var, new a(context));
    }

    @Override // ab.b
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public ta.b generatedComponent() {
        if (this.f13173p == null) {
            synchronized (this.f13174q) {
                if (this.f13173p == null) {
                    this.f13173p = a();
                }
            }
        }
        return this.f13173p;
    }
}
