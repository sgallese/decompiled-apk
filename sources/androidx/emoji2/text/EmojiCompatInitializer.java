package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.v;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements z3.a<Boolean> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends f.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements f.h {

        /* renamed from: a  reason: collision with root package name */
        private final Context f4359a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends f.i {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f.i f4360a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f4361b;

            a(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f4360a = iVar;
                this.f4361b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.f.i
            public void a(Throwable th) {
                try {
                    this.f4360a.a(th);
                } finally {
                    this.f4361b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.f.i
            public void b(n nVar) {
                try {
                    this.f4360a.b(nVar);
                } finally {
                    this.f4361b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f4359a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.h
        public void a(final f.i iVar) {
            final ThreadPoolExecutor b10 = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            b10.execute(new Runnable() { // from class: androidx.emoji2.text.g
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.d(iVar, b10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public void d(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k a10 = d.a(this.f4359a);
                if (a10 != null) {
                    a10.c(threadPoolExecutor);
                    a10.a().a(new a(iVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.core.os.t.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.k()) {
                    f.c().n();
                }
            } finally {
                androidx.core.os.t.b();
            }
        }
    }

    @Override // z3.a
    public List<Class<? extends z3.a<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // z3.a
    /* renamed from: c  reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        f.j(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        final androidx.lifecycle.p lifecycle = ((v) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new androidx.lifecycle.i() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.i
            public /* synthetic */ void onCreate(v vVar) {
                androidx.lifecycle.h.a(this, vVar);
            }

            @Override // androidx.lifecycle.i
            public /* synthetic */ void onDestroy(v vVar) {
                androidx.lifecycle.h.b(this, vVar);
            }

            @Override // androidx.lifecycle.i
            public /* synthetic */ void onPause(v vVar) {
                androidx.lifecycle.h.c(this, vVar);
            }

            @Override // androidx.lifecycle.i
            public void onResume(v vVar) {
                EmojiCompatInitializer.this.e();
                lifecycle.d(this);
            }

            @Override // androidx.lifecycle.i
            public /* synthetic */ void onStart(v vVar) {
                androidx.lifecycle.h.e(this, vVar);
            }

            @Override // androidx.lifecycle.i
            public /* synthetic */ void onStop(v vVar) {
                androidx.lifecycle.h.f(this, vVar);
            }
        });
    }

    void e() {
        androidx.emoji2.text.c.d().postDelayed(new c(), 500L);
    }
}
