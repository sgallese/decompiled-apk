package com.habitrpg.common.habitica.extensions;

import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.util.Patterns;
import java.util.List;
import java.util.Locale;
import qc.q;
import yc.b;
import yc.j;
import yc.v;
import yc.w;

/* compiled from: StringExtensions.kt */
/* loaded from: classes4.dex */
public final class StringExtensionsKt {
    public static final CharSequence addZeroWidthSpace(String str) {
        q.i(str, "<this>");
        SpannableString spannableString = new SpannableString(str);
        Linkify.addLinks(spannableString, 1);
        CharSequence concat = TextUtils.concat(spannableString, "\u200b");
        q.h(concat, "concat(...)");
        return concat;
    }

    public static final CharSequence fromHtml(String str) {
        Spanned fromHtml;
        q.i(str, "<this>");
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(str, 0);
            q.f(fromHtml);
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(str);
        q.f(fromHtml2);
        return fromHtml2;
    }

    public static final boolean isValidEmail(CharSequence charSequence) {
        boolean z10;
        if (charSequence != null && charSequence.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || !Patterns.EMAIL_ADDRESS.matcher(charSequence).matches()) {
            return false;
        }
        return true;
    }

    public static final String localizedCapitalize(String str) {
        boolean z10;
        String valueOf;
        q.i(str, "<this>");
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale locale = Locale.getDefault();
                q.h(locale, "getDefault(...)");
                valueOf = b.d(charAt, locale);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb2.append((Object) valueOf);
            String substring = str.substring(1);
            q.h(substring, "this as java.lang.String).substring(startIndex)");
            sb2.append(substring);
            return sb2.toString();
        }
        return str;
    }

    public static final String localizedCapitalizeWithSpaces(String str) {
        q.i(str, "<this>");
        return spaceBetweenCapitals(localizedCapitalize(str));
    }

    public static final String removeZeroWidthSpace(String str) {
        String B;
        q.i(str, "<this>");
        B = v.B(str, "\u200b", "", false, 4, null);
        return B;
    }

    public static final String spaceBetweenCapitals(String str) {
        q.i(str, "<this>");
        return new j("(.)([A-Z0-9]\\w)").g(str, "$1 $2");
    }

    public static final Locale toLocale(String str) {
        List x02;
        Locale locale;
        q.i(str, "<this>");
        x02 = w.x0(str, new String[]{"_"}, false, 0, 6, null);
        int size = x02.size();
        if (size != 1) {
            if (size != 2) {
                return new Locale("en");
            }
            locale = new Locale((String) x02.get(0), (String) x02.get(1));
        } else {
            locale = new Locale((String) x02.get(0));
        }
        return locale;
    }
}
