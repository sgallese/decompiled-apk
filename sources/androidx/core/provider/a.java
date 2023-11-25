package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final g.c f3957a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3958b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* renamed from: androidx.core.provider.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0073a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g.c f3959f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Typeface f3960m;

        RunnableC0073a(g.c cVar, Typeface typeface) {
            this.f3959f = cVar;
            this.f3960m = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3959f.b(this.f3960m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CallbackWithHandler.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g.c f3962f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f3963m;

        b(g.c cVar, int i10) {
            this.f3962f = cVar;
            this.f3963m = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3962f.a(this.f3963m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(g.c cVar, Handler handler) {
        this.f3957a = cVar;
        this.f3958b = handler;
    }

    private void a(int i10) {
        this.f3958b.post(new b(this.f3957a, i10));
    }

    private void c(Typeface typeface) {
        this.f3958b.post(new RunnableC0073a(this.f3957a, typeface));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f3986a);
        } else {
            a(eVar.f3987b);
        }
    }
}
