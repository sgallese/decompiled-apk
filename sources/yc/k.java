package yc;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* compiled from: Regex.kt */
/* loaded from: classes4.dex */
public final class k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final h d(Matcher matcher, int i10, CharSequence charSequence) {
        if (!matcher.find(i10)) {
            return null;
        }
        return new i(matcher, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vc.f e(MatchResult matchResult) {
        vc.f s10;
        s10 = vc.l.s(matchResult.start(), matchResult.end());
        return s10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vc.f f(MatchResult matchResult, int i10) {
        vc.f s10;
        s10 = vc.l.s(matchResult.start(i10), matchResult.end(i10));
        return s10;
    }
}
