package com.habitrpg.android.habitica.ui.fragments.purchases;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class g {
    public static /* synthetic */ String a(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = str.codePointAt(i10);
            if (!Character.isWhitespace(codePointAt)) {
                break;
            }
            i10 += Character.charCount(codePointAt);
        }
        while (length > i10) {
            int codePointBefore = Character.codePointBefore(str, length);
            if (!Character.isWhitespace(codePointBefore)) {
                break;
            }
            length -= Character.charCount(codePointBefore);
        }
        return str.substring(i10, length);
    }
}
