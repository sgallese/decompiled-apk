package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.g;
import androidx.emoji2.text.f;
import androidx.emoji2.text.k;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes.dex */
public class k extends f.c {

    /* renamed from: k  reason: collision with root package name */
    private static final a f4428k = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class a {
        public Typeface a(Context context, g.b bVar) throws PackageManager.NameNotFoundException {
            return androidx.core.provider.g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, androidx.core.provider.e eVar) throws PackageManager.NameNotFoundException {
            return androidx.core.provider.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class b implements f.h {

        /* renamed from: a  reason: collision with root package name */
        private final Context f4429a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.provider.e f4430b;

        /* renamed from: c  reason: collision with root package name */
        private final a f4431c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f4432d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private Handler f4433e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f4434f;

        /* renamed from: g  reason: collision with root package name */
        private ThreadPoolExecutor f4435g;

        /* renamed from: h  reason: collision with root package name */
        f.i f4436h;

        /* renamed from: i  reason: collision with root package name */
        private ContentObserver f4437i;

        /* renamed from: j  reason: collision with root package name */
        private Runnable f4438j;

        b(Context context, androidx.core.provider.e eVar, a aVar) {
            androidx.core.util.i.h(context, "Context cannot be null");
            androidx.core.util.i.h(eVar, "FontRequest cannot be null");
            this.f4429a = context.getApplicationContext();
            this.f4430b = eVar;
            this.f4431c = aVar;
        }

        private void b() {
            synchronized (this.f4432d) {
                this.f4436h = null;
                ContentObserver contentObserver = this.f4437i;
                if (contentObserver != null) {
                    this.f4431c.c(this.f4429a, contentObserver);
                    this.f4437i = null;
                }
                Handler handler = this.f4433e;
                if (handler != null) {
                    handler.removeCallbacks(this.f4438j);
                }
                this.f4433e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f4435g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4434f = null;
                this.f4435g = null;
            }
        }

        private g.b e() {
            try {
                g.a b10 = this.f4431c.b(this.f4429a, this.f4430b);
                if (b10.c() == 0) {
                    g.b[] b11 = b10.b();
                    if (b11 != null && b11.length != 0) {
                        return b11[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b10.c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.f.h
        public void a(f.i iVar) {
            androidx.core.util.i.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f4432d) {
                this.f4436h = iVar;
            }
            d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() {
            synchronized (this.f4432d) {
                if (this.f4436h == null) {
                    return;
                }
                try {
                    g.b e10 = e();
                    int b10 = e10.b();
                    if (b10 == 2) {
                        synchronized (this.f4432d) {
                        }
                    }
                    if (b10 == 0) {
                        try {
                            androidx.core.os.t.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a10 = this.f4431c.a(this.f4429a, e10);
                            ByteBuffer f10 = androidx.core.graphics.l.f(this.f4429a, null, e10.d());
                            if (f10 != null && a10 != null) {
                                n b11 = n.b(a10, f10);
                                androidx.core.os.t.b();
                                synchronized (this.f4432d) {
                                    f.i iVar = this.f4436h;
                                    if (iVar != null) {
                                        iVar.b(b11);
                                    }
                                }
                                b();
                                return;
                            }
                            throw new RuntimeException("Unable to open file.");
                        } catch (Throwable th) {
                            androidx.core.os.t.b();
                            throw th;
                        }
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + b10 + ")");
                } catch (Throwable th2) {
                    synchronized (this.f4432d) {
                        f.i iVar2 = this.f4436h;
                        if (iVar2 != null) {
                            iVar2.a(th2);
                        }
                        b();
                    }
                }
            }
        }

        void d() {
            synchronized (this.f4432d) {
                if (this.f4436h == null) {
                    return;
                }
                if (this.f4434f == null) {
                    ThreadPoolExecutor b10 = c.b("emojiCompat");
                    this.f4435g = b10;
                    this.f4434f = b10;
                }
                this.f4434f.execute(new Runnable() { // from class: androidx.emoji2.text.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.b.this.c();
                    }
                });
            }
        }

        public void f(Executor executor) {
            synchronized (this.f4432d) {
                this.f4434f = executor;
            }
        }
    }

    public k(Context context, androidx.core.provider.e eVar) {
        super(new b(context, eVar, f4428k));
    }

    public k c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
