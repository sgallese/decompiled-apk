package g5;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import c5.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ec.b0;
import java.io.Closeable;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import u4.a;
import x4.b;

/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Bitmap.Config[] f16190a;

    /* renamed from: b  reason: collision with root package name */
    private static final Bitmap.Config f16191b;

    /* renamed from: c  reason: collision with root package name */
    private static final Headers f16192c;

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16193a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f16194b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f16195c;

        static {
            int[] iArr = new int[t4.f.values().length];
            try {
                iArr[t4.f.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t4.f.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t4.f.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t4.f.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16193a = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f16194b = iArr2;
            int[] iArr3 = new int[c5.h.values().length];
            try {
                iArr3[c5.h.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[c5.h.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f16195c = iArr3;
        }
    }

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config2};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        f16190a = configArr;
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f16191b = config;
        f16192c = new Headers.Builder().build();
    }

    public static final int A(c5.c cVar, c5.h hVar) {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).f8840a;
        }
        int i10 = a.f16195c[hVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return Integer.MAX_VALUE;
            }
            throw new NoWhenBranchMatchedException();
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    public static final void a(a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    public static final Headers.Builder b(Headers.Builder builder, String str) {
        int W;
        boolean z10;
        CharSequence T0;
        W = yc.w.W(str, ':', 0, false, 6, null);
        if (W != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            String substring = str.substring(0, W);
            qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            T0 = yc.w.T0(substring);
            String obj = T0.toString();
            String substring2 = str.substring(W + 1);
            qc.q.h(substring2, "this as java.lang.String).substring(startIndex)");
            builder.addUnsafeNonAscii(obj, substring2);
            return builder;
        }
        throw new IllegalArgumentException(("Unexpected header: " + str).toString());
    }

    public static final int c(Context context, double d10) {
        int i10;
        boolean z10;
        try {
            Object i11 = androidx.core.content.a.i(context, ActivityManager.class);
            qc.q.f(i11);
            ActivityManager activityManager = (ActivityManager) i11;
            if ((context.getApplicationInfo().flags & 1048576) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i10 = activityManager.getLargeMemoryClass();
            } else {
                i10 = activityManager.getMemoryClass();
            }
        } catch (Exception unused) {
            i10 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        double d11 = d10 * i10;
        double d12 = (double) UserVerificationMethods.USER_VERIFY_ALL;
        return (int) (d11 * d12 * d12);
    }

    public static final void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final double e(Context context) {
        try {
            Object i10 = androidx.core.content.a.i(context, ActivityManager.class);
            qc.q.f(i10);
            if (!((ActivityManager) i10).isLowRamDevice()) {
                return 0.2d;
            }
            return 0.15d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Bitmap.Config f() {
        return f16191b;
    }

    public static final q4.d g(b.a aVar) {
        if (aVar instanceof x4.c) {
            return ((x4.c) aVar).e();
        }
        return q4.d.f21390b;
    }

    public static final String h(Uri uri) {
        Object c02;
        c02 = b0.c0(uri.getPathSegments());
        return (String) c02;
    }

    public static final int i(Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            return bitmap.getHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String j(android.webkit.MimeTypeMap r3, java.lang.String r4) {
        /*
            if (r4 == 0) goto Lb
            boolean r0 = yc.m.u(r4)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            r1 = 0
            if (r0 == 0) goto L10
            return r1
        L10:
            r0 = 35
            r2 = 2
            java.lang.String r4 = yc.m.R0(r4, r0, r1, r2, r1)
            r0 = 63
            java.lang.String r4 = yc.m.R0(r4, r0, r1, r2, r1)
            r0 = 47
            java.lang.String r4 = yc.m.K0(r4, r0, r1, r2, r1)
            r0 = 46
            java.lang.String r1 = ""
            java.lang.String r4 = yc.m.J0(r4, r0, r1)
            java.lang.String r3 = r3.getMimeTypeFromExtension(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.l.j(android.webkit.MimeTypeMap, java.lang.String):java.lang.String");
    }

    public static final int k(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final b5.t l(View view) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        int i10 = r4.a.f22144a;
        Object tag = view.getTag(i10);
        b5.t tVar = null;
        if (tag instanceof b5.t) {
            onAttachStateChangeListener = (b5.t) tag;
        } else {
            onAttachStateChangeListener = null;
        }
        if (onAttachStateChangeListener == null) {
            synchronized (view) {
                Object tag2 = view.getTag(i10);
                if (tag2 instanceof b5.t) {
                    tVar = (b5.t) tag2;
                }
                if (tVar != null) {
                    onAttachStateChangeListener = tVar;
                } else {
                    onAttachStateChangeListener = new b5.t(view);
                    view.addOnAttachStateChangeListener(onAttachStateChangeListener);
                    view.setTag(i10, onAttachStateChangeListener);
                }
            }
        }
        return onAttachStateChangeListener;
    }

    public static final File m(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            cacheDir.mkdirs();
            return cacheDir;
        }
        throw new IllegalStateException("cacheDir == null".toString());
    }

    public static final c5.h n(ImageView imageView) {
        int i10;
        ImageView.ScaleType scaleType = imageView.getScaleType();
        if (scaleType == null) {
            i10 = -1;
        } else {
            i10 = a.f16194b[scaleType.ordinal()];
        }
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            return c5.h.FILL;
        }
        return c5.h.FIT;
    }

    public static final Bitmap.Config[] o() {
        return f16190a;
    }

    public static final int p(Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            return bitmap.getWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    public static final boolean q(Uri uri) {
        if (qc.q.d(uri.getScheme(), "file") && qc.q.d(h(uri), "android_asset")) {
            return true;
        }
        return false;
    }

    public static final boolean r() {
        return qc.q.d(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean s(int i10) {
        if (i10 != Integer.MIN_VALUE && i10 != Integer.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public static final boolean t(b.a aVar) {
        if ((aVar instanceof x4.c) && ((x4.c) aVar).f()) {
            return true;
        }
        return false;
    }

    public static final boolean u(Drawable drawable) {
        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof androidx.vectordrawable.graphics.drawable.j)) {
            return false;
        }
        return true;
    }

    public static final b5.m v(b5.m mVar) {
        if (mVar == null) {
            return b5.m.f8030p;
        }
        return mVar;
    }

    public static final b5.r w(b5.r rVar) {
        if (rVar == null) {
            return b5.r.f8046c;
        }
        return rVar;
    }

    public static final Headers x(Headers headers) {
        if (headers == null) {
            return f16192c;
        }
        return headers;
    }

    public static final ResponseBody y(Response response) {
        ResponseBody body = response.body();
        if (body != null) {
            return body;
        }
        throw new IllegalStateException("response body == null".toString());
    }

    public static final int z(String str, int i10) {
        Long l10;
        l10 = yc.u.l(str);
        if (l10 != null) {
            long longValue = l10.longValue();
            if (longValue > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (longValue < 0) {
                return 0;
            }
            return (int) longValue;
        }
        return i10;
    }
}
