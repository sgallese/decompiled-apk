package s1;

import a1.l0;
import a1.t3;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.ui.platform.j0;
import j0.l;
import j0.n;
import qc.q;

/* compiled from: ImageResources.android.kt */
/* loaded from: classes.dex */
public final class d {
    public static final t3 a(t3.a aVar, int i10, l lVar, int i11) {
        q.i(aVar, "<this>");
        lVar.e(-304919470);
        if (n.K()) {
            n.V(-304919470, i11, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context context = (Context) lVar.C(j0.g());
        lVar.e(-492369756);
        Object f10 = lVar.f();
        l.a aVar2 = l.f18688a;
        if (f10 == aVar2.a()) {
            f10 = new TypedValue();
            lVar.J(f10);
        }
        lVar.N();
        TypedValue typedValue = (TypedValue) f10;
        context.getResources().getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        q.f(charSequence);
        String obj = charSequence.toString();
        lVar.e(1157296644);
        boolean Q = lVar.Q(obj);
        Object f11 = lVar.f();
        if (Q || f11 == aVar2.a()) {
            Resources resources = context.getResources();
            q.h(resources, "context.resources");
            f11 = b(aVar, resources, i10);
            lVar.J(f11);
        }
        lVar.N();
        t3 t3Var = (t3) f11;
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return t3Var;
    }

    public static final t3 b(t3.a aVar, Resources resources, int i10) {
        q.i(aVar, "<this>");
        q.i(resources, "res");
        Drawable drawable = resources.getDrawable(i10, null);
        q.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        q.h(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return l0.c(bitmap);
    }
}
