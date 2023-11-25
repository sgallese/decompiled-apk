package d2;

import a2.c0;
import a2.x;
import a2.y;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.List;
import v1.b0;
import v1.d;
import v1.k0;
import v1.w;
import v1.z;

/* compiled from: AndroidParagraphHelper.android.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final a f13064a = new a();

    public static final CharSequence a(String str, float f10, k0 k0Var, List<d.b<b0>> list, List<d.b<v1.u>> list2, j2.e eVar, pc.r<? super a2.l, ? super c0, ? super x, ? super y, ? extends Typeface> rVar, boolean z10) {
        CharSequence charSequence;
        Spannable spannableString;
        qc.q.i(str, "text");
        qc.q.i(k0Var, "contextTextStyle");
        qc.q.i(list, "spanStyles");
        qc.q.i(list2, "placeholders");
        qc.q.i(eVar, "density");
        qc.q.i(rVar, "resolveTypeface");
        if (z10 && androidx.emoji2.text.f.k()) {
            charSequence = androidx.emoji2.text.f.c().r(str);
            qc.q.f(charSequence);
        } else {
            charSequence = str;
        }
        qc.q.h(charSequence, "if (useEmojiCompat && Em…else {\n        text\n    }");
        if (list.isEmpty() && list2.isEmpty() && qc.q.d(k0Var.D(), g2.r.f16086c.a()) && j2.t.h(k0Var.s())) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannableString = (Spannable) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        if (qc.q.d(k0Var.A(), g2.k.f16065b.d())) {
            e2.g.t(spannableString, f13064a, 0, str.length());
        }
        if (b(k0Var) && k0Var.t() == null) {
            e2.g.q(spannableString, k0Var.s(), f10, eVar);
        } else {
            g2.h t10 = k0Var.t();
            if (t10 == null) {
                t10 = g2.h.f16043c.a();
            }
            Spannable spannable = spannableString;
            e2.g.p(spannable, k0Var.s(), f10, eVar, t10);
        }
        e2.g.x(spannableString, k0Var.D(), f10, eVar);
        e2.g.v(spannableString, k0Var, list, eVar, rVar);
        e2.f.d(spannableString, list2, eVar);
        return spannableString;
    }

    public static final boolean b(k0 k0Var) {
        w a10;
        qc.q.i(k0Var, "<this>");
        z w10 = k0Var.w();
        if (w10 != null && (a10 = w10.a()) != null) {
            return a10.c();
        }
        return true;
    }

    /* compiled from: AndroidParagraphHelper.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends CharacterStyle {
        a() {
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }
}
