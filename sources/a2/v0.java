package a2;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: PlatformTypefaces.kt */
/* loaded from: classes.dex */
final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public static final v0 f335a = new v0();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<Paint> f336b = new ThreadLocal<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PlatformTypefaces.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<a0, CharSequence> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j2.e f337f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j2.e eVar) {
            super(1);
            this.f337f = eVar;
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(a0 a0Var) {
            qc.q.i(a0Var, "setting");
            return '\'' + a0Var.c() + "' " + a0Var.b(this.f337f);
        }
    }

    private v0() {
    }

    private final String b(b0 b0Var, Context context) {
        return v1.e0.d(b0Var.a(), null, null, null, 0, null, new a(j2.a.a(context)), 31, null);
    }

    public final Typeface a(Typeface typeface, b0 b0Var, Context context) {
        qc.q.i(b0Var, "variationSettings");
        qc.q.i(context, "context");
        if (typeface == null) {
            return null;
        }
        if (b0Var.a().isEmpty()) {
            return typeface;
        }
        Paint paint = f336b.get();
        if (paint == null) {
            paint = new Paint();
            f336b.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(b(b0Var, context));
        return paint.getTypeface();
    }
}
