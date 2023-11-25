package com.habitrpg.common.habitica.helpers;

import pc.l;
import qc.q;
import qc.r;
import yc.v;
import yc.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MarkdownParser.kt */
/* loaded from: classes4.dex */
public final class MarkdownParser$preprocessImageMarkdown$1 extends r implements l<yc.h, CharSequence> {
    public static final MarkdownParser$preprocessImageMarkdown$1 INSTANCE = new MarkdownParser$preprocessImageMarkdown$1();

    MarkdownParser$preprocessImageMarkdown$1() {
        super(1);
    }

    @Override // pc.l
    public final CharSequence invoke(yc.h hVar) {
        boolean K;
        boolean K2;
        String B;
        String B2;
        q.i(hVar, "matchResult");
        String value = hVar.getValue();
        K = w.K(value, ".jpg\"", false, 2, null);
        if (K) {
            B2 = v.B(value, ".jpg\"", ".jpg \"", false, 4, null);
            return B2;
        }
        K2 = w.K(value, ".png\"", false, 2, null);
        if (K2) {
            B = v.B(value, ".png\"", ".png \"", false, 4, null);
            return B;
        }
        return value;
    }
}
