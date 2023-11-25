package com.habitrpg.common.habitica.helpers;

import ec.o;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qc.q;
import yc.v;

/* compiled from: EmojiParser.kt */
/* loaded from: classes4.dex */
public final class EmojiParser {
    public static final EmojiParser INSTANCE = new EmojiParser();

    private EmojiParser() {
    }

    public final String convertToCheatCode(String str) {
        char[] o10;
        if (str == null) {
            return str;
        }
        char[] charArray = str.toCharArray();
        q.h(charArray, "this as java.lang.String).toCharArray()");
        int length = charArray.length - 2;
        if (length >= 0) {
            String str2 = str;
            int i10 = 0;
            while (true) {
                o10 = o.o(charArray, i10, i10 + 2);
                String str3 = new String(o10);
                int codePointAt = str3.codePointAt(0);
                Map<Integer, String> map = EmojiMap.emojiMap;
                if (map.containsKey(Integer.valueOf(codePointAt))) {
                    String str4 = map.get(Integer.valueOf(codePointAt));
                    q.f(str4);
                    str2 = v.B(str2, str3, str4, false, 4, null);
                }
                if (i10 != length) {
                    i10++;
                } else {
                    return str2;
                }
            }
        } else {
            return str;
        }
    }

    public final String parseEmojis(String str) {
        if (str == null) {
            return str;
        }
        Matcher matcher = Pattern.compile("(:[^:]+:)").matcher(str);
        String str2 = str;
        while (matcher.find()) {
            String group = matcher.group();
            Map<String, Integer> map = EmojiMap.invertedEmojiMap;
            if (map.get(group) != null) {
                Integer num = map.get(group);
                q.f(num);
                char[] chars = Character.toChars(num.intValue());
                q.h(chars, "toChars(...)");
                String str3 = new String(chars);
                q.f(group);
                str2 = v.B(str2, group, str3, false, 4, null);
            }
        }
        return str2;
    }
}
