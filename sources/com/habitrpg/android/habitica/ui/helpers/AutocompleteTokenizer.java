package com.habitrpg.android.habitica.ui.helpers;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.MultiAutoCompleteTextView;
import java.util.List;
import qc.q;

/* compiled from: AutocompleteTokenizer.kt */
/* loaded from: classes4.dex */
public final class AutocompleteTokenizer implements MultiAutoCompleteTextView.Tokenizer {
    public static final int $stable = 8;
    private final List<Character> tokens;

    public AutocompleteTokenizer(List<Character> list) {
        q.i(list, "tokens");
        this.tokens = list;
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public int findTokenEnd(CharSequence charSequence, int i10) {
        q.i(charSequence, "text");
        int length = charSequence.length();
        while (i10 < length) {
            if (charSequence.charAt(i10) == ' ') {
                return i10;
            }
            i10++;
        }
        return length;
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public int findTokenStart(CharSequence charSequence, int i10) {
        q.i(charSequence, "text");
        int i11 = i10;
        while (i11 > 0) {
            int i12 = i11 - 1;
            if (charSequence.charAt(i12) == ' ' || this.tokens.contains(Character.valueOf(charSequence.charAt(i12)))) {
                break;
            }
            i11--;
        }
        if (i11 >= 1) {
            int i13 = i11 - 1;
            if (this.tokens.contains(Character.valueOf(charSequence.charAt(i13)))) {
                return i13;
            }
            return i10;
        }
        return i10;
    }

    public final List<Character> getTokens() {
        return this.tokens;
    }

    @Override // android.widget.MultiAutoCompleteTextView.Tokenizer
    public CharSequence terminateToken(CharSequence charSequence) {
        q.i(charSequence, "text");
        int length = charSequence.length();
        while (length > 0 && charSequence.charAt(length - 1) == ' ') {
            length--;
        }
        if (length <= 0 || charSequence.charAt(length - 1) != ' ') {
            if (charSequence instanceof Spanned) {
                SpannableString spannableString = new SpannableString(((Object) charSequence) + " ");
                TextUtils.copySpansFrom((Spanned) charSequence, 0, charSequence.length(), Object.class, spannableString, 0);
                return spannableString;
            }
            return ((Object) charSequence) + " ";
        }
        return charSequence;
    }
}
