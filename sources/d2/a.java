package d2;

import a2.c0;
import a2.e0;
import a2.l;
import a2.x;
import a2.y;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g2.k;
import java.util.List;
import okhttp3.internal.http2.Http2;
import v1.b0;
import v1.d;
import v1.m0;
import v1.n0;

/* compiled from: AndroidAccessibilitySpannableString.android.kt */
/* loaded from: classes.dex */
public final class a {
    private static final void a(SpannableString spannableString, b0 b0Var, int i10, int i11, j2.e eVar, l.b bVar) {
        int b10;
        int a10;
        e2.g.j(spannableString, b0Var.g(), i10, i11);
        e2.g.n(spannableString, b0Var.k(), eVar, i10, i11);
        if (b0Var.n() != null || b0Var.l() != null) {
            c0 n10 = b0Var.n();
            if (n10 == null) {
                n10 = c0.f239m.e();
            }
            x l10 = b0Var.l();
            if (l10 != null) {
                b10 = l10.i();
            } else {
                b10 = x.f339b.b();
            }
            spannableString.setSpan(new StyleSpan(a2.f.c(n10, b10)), i10, i11, 33);
        }
        if (b0Var.i() != null) {
            if (b0Var.i() instanceof e0) {
                spannableString.setSpan(new TypefaceSpan(((e0) b0Var.i()).j()), i10, i11, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                a2.l i12 = b0Var.i();
                y m10 = b0Var.m();
                if (m10 != null) {
                    a10 = m10.m();
                } else {
                    a10 = y.f348b.a();
                }
                Object value = a2.m.a(bVar, i12, null, 0, a10, 6, null).getValue();
                qc.q.g(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(l.f13082a.a((Typeface) value), i10, i11, 33);
            }
        }
        if (b0Var.s() != null) {
            g2.k s10 = b0Var.s();
            k.a aVar = g2.k.f16065b;
            if (s10.d(aVar.d())) {
                spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (b0Var.s().d(aVar.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
        }
        if (b0Var.u() != null) {
            spannableString.setSpan(new ScaleXSpan(b0Var.u().b()), i10, i11, 33);
        }
        e2.g.r(spannableString, b0Var.p(), i10, i11);
        e2.g.g(spannableString, b0Var.d(), i10, i11);
    }

    public static final SpannableString b(v1.d dVar, j2.e eVar, l.b bVar, u uVar) {
        b0 a10;
        qc.q.i(dVar, "<this>");
        qc.q.i(eVar, "density");
        qc.q.i(bVar, "fontFamilyResolver");
        qc.q.i(uVar, "urlSpanCache");
        SpannableString spannableString = new SpannableString(dVar.i());
        List<d.b<b0>> g10 = dVar.g();
        if (g10 != null) {
            int size = g10.size();
            for (int i10 = 0; i10 < size; i10++) {
                d.b<b0> bVar2 = g10.get(i10);
                b0 a11 = bVar2.a();
                int b10 = bVar2.b();
                int c10 = bVar2.c();
                a10 = a11.a((r38 & 1) != 0 ? a11.g() : 0L, (r38 & 2) != 0 ? a11.f24394b : 0L, (r38 & 4) != 0 ? a11.f24395c : null, (r38 & 8) != 0 ? a11.f24396d : null, (r38 & 16) != 0 ? a11.f24397e : null, (r38 & 32) != 0 ? a11.f24398f : null, (r38 & 64) != 0 ? a11.f24399g : null, (r38 & 128) != 0 ? a11.f24400h : 0L, (r38 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? a11.f24401i : null, (r38 & 512) != 0 ? a11.f24402j : null, (r38 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? a11.f24403k : null, (r38 & RecyclerView.m.FLAG_MOVED) != 0 ? a11.f24404l : 0L, (r38 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? a11.f24405m : null, (r38 & 8192) != 0 ? a11.f24406n : null, (r38 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? a11.f24407o : null, (r38 & 32768) != 0 ? a11.f24408p : null);
                a(spannableString, a10, b10, c10, eVar, bVar);
            }
        }
        List<d.b<m0>> j10 = dVar.j(0, dVar.length());
        int size2 = j10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            d.b<m0> bVar3 = j10.get(i11);
            m0 a12 = bVar3.a();
            spannableString.setSpan(e2.i.a(a12), bVar3.b(), bVar3.c(), 33);
        }
        List<d.b<n0>> k10 = dVar.k(0, dVar.length());
        int size3 = k10.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d.b<n0> bVar4 = k10.get(i12);
            n0 a13 = bVar4.a();
            spannableString.setSpan(uVar.a(a13), bVar4.b(), bVar4.c(), 33);
        }
        return spannableString;
    }
}
