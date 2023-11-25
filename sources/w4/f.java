package w4;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import g5.o;
import kotlin.coroutines.Continuation;
import w4.i;

/* compiled from: DrawableFetcher.kt */
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f25374a;

    /* renamed from: b  reason: collision with root package name */
    private final b5.l f25375b;

    /* compiled from: DrawableFetcher.kt */
    /* loaded from: classes.dex */
    public static final class a implements i.a<Drawable> {
        @Override // w4.i.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public i a(Drawable drawable, b5.l lVar, q4.g gVar) {
            return new f(drawable, lVar);
        }
    }

    public f(Drawable drawable, b5.l lVar) {
        this.f25374a = drawable;
        this.f25375b = lVar;
    }

    @Override // w4.i
    public Object a(Continuation<? super h> continuation) {
        Drawable drawable;
        boolean u10 = g5.l.u(this.f25374a);
        if (u10) {
            drawable = new BitmapDrawable(this.f25375b.g().getResources(), o.f16199a.a(this.f25374a, this.f25375b.f(), this.f25375b.o(), this.f25375b.n(), this.f25375b.c()));
        } else {
            drawable = this.f25374a;
        }
        return new g(drawable, u10, t4.f.MEMORY);
    }
}
