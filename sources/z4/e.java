package z4;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import b5.l;
import qc.q;

/* compiled from: ResourceIntMapper.kt */
/* loaded from: classes.dex */
public final class e implements d<Integer, Uri> {
    private final boolean b(int i10, Context context) {
        try {
            if (context.getResources().getResourceEntryName(i10) == null) {
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    @Override // z4.d
    public /* bridge */ /* synthetic */ Uri a(Integer num, l lVar) {
        return c(num.intValue(), lVar);
    }

    public Uri c(int i10, l lVar) {
        if (!b(i10, lVar.g())) {
            return null;
        }
        Uri parse = Uri.parse("android.resource://" + lVar.g().getPackageName() + '/' + i10);
        q.h(parse, "parse(this)");
        return parse;
    }
}
