package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: ViewCompositionStrategy.android.kt */
/* loaded from: classes.dex */
public interface e4 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2657a = a.f2658a;

    /* compiled from: ViewCompositionStrategy.android.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f2658a = new a();

        private a() {
        }

        public final e4 a() {
            return b.f2659b;
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    /* loaded from: classes.dex */
    public static final class b implements e4 {

        /* renamed from: b  reason: collision with root package name */
        public static final b f2659b = new b();

        /* compiled from: ViewCompositionStrategy.android.kt */
        /* loaded from: classes.dex */
        static final class a extends qc.r implements pc.a<dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f2660f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0041b f2661m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ x2.b f2662p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.a aVar, ViewOnAttachStateChangeListenerC0041b viewOnAttachStateChangeListenerC0041b, x2.b bVar) {
                super(0);
                this.f2660f = aVar;
                this.f2661m = viewOnAttachStateChangeListenerC0041b;
                this.f2662p = bVar;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f2660f.removeOnAttachStateChangeListener(this.f2661m);
                x2.a.g(this.f2660f, this.f2662p);
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        /* renamed from: androidx.compose.ui.platform.e4$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewOnAttachStateChangeListenerC0041b implements View.OnAttachStateChangeListener {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f2663f;

            ViewOnAttachStateChangeListenerC0041b(androidx.compose.ui.platform.a aVar) {
                this.f2663f = aVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                qc.q.i(view, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                qc.q.i(view, "v");
                if (!x2.a.f(this.f2663f)) {
                    this.f2663f.e();
                }
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        /* loaded from: classes.dex */
        static final class c implements x2.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f2664a;

            c(androidx.compose.ui.platform.a aVar) {
                this.f2664a = aVar;
            }

            @Override // x2.b
            public final void b() {
                this.f2664a.e();
            }
        }

        private b() {
        }

        @Override // androidx.compose.ui.platform.e4
        public pc.a<dc.w> a(androidx.compose.ui.platform.a aVar) {
            qc.q.i(aVar, "view");
            ViewOnAttachStateChangeListenerC0041b viewOnAttachStateChangeListenerC0041b = new ViewOnAttachStateChangeListenerC0041b(aVar);
            aVar.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0041b);
            c cVar = new c(aVar);
            x2.a.a(aVar, cVar);
            return new a(aVar, viewOnAttachStateChangeListenerC0041b, cVar);
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    /* loaded from: classes.dex */
    public static final class c implements e4 {

        /* renamed from: b  reason: collision with root package name */
        public static final c f2665b = new c();

        /* compiled from: ViewCompositionStrategy.android.kt */
        /* loaded from: classes.dex */
        static final class a extends qc.r implements pc.a<dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f2666f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ ViewOnAttachStateChangeListenerC0042c f2667m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.a aVar, ViewOnAttachStateChangeListenerC0042c viewOnAttachStateChangeListenerC0042c) {
                super(0);
                this.f2666f = aVar;
                this.f2667m = viewOnAttachStateChangeListenerC0042c;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f2666f.removeOnAttachStateChangeListener(this.f2667m);
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        /* loaded from: classes.dex */
        static final class b extends qc.r implements pc.a<dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ qc.f0<pc.a<dc.w>> f2668f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(qc.f0<pc.a<dc.w>> f0Var) {
                super(0);
                this.f2668f = f0Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f2668f.f21676f.invoke();
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        /* renamed from: androidx.compose.ui.platform.e4$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewOnAttachStateChangeListenerC0042c implements View.OnAttachStateChangeListener {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.a f2669f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ qc.f0<pc.a<dc.w>> f2670m;

            ViewOnAttachStateChangeListenerC0042c(androidx.compose.ui.platform.a aVar, qc.f0<pc.a<dc.w>> f0Var) {
                this.f2669f = aVar;
                this.f2670m = f0Var;
            }

            /* JADX WARN: Type inference failed for: r3v7, types: [pc.a, T] */
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                qc.q.i(view, "v");
                androidx.lifecycle.v a10 = androidx.lifecycle.d1.a(this.f2669f);
                androidx.compose.ui.platform.a aVar = this.f2669f;
                if (a10 != null) {
                    this.f2670m.f21676f = ViewCompositionStrategy_androidKt.a(aVar, a10.getLifecycle());
                    this.f2669f.removeOnAttachStateChangeListener(this);
                    return;
                }
                throw new IllegalStateException(("View tree for " + aVar + " has no ViewTreeLifecycleOwner").toString());
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                qc.q.i(view, "v");
            }
        }

        private c() {
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.e4$c$a] */
        @Override // androidx.compose.ui.platform.e4
        public pc.a<dc.w> a(androidx.compose.ui.platform.a aVar) {
            qc.q.i(aVar, "view");
            if (aVar.isAttachedToWindow()) {
                androidx.lifecycle.v a10 = androidx.lifecycle.d1.a(aVar);
                if (a10 != null) {
                    return ViewCompositionStrategy_androidKt.a(aVar, a10.getLifecycle());
                }
                throw new IllegalStateException(("View tree for " + aVar + " has no ViewTreeLifecycleOwner").toString());
            }
            qc.f0 f0Var = new qc.f0();
            ViewOnAttachStateChangeListenerC0042c viewOnAttachStateChangeListenerC0042c = new ViewOnAttachStateChangeListenerC0042c(aVar, f0Var);
            aVar.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0042c);
            f0Var.f21676f = new a(aVar, viewOnAttachStateChangeListenerC0042c);
            return new b(f0Var);
        }
    }

    pc.a<dc.w> a(androidx.compose.ui.platform.a aVar);
}
