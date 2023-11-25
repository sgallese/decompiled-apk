package c6;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import dc.f;
import dc.h;
import dc.j;
import qc.r;
import z0.l;
import z0.m;

/* compiled from: DrawablePainter.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final f f8864a;

    /* compiled from: DrawablePainter.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.a<Handler> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f8865f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        f a10;
        a10 = h.a(j.NONE, a.f8865f);
        f8864a = a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return m.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return l.f26375b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler d() {
        return (Handler) f8864a.getValue();
    }
}
