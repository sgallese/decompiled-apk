package androidx.compose.ui.platform;

import android.view.View;

/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes.dex */
public interface v4 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2857a = a.f2858a;

    /* compiled from: WindowRecomposer.android.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f2858a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final v4 f2859b = C0044a.f2860b;

        /* compiled from: WindowRecomposer.android.kt */
        /* renamed from: androidx.compose.ui.platform.v4$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0044a implements v4 {

            /* renamed from: b  reason: collision with root package name */
            public static final C0044a f2860b = new C0044a();

            C0044a() {
            }

            @Override // androidx.compose.ui.platform.v4
            public final j0.b2 a(View view) {
                qc.q.i(view, "rootView");
                return WindowRecomposer_androidKt.c(view, null, null, 3, null);
            }
        }

        private a() {
        }

        public final v4 a() {
            return f2859b;
        }
    }

    j0.b2 a(View view);
}
