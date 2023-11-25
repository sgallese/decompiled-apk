package g5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PostProcessor;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import c5.c;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class h {

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16181a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f16182b;

        static {
            int[] iArr = new int[e5.b.values().length];
            try {
                iArr[e5.b.UNCHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e5.b.TRANSLUCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e5.b.OPAQUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16181a = iArr;
            int[] iArr2 = new int[c5.h.values().length];
            try {
                iArr2[c5.h.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[c5.h.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f16182b = iArr2;
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class b extends Animatable2.AnimationCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f16183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f16184b;

        b(pc.a<dc.w> aVar, pc.a<dc.w> aVar2) {
            this.f16183a = aVar;
            this.f16184b = aVar2;
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            pc.a<dc.w> aVar = this.f16184b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            pc.a<dc.w> aVar = this.f16183a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class c extends androidx.vectordrawable.graphics.drawable.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f16185b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f16186c;

        c(pc.a<dc.w> aVar, pc.a<dc.w> aVar2) {
            this.f16185b = aVar;
            this.f16186c = aVar2;
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            pc.a<dc.w> aVar = this.f16186c;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            pc.a<dc.w> aVar = this.f16185b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final Animatable2.AnimationCallback b(pc.a<dc.w> aVar, pc.a<dc.w> aVar2) {
        return f.a(new b(aVar, aVar2));
    }

    public static final androidx.vectordrawable.graphics.drawable.b c(pc.a<dc.w> aVar, pc.a<dc.w> aVar2) {
        return new c(aVar, aVar2);
    }

    public static final PostProcessor d(final e5.a aVar) {
        return new PostProcessor() { // from class: g5.g
            @Override // android.graphics.PostProcessor
            public final int onPostProcess(Canvas canvas) {
                int e10;
                e10 = h.e(e5.a.this, canvas);
                return e10;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(e5.a aVar, Canvas canvas) {
        return f(aVar.a(canvas));
    }

    public static final int f(e5.b bVar) {
        int i10 = a.f16181a[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return -1;
                }
                throw new NoWhenBranchMatchedException();
            }
            return -3;
        }
        return 0;
    }

    public static final boolean g(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return true;
            }
        }
        return false;
    }

    public static final int h(c5.c cVar, c5.h hVar) {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).f8840a;
        }
        int i10 = a.f16182b[hVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return Integer.MAX_VALUE;
            }
            throw new NoWhenBranchMatchedException();
        }
        return RecyclerView.UNDEFINED_DURATION;
    }
}
