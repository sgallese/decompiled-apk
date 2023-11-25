package w1;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import okhttp3.internal.http2.Http2;

/* compiled from: TextLayout.kt */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    private static final m1 f25315a = new m1();

    /* renamed from: b  reason: collision with root package name */
    private static final long f25316b = a(0, 0);

    public static final long a(int i10, int i11) {
        return p1.a((i11 & 4294967295L) | (i10 << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt g(n1 n1Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, y1.h[] hVarArr) {
        boolean z10;
        Object L;
        boolean e10;
        StaticLayout a10;
        int k10 = n1Var.k() - 1;
        if (n1Var.g().getLineStart(k10) == n1Var.g().getLineEnd(k10)) {
            if (hVarArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (true ^ z10) {
                SpannableString spannableString = new SpannableString("\u200b");
                L = ec.p.L(hVarArr);
                y1.h hVar = (y1.h) L;
                int length = spannableString.length();
                if (k10 != 0 && hVar.e()) {
                    e10 = false;
                } else {
                    e10 = hVar.e();
                }
                spannableString.setSpan(hVar.b(0, length, e10), 0, spannableString.length(), 33);
                a10 = o0.f25312a.a(spannableString, (r47 & 2) != 0 ? 0 : 0, (r47 & 4) != 0 ? spannableString.length() : spannableString.length(), textPaint, Integer.MAX_VALUE, (r47 & 32) != 0 ? h.f25273a.b() : textDirectionHeuristic, (r47 & 64) != 0 ? h.f25273a.a() : null, (r47 & 128) != 0 ? Integer.MAX_VALUE : 0, (r47 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : null, (r47 & 512) != 0 ? Integer.MAX_VALUE : 0, (r47 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 1.0f : 0.0f, (r47 & RecyclerView.m.FLAG_MOVED) != 0 ? 0.0f : 0.0f, (r47 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 0 : 0, (r47 & 8192) != 0 ? false : n1Var.f(), (r47 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : n1Var.c(), (32768 & r47) != 0 ? 0 : 0, (65536 & r47) != 0 ? 0 : 0, (131072 & r47) != 0 ? 0 : 0, (262144 & r47) != 0 ? 0 : 0, (524288 & r47) != 0 ? null : null, (r47 & 1048576) != 0 ? null : null);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = a10.getLineAscent(0);
                fontMetricsInt.descent = a10.getLineDescent(0);
                fontMetricsInt.top = a10.getLineTop(0);
                fontMetricsInt.bottom = a10.getLineBottom(0);
                return fontMetricsInt;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(n1 n1Var, y1.h[] hVarArr) {
        int i10 = 0;
        int i11 = 0;
        for (y1.h hVar : hVarArr) {
            if (hVar.c() < 0) {
                i10 = Math.max(i10, Math.abs(hVar.c()));
            }
            if (hVar.d() < 0) {
                i11 = Math.max(i10, Math.abs(hVar.d()));
            }
        }
        if (i10 == 0 && i11 == 0) {
            return f25316b;
        }
        return a(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y1.h[] i(n1 n1Var) {
        boolean z10;
        if (!(n1Var.D() instanceof Spanned)) {
            return new y1.h[0];
        }
        CharSequence D = n1Var.D();
        qc.q.g(D, "null cannot be cast to non-null type android.text.Spanned");
        y1.h[] hVarArr = (y1.h[]) ((Spanned) D).getSpans(0, n1Var.D().length(), y1.h.class);
        qc.q.h(hVarArr, "lineHeightStyleSpans");
        if (hVarArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new y1.h[0];
        }
        return hVarArr;
    }

    public static final TextDirectionHeuristic j(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                                qc.q.h(textDirectionHeuristic, "FIRSTSTRONG_LTR");
                                return textDirectionHeuristic;
                            }
                            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.LOCALE;
                            qc.q.h(textDirectionHeuristic2, "LOCALE");
                            return textDirectionHeuristic2;
                        }
                        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.ANYRTL_LTR;
                        qc.q.h(textDirectionHeuristic3, "ANYRTL_LTR");
                        return textDirectionHeuristic3;
                    }
                    TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    qc.q.h(textDirectionHeuristic4, "FIRSTSTRONG_RTL");
                    return textDirectionHeuristic4;
                }
                TextDirectionHeuristic textDirectionHeuristic5 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                qc.q.h(textDirectionHeuristic5, "FIRSTSTRONG_LTR");
                return textDirectionHeuristic5;
            }
            TextDirectionHeuristic textDirectionHeuristic6 = TextDirectionHeuristics.RTL;
            qc.q.h(textDirectionHeuristic6, "RTL");
            return textDirectionHeuristic6;
        }
        TextDirectionHeuristic textDirectionHeuristic7 = TextDirectionHeuristics.LTR;
        qc.q.h(textDirectionHeuristic7, "LTR");
        return textDirectionHeuristic7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(n1 n1Var) {
        int topPadding;
        int bottomPadding;
        if (!n1Var.f() && !n1Var.E()) {
            TextPaint paint = n1Var.g().getPaint();
            CharSequence text = n1Var.g().getText();
            qc.q.h(paint, "paint");
            qc.q.h(text, "text");
            Rect c10 = p.c(paint, text, n1Var.g().getLineStart(0), n1Var.g().getLineEnd(0));
            int lineAscent = n1Var.g().getLineAscent(0);
            int i10 = c10.top;
            if (i10 < lineAscent) {
                topPadding = lineAscent - i10;
            } else {
                topPadding = n1Var.g().getTopPadding();
            }
            if (n1Var.k() != 1) {
                int k10 = n1Var.k() - 1;
                c10 = p.c(paint, text, n1Var.g().getLineStart(k10), n1Var.g().getLineEnd(k10));
            }
            int lineDescent = n1Var.g().getLineDescent(n1Var.k() - 1);
            int i11 = c10.bottom;
            if (i11 > lineDescent) {
                bottomPadding = i11 - lineDescent;
            } else {
                bottomPadding = n1Var.g().getBottomPadding();
            }
            if (topPadding == 0 && bottomPadding == 0) {
                return f25316b;
            }
            return a(topPadding, bottomPadding);
        }
        return f25316b;
    }

    public static final boolean l(Layout layout, int i10) {
        qc.q.i(layout, "<this>");
        if (layout.getEllipsisCount(i10) > 0) {
            return true;
        }
        return false;
    }
}
