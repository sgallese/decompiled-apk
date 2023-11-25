package qb;

import android.text.Spanned;

/* compiled from: LeadingMarginUtils.java */
/* loaded from: classes4.dex */
public abstract class c {
    public static boolean a(int i10, CharSequence charSequence, Object obj) {
        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(obj) == i10) {
            return true;
        }
        return false;
    }

    public static boolean b(int i10, CharSequence charSequence, Object obj) {
        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(obj) == i10) {
            return true;
        }
        return false;
    }
}
