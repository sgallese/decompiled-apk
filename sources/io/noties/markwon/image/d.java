package io.noties.markwon.image;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import io.noties.markwon.image.j;
import io.noties.markwon.image.p;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AsyncDrawableLoaderImpl.java */
/* loaded from: classes4.dex */
public class d extends b {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f17197a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, r> f17198b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, q> f17199c;

    /* renamed from: d  reason: collision with root package name */
    private final q f17200d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f17201e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<io.noties.markwon.image.a, Future<?>> f17202f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncDrawableLoaderImpl.java */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ io.noties.markwon.image.a f17203f;

        /* compiled from: AsyncDrawableLoaderImpl.java */
        /* renamed from: io.noties.markwon.image.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0408a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Drawable f17205f;

            RunnableC0408a(Drawable drawable) {
                this.f17205f = drawable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (((Future) d.this.f17202f.remove(a.this.f17203f)) != null && this.f17205f != null && a.this.f17203f.i()) {
                    a.this.f17203f.n(this.f17205f);
                }
            }
        }

        a(io.noties.markwon.image.a aVar) {
            this.f17203f = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Rect bounds;
            String scheme;
            String a10 = this.f17203f.a();
            Uri parse = Uri.parse(a10);
            Drawable drawable = null;
            try {
                scheme = parse.getScheme();
            } catch (Throwable th) {
                d.h(d.this);
                Log.e("MARKWON-IMAGE", "Error loading image: " + a10, th);
            }
            if (scheme != null && scheme.length() != 0) {
                r rVar = (r) d.this.f17198b.get(scheme);
                if (rVar != null) {
                    j a11 = rVar.a(a10, parse);
                    if (a11.c()) {
                        j.b a12 = a11.a();
                        try {
                            q qVar = (q) d.this.f17199c.get(a12.e());
                            if (qVar == null) {
                                qVar = d.this.f17200d;
                            }
                            if (qVar != null) {
                                drawable = qVar.a(a12.e(), a12.f());
                                if (drawable != null && ((bounds = drawable.getBounds()) == null || bounds.isEmpty())) {
                                    i.a(drawable);
                                }
                                d.this.f17201e.postAtTime(new RunnableC0408a(drawable), this.f17203f, SystemClock.uptimeMillis());
                                return;
                            }
                            throw new IllegalStateException("No media-decoder is found: " + a10);
                        } finally {
                            try {
                                a12.f().close();
                            } catch (IOException e10) {
                                Log.e("MARKWON-IMAGE", "Error closing inputStream", e10);
                            }
                        }
                    }
                    a11.b();
                    throw null;
                }
                throw new IllegalStateException("No scheme-handler is found: " + a10);
            }
            throw new IllegalStateException("No scheme is found: " + a10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(c cVar) {
        this(cVar, new Handler(Looper.getMainLooper()));
    }

    static /* synthetic */ p.a h(d dVar) {
        dVar.getClass();
        return null;
    }

    private Future<?> k(io.noties.markwon.image.a aVar) {
        return this.f17197a.submit(new a(aVar));
    }

    @Override // io.noties.markwon.image.b
    public void a(io.noties.markwon.image.a aVar) {
        Future<?> remove = this.f17202f.remove(aVar);
        if (remove != null) {
            remove.cancel(true);
        }
        this.f17201e.removeCallbacksAndMessages(aVar);
    }

    @Override // io.noties.markwon.image.b
    public void b(io.noties.markwon.image.a aVar) {
        if (this.f17202f.get(aVar) == null) {
            this.f17202f.put(aVar, k(aVar));
        }
    }

    @Override // io.noties.markwon.image.b
    public Drawable d(io.noties.markwon.image.a aVar) {
        return null;
    }

    d(c cVar, Handler handler) {
        this.f17202f = new HashMap(2);
        this.f17197a = cVar.f17192a;
        this.f17198b = cVar.f17193b;
        this.f17199c = cVar.f17194c;
        this.f17200d = cVar.f17195d;
        this.f17201e = handler;
    }
}
