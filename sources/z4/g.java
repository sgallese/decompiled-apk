package z4;

import android.net.Uri;
import b5.l;
import qc.q;

/* compiled from: StringMapper.kt */
/* loaded from: classes.dex */
public final class g implements d<String, Uri> {
    @Override // z4.d
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public Uri a(String str, l lVar) {
        Uri parse = Uri.parse(str);
        q.h(parse, "parse(this)");
        return parse;
    }
}
