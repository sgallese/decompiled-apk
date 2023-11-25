package com.habitrpg.common.habitica.helpers;

import ec.b0;
import ec.t;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import yc.j;
import yc.w;

/* compiled from: LanguageHelper.kt */
/* loaded from: classes4.dex */
public final class LanguageHelper {
    private String languageCode;
    private Locale locale;

    public LanguageHelper(String str) {
        String str2;
        boolean K;
        Locale locale;
        List i10;
        boolean z10;
        if (str == null) {
            str2 = "en";
        } else {
            str2 = str;
        }
        int hashCode = str2.hashCode();
        if (hashCode != 3338) {
            if (hashCode != 3365) {
                if (hashCode != 3374) {
                    if (hashCode == 3588 && str2.equals("pt")) {
                        this.locale = new Locale("pt", "PT");
                        this.languageCode = "pt";
                        return;
                    }
                } else if (str2.equals("iw")) {
                    this.locale = new Locale("iw");
                    this.languageCode = "he";
                    return;
                }
            } else if (str2.equals("in")) {
                this.locale = new Locale("in");
                this.languageCode = "id";
                return;
            }
        } else if (str2.equals("hr")) {
            this.locale = new Locale("hr", "HR");
            this.languageCode = "hr";
            return;
        }
        K = w.K(str2, "_", false, 2, null);
        if (K) {
            List<String> i11 = new j("_").i(str2, 0);
            if (!i11.isEmpty()) {
                ListIterator<String> listIterator = i11.listIterator(i11.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        i10 = b0.y0(i11, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            i10 = t.i();
            String[] strArr = (String[]) i10.toArray(new String[0]);
            locale = new Locale(strArr[0], strArr[1]);
        } else {
            locale = new Locale(str2);
        }
        this.locale = locale;
        this.languageCode = str;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final Locale getLocale() {
        return this.locale;
    }
}
