package com.habitrpg.common.habitica.helpers;

import android.content.Context;
import java.util.List;
import qc.q;
import yc.w;

/* compiled from: NumberAbbreviator.kt */
/* loaded from: classes4.dex */
public final class NumberAbbreviator {
    public static final NumberAbbreviator INSTANCE = new NumberAbbreviator();

    private NumberAbbreviator() {
    }

    public static /* synthetic */ String abbreviate$default(NumberAbbreviator numberAbbreviator, Context context, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 2;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return numberAbbreviator.abbreviate(context, f10, i10, i11);
    }

    private final String abbreviationForCounter(int i10) {
        if (i10 == 0) {
            return "";
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return "";
                        }
                        return "q";
                    }
                    return "t";
                }
                return "b";
            }
            return "m";
        }
        return "k";
    }

    public final String abbreviate(Context context, float f10, int i10, int i11) {
        return abbreviate(context, f10, i10, i11);
    }

    public final String abbreviate(Context context, double d10, int i10, int i11) {
        List x02;
        String U0;
        int i12 = (((d10 > 0.0d ? 1 : (d10 == 0.0d ? 0 : -1)) == 0) || d10 <= -1.0d || d10 >= 1.0d || i10 != 0) ? i10 : 2;
        double abs = Math.abs(d10);
        double d11 = abs;
        int i13 = 0;
        while (d11 >= 1000.0d && abs >= i11) {
            i13++;
            d11 /= 1000;
        }
        x02 = w.x0(String.valueOf(d11), new String[]{"."}, false, 0, 6, null);
        String str = (String) x02.get(0);
        if (x02.size() == 2) {
            String str2 = (String) x02.get(1);
            String substring = str2.substring(0, Math.min(str2.length(), i12));
            q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            U0 = w.U0(substring, '0');
            if (U0.length() > 0) {
                str = str + "." + U0;
            }
        }
        if (d10 < 0.0d) {
            str = "-" + str;
        }
        return str + abbreviationForCounter(i13);
    }
}
